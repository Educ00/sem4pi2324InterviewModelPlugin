// Generated from ./Grammar.g4 by ANTLR 4.13.1
package Plugin.ImportQuestionsAndAnswers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#jobOpeningReference}.
	 * @param ctx the parse tree
	 */
	void enterJobOpeningReference(GrammarParser.JobOpeningReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#jobOpeningReference}.
	 * @param ctx the parse tree
	 */
	void exitJobOpeningReference(GrammarParser.JobOpeningReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(GrammarParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(GrammarParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#score}.
	 * @param ctx the parse tree
	 */
	void enterScore(GrammarParser.ScoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#score}.
	 * @param ctx the parse tree
	 */
	void exitScore(GrammarParser.ScoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#questionBody}.
	 * @param ctx the parse tree
	 */
	void enterQuestionBody(GrammarParser.QuestionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#questionBody}.
	 * @param ctx the parse tree
	 */
	void exitQuestionBody(GrammarParser.QuestionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#choice}.
	 * @param ctx the parse tree
	 */
	void enterChoice(GrammarParser.ChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#choice}.
	 * @param ctx the parse tree
	 */
	void exitChoice(GrammarParser.ChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion(GrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion(GrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#trueFalseAnswer}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseAnswer(GrammarParser.TrueFalseAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#trueFalseAnswer}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseAnswer(GrammarParser.TrueFalseAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 */
	void enterShortAnswerQuestion(GrammarParser.ShortAnswerQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 */
	void exitShortAnswerQuestion(GrammarParser.ShortAnswerQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#shortAnswerAnswer}.
	 * @param ctx the parse tree
	 */
	void enterShortAnswerAnswer(GrammarParser.ShortAnswerAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#shortAnswerAnswer}.
	 * @param ctx the parse tree
	 */
	void exitShortAnswerAnswer(GrammarParser.ShortAnswerAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#singleChoiceQuestion}.
	 * @param ctx the parse tree
	 */
	void enterSingleChoiceQuestion(GrammarParser.SingleChoiceQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#singleChoiceQuestion}.
	 * @param ctx the parse tree
	 */
	void exitSingleChoiceQuestion(GrammarParser.SingleChoiceQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#singleChoiceAnswer}.
	 * @param ctx the parse tree
	 */
	void enterSingleChoiceAnswer(GrammarParser.SingleChoiceAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#singleChoiceAnswer}.
	 * @param ctx the parse tree
	 */
	void exitSingleChoiceAnswer(GrammarParser.SingleChoiceAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#multipleChoiceQuestion}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceQuestion(GrammarParser.MultipleChoiceQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#multipleChoiceQuestion}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceQuestion(GrammarParser.MultipleChoiceQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#multipleChoiceAnswer}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceAnswer(GrammarParser.MultipleChoiceAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#multipleChoiceAnswer}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceAnswer(GrammarParser.MultipleChoiceAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#numericalQuestion}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion(GrammarParser.NumericalQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#numericalQuestion}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion(GrammarParser.NumericalQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#numericalAnswer}.
	 * @param ctx the parse tree
	 */
	void enterNumericalAnswer(GrammarParser.NumericalAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#numericalAnswer}.
	 * @param ctx the parse tree
	 */
	void exitNumericalAnswer(GrammarParser.NumericalAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#dateQuestion}.
	 * @param ctx the parse tree
	 */
	void enterDateQuestion(GrammarParser.DateQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#dateQuestion}.
	 * @param ctx the parse tree
	 */
	void exitDateQuestion(GrammarParser.DateQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#dateAnswer}.
	 * @param ctx the parse tree
	 */
	void enterDateAnswer(GrammarParser.DateAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#dateAnswer}.
	 * @param ctx the parse tree
	 */
	void exitDateAnswer(GrammarParser.DateAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#timeQuestion}.
	 * @param ctx the parse tree
	 */
	void enterTimeQuestion(GrammarParser.TimeQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#timeQuestion}.
	 * @param ctx the parse tree
	 */
	void exitTimeQuestion(GrammarParser.TimeQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#timeAnswer}.
	 * @param ctx the parse tree
	 */
	void enterTimeAnswer(GrammarParser.TimeAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#timeAnswer}.
	 * @param ctx the parse tree
	 */
	void exitTimeAnswer(GrammarParser.TimeAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#numericScaleQuestion}.
	 * @param ctx the parse tree
	 */
	void enterNumericScaleQuestion(GrammarParser.NumericScaleQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#numericScaleQuestion}.
	 * @param ctx the parse tree
	 */
	void exitNumericScaleQuestion(GrammarParser.NumericScaleQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#numericScaleAnswer}.
	 * @param ctx the parse tree
	 */
	void enterNumericScaleAnswer(GrammarParser.NumericScaleAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#numericScaleAnswer}.
	 * @param ctx the parse tree
	 */
	void exitNumericScaleAnswer(GrammarParser.NumericScaleAnswerContext ctx);
}