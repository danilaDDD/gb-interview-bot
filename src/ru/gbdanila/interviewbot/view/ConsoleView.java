package ru.gbdanila.interviewbot.view;

import ru.gbdanila.interviewbot.command.Command;
import ru.gbdanila.interviewbot.entity.Answer;
import ru.gbdanila.interviewbot.repository.AnswerRepository;
import ru.gbdanila.interviewbot.repository.QuestionRepository;

import java.util.List;
import java.util.Scanner;

/**
 * Класс для вывода команд
 */
public class ConsoleView {
    private static Scanner scanner = new Scanner(System.in);

    private final QuestionRepository questionRepository;
    private final AnswerRepository answerRepository;

    public ConsoleView(QuestionRepository questionRepository, AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
        this.questionRepository = questionRepository;
    }

    public void run(){

       while (true){
           System.out.printf("available commands: %s%n", List.of(Command.values()));
           try {
               tryRun();
           }catch (InterruptedException e){
               System.exit(0);
           }catch (Exception e) {
               e.printStackTrace();
               System.out.println("try again:");
           }
       }
    }

    private void tryRun() throws InterruptedException {
        Command command = Command.valueOf(prompt("input command: "));

        switch (command){
            case INTERVIEW -> runInterview();
            case GET_ANSWERS -> {
                System.out.println("your answers: ");
                answerRepository.getAnswers().forEach(System.out::println);
            }
            case EXIT -> throw new InterruptedException();
        }

    }

    private String prompt(String msg) {
        System.out.print(msg);
        return scanner.nextLine();
    }

    private void runInterview() {
        questionRepository.getQuestions().forEach(question -> {
            String answer = prompt(question.getText());
            answerRepository.addAnswer(new Answer(question, answer));
        });
    }
}
