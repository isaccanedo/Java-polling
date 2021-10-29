package com.isaccanedo.polling.service;

import com.isaccanedo.polling.dto.AgendaRequestDto;
import com.isaccanedo.polling.dto.AgendaResponseDto;
import com.isaccanedo.polling.entity.Agenda;
import com.isaccanedo.polling.exception.NotFoundException;
import com.isaccanedo.polling.repository.AgendaRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AgendaServiceImpl implements AgendaService {

    private final AgendaRepository agendaRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public AgendaServiceImpl(AgendaRepository agendaRepository, ModelMapper modelMapper) {
        this.agendaRepository = agendaRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<AgendaResponseDto> listAgendas() {
        List<Agenda> agendaList = this.agendaRepository.findAll();

        return agendaList.stream().map(
            agenda -> modelMapper.map(agenda, AgendaResponseDto.class)
        ).collect(Collectors.toList());
    }

    @Override
    public AgendaResponseDto getAgenda(String id) {
        Agenda agenda = this.agendaRepository.findById(new ObjectId(id)).
                orElseThrow(() -> new NotFoundException("Agenda not found."));

        return modelMapper.map(agenda, AgendaResponseDto.class);
    }

    @Override
    public AgendaResponseDto createAgenda(AgendaRequestDto dto) {
        Agenda agenda = new Agenda(dto.getName());
        agenda = agendaRepository.insert(agenda);

        return modelMapper.map(agenda, AgendaResponseDto.class);
    }
}
