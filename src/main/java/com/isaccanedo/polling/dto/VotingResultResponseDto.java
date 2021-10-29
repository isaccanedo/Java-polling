package com.isaccanedo.polling.dto;

import com.isaccanedo.polling.entity.VoteCount;

public class VotingResultResponseDto {
    private AgendaResponseDto agenda;
    private VoteCount voteCount;

    public AgendaResponseDto getAgenda() {
        return agenda;
    }

    public void setAgenda(AgendaResponseDto agenda) {
        this.agenda = agenda;
    }

    public VoteCount getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(VoteCount voteCount) {
        this.voteCount = voteCount;
    }
}
