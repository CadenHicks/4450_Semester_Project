grammar Final;

/*
 * Parser Rules
 */

 prog: expr EOF ;

 expr: expr assign expr
    |  assign
    |  arithmetic
    ;
       

assign              : (INTEGER | ID) ARITHMETIC? EQUALS (arithmetic | INTEGER | ID) NEWLINE+ ;
arithmetic          : (INTEGER | ID) ARITHMETIC (arithmetic | INTEGER | ID) NEWLINE+ ;

/*
 * Lexer Rules
 */

 fragment LOWERCASE : [a-z] ;
 fragment UPPERCASE : [A-Z] ;
 
 NEWLINE            : ('\n') ;
 EQUALS             : ('=') ;
 ARITHMETIC         : ('+'|'-'|'*'|'/'|'%') ;
 INTEGER            : [0-9]+ ;
 ID                 : (LOWERCASE | UPPERCASE)+ ;