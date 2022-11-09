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
 INTEGER            : '-'?[0-9]+;
 ID                 : (LOWERCASE | UPPERCASE)+;
 BOOLEAN            : ('True' | 'False' | 'true' | 'false') ;
 FLOAT              : ('-'? [0-9]+ '.' [0-9]+) ;
 STRING             : ('"'(LOWERCASE | UPPERCASE | [0-9] | SPACE | '\t')* '"') ;