package com.isaccanedo.polling.service;

import com.isaccanedo.polling.dto.AgendaRequestDto;
import com.isaccanedo.polling.dto.AgendaResponseDto;

import java.util.List;

public interface AgendaService {
    List<AgendaResponseDto> listAgendas();
    AgendaResponseDto getAgenda(String id);
    AgendaResponseDto createAgenda(AgendaRequestDto dto);
}
