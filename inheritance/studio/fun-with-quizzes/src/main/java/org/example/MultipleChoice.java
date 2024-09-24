package org.example;

import java.util.ArrayList;

public class MultipleChoice extends Question {
    private ArrayList<String> options;
    private String answer;

    public MultipleChoice( String question, ArrayList<String> options, String answer) {
        super(question);
        this.options = options;
        this.answer = answer;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return this.getQuestion() + '\'' +
                "Options:" + options.toString() + '\'';
    }
}
