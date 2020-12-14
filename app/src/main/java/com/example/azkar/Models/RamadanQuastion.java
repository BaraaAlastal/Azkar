package com.example.azkar.Models;

public class RamadanQuastion {

    private String quastion;
    private String answer;

    public String getQuastion() {
        return quastion;
    }

    public void setQuastion(String quastion) {
        this.quastion = quastion;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public RamadanQuastion(String quastion, String answer) {
        this.quastion = quastion;
        this.answer = answer;
    }

    public RamadanQuastion() {
    }
}
