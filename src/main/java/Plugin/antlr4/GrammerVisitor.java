// Generated from ./Grammer.g4 by ANTLR 4.13.1
package Plugin.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammerParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GrammerParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#jobOpeningReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobOpeningReference(GrammerParser.JobOpeningReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#question}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestion(GrammerParser.QuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#score}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScore(GrammerParser.ScoreContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#questionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuestionBody(GrammerParser.QuestionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoice(GrammerParser.ChoiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#trueFalseQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseQuestion(GrammerParser.TrueFalseQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#trueFalseAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFalseAnswer(GrammerParser.TrueFalseAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#shortAnswerQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAnswerQuestion(GrammerParser.ShortAnswerQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#shortAnswerAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortAnswerAnswer(GrammerParser.ShortAnswerAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#singleChoiceQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleChoiceQuestion(GrammerParser.SingleChoiceQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#singleChoiceAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleChoiceAnswer(GrammerParser.SingleChoiceAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#multipleChoiceQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceQuestion(GrammerParser.MultipleChoiceQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#multipleChoiceAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleChoiceAnswer(GrammerParser.MultipleChoiceAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#numericalQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalQuestion(GrammerParser.NumericalQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#numericalAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericalAnswer(GrammerParser.NumericalAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#dateQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateQuestion(GrammerParser.DateQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#dateAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateAnswer(GrammerParser.DateAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#timeQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeQuestion(GrammerParser.TimeQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#timeAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeAnswer(GrammerParser.TimeAnswerContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#numericScaleQuestion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericScaleQuestion(GrammerParser.NumericScaleQuestionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammerParser#numericScaleAnswer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericScaleAnswer(GrammerParser.NumericScaleAnswerContext ctx);
}