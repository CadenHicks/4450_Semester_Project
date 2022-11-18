grammar Final;

/*
 * Parser Rules
 */
//assign              : (INTEGER | ID)  ARITHMETIC? EQUALS (INTEGER | ID) (ARITHMETIC (INTEGER | ID))* NEWLINE;

prog: line* EOF; 

//expr:	line;

line				: NEWLINE* (assign | statements) NEWLINE*;	
assign				: ID ARITHMETIC? EQUALS CON? (literals | ID) arithmetic;
literals			: (STRING | INTEGER | BOOLEAN | FLOATS);
arithmetic          : (ARITHMETIC (INTEGER | ID | FLOATS | STRING))*
                    | (condition)*
                    ;
statements          : structureIf;
structureIf         : ifState elifState? elseState?;
ifState             : IF condition+ END NEWLINE? block+;
elifState           : (ELIF condition+ END NEWLINE? block+)+;
elseState           : ELSE END NEWLINE? block+;
condition           : CON? (literals | ID) arithmetic ((CON | EQU) CON? (literals | ID) arithmetic)? CON*;
block               : INDENT line INDENT?;

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
 END				: (':');
 NEWLINE			: [\r\n]+;
 INDENT				: [\t];
 WS					: [ ]+ -> skip;
 EQUALS             : ('=');
 ARITHMETIC         : ('+'|'-'|'*'|'/'|'%');
 INTEGER            : '-'? [0-9]+;
 BOOLEAN			: ('True' |'true'|'False'|'false');
 FLOATS				: '-'? [0-9]* '.' [0-9]+;
 STRING				: ('"'.*?'"');  
 ID                 : (LOWERCASE | UPPERCASE)+;