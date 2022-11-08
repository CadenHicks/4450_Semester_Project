grammar Final;

/*
 * Parser Rules
 */

assign              : (INTEGER | ID) ARITHMETIC? EQUALS (INTEGER | ID) ;
arithmetic          : (INTEGER | ID) ARITHMETIC (INTEGER | ID) ;

/*
 * Lexer Rules
 */

 fragment LOWERCASE : [a-z] ;
 fragment UPPERCASE : [A-Z] ;

 EQUALS             : ('=') ;
 ARITHMETIC         : ('+'|'-'|'*'|'/'|'%') ;
 INTEGER            : [0-9]+;
 ID                 : (LOWERCASE | UPPERCASE)+;