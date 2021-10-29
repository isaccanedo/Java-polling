package com.isaccanedo.polling.service;

import com.isaccanedo.polling.dto.VotingResultResponseDto;

public interface MessagingService {
    void send(VotingResultResponseDto votingResult);
}
