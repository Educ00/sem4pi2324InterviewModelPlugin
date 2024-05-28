// Generated from ./Grammer.g4 by ANTLR 4.13.1
package Plugin.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammerParser}.
 */
public interface GrammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammerParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GrammerParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GrammerParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#jobOpeningReference}.
	 * @param ctx the parse tree
	 */
	void enterJobOpeningReference(GrammerParser.JobOpeningReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#jobOpeningReference}.
	 * @param ctx the parse tree
	 */
	void exitJobOpeningReference(GrammerParser.JobOpeningReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(GrammerParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(GrammerParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#score}.
	 * @param ctx the parse tree
	 */
	void enterScore(GrammerParser.ScoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#score}.
	 * @param ctx the parse tree
	 */
	void exitScore(GrammerParser.ScoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#questionBody}.
	 * @param ctx the parse tree
	 */
	void enterQuestionBody(GrammerParser.QuestionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#questionBody}.
	 * @param ctx the parse tree
	 */
	void exitQuestionBody(GrammerParser.QuestionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#choice}.
	 * @param ctx the parse tree
	 */
	void enterChoice(GrammerParser.ChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#choice}.
	 * @param ctx the parse tree
	 */
	void exitChoice(GrammerParser.ChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseQuestion(GrammerParser.TrueFalseQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseQuestion(GrammerParser.TrueFalseQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#trueFalseAnswer}.
	 * @param ctx the parse tree
	 */
	void enterTrueFalseAnswer(GrammerParser.TrueFalseAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#trueFalseAnswer}.
	 * @param ctx the parse tree
	 */
	void exitTrueFalseAnswer(GrammerParser.TrueFalseAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 */
	void enterShortAnswerQuestion(GrammerParser.ShortAnswerQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 */
	void exitShortAnswerQuestion(GrammerParser.ShortAnswerQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#shortAnswerAnswer}.
	 * @param ctx the parse tree
	 */
	void enterShortAnswerAnswer(GrammerParser.ShortAnswerAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#shortAnswerAnswer}.
	 * @param ctx the parse tree
	 */
	void exitShortAnswerAnswer(GrammerParser.ShortAnswerAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#singleChoiceQuestion}.
	 * @param ctx the parse tree
	 */
	void enterSingleChoiceQuestion(GrammerParser.SingleChoiceQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#singleChoiceQuestion}.
	 * @param ctx the parse tree
	 */
	void exitSingleChoiceQuestion(GrammerParser.SingleChoiceQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#singleChoiceAnswer}.
	 * @param ctx the parse tree
	 */
	void enterSingleChoiceAnswer(GrammerParser.SingleChoiceAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#singleChoiceAnswer}.
	 * @param ctx the parse tree
	 */
	void exitSingleChoiceAnswer(GrammerParser.SingleChoiceAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#multipleChoiceQuestion}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceQuestion(GrammerParser.MultipleChoiceQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#multipleChoiceQuestion}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceQuestion(GrammerParser.MultipleChoiceQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#multipleChoiceAnswer}.
	 * @param ctx the parse tree
	 */
	void enterMultipleChoiceAnswer(GrammerParser.MultipleChoiceAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#multipleChoiceAnswer}.
	 * @param ctx the parse tree
	 */
	void exitMultipleChoiceAnswer(GrammerParser.MultipleChoiceAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#numericalQuestion}.
	 * @param ctx the parse tree
	 */
	void enterNumericalQuestion(GrammerParser.NumericalQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#numericalQuestion}.
	 * @param ctx the parse tree
	 */
	void exitNumericalQuestion(GrammerParser.NumericalQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#numericalAnswer}.
	 * @param ctx the parse tree
	 */
	void enterNumericalAnswer(GrammerParser.NumericalAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#numericalAnswer}.
	 * @param ctx the parse tree
	 */
	void exitNumericalAnswer(GrammerParser.NumericalAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#dateQuestion}.
	 * @param ctx the parse tree
	 */
	void enterDateQuestion(GrammerParser.DateQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#dateQuestion}.
	 * @param ctx the parse tree
	 */
	void exitDateQuestion(GrammerParser.DateQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#dateAnswer}.
	 * @param ctx the parse tree
	 */
	void enterDateAnswer(GrammerParser.DateAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#dateAnswer}.
	 * @param ctx the parse tree
	 */
	void exitDateAnswer(GrammerParser.DateAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#timeQuestion}.
	 * @param ctx the parse tree
	 */
	void enterTimeQuestion(GrammerParser.TimeQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#timeQuestion}.
	 * @param ctx the parse tree
	 */
	void exitTimeQuestion(GrammerParser.TimeQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#timeAnswer}.
	 * @param ctx the parse tree
	 */
	void enterTimeAnswer(GrammerParser.TimeAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#timeAnswer}.
	 * @param ctx the parse tree
	 */
	void exitTimeAnswer(GrammerParser.TimeAnswerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#numericScaleQuestion}.
	 * @param ctx the parse tree
	 */
	void enterNumericScaleQuestion(GrammerParser.NumericScaleQuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#numericScaleQuestion}.
	 * @param ctx the parse tree
	 */
	void exitNumericScaleQuestion(GrammerParser.NumericScaleQuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammerParser#numericScaleAnswer}.
	 * @param ctx the parse tree
	 */
	void enterNumericScaleAnswer(GrammerParser.NumericScaleAnswerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammerParser#numericScaleAnswer}.
	 * @param ctx the parse tree
	 */
	void exitNumericScaleAnswer(GrammerParser.NumericScaleAnswerContext ctx);
}