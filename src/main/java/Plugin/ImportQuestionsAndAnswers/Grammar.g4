grammar Grammar;

start: jobOpeningReference question+;

jobOpeningReference: START_REFERENCE STRING END_REFERENCE;

question: START_QUESTION
    (trueFalseQuestion |
     shortAnswerQuestion |
     singleChoiceQuestion |
     multipleChoiceQuestion |
     numericalQuestion |
     dateQuestion |
     timeQuestion |
     numericScaleQuestion
     ) END_QUESTION;


score: START_SCORE NUMBER END_SCORE;
questionBody: START_QUESTION_BODY STRING choice* END_QUESTION_BODY;
choice: START_CHOICE NUMBER STRING END_CHOICE;

trueFalseQuestion: START_TYPE 'true-false' END_TYPE questionBody trueFalseAnswer;
trueFalseAnswer: START_CORRECT_ANSWER BOOLEAN score? END_CORRECT_ANSWER;

shortAnswerQuestion: START_TYPE 'short-answer' END_TYPE questionBody shortAnswerAnswer+;
shortAnswerAnswer: START_CORRECT_ANSWER STRING score? END_CORRECT_ANSWER;

singleChoiceQuestion: START_TYPE 'single-choice' END_TYPE questionBody singleChoiceAnswer;
singleChoiceAnswer: START_CORRECT_ANSWER NUMBER score? END_CORRECT_ANSWER;

multipleChoiceQuestion: START_TYPE 'multiple-choice' END_TYPE questionBody multipleChoiceAnswer+;
multipleChoiceAnswer: START_CORRECT_ANSWER '[' ( NUMBER ',')* NUMBER ']' score? END_CORRECT_ANSWER;

numericalQuestion: START_TYPE 'numerical' END_TYPE questionBody numericalAnswer;
numericalAnswer: START_CORRECT_ANSWER NUMBER score? END_CORRECT_ANSWER;

dateQuestion: START_TYPE 'date' END_TYPE questionBody dateAnswer;
dateAnswer: START_CORRECT_ANSWER DATE score? END_CORRECT_ANSWER;

timeQuestion: START_TYPE 'time' END_TYPE questionBody timeAnswer;
timeAnswer: START_CORRECT_ANSWER TIME score? END_CORRECT_ANSWER;

numericScaleQuestion: START_TYPE 'numeric-scale' END_TYPE questionBody numericScaleAnswer;
numericScaleAnswer: START_CORRECT_ANSWER SCALE score? END_CORRECT_ANSWER;



// ----- TOKENS -----

START_REFERENCE:        '@start-reference@';
END_REFERENCE:          '@end-reference@';

START_QUESTION:         '@start-question@';
END_QUESTION:           '@end-question@';

START_TYPE:             '@start-type@';
END_TYPE:               '@end-type@';

START_SCORE:		    '@start-score@';
END_SCORE:              '@end-score@';

START_QUESTION_BODY:    '@start-question-body@';
END_QUESTION_BODY:      '@end-question-body@';

START_CORRECT_ANSWER:	'@start-correct-answer@';
END_CORRECT_ANSWER:	    '@end-correct-answer@';

START_CHOICE:           '@start-choice@';
END_CHOICE:             '@end-choice@';

START_VALUE:            '@start-value@';
END_VALUE:              '@end-value@';

//EOI: ';';

// Chars wrapped in double quotes, allowing escaped double quotes, backslashes and newlines
STRING:
	'"' ('\\' [\\"] | ~[\\"])* '"'
	| '"' ( '\\' [\\n] | ~[\\"])* '"';

NUMBER:                 REAL_NUMBER | INTEGER;
REAL_NUMBER:	        [0-9]+ '.' [0-9]+;
INTEGER:			    [0-9]+;
DATE:                   [0-3][0-9]'/'[0-1][0-9]'/'[0-9][0-9][0-9][0-9];
TIME:                   [0-2][0-9]':'[0-5][0-9](':'[0-5][0-9])?;
SCALE:                  '['NUMBER+ '-' NUMBER+ ']';
BOOLEAN:                (([tT][rR][uU][eE]) | ([fF][aA][lL][sS][eE]));

// Skip spaces, tabs and newlines
WS: [ \t\n\r]+ -> skip;

// Skip comments
COMMENT: '//' ~[\r\n]* -> skip;

