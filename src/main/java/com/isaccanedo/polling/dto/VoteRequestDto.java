package com.isaccanedo.polling.dto;

import com.isaccanedo.polling.entity.Answer;

public class VoteRequestDto {
    private String votingId;
    private String cpf;
    private Answer answer;

    public String getVotingId() {
        return votingId;
    }

    public void setVotingId(String votingId) {
        this.votingId = votingId;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
}
