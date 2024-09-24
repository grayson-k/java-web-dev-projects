package org.example;

public class Question {
    private static int nextId = 0;

    private int id;
    private String question;

    public Question(String question) {
        this.id = nextId;
        this.question = question;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public String toString() {
        return "Question='" + this.question + '\'';
    }
}
