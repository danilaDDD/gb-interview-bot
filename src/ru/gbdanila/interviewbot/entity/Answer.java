package ru.gbdanila.interviewbot.entity;

/**
 * Класс с данными ответа введенного пользователем
 */
public class Answer {
    private final Question question;
    private final String realAnswer;

    public Answer(Question question, String realAnswer) {
        this.question = question;
        this.realAnswer = realAnswer;
    }

    @Override
    public String toString() {
        return String.format("Answer{question=%s, true answer=%s, real answer=%s}",
                question.getText(), question.getAnswer(), realAnswer);
    }
}
