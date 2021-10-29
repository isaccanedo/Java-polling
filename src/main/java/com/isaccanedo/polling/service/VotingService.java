package com.isaccanedo.polling.service;

import com.isaccanedo.polling.dto.*;

import java.util.List;

public interface VotingService {
    List<VotingResponseDto> listVotings();
    VotingResponseDto getVoting(String id);
    VotingResponseDto createVoting(VotingRequestDto dto);
    VoteResponseDto addVote(VoteRequestDto dto);
    VotingResultResponseDto getVotingResult(String id);
}
