// Generated from ./Grammar.g4 by ANTLR 4.13.1
package Plugin.ImportQuestionsAndAnswers;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, START_REFERENCE=12, END_REFERENCE=13, START_QUESTION=14, 
		END_QUESTION=15, START_TYPE=16, END_TYPE=17, START_SCORE=18, END_SCORE=19, 
		START_QUESTION_BODY=20, END_QUESTION_BODY=21, START_CORRECT_ANSWER=22, 
		END_CORRECT_ANSWER=23, START_CHOICE=24, END_CHOICE=25, START_VALUE=26, 
		END_VALUE=27, STRING=28, NUMBER=29, REAL_NUMBER=30, INTEGER=31, DATE=32, 
		TIME=33, SCALE=34, BOOLEAN=35, WS=36, COMMENT=37;
	public static final int
		RULE_start = 0, RULE_jobOpeningReference = 1, RULE_question = 2, RULE_score = 3, 
		RULE_questionBody = 4, RULE_choice = 5, RULE_trueFalseQuestion = 6, RULE_trueFalseAnswer = 7, 
		RULE_shortAnswerQuestion = 8, RULE_shortAnswerAnswer = 9, RULE_singleChoiceQuestion = 10, 
		RULE_singleChoiceAnswer = 11, RULE_multipleChoiceQuestion = 12, RULE_multipleChoiceAnswer = 13, 
		RULE_numericalQuestion = 14, RULE_numericalAnswer = 15, RULE_dateQuestion = 16, 
		RULE_dateAnswer = 17, RULE_timeQuestion = 18, RULE_timeAnswer = 19, RULE_numericScaleQuestion = 20, 
		RULE_numericScaleAnswer = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "jobOpeningReference", "question", "score", "questionBody", 
			"choice", "trueFalseQuestion", "trueFalseAnswer", "shortAnswerQuestion", 
			"shortAnswerAnswer", "singleChoiceQuestion", "singleChoiceAnswer", "multipleChoiceQuestion", 
			"multipleChoiceAnswer", "numericalQuestion", "numericalAnswer", "dateQuestion", 
			"dateAnswer", "timeQuestion", "timeAnswer", "numericScaleQuestion", "numericScaleAnswer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'true-false'", "'short-answer'", "'single-choice'", "'multiple-choice'", 
			"'['", "','", "']'", "'numerical'", "'date'", "'time'", "'numeric-scale'", 
			"'@start-reference@'", "'@end-reference@'", "'@start-question@'", "'@end-question@'", 
			"'@start-type@'", "'@end-type@'", "'@start-score@'", "'@end-score@'", 
			"'@start-question-body@'", "'@end-question-body@'", "'@start-correct-answer@'", 
			"'@end-correct-answer@'", "'@start-choice@'", "'@end-choice@'", "'@start-value@'", 
			"'@end-value@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"START_REFERENCE", "END_REFERENCE", "START_QUESTION", "END_QUESTION", 
			"START_TYPE", "END_TYPE", "START_SCORE", "END_SCORE", "START_QUESTION_BODY", 
			"END_QUESTION_BODY", "START_CORRECT_ANSWER", "END_CORRECT_ANSWER", "START_CHOICE", 
			"END_CHOICE", "START_VALUE", "END_VALUE", "STRING", "NUMBER", "REAL_NUMBER", 
			"INTEGER", "DATE", "TIME", "SCALE", "BOOLEAN", "WS", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public JobOpeningReferenceContext jobOpeningReference() {
			return getRuleContext(JobOpeningReferenceContext.class,0);
		}
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			jobOpeningReference();
			setState(46); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(45);
				question();
				}
				}
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==START_QUESTION );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JobOpeningReferenceContext extends ParserRuleContext {
		public TerminalNode START_REFERENCE() { return getToken(GrammarParser.START_REFERENCE, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode END_REFERENCE() { return getToken(GrammarParser.END_REFERENCE, 0); }
		public JobOpeningReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jobOpeningReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterJobOpeningReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitJobOpeningReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitJobOpeningReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JobOpeningReferenceContext jobOpeningReference() throws RecognitionException {
		JobOpeningReferenceContext _localctx = new JobOpeningReferenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_jobOpeningReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(START_REFERENCE);
			setState(51);
			match(STRING);
			setState(52);
			match(END_REFERENCE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionContext extends ParserRuleContext {
		public TerminalNode START_QUESTION() { return getToken(GrammarParser.START_QUESTION, 0); }
		public TerminalNode END_QUESTION() { return getToken(GrammarParser.END_QUESTION, 0); }
		public TrueFalseQuestionContext trueFalseQuestion() {
			return getRuleContext(TrueFalseQuestionContext.class,0);
		}
		public ShortAnswerQuestionContext shortAnswerQuestion() {
			return getRuleContext(ShortAnswerQuestionContext.class,0);
		}
		public SingleChoiceQuestionContext singleChoiceQuestion() {
			return getRuleContext(SingleChoiceQuestionContext.class,0);
		}
		public MultipleChoiceQuestionContext multipleChoiceQuestion() {
			return getRuleContext(MultipleChoiceQuestionContext.class,0);
		}
		public NumericalQuestionContext numericalQuestion() {
			return getRuleContext(NumericalQuestionContext.class,0);
		}
		public DateQuestionContext dateQuestion() {
			return getRuleContext(DateQuestionContext.class,0);
		}
		public TimeQuestionContext timeQuestion() {
			return getRuleContext(TimeQuestionContext.class,0);
		}
		public NumericScaleQuestionContext numericScaleQuestion() {
			return getRuleContext(NumericScaleQuestionContext.class,0);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_question);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(START_QUESTION);
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(55);
				trueFalseQuestion();
				}
				break;
			case 2:
				{
				setState(56);
				shortAnswerQuestion();
				}
				break;
			case 3:
				{
				setState(57);
				singleChoiceQuestion();
				}
				break;
			case 4:
				{
				setState(58);
				multipleChoiceQuestion();
				}
				break;
			case 5:
				{
				setState(59);
				numericalQuestion();
				}
				break;
			case 6:
				{
				setState(60);
				dateQuestion();
				}
				break;
			case 7:
				{
				setState(61);
				timeQuestion();
				}
				break;
			case 8:
				{
				setState(62);
				numericScaleQuestion();
				}
				break;
			}
			setState(65);
			match(END_QUESTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScoreContext extends ParserRuleContext {
		public TerminalNode START_SCORE() { return getToken(GrammarParser.START_SCORE, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode END_SCORE() { return getToken(GrammarParser.END_SCORE, 0); }
		public ScoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_score; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterScore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitScore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitScore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScoreContext score() throws RecognitionException {
		ScoreContext _localctx = new ScoreContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_score);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(START_SCORE);
			setState(68);
			match(NUMBER);
			setState(69);
			match(END_SCORE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuestionBodyContext extends ParserRuleContext {
		public TerminalNode START_QUESTION_BODY() { return getToken(GrammarParser.START_QUESTION_BODY, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode END_QUESTION_BODY() { return getToken(GrammarParser.END_QUESTION_BODY, 0); }
		public List<ChoiceContext> choice() {
			return getRuleContexts(ChoiceContext.class);
		}
		public ChoiceContext choice(int i) {
			return getRuleContext(ChoiceContext.class,i);
		}
		public QuestionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_questionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterQuestionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitQuestionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitQuestionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuestionBodyContext questionBody() throws RecognitionException {
		QuestionBodyContext _localctx = new QuestionBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_questionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(START_QUESTION_BODY);
			setState(72);
			match(STRING);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==START_CHOICE) {
				{
				{
				setState(73);
				choice();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(END_QUESTION_BODY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChoiceContext extends ParserRuleContext {
		public TerminalNode START_CHOICE() { return getToken(GrammarParser.START_CHOICE, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode END_CHOICE() { return getToken(GrammarParser.END_CHOICE, 0); }
		public ChoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterChoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitChoice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitChoice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChoiceContext choice() throws RecognitionException {
		ChoiceContext _localctx = new ChoiceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_choice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(START_CHOICE);
			setState(82);
			match(NUMBER);
			setState(83);
			match(STRING);
			setState(84);
			match(END_CHOICE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrueFalseQuestionContext extends ParserRuleContext {
		public TerminalNode START_TYPE() { return getToken(GrammarParser.START_TYPE, 0); }
		public TerminalNode END_TYPE() { return getToken(GrammarParser.END_TYPE, 0); }
		public QuestionBodyContext questionBody() {
			return getRuleContext(QuestionBodyContext.class,0);
		}
		public TrueFalseAnswerContext trueFalseAnswer() {
			return getRuleContext(TrueFalseAnswerContext.class,0);
		}
		public TrueFalseQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTrueFalseQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTrueFalseQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTrueFalseQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseQuestionContext trueFalseQuestion() throws RecognitionException {
		TrueFalseQuestionContext _localctx = new TrueFalseQuestionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_trueFalseQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(START_TYPE);
			setState(87);
			match(T__0);
			setState(88);
			match(END_TYPE);
			setState(89);
			questionBody();
			setState(90);
			trueFalseAnswer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrueFalseAnswerContext extends ParserRuleContext {
		public TerminalNode START_CORRECT_ANSWER() { return getToken(GrammarParser.START_CORRECT_ANSWER, 0); }
		public TerminalNode BOOLEAN() { return getToken(GrammarParser.BOOLEAN, 0); }
		public TerminalNode END_CORRECT_ANSWER() { return getToken(GrammarParser.END_CORRECT_ANSWER, 0); }
		public ScoreContext score() {
			return getRuleContext(ScoreContext.class,0);
		}
		public TrueFalseAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trueFalseAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTrueFalseAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTrueFalseAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTrueFalseAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrueFalseAnswerContext trueFalseAnswer() throws RecognitionException {
		TrueFalseAnswerContext _localctx = new TrueFalseAnswerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_trueFalseAnswer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(START_CORRECT_ANSWER);
			setState(93);
			match(BOOLEAN);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_SCORE) {
				{
				setState(94);
				score();
				}
			}

			setState(97);
			match(END_CORRECT_ANSWER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShortAnswerQuestionContext extends ParserRuleContext {
		public TerminalNode START_TYPE() { return getToken(GrammarParser.START_TYPE, 0); }
		public TerminalNode END_TYPE() { return getToken(GrammarParser.END_TYPE, 0); }
		public QuestionBodyContext questionBody() {
			return getRuleContext(QuestionBodyContext.class,0);
		}
		public List<ShortAnswerAnswerContext> shortAnswerAnswer() {
			return getRuleContexts(ShortAnswerAnswerContext.class);
		}
		public ShortAnswerAnswerContext shortAnswerAnswer(int i) {
			return getRuleContext(ShortAnswerAnswerContext.class,i);
		}
		public ShortAnswerQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortAnswerQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterShortAnswerQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitShortAnswerQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitShortAnswerQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAnswerQuestionContext shortAnswerQuestion() throws RecognitionException {
		ShortAnswerQuestionContext _localctx = new ShortAnswerQuestionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_shortAnswerQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(START_TYPE);
			setState(100);
			match(T__1);
			setState(101);
			match(END_TYPE);
			setState(102);
			questionBody();
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				shortAnswerAnswer();
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==START_CORRECT_ANSWER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShortAnswerAnswerContext extends ParserRuleContext {
		public TerminalNode START_CORRECT_ANSWER() { return getToken(GrammarParser.START_CORRECT_ANSWER, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode END_CORRECT_ANSWER() { return getToken(GrammarParser.END_CORRECT_ANSWER, 0); }
		public ScoreContext score() {
			return getRuleContext(ScoreContext.class,0);
		}
		public ShortAnswerAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortAnswerAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterShortAnswerAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitShortAnswerAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitShortAnswerAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShortAnswerAnswerContext shortAnswerAnswer() throws RecognitionException {
		ShortAnswerAnswerContext _localctx = new ShortAnswerAnswerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_shortAnswerAnswer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(START_CORRECT_ANSWER);
			setState(109);
			match(STRING);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_SCORE) {
				{
				setState(110);
				score();
				}
			}

			setState(113);
			match(END_CORRECT_ANSWER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleChoiceQuestionContext extends ParserRuleContext {
		public TerminalNode START_TYPE() { return getToken(GrammarParser.START_TYPE, 0); }
		public TerminalNode END_TYPE() { return getToken(GrammarParser.END_TYPE, 0); }
		public QuestionBodyContext questionBody() {
			return getRuleContext(QuestionBodyContext.class,0);
		}
		public SingleChoiceAnswerContext singleChoiceAnswer() {
			return getRuleContext(SingleChoiceAnswerContext.class,0);
		}
		public SingleChoiceQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleChoiceQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSingleChoiceQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSingleChoiceQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSingleChoiceQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleChoiceQuestionContext singleChoiceQuestion() throws RecognitionException {
		SingleChoiceQuestionContext _localctx = new SingleChoiceQuestionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_singleChoiceQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(START_TYPE);
			setState(116);
			match(T__2);
			setState(117);
			match(END_TYPE);
			setState(118);
			questionBody();
			setState(119);
			singleChoiceAnswer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleChoiceAnswerContext extends ParserRuleContext {
		public TerminalNode START_CORRECT_ANSWER() { return getToken(GrammarParser.START_CORRECT_ANSWER, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode END_CORRECT_ANSWER() { return getToken(GrammarParser.END_CORRECT_ANSWER, 0); }
		public ScoreContext score() {
			return getRuleContext(ScoreContext.class,0);
		}
		public SingleChoiceAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleChoiceAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSingleChoiceAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSingleChoiceAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSingleChoiceAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleChoiceAnswerContext singleChoiceAnswer() throws RecognitionException {
		SingleChoiceAnswerContext _localctx = new SingleChoiceAnswerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_singleChoiceAnswer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(START_CORRECT_ANSWER);
			setState(122);
			match(NUMBER);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_SCORE) {
				{
				setState(123);
				score();
				}
			}

			setState(126);
			match(END_CORRECT_ANSWER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultipleChoiceQuestionContext extends ParserRuleContext {
		public TerminalNode START_TYPE() { return getToken(GrammarParser.START_TYPE, 0); }
		public TerminalNode END_TYPE() { return getToken(GrammarParser.END_TYPE, 0); }
		public QuestionBodyContext questionBody() {
			return getRuleContext(QuestionBodyContext.class,0);
		}
		public List<MultipleChoiceAnswerContext> multipleChoiceAnswer() {
			return getRuleContexts(MultipleChoiceAnswerContext.class);
		}
		public MultipleChoiceAnswerContext multipleChoiceAnswer(int i) {
			return getRuleContext(MultipleChoiceAnswerContext.class,i);
		}
		public MultipleChoiceQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleChoiceQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMultipleChoiceQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMultipleChoiceQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMultipleChoiceQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceQuestionContext multipleChoiceQuestion() throws RecognitionException {
		MultipleChoiceQuestionContext _localctx = new MultipleChoiceQuestionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multipleChoiceQuestion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(START_TYPE);
			setState(129);
			match(T__3);
			setState(130);
			match(END_TYPE);
			setState(131);
			questionBody();
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				multipleChoiceAnswer();
				}
				}
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==START_CORRECT_ANSWER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultipleChoiceAnswerContext extends ParserRuleContext {
		public TerminalNode START_CORRECT_ANSWER() { return getToken(GrammarParser.START_CORRECT_ANSWER, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(GrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(GrammarParser.NUMBER, i);
		}
		public TerminalNode END_CORRECT_ANSWER() { return getToken(GrammarParser.END_CORRECT_ANSWER, 0); }
		public ScoreContext score() {
			return getRuleContext(ScoreContext.class,0);
		}
		public MultipleChoiceAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleChoiceAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMultipleChoiceAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMultipleChoiceAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMultipleChoiceAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleChoiceAnswerContext multipleChoiceAnswer() throws RecognitionException {
		MultipleChoiceAnswerContext _localctx = new MultipleChoiceAnswerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multipleChoiceAnswer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(START_CORRECT_ANSWER);
			setState(138);
			match(T__4);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					match(NUMBER);
					setState(140);
					match(T__5);
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(146);
			match(NUMBER);
			setState(147);
			match(T__6);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_SCORE) {
				{
				setState(148);
				score();
				}
			}

			setState(151);
			match(END_CORRECT_ANSWER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumericalQuestionContext extends ParserRuleContext {
		public TerminalNode START_TYPE() { return getToken(GrammarParser.START_TYPE, 0); }
		public TerminalNode END_TYPE() { return getToken(GrammarParser.END_TYPE, 0); }
		public QuestionBodyContext questionBody() {
			return getRuleContext(QuestionBodyContext.class,0);
		}
		public NumericalAnswerContext numericalAnswer() {
			return getRuleContext(NumericalAnswerContext.class,0);
		}
		public NumericalQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumericalQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumericalQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNumericalQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalQuestionContext numericalQuestion() throws RecognitionException {
		NumericalQuestionContext _localctx = new NumericalQuestionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_numericalQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(START_TYPE);
			setState(154);
			match(T__7);
			setState(155);
			match(END_TYPE);
			setState(156);
			questionBody();
			setState(157);
			numericalAnswer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumericalAnswerContext extends ParserRuleContext {
		public TerminalNode START_CORRECT_ANSWER() { return getToken(GrammarParser.START_CORRECT_ANSWER, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode END_CORRECT_ANSWER() { return getToken(GrammarParser.END_CORRECT_ANSWER, 0); }
		public ScoreContext score() {
			return getRuleContext(ScoreContext.class,0);
		}
		public NumericalAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericalAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumericalAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumericalAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNumericalAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericalAnswerContext numericalAnswer() throws RecognitionException {
		NumericalAnswerContext _localctx = new NumericalAnswerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_numericalAnswer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(START_CORRECT_ANSWER);
			setState(160);
			match(NUMBER);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_SCORE) {
				{
				setState(161);
				score();
				}
			}

			setState(164);
			match(END_CORRECT_ANSWER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DateQuestionContext extends ParserRuleContext {
		public TerminalNode START_TYPE() { return getToken(GrammarParser.START_TYPE, 0); }
		public TerminalNode END_TYPE() { return getToken(GrammarParser.END_TYPE, 0); }
		public QuestionBodyContext questionBody() {
			return getRuleContext(QuestionBodyContext.class,0);
		}
		public DateAnswerContext dateAnswer() {
			return getRuleContext(DateAnswerContext.class,0);
		}
		public DateQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDateQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDateQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDateQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateQuestionContext dateQuestion() throws RecognitionException {
		DateQuestionContext _localctx = new DateQuestionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dateQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(START_TYPE);
			setState(167);
			match(T__8);
			setState(168);
			match(END_TYPE);
			setState(169);
			questionBody();
			setState(170);
			dateAnswer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DateAnswerContext extends ParserRuleContext {
		public TerminalNode START_CORRECT_ANSWER() { return getToken(GrammarParser.START_CORRECT_ANSWER, 0); }
		public TerminalNode DATE() { return getToken(GrammarParser.DATE, 0); }
		public TerminalNode END_CORRECT_ANSWER() { return getToken(GrammarParser.END_CORRECT_ANSWER, 0); }
		public ScoreContext score() {
			return getRuleContext(ScoreContext.class,0);
		}
		public DateAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDateAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDateAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDateAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateAnswerContext dateAnswer() throws RecognitionException {
		DateAnswerContext _localctx = new DateAnswerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dateAnswer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(START_CORRECT_ANSWER);
			setState(173);
			match(DATE);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_SCORE) {
				{
				setState(174);
				score();
				}
			}

			setState(177);
			match(END_CORRECT_ANSWER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimeQuestionContext extends ParserRuleContext {
		public TerminalNode START_TYPE() { return getToken(GrammarParser.START_TYPE, 0); }
		public TerminalNode END_TYPE() { return getToken(GrammarParser.END_TYPE, 0); }
		public QuestionBodyContext questionBody() {
			return getRuleContext(QuestionBodyContext.class,0);
		}
		public TimeAnswerContext timeAnswer() {
			return getRuleContext(TimeAnswerContext.class,0);
		}
		public TimeQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTimeQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTimeQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTimeQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeQuestionContext timeQuestion() throws RecognitionException {
		TimeQuestionContext _localctx = new TimeQuestionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_timeQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(START_TYPE);
			setState(180);
			match(T__9);
			setState(181);
			match(END_TYPE);
			setState(182);
			questionBody();
			setState(183);
			timeAnswer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimeAnswerContext extends ParserRuleContext {
		public TerminalNode START_CORRECT_ANSWER() { return getToken(GrammarParser.START_CORRECT_ANSWER, 0); }
		public TerminalNode TIME() { return getToken(GrammarParser.TIME, 0); }
		public TerminalNode END_CORRECT_ANSWER() { return getToken(GrammarParser.END_CORRECT_ANSWER, 0); }
		public ScoreContext score() {
			return getRuleContext(ScoreContext.class,0);
		}
		public TimeAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTimeAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTimeAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitTimeAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeAnswerContext timeAnswer() throws RecognitionException {
		TimeAnswerContext _localctx = new TimeAnswerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_timeAnswer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(START_CORRECT_ANSWER);
			setState(186);
			match(TIME);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_SCORE) {
				{
				setState(187);
				score();
				}
			}

			setState(190);
			match(END_CORRECT_ANSWER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumericScaleQuestionContext extends ParserRuleContext {
		public TerminalNode START_TYPE() { return getToken(GrammarParser.START_TYPE, 0); }
		public TerminalNode END_TYPE() { return getToken(GrammarParser.END_TYPE, 0); }
		public QuestionBodyContext questionBody() {
			return getRuleContext(QuestionBodyContext.class,0);
		}
		public NumericScaleAnswerContext numericScaleAnswer() {
			return getRuleContext(NumericScaleAnswerContext.class,0);
		}
		public NumericScaleQuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericScaleQuestion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumericScaleQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumericScaleQuestion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNumericScaleQuestion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericScaleQuestionContext numericScaleQuestion() throws RecognitionException {
		NumericScaleQuestionContext _localctx = new NumericScaleQuestionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_numericScaleQuestion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(START_TYPE);
			setState(193);
			match(T__10);
			setState(194);
			match(END_TYPE);
			setState(195);
			questionBody();
			setState(196);
			numericScaleAnswer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumericScaleAnswerContext extends ParserRuleContext {
		public TerminalNode START_CORRECT_ANSWER() { return getToken(GrammarParser.START_CORRECT_ANSWER, 0); }
		public TerminalNode SCALE() { return getToken(GrammarParser.SCALE, 0); }
		public TerminalNode END_CORRECT_ANSWER() { return getToken(GrammarParser.END_CORRECT_ANSWER, 0); }
		public ScoreContext score() {
			return getRuleContext(ScoreContext.class,0);
		}
		public NumericScaleAnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericScaleAnswer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumericScaleAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumericScaleAnswer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNumericScaleAnswer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericScaleAnswerContext numericScaleAnswer() throws RecognitionException {
		NumericScaleAnswerContext _localctx = new NumericScaleAnswerContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_numericScaleAnswer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(START_CORRECT_ANSWER);
			setState(199);
			match(SCALE);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START_SCORE) {
				{
				setState(200);
				score();
				}
			}

			setState(203);
			match(END_CORRECT_ANSWER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u00ce\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0004\u0000/\b\u0000\u000b\u0000\f\u00000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002@\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004K\b\u0004\n\u0004\f\u0004N\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007`\b\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\bi\b\b\u000b\b\f\bj\u0001\t\u0001"+
		"\t\u0001\t\u0003\tp\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b}\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0004\f\u0086\b\f\u000b\f\f\f\u0087\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u008e\b\r\n\r\f\r\u0091\t\r\u0001\r\u0001\r\u0001\r\u0003\r\u0096\b"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00a3"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u00b0\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00bd\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00ca\b\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0000\u0000\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\u0000\u00cb\u0000,\u0001"+
		"\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u00046\u0001\u0000\u0000"+
		"\u0000\u0006C\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000\u0000\nQ\u0001"+
		"\u0000\u0000\u0000\fV\u0001\u0000\u0000\u0000\u000e\\\u0001\u0000\u0000"+
		"\u0000\u0010c\u0001\u0000\u0000\u0000\u0012l\u0001\u0000\u0000\u0000\u0014"+
		"s\u0001\u0000\u0000\u0000\u0016y\u0001\u0000\u0000\u0000\u0018\u0080\u0001"+
		"\u0000\u0000\u0000\u001a\u0089\u0001\u0000\u0000\u0000\u001c\u0099\u0001"+
		"\u0000\u0000\u0000\u001e\u009f\u0001\u0000\u0000\u0000 \u00a6\u0001\u0000"+
		"\u0000\u0000\"\u00ac\u0001\u0000\u0000\u0000$\u00b3\u0001\u0000\u0000"+
		"\u0000&\u00b9\u0001\u0000\u0000\u0000(\u00c0\u0001\u0000\u0000\u0000*"+
		"\u00c6\u0001\u0000\u0000\u0000,.\u0003\u0002\u0001\u0000-/\u0003\u0004"+
		"\u0002\u0000.-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u00001\u0001\u0001\u0000\u0000"+
		"\u000023\u0005\f\u0000\u000034\u0005\u001c\u0000\u000045\u0005\r\u0000"+
		"\u00005\u0003\u0001\u0000\u0000\u00006?\u0005\u000e\u0000\u00007@\u0003"+
		"\f\u0006\u00008@\u0003\u0010\b\u00009@\u0003\u0014\n\u0000:@\u0003\u0018"+
		"\f\u0000;@\u0003\u001c\u000e\u0000<@\u0003 \u0010\u0000=@\u0003$\u0012"+
		"\u0000>@\u0003(\u0014\u0000?7\u0001\u0000\u0000\u0000?8\u0001\u0000\u0000"+
		"\u0000?9\u0001\u0000\u0000\u0000?:\u0001\u0000\u0000\u0000?;\u0001\u0000"+
		"\u0000\u0000?<\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?>\u0001"+
		"\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0005\u000f\u0000\u0000"+
		"B\u0005\u0001\u0000\u0000\u0000CD\u0005\u0012\u0000\u0000DE\u0005\u001d"+
		"\u0000\u0000EF\u0005\u0013\u0000\u0000F\u0007\u0001\u0000\u0000\u0000"+
		"GH\u0005\u0014\u0000\u0000HL\u0005\u001c\u0000\u0000IK\u0003\n\u0005\u0000"+
		"JI\u0001\u0000\u0000\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000NL\u0001\u0000"+
		"\u0000\u0000OP\u0005\u0015\u0000\u0000P\t\u0001\u0000\u0000\u0000QR\u0005"+
		"\u0018\u0000\u0000RS\u0005\u001d\u0000\u0000ST\u0005\u001c\u0000\u0000"+
		"TU\u0005\u0019\u0000\u0000U\u000b\u0001\u0000\u0000\u0000VW\u0005\u0010"+
		"\u0000\u0000WX\u0005\u0001\u0000\u0000XY\u0005\u0011\u0000\u0000YZ\u0003"+
		"\b\u0004\u0000Z[\u0003\u000e\u0007\u0000[\r\u0001\u0000\u0000\u0000\\"+
		"]\u0005\u0016\u0000\u0000]_\u0005#\u0000\u0000^`\u0003\u0006\u0003\u0000"+
		"_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000"+
		"\u0000ab\u0005\u0017\u0000\u0000b\u000f\u0001\u0000\u0000\u0000cd\u0005"+
		"\u0010\u0000\u0000de\u0005\u0002\u0000\u0000ef\u0005\u0011\u0000\u0000"+
		"fh\u0003\b\u0004\u0000gi\u0003\u0012\t\u0000hg\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000k\u0011\u0001\u0000\u0000\u0000lm\u0005\u0016\u0000\u0000mo\u0005"+
		"\u001c\u0000\u0000np\u0003\u0006\u0003\u0000on\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0005\u0017\u0000"+
		"\u0000r\u0013\u0001\u0000\u0000\u0000st\u0005\u0010\u0000\u0000tu\u0005"+
		"\u0003\u0000\u0000uv\u0005\u0011\u0000\u0000vw\u0003\b\u0004\u0000wx\u0003"+
		"\u0016\u000b\u0000x\u0015\u0001\u0000\u0000\u0000yz\u0005\u0016\u0000"+
		"\u0000z|\u0005\u001d\u0000\u0000{}\u0003\u0006\u0003\u0000|{\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005\u0017\u0000\u0000\u007f\u0017\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u0010\u0000\u0000\u0081\u0082\u0005\u0004\u0000\u0000\u0082\u0083"+
		"\u0005\u0011\u0000\u0000\u0083\u0085\u0003\b\u0004\u0000\u0084\u0086\u0003"+
		"\u001a\r\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000"+
		"\u0000\u0000\u0088\u0019\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0016"+
		"\u0000\u0000\u008a\u008f\u0005\u0005\u0000\u0000\u008b\u008c\u0005\u001d"+
		"\u0000\u0000\u008c\u008e\u0005\u0006\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u001d"+
		"\u0000\u0000\u0093\u0095\u0005\u0007\u0000\u0000\u0094\u0096\u0003\u0006"+
		"\u0003\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0017"+
		"\u0000\u0000\u0098\u001b\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0010"+
		"\u0000\u0000\u009a\u009b\u0005\b\u0000\u0000\u009b\u009c\u0005\u0011\u0000"+
		"\u0000\u009c\u009d\u0003\b\u0004\u0000\u009d\u009e\u0003\u001e\u000f\u0000"+
		"\u009e\u001d\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0016\u0000\u0000"+
		"\u00a0\u00a2\u0005\u001d\u0000\u0000\u00a1\u00a3\u0003\u0006\u0003\u0000"+
		"\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0017\u0000\u0000"+
		"\u00a5\u001f\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0010\u0000\u0000"+
		"\u00a7\u00a8\u0005\t\u0000\u0000\u00a8\u00a9\u0005\u0011\u0000\u0000\u00a9"+
		"\u00aa\u0003\b\u0004\u0000\u00aa\u00ab\u0003\"\u0011\u0000\u00ab!\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005\u0016\u0000\u0000\u00ad\u00af\u0005"+
		" \u0000\u0000\u00ae\u00b0\u0003\u0006\u0003\u0000\u00af\u00ae\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0005\u0017\u0000\u0000\u00b2#\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0005\u0010\u0000\u0000\u00b4\u00b5\u0005\n\u0000\u0000"+
		"\u00b5\u00b6\u0005\u0011\u0000\u0000\u00b6\u00b7\u0003\b\u0004\u0000\u00b7"+
		"\u00b8\u0003&\u0013\u0000\u00b8%\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"+
		"\u0016\u0000\u0000\u00ba\u00bc\u0005!\u0000\u0000\u00bb\u00bd\u0003\u0006"+
		"\u0003\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0017"+
		"\u0000\u0000\u00bf\'\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0010\u0000"+
		"\u0000\u00c1\u00c2\u0005\u000b\u0000\u0000\u00c2\u00c3\u0005\u0011\u0000"+
		"\u0000\u00c3\u00c4\u0003\b\u0004\u0000\u00c4\u00c5\u0003*\u0015\u0000"+
		"\u00c5)\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u0016\u0000\u0000\u00c7"+
		"\u00c9\u0005\"\u0000\u0000\u00c8\u00ca\u0003\u0006\u0003\u0000\u00c9\u00c8"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0017\u0000\u0000\u00cc+\u0001"+
		"\u0000\u0000\u0000\u000e0?L_jo|\u0087\u008f\u0095\u00a2\u00af\u00bc\u00c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}