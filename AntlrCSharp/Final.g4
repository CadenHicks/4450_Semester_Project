grammar Final;

/*
 * Parser Rules
 */
//assign              : (INTEGER | ID)  ARITHMETIC? EQUALS (INTEGER | ID) (ARITHMETIC (INTEGER | ID))* NEWLINE;

prog: line* EOF; 

//expr:	line;

line				: NEWLINE* (assign comment? | statements comment? | comment?) NEWLINE*;	
assign				: ID ARITHMETIC? EQUALS CON? (literals | ID) arithmetic;
literals			: (STRING | INTEGER | BOOLEAN | FLOATS);
arithmetic          : (ARITHMETIC (INTEGER | ID | FLOATS | STRING))*
                    | (condition)*
                    ;
statements          : structureIf;
structureIf         : ifState WHITE? elifState?? elseState??;
ifState             : IF condition+ END NEWLINE? (block+|line);
elifState           : (ELIF condition+ END NEWLINE? (block+ |line))*;
elseState           : ELSE END NEWLINE? block+;
condition           : CON? (literals | ID) arithmetic ((CON | EQU) CON? (literals | ID) arithmetic)? CON*;
block               : WHITE line;
whileState          : WHILE condition+ END NEWLINE? (block+|line);
funcDef             : DEF ID '(' args ')' END NEWLINE? (block+|line);
args                : ('*')?ID (EQU literals)?((',' args)?);
comment             : ~(NEWLINE | WHITE)'#'.*?;
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
 DEF                : ('def');
 END				: (':');
 NEWLINE			: [\r\n]+;
 WHITE				: [\t]+;
 WS					: [ ]+ -> skip;
 EQUALS             : ('=');
 ARITHMETIC         : ('+'|'-'|'*'|'/'|'%');
 INTEGER            : '-'? [0-9]+;
 BOOLEAN			: ('True' |'true'|'False'|'false');
 FLOATS				: '-'? [0-9]* '.' [0-9]+;
 STRING				: ('"'.*?'"');  
 ID                 : (LOWERCASE | UPPERCASE)+;