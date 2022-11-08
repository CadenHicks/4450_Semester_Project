grammar Final;

/*
 * Parser Rules
 */

assign              : (INTEGER | ID) ARITHMETIC? EQUALS SPACE (INTEGER | ID) ;
arithmetic          : (INTEGER | ID) ARITHMETIC SPACE (INTEGER | ID) ;

/*
 * Lexer Rules
 */

 fragment LOWERCASE : [a-z] ;
 fragment UPPERCASE : [A-Z] ;
 
 SPACE              : ' '   ;
 EQUALS             : ('=') ;
 ARITHMETIC         : ('+'|'-'|'*'|'/'|'%') ;
 INTEGER            : [0-9]+ SPACE;
 ID                 : (LOWERCASE | UPPERCASE)+ SPACE;