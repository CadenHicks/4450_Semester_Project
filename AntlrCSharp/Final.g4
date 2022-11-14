grammar Final;

/*
 * Parser Rules
 */
//assign              : (INTEGER | ID)  ARITHMETIC? EQUALS (INTEGER | ID) (ARITHMETIC (INTEGER | ID))* NEWLINE;

prog: line* EOF; 

//expr:	line;

line				: NEWLINE* assign;	
assign				: ID ARITHMETIC? EQUALS (literals | ID) arithmetic NEWLINE;
literals			: (STRING | INTEGER | BOOLEAN | FLOATS);
arithmetic          : (ARITHMETIC (INTEGER | ID | FLOATS | STRING))*;
logic               : (literals | arithmetic) LOGICAL (literals | arithmetic | logic);
if_statement        : 'if' logic ':' (assign | (NEWLINE block));
block               : (TAB line)+;

/*
 * Lexer Rules
 */

 fragment LOWERCASE : [a-z] ;
 fragment UPPERCASE : [A-Z] ;

 NEWLINE			: [\r\n]+;
 TAB                : '\t';
 WS					: [ \t]+ -> skip;
 EQUALS             : ('=');
 ARITHMETIC         : ('+'|'-'|'*'|'/'|'%');
 LOGICAL            : ( '<' | '>' | '<=' | '>=' | '==' | '!=' | 'and' | 'or');
 INTEGER            : '-'? [0-9]+;
 BOOLEAN			: ('True' |'true'|'False'|'false');
 FLOATS				: '-'? [0-9]* '.' [0-9]+;
 STRING				: ('"'.*?'"');  
 ID                 : (LOWERCASE | UPPERCASE)+;