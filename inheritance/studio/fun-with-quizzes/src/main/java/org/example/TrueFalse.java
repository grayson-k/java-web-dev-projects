package org.example;

public class TrueFalse extends Question {
    private boolean answer;

    public TrueFalse(String question, boolean answer) {
        super(question);
        this.answer = answer;
    }

    public boolean isAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return this.getQuestion() + '\'';
    }
}
