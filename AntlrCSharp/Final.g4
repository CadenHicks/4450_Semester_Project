grammar Final;

/*
 * Parser Rules
 */
//assign              : (INTEGER | ID)  ARITHMETIC? EQUALS (INTEGER | ID) (ARITHMETIC (INTEGER | ID))* NEWLINE;

prog: line* EOF; 

//expr:	line;

line				: NEWLINE* (assign comment? | statements comment? | loopControl comment? | funcCall comment? | comment ) NEWLINE*;	
assign				: ID ARITHMETIC? EQUALS CON? (literals | ID) arithmetic;
literals			: (STRING | INTEGER | BOOLEAN | FLOATS);
arithmetic          : (ARITHMETIC (INTEGER | ID | FLOATS | STRING))*
                    | (condition)*
                    ;
statements          : structureIf | whileState | funcDef | forState;
structureIf         : ifState INDENT? elifState?? elseState??;
ifState             : IF condition+ END NEWLINE? (block+|line);
elifState           : (ELIF condition+ END NEWLINE? (block+ |line))+;
elseState           : ELSE END NEWLINE? block+;
condition           : CON? (literals | ID) arithmetic ((CON | EQU) CON? (literals | ID) arithmetic)? CON*;
block               : INDENT line INDENT?;
whileState          : WHILE condition+ END NEWLINE? (block+|line);
forState            : FOR ID IN (literals | ID | funcCall) END NEWLINE? (block+|line);
funcDef             : DEF ID '(' args ')' END NEWLINE? (block+|line);
funcCall            : ID '(' ((ID | literals) (',' (ID | literals))*)? ')';
args                : ('*')?ID (EQU literals)?((',' args)?);
comment             : '#' ~( '\r' | '\n' )*;
loopControl         : (BREAK | CONTINUE);

/*
 * Lexer Rules
 */

 fragment LOWERCASE : [a-z] ;
 fragment UPPERCASE : [A-Z] ;

 CON        		: ('and'|'or'|'not');
 EQU				: ('=='|'!='|'<'|'<='|'>'|'>=');
 IF					: ('if');
 ELIF               : ('elif');
 ELSE				: ('else');
 WHILE              : ('while');
 FOR                : ('for');
 IN                 : ('in');
 BREAK              : ('break');
 CONTINUE           : ('continue');
 DEF                : ('def');
 END				: (':');
 NEWLINE			: [\r\n]+;
 INDENT				: [\t]+;
 WS					: [ ]+ -> skip;
 EQUALS             : ('=');
 ARITHMETIC         : ('+'|'-'|'*'|'/'|'%');
 INTEGER            : '-'? [0-9]+;
 BOOLEAN			: ('True' |'true'|'False'|'false');
 FLOATS				: '-'? [0-9]* '.' [0-9]+;
 STRING				: ('"'.*?'"');  
 ID                 : (LOWERCASE | UPPERCASE)+;