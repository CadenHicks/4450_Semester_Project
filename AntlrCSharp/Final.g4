grammar Final;

/*
 * Parser Rules
 */
prog: expr expr expr EOF;

expr:	expr assign expr 
	|	assign
	|	arithmetic
	;

assign              : (INTEGER | ID)  ARITHMETIC? EQUALS (INTEGER | ID) ARITHMETIC? (INTEGER | ID)? NEWLINE;
arithmetic          : (INTEGER | ID) ARITHMETIC (INTEGER | ID) NEWLINE;

/*
 * Lexer Rules
 */

 fragment LOWERCASE : [a-z] ;
 fragment UPPERCASE : [A-Z] ;

 NEWLINE			: [\r\n]+;
 WS					: [ \t\r\n]+ -> skip;
 EQUALS             : ('=');
 ARITHMETIC         : ('+'|'-'|'*'|'/'|'%') ;
 INTEGER            : [0-9]+;
 ID                 : (LOWERCASE | UPPERCASE)+;