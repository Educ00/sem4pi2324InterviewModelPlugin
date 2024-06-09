package Plugin;

import Plugin.ImportQuestionsAndAnswers.CustomListener;
import Plugin.ImportQuestionsAndAnswers.GrammarLexer;
import Plugin.ImportQuestionsAndAnswers.GrammarParser;
import eapli.jobs4u.app.plugin.Application.InterviewModelImporter;
import eapli.jobs4u.app.question.domain.Answer;
import eapli.jobs4u.app.question.domain.Choice;
import eapli.jobs4u.app.question.domain.Question;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.HashSet;
import java.util.Set;

public class Main implements InterviewModelImporter {

    @Override
    public Set<Question> parseFile(String inputFilePath) {
        Set<Question> setToReturn = new HashSet<>();
        try {
            // Create a lexer that feeds off of input CharStream
            GrammarLexer lexer = new GrammarLexer(CharStreams.fromFileName(inputFilePath));
            // Create a buffer of tokens between the lexer and parser
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Create a parser that feeds off the tokens buffer
            GrammarParser parser = new GrammarParser(tokens);
            // Begin parsing at the start rule
            ParseTree tree = parser.start();
            // Create a walker for walking the parse tree
            ParseTreeWalker walker = new ParseTreeWalker();
            // Walk the tree with our custom listener
            CustomListener listener = new CustomListener();
            walker.walk(listener, tree);
            setToReturn = listener.questionSet();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return setToReturn;
    }

    @Override
    public String buildGeneralTemplateForQuestionsAndAnswers(String outputPath) {
        try {
            File file = new File(outputPath);
            if (!file.exists() || file.isFile()) {
                throw new IllegalArgumentException("Invalid file path. HINT: Should be a directory.");
            }
            outputPath = outputPath.concat(File.separator).concat("ImportQuestionsTemplate.txt");
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(outputPath), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {

            writer.write("@start-reference@ \"Job Reference (beetween \")\" @end-reference@");
            writer.newLine();
            writer.newLine();
            writer.write("@start-question@\n" +
                    "    @start-type@ true-false @end-type@\n" +
                    "    @start-question-body@ \"Question (between quotation marks)\" @end-question-body@\n" +
                    "    @start-correct-answer@ true/false \n" +
                    "        @start-score@ 0 @end-score@\n" +
                    "    @end-correct-answer@\n" +
                    "@end-question@");
            writer.newLine();
            writer.newLine();
            writer.write("@start-question@\n" +
                    "    @start-type@ short-answer @end-type@\n" +
                    "    @start-question-body@ \"Question (between quotation marks)\" @end-question-body@\n" +
                    "    @start-correct-answer@ \"Answer (between quotation marks)\"\n" +
                    "        @start-score@ 0 @end-score@\n" +
                    "    @end-correct-answer@\n" +
                    "    @start-correct-answer@ \"Answer (between quotation marks)\"\n" +
                    "        @start-score@ 0 @end-score@\n" +
                    "    @end-correct-answer@\n" +
                    "@end-question@");
            writer.newLine();
            writer.newLine();
            writer.write("@start-question@\n" +
                    "    @start-type@ single-choice @end-type@\n" +
                    "    @start-question-body@ \"Question (between quotation marks)\"\n" +
                    "        @start-choice@ 1 \"Choice (between quotation marks)\" @end-choice@\n" +
                    "        @start-choice@ 2 \"Choice (between quotation marks)\" @end-choice@\n" +
                    "        @start-choice@ 3 \"Choice (between quotation marks)\" @end-choice@\n" +
                    "    @end-question-body@\n" +
                    "    @start-correct-answer@ 1\n" +
                    "        @start-score@ 0 @end-score@\n" +
                    "    @end-correct-answer@\n" +
                    "@end-question@");
            writer.newLine();
            writer.newLine();
            writer.write("@start-question@\n" +
                    "    @start-type@ multiple-choice @end-type@\n" +
                    "    @start-question-body@ \"Question (between quotation marks)\"\n" +
                    "        @start-choice@ 1 \"Choice (between quotation marks)\" @end-choice@\n" +
                    "        @start-choice@ 2 \"Choice (between quotation marks)\" @end-choice@\n" +
                    "        @start-choice@ 3 \"Choice (between quotation marks)\" @end-choice@\n" +
                    "    @end-question-body@\n" +
                    "    @start-correct-answer@ [2, 3, 1]\n" +
                    "        @start-score@ 0 @end-score@\n" +
                    "    @end-correct-answer@\n" +
                    "@end-question@");
            writer.newLine();
            writer.newLine();
            writer.write("@start-question@\n" +
                    "    @start-type@ numerical @end-type@\n" +
                    "    @start-question-body@ \"Question (between quotation marks)\" @end-question-body@\n" +
                    "    @start-correct-answer@ 1\n" +
                    "        @start-score@ 0 @end-score@\n" +
                    "    @end-correct-answer@\n" +
                    "@end-question@");
            writer.newLine();
            writer.newLine();
            writer.write("@start-question@\n" +
                    "    @start-type@ date @end-type@\n" +
                    "    @start-question-body@ \"Question (between quotation marks)\" @end-question-body@\n" +
                    "    @start-correct-answer@ dd/mm/yyyy\n" +
                    "        @start-score@ 0 @end-score@\n" +
                    "    @end-correct-answer@\n" +
                    "@end-question@");
            writer.newLine();
            writer.newLine();
            writer.write("@start-question@\n" +
                    "    @start-type@ time @end-type@\n" +
                    "    @start-question-body@ \"Question (between quotation marks)\" @end-question-body@\n" +
                    "    @start-correct-answer@ hh:mm:ss\n" +
                    "        @start-score@ 0 @end-score@\n" +
                    "    @end-correct-answer@\n" +
                    "@end-question@");
            writer.newLine();
            writer.newLine();
            writer.write("@start-question@\n" +
                    "    @start-type@ numeric-scale @end-type@\n" +
                    "    @start-question-body@ \"Question (between quotation marks)\" @end-question-body@\n" +
                    "    @start-correct-answer@ [1-10]\n" +
                    "        @start-score@ 0 @end-score@\n" +
                    "    @end-correct-answer@\n" +
                    "@end-question@");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return outputPath;
    }


    @Override
    public String buildTemplateForInterviewModel(String outputFilePath, Set<Question> questionSet) {
        try {
            File file = new File(outputFilePath);
            if (!file.exists() || file.isFile()) {
                throw new IllegalArgumentException("Invalid file path. HINT: Should be a directory.");
            }
            outputFilePath = outputFilePath.concat(File.separator).concat("template_for_interview_of_"+questionSet.iterator().next().jobOpeningReference().toString()+".txt");
        } catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(outputFilePath), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING)) {
            writer.write("// --------------------------------------------------------------------------------");
            writer.newLine();
            writer.write("// ONLY WRITE ON THE ANSWER FIElDS.");
            writer.newLine();
            writer.write("// DO NOT CHANGE THE ORDER OR ADD SPACES, TABS OR OTHER CHARACTERS IN THE DOCUMENT");
            writer.newLine();
            writer.write("// --------------------------------------------------------------------------------");
            writer.newLine();
            writer.newLine();
            writer.write("@start-reference@ \"" + questionSet.iterator().next().jobOpeningReference().toString() +"\" @end-reference@");
            writer.newLine();
            writer.newLine();
            for (Question question : questionSet){
                switch (question.questionType()){
                    case TrueFalse:
                        writer.write("@start-question@\n" +
                                "    @start-type@ true-false @end-type@\n" +
                                "    @start-question-body@ \"" + question.body() + "\" ");
                        writer.newLine();
                        if (!question.choices().isEmpty()){
                            for (Choice choice : question.choices()){
                                writer.write("        @start-choice@ " + choice.index() + " " + "\"" + choice.body() + "\" @end-choice@\n");
                            }
                        }
                        writer.write("    @end-question-body@\n");
                        writer.write("    @start-correct-answer@  @end-correct-answer@\n @end-question@");
                        break;
                    case ShortAnswer:
                        writer.write("@start-question@\n" +
                                "    @start-type@ short-answer @end-type@\n" +
                                "    @start-question-body@ \"" + question.body() + "\" ");
                        writer.newLine();
                        if (!question.choices().isEmpty()){
                            for (Choice choice : question.choices()){
                                writer.write("        @start-choice@ " + choice.index() + " " + "\"" + choice.body() + "\" @end-choice@\n");
                            }
                        }
                        writer.write("    @end-question-body@\n");
                        writer.write("    @start-correct-answer@  @end-correct-answer@\n @end-question@");
                        break;
                    case SingleChoice:
                        writer.write("@start-question@\n" +
                                "    @start-type@ single-choice @end-type@\n" +
                                "    @start-question-body@ \"" + question.body() + "\" ");
                        writer.newLine();
                        if (!question.choices().isEmpty()){
                            for (Choice choice : question.choices()){
                                writer.write("        @start-choice@ " + choice.index() + " " + "\"" + choice.body() + "\" @end-choice@\n");
                            }
                        }
                        writer.write("    @end-question-body@\n");
                        writer.write("    @start-correct-answer@  @end-correct-answer@\n @end-question@");
                        break;
                    case MultipleChoice:
                        writer.write("@start-question@\n" +
                                "    @start-type@ multiple-choice @end-type@\n" +
                                "    @start-question-body@ \"" + question.body() + "\" ");
                        writer.newLine();
                        if (!question.choices().isEmpty()){
                            for (Choice choice : question.choices()){
                                writer.write("        @start-choice@ " + choice.index() + " " + "\"" + choice.body() + "\" @end-choice@\n");
                            }
                        }
                        writer.write("    @end-question-body@\n");
                        writer.write("    @start-correct-answer@  @end-correct-answer@\n @end-question@");
                        break;
                    case Numerical:
                        writer.write("@start-question@\n" +
                                "    @start-type@ numerical @end-type@\n" +
                                "    @start-question-body@ \"" + question.body() + "\" ");
                        writer.newLine();
                        if (!question.choices().isEmpty()){
                            for (Choice choice : question.choices()){
                                writer.write("        @start-choice@ " + choice.index() + " " + "\"" + choice.body() + "\" @end-choice@\n");
                            }
                        }
                        writer.write("    @end-question-body@\n");
                        writer.write("    @start-correct-answer@  @end-correct-answer@\n @end-question@");
                        break;
                    case Date:
                        writer.write("@start-question@\n" +
                                "    @start-type@ date @end-type@\n" +
                                "    @start-question-body@ \"" + question.body() + "\" ");
                        writer.newLine();
                        if (!question.choices().isEmpty()){
                            for (Choice choice : question.choices()){
                                writer.write("        @start-choice@ " + choice.index() + " " + "\"" + choice.body() + "\" @end-choice@\n");
                            }
                        }
                        writer.write("    @end-question-body@\n");
                        writer.write("    @start-correct-answer@  @end-correct-answer@\n @end-question@");
                        break;
                    case Time:
                        writer.write("@start-question@\n" +
                                "    @start-type@ time @end-type@\n" +
                                "    @start-question-body@ \"" + question.body() + "\" ");
                        writer.newLine();
                        if (!question.choices().isEmpty()){
                            for (Choice choice : question.choices()){
                                writer.write("        @start-choice@ " + choice.index() + " " + "\"" + choice.body() + "\" @end-choice@\n");
                            }
                        }
                        writer.write("    @end-question-body@\n");
                        writer.write("    @start-correct-answer@  @end-correct-answer@\n @end-question@");
                        break;
                    case NumericScale:
                        writer.write("@start-question@\n" +
                                "    @start-type@ numeric-scale @end-type@\n" +
                                "    @start-question-body@ \"" + question.body() + "\" ");
                        writer.newLine();
                        if (!question.choices().isEmpty()){
                            for (Choice choice : question.choices()){
                                writer.write("        @start-choice@ " + choice.index() + " " + "\"" + choice.body() + "\" @end-choice@\n");
                            }
                        }
                        writer.write("    @end-question-body@\n");
                        writer.write("    @start-correct-answer@  @end-correct-answer@\n @end-question@");
                        break;
                }
                writer.newLine();
                writer.newLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return outputFilePath;
    }

    @Override
    public double gradeInterview(Set<Question> interviewQuestions, Set<Question> scoreQuestions) {
        double score = 0;
        for (Question interviewQuestion : interviewQuestions){
            for (Question scoreQuestion : scoreQuestions){
                if (interviewQuestion.body().equals(scoreQuestion.body())){
                    for (Answer interviewAnswer : interviewQuestion.answers()){
                        for (Answer scoreAnswer : scoreQuestion.answers()){
                            if (interviewAnswer.givenAnswerBody().equals(scoreAnswer.correctAnswerBody())){
                                score += scoreAnswer.score();
                            }
                        }
                    }
                }
            }
        }
        return score;
    }
}