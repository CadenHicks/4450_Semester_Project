grammar Final;

/*
 * Parser Rules
 */

assign              : (ID) ARITHMETIC? EQUALS SPACE (INTEGER | ID | FLOAT | BOOLEAN | STRING) ;
arithmetic          : (INTEGER | ID | STRING | FLOAT) ARITHMETIC (INTEGER | ID | STRING | FLOAT) ;

/*
 * Lexer Rules
 */

 fragment LOWERCASE : [a-z] ;
 fragment UPPERCASE : [A-Z] ;
 
 SPACE              : ' '   ;
 EQUALS             : ('=') ;
 ARITHMETIC         : ('+'|'-'|'*'|'/'|'%') ;
 LOGICAL            : ('==' | '!=' | 'and' | 'or' | '>=' | '<=' | '>' | '<') ;
 INTEGER            : '-'?[0-9]+;
 ID                 : (LOWERCASE | UPPERCASE)+;
 BOOLEAN            : ('True' | 'False' | 'true' | 'false') ;
 FLOAT              : ('-'? [0-9]+ '.' [0-9]+) ;
 STRING             : '" '.*' "' ;