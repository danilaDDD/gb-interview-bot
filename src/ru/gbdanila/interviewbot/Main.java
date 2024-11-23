package ru.gbdanila.interviewbot;

import ru.gbdanila.interviewbot.repository.AnswerRepository;
import ru.gbdanila.interviewbot.repository.QuestionRepository;
import ru.gbdanila.interviewbot.view.ConsoleView;

/**
 * Консольное приложение, которое позваляет опрашивать пользователя и выводить ответы
 */
public class Main {
    public static void main(String[] args) {
        QuestionRepository questionRepository = new QuestionRepository();
        AnswerRepository answerRepository = new AnswerRepository();

        new ConsoleView(questionRepository, answerRepository).run();
    }
}