grammar Final;

/*
 * Parser Rules
 */
//assign              : (INTEGER | ID)  ARITHMETIC? EQUALS (INTEGER | ID) (ARITHMETIC (INTEGER | ID))* NEWLINE;

prog: line* EOF; 

//expr:	line;

line				: NEWLINE* (assign | statements) NEWLINE*;	
assign				: ID ARITHMETIC? EQUALS (literals | ID) arithmetic;
literals			: (STRING | INTEGER | BOOLEAN | FLOATS);
arithmetic          : (ARITHMETIC (INTEGER | ID | FLOATS | STRING))*;
statements			: IF condition (CONDITIONAL condition)* END NEWLINE (block)+ elseIf* (ELSE END NEWLINE (block)+)?;
block				: WHITE line NEWLINE;
elseIf				: ELSE IF condition (CONDITIONAL condition)* END NEWLINE (block)+;
condition			: (literals | ID) CON (literals | ID);

/*
 * Lexer Rules
 */

 fragment LOWERCASE : [a-z] ;
 fragment UPPERCASE : [A-Z] ;

 CONDITIONAL		: ('and'|'or');
 CON				: ('=='|'!='|'<'|'<='|'>'|'>=');
 IF					: ('if');
 ELSE				: ('else');
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