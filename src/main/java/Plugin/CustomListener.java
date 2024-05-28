package Plugin;

import Plugin.antlr4.GrammerBaseListener;
import Plugin.antlr4.GrammerParser;

import eapli.jobs4u.app.jobopening.domain.JobOpeningReference;
import eapli.jobs4u.app.question.domain.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CustomListener extends GrammerBaseListener {
    private Set<Question> questionAndAnswers = new HashSet<>();

    private JobOpeningReference reference;
    private String questionBody;
    private QuestionType questionType;
    private Set<Choice> choices;
    private Set<Answer> correctAnswers;

    private String multipleChoiceAnswer;
    private String answerBody;
    private double score;

    private int index;
    private String choiceBody;


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
        correctAnswers.add(
                answerBuilder
                        .withScore(score)
                        .withBody(answerBody.replaceAll("\"", "").trim())
                        .build()
        );
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

    @Override public void enterJobOpeningReference(GrammerParser.JobOpeningReferenceContext ctx) {
        reference = new JobOpeningReference(ctx.STRING().getText().replaceAll("\"", ""));
    }


    @Override
    public void enterQuestion(GrammerParser.QuestionContext ctx) {
        choices = new HashSet<>();
        correctAnswers = new HashSet<>();
    }

    @Override
    public void exitQuestion(GrammerParser.QuestionContext ctx) {
        addQuestionByBuilder();
    }

    @Override
    public void enterScore(GrammerParser.ScoreContext ctx) {
        score = Double.parseDouble(ctx.NUMBER().getText());
    }

    @Override
    public void enterQuestionBody(GrammerParser.QuestionBodyContext ctx) {
        questionBody = ctx.STRING().getText().replaceAll("\"", "");
    }

    @Override
    public void enterChoice(GrammerParser.ChoiceContext ctx) {
        index = Integer.parseInt(ctx.NUMBER().getText());
        choiceBody = ctx.STRING().getText();
    }

    @Override
    public void exitChoice(GrammerParser.ChoiceContext ctx) {
        addChoiceByBuilder();
    }

    @Override
    public void enterTrueFalseQuestion(GrammerParser.TrueFalseQuestionContext ctx) {
        questionType = QuestionType.TrueFalse;
    }


    @Override
    public void enterTrueFalseAnswer(GrammerParser.TrueFalseAnswerContext ctx) {
        answerBody = ctx.BOOLEAN().getText();
    }

    @Override
    public void exitTrueFalseAnswer(GrammerParser.TrueFalseAnswerContext ctx) {
        addAnswerByBuilder();
    }


    @Override
    public void enterShortAnswerQuestion(GrammerParser.ShortAnswerQuestionContext ctx) {
        questionType = QuestionType.ShortAnswer;
    }

    @Override
    public void enterShortAnswerAnswer(GrammerParser.ShortAnswerAnswerContext ctx) {
        answerBody = ctx.STRING().getText();
    }

    @Override
    public void exitShortAnswerAnswer(GrammerParser.ShortAnswerAnswerContext ctx) {
        addAnswerByBuilder();
    }

    @Override
    public void enterSingleChoiceQuestion(GrammerParser.SingleChoiceQuestionContext ctx) {
        questionType = QuestionType.SingleChoice;
    }

    @Override
    public void enterSingleChoiceAnswer(GrammerParser.SingleChoiceAnswerContext ctx) {
        answerBody = ctx.NUMBER().getText();
    }

    @Override
    public void exitSingleChoiceAnswer(GrammerParser.SingleChoiceAnswerContext ctx) {
        addAnswerByBuilder();
    }

    @Override
    public void enterMultipleChoiceQuestion(GrammerParser.MultipleChoiceQuestionContext ctx) {
        questionType = QuestionType.MultipleChoice;
    }

    @Override
    public void enterMultipleChoiceAnswer(GrammerParser.MultipleChoiceAnswerContext ctx) {
        Iterator<TerminalNode> iterator = ctx.NUMBER().iterator();
        answerBody = iterator.next().getText();
        while (iterator.hasNext()) {
            answerBody = answerBody
                    .concat(",")
                    .concat(iterator.next().getText());
        }
    }

    @Override
    public void exitMultipleChoiceAnswer(GrammerParser.MultipleChoiceAnswerContext ctx) {
        addAnswerByBuilder();
    }

    @Override
    public void enterNumericalQuestion(GrammerParser.NumericalQuestionContext ctx) {
        questionType = QuestionType.Numerical;
    }

    @Override
    public void enterNumericalAnswer(GrammerParser.NumericalAnswerContext ctx) {
        answerBody = ctx.NUMBER().getText();
    }

    @Override
    public void exitNumericalAnswer(GrammerParser.NumericalAnswerContext ctx) {
        addAnswerByBuilder();
    }

    @Override
    public void enterDateQuestion(GrammerParser.DateQuestionContext ctx) {
        questionType = QuestionType.Date;
    }

    @Override
    public void enterDateAnswer(GrammerParser.DateAnswerContext ctx) {
        answerBody = ctx.DATE().getText();
    }

    @Override
    public void exitDateAnswer(GrammerParser.DateAnswerContext ctx) {
        addAnswerByBuilder();
    }

    @Override
    public void enterTimeQuestion(GrammerParser.TimeQuestionContext ctx) {
        questionType = QuestionType.Time;
    }

    @Override
    public void enterTimeAnswer(GrammerParser.TimeAnswerContext ctx) {
        answerBody = ctx.TIME().getText();
    }

    @Override
    public void exitTimeAnswer(GrammerParser.TimeAnswerContext ctx) {
        addAnswerByBuilder();
    }

    @Override
    public void enterNumericScaleQuestion(GrammerParser.NumericScaleQuestionContext ctx) {
        questionType = QuestionType.NumericScale;
    }

    @Override
    public void enterNumericScaleAnswer(GrammerParser.NumericScaleAnswerContext ctx) {
        answerBody = ctx.SCALE().getText();
    }

    @Override
    public void exitNumericScaleAnswer(GrammerParser.NumericScaleAnswerContext ctx) {
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
