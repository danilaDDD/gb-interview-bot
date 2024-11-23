package ru.gbdanila.interviewbot.entity;

public class Question {
    private final String text;
    private final String answer;

    public Question(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return String.format("Question{text=%s, answer=%s}", text, answer);

    }
}
