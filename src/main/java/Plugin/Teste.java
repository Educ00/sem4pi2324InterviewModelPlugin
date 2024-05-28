package Plugin;

import eapli.jobs4u.app.question.domain.Question;

import java.util.Set;

public class Teste {
    public static void main(String[] args) {
        Main main = new Main();
        Set<Question> set = main.parseQuestionsAndAnswersFile("src/main/java/Plugin/teste.txt");
        String templatePath = main.buildGeneralTemplateForQuestionsAndAnswers("src/main/java/Plugin");
        String path = main.buildTemplateForInterviewModel("src/main/java/Plugin", set);
        for (Question a : set){
            System.out.println(a);
        }
        System.out.println("Path template interview: " + path);
        System.out.println("Path template: " + templatePath);
    }
}
