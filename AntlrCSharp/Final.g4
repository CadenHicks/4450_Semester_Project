grammar Final;

/*
 * Parser Rules
 */
//assign              : (INTEGER | ID)  ARITHMETIC? EQUALS (INTEGER | ID) (ARITHMETIC (INTEGER | ID))* NEWLINE;

prog: line* EOF; 

//expr:	line;

line				: NEWLINE* assign;	
assign				: ID ARITHMETIC? EQUALS (string | ID | arithmetic)  NEWLINE;
string				: SC CHAR SC;
arithmetic          : (INTEGER | ID) (ARITHMETIC (INTEGER | ID))*;

/*
 * Lexer Rules
 */

 fragment LOWERCASE : [a-z] ;
 fragment UPPERCASE : [A-Z] ;

 NEWLINE			: [\r\n]+;
 WS					: [ \t]+ -> skip;
 SC					: ('"');
 EQUALS             : ('=');
 ARITHMETIC         : ('+'|'-'|'*'|'/'|'%');
 INTEGER            : [0-9];
 ID                 : (LOWERCASE | UPPERCASE)+;
 CHAR				: (LOWERCASE | UPPERCASE | [0-9]);