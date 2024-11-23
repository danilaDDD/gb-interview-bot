package ru.gbdanila.interviewbot.repository;

import ru.gbdanila.interviewbot.entity.Question;

import java.util.List;

public class QuestionRepository {
    private static final List<Question> questions = List.of(
            new Question("Является ли java языком программирования?", "Да"),
            new Question("Как расшифровывается JVM", "Java Virtual Machine"),
            new Question("Как расшифровывается JDK", "Java Development Kit")
    );

    /**
     *
     * @return список всех доступных объектов вопросов
     */
    public List<Question> getQuestions(){
        return questions;
    }
}
