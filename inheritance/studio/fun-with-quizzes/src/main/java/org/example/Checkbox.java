package org.example;

import java.util.ArrayList;

public class Checkbox extends Question{
    private ArrayList<String> options;
    private ArrayList<String> answers;

    public Checkbox(String question, ArrayList<String> options, ArrayList<String> answers) {
        super(question);
        this.options = options;
        this.answers = answers;
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    @Override
    public String toString() {
        return this.getQuestion() + '\'' +
                "Options:" + options.toString() + '\'';
    }
}
