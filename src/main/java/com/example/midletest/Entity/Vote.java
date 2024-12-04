package com.example.midletest.Entity;

import java.util.List;

public class Vote {
    private String question;
    private List<String> options;
    private List<Integer> totalVotes;

    public Vote(String question, List<String> options, List<Integer> totalVotes) {
        this.question = question;
        this.options = options;
        this.totalVotes = totalVotes;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public List<Integer> getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(List<Integer> totalVotes) {
        this.totalVotes = totalVotes;
    }
}
