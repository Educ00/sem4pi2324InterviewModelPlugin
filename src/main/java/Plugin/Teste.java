package Plugin;

import eapli.jobs4u.app.question.domain.Answer;
import eapli.jobs4u.app.question.domain.Question;

import java.util.Set;

public class Teste {
    public static void main(String[] args) {
        Main main = new Main();
        Set<Question> set = main.parseFile("src/main/java/Plugin/testeImportQuestions.txt");
        Set<Question> set2 = main.parseFile("src/main/java/Plugin/testeAnswer.txt");
        String templatePath = main.buildGeneralTemplateForQuestionsAndAnswers("src/main/java/Plugin");
        String path = main.buildTemplateForInterviewModel("src/main/java/Plugin", set);
        for (Question a : set){
            for (Answer b : a.correctAnswers()){
                System.out.println(a.body());
                System.out.println(b.correctAnswerBody());
            }
        }
        System.out.println("--");
        for (Question a : set2){
            for (Answer b : a.correctAnswers()){
                System.out.println(a.body());
                System.out.println(b.givenAnswerBody());
            }
        }
        System.out.println("Path template interview: " + path);
        System.out.println("Path template: " + templatePath);
        System.out.println("Rating: " + main.gradeInterview("src/main/java/Plugin/testeAnswer.txt", set));
    }
}
