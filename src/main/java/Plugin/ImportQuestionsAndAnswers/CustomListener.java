package Plugin.ImportQuestionsAndAnswers;

import eapli.jobs4u.app.jobopening.domain.JobOpeningReference;
import eapli.jobs4u.app.question.domain.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomListener extends GrammarBaseListener {
    private Set<Question> questionAndAnswers = new HashSet<>();

    private JobOpeningReference reference;
    private String questionBody;
    private QuestionType questionType;
    private Set<Choice> choices;
    private Set<Answer> correctAnswers;

    private String answerBody;
    private double score;

    private int index;
    private String choiceBody;

    private boolean isToImportQuestions = false;

    public Set<Question> questionSet() {
        return this.questionAndAnswers;
    }

    public void addQuestionByBuilder() {
        QuestionBuilder questionBuilder = new QuestionBuilder();
        questionAndAnswers.add(
                questionBuilder
                        .withJobOpeningReference(reference)
                        .withBody(questionBody)
                        .withChoices(choices)
                        .withCorrectAnswers(correctAnswers)
                        .withType(questionType)
                        .build()
        );
    }

    public void addAnswerByBuilder() {
        AnswerBuilder answerBuilder = new AnswerBuilder();
        answerBuilder.withScore(score);

        if (isToImportQuestions) {
            answerBuilder.withCorrectAnswerBody(answerBody.replaceAll("\"", "").trim());
        } else {
            answerBuilder.withGivenAnswerBody(answerBody.replaceAll("\"", "").trim());
        }

        correctAnswers.add(answerBuilder.build());
    }

    public void addChoiceByBuilder() {
        ChoiceBuilder choiceBuilder = new ChoiceBuilder();
        choices.add(
                choiceBuilder
                        .withIndex(index)
                        .withBody(choiceBody.replaceAll("\"", "").trim())
                        .build()
        );
    }

    @Override
    public void enterJobOpeningReference(GrammarParser.JobOpeningReferenceContext ctx) {
        reference = new JobOpeningReference(ctx.STRING().getText().replaceAll("\"", ""));
    }


    @Override
    public void enterQuestion(GrammarParser.QuestionContext ctx) {
        choices = new HashSet<>();
        correctAnswers = new HashSet<>();
    }

    @Override
    public void exitQuestion(GrammarParser.QuestionContext ctx) {
        addQuestionByBuilder();
    }

    @Override
    public void enterScore(GrammarParser.ScoreContext ctx) {
        isToImportQuestions = true;
        score = Double.parseDouble(ctx.NUMBER().getText());
    }

    @Override
    public void enterQuestionBody(GrammarParser.QuestionBodyContext ctx) {
        questionBody = ctx.STRING().getText().replaceAll("\"", "");
    }

    @Override
    public void enterChoice(GrammarParser.ChoiceContext ctx) {
        index = Integer.parseInt(ctx.NUMBER().getText());
        choiceBody = ctx.STRING().getText();
    }

    @Override
    public void exitChoice(GrammarParser.ChoiceContext ctx) {
        addChoiceByBuilder();
    }

    @Override
    public void enterTrueFalseQuestion(GrammarParser.TrueFalseQuestionContext ctx) {
        questionType = QuestionType.TrueFalse;
    }


    @Override
    public void enterTrueFalseAnswer(GrammarParser.TrueFalseAnswerContext ctx) {
        answerBody = ctx.BOOLEAN().getText();
    }

    @Override
    public void exitTrueFalseAnswer(GrammarParser.TrueFalseAnswerContext ctx) {
        addAnswerByBuilder();
    }


    @Override
    public void enterShortAnswerQuestion(GrammarParser.ShortAnswerQuestionContext ctx) {
        questionType = QuestionType.ShortAnswer;
    }

    @Override
    public void enterShortAnswerAnswer(GrammarParser.ShortAnswerAnswerContext ctx) {
        answerBody = ctx.STRING().getText();
    }

    @Override
    public void exitShortAnswerAnswer(GrammarParser.ShortAnswerAnswerContext ctx) {
        addAnswerByBuilder();
    }

    @Override
    public void enterSingleChoiceQuestion(GrammarParser.SingleChoiceQuestionContext ctx) {
        questionType = QuestionType.SingleChoice;
    }

    @Override
    public void enterSingleChoiceAnswer(GrammarParser.SingleChoiceAnswerContext ctx) {
        answerBody = ctx.NUMBER().getText();
    }

    @Override
    public void exitSingleChoiceAnswer(GrammarParser.SingleChoiceAnswerContext ctx) {
        addAnswerByBuilder();
    }

    @Override
    public void enterMultipleChoiceQuestion(GrammarParser.MultipleChoiceQuestionContext ctx) {
        questionType = QuestionType.MultipleChoice;
    }

    @Override
    public void enterMultipleChoiceAnswer(GrammarParser.MultipleChoiceAnswerContext ctx) {
        Iterator<TerminalNode> iterator = ctx.NUMBER().iterator();
        answerBody = iterator.next().getText();
        while (iterator.hasNext()) {
            answerBody = answerBody
                    .concat(",")
                    .concat(iterator.next().getText());
        }
    }

    @Override
    public void exitMultipleChoiceAnswer(GrammarParser.MultipleChoiceAnswerContext ctx) {
        addAnswerByBuilder();
    }

    @Override
    public void enterNumericalQuestion(GrammarParser.NumericalQuestionContext ctx) {
        questionType = QuestionType.Numerical;
    }

    @Override
    public void enterNumericalAnswer(GrammarParser.NumericalAnswerContext ctx) {
        answerBody = ctx.NUMBER().getText();
    }

    @Override
    public void exitNumericalAnswer(GrammarParser.NumericalAnswerContext ctx) {
        addAnswerByBuilder();
    }

    @Override
    public void enterDateQuestion(GrammarParser.DateQuestionContext ctx) {
        questionType = QuestionType.Date;
    }

    @Override
    public void enterDateAnswer(GrammarParser.DateAnswerContext ctx) {
        answerBody = ctx.DATE().getText();
    }

    @Override
    public void exitDateAnswer(GrammarParser.DateAnswerContext ctx) {
        addAnswerByBuilder();
    }

    @Override
    public void enterTimeQuestion(GrammarParser.TimeQuestionContext ctx) {
        questionType = QuestionType.Time;
    }

    @Override
    public void enterTimeAnswer(GrammarParser.TimeAnswerContext ctx) {
        answerBody = ctx.TIME().getText();
    }

    @Override
    public void exitTimeAnswer(GrammarParser.TimeAnswerContext ctx) {
        addAnswerByBuilder();
    }

    @Override
    public void enterNumericScaleQuestion(GrammarParser.NumericScaleQuestionContext ctx) {
        questionType = QuestionType.NumericScale;
    }

    @Override
    public void enterNumericScaleAnswer(GrammarParser.NumericScaleAnswerContext ctx) {
        answerBody = ctx.SCALE().getText();
    }

    @Override
    public void exitNumericScaleAnswer(GrammarParser.NumericScaleAnswerContext ctx) {
        addAnswerByBuilder();
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    @Override
    public void visitTerminal(TerminalNode node) {
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
    }
}
