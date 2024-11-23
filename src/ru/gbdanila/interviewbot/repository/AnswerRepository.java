package ru.gbdanila.interviewbot.repository;

import ru.gbdanila.interviewbot.entity.Answer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnswerRepository {
    private static List<Answer> answers = new ArrayList<>();

    /**
     * Добавление ответа
     * @param answer объект ответа
     */
    public void addAnswer(Answer answer){
        answers.add(answer);
    }

    /**
     *
     * @return список всех добавленных ответов
     */
    public List<Answer> getAnswers() {
        return answers.stream().toList();
    }
}
