grammar Final;

/*
 * Parser Rules
 */
prog:expr EOF;

expr:	expr assign expr
	|	assign
	|	arithmetic
	;

assign              : (INTEGER | ID)  ARITHMETIC? EQUALS (INTEGER | ID) ;
arithmetic          : (INTEGER | ID) ARITHMETIC (INTEGER | ID) ;

/*
 * Lexer Rules
 */

 fragment LOWERCASE : [a-z] ;
 fragment UPPERCASE : [A-Z] ;

 NEWLINE			: [\r\n]+ -> skip;
 WS					: [ \t]+ -> skip;
 EQUALS             : ('=') ;
 ARITHMETIC         : ('+'|'-'|'*'|'/'|'%') ;
 INTEGER            : [0-9]+;
 ID                 : (LOWERCASE | UPPERCASE)+;