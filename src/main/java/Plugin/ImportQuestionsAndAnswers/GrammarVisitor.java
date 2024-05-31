// Generated from ./Grammar.g4 by ANTLR 4.13.1
package Plugin.ImportQuestionsAndAnswers;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#jobOpeningReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobOpeningReference(GrammarParser.JobOpeningReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(GrammarParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#score}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScore(GrammarParser.ScoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#questionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionBody(GrammarParser.QuestionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice(GrammarParser.ChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion(GrammarParser.TrueFalseQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#trueFalseAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseAnswer(GrammarParser.TrueFalseAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAnswerQuestion(GrammarParser.ShortAnswerQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#shortAnswerAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAnswerAnswer(GrammarParser.ShortAnswerAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#singleChoiceQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleChoiceQuestion(GrammarParser.SingleChoiceQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#singleChoiceAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleChoiceAnswer(GrammarParser.SingleChoiceAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#multipleChoiceQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceQuestion(GrammarParser.MultipleChoiceQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#multipleChoiceAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceAnswer(GrammarParser.MultipleChoiceAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#numericalQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion(GrammarParser.NumericalQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#numericalAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalAnswer(GrammarParser.NumericalAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#dateQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateQuestion(GrammarParser.DateQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#dateAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateAnswer(GrammarParser.DateAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#timeQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeQuestion(GrammarParser.TimeQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#timeAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeAnswer(GrammarParser.TimeAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#numericScaleQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericScaleQuestion(GrammarParser.NumericScaleQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#numericScaleAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericScaleAnswer(GrammarParser.NumericScaleAnswerContext ctx);
}