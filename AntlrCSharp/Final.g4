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
statements			: ifstate //Can add other statements like while or for here later
ifState				: IF condition (CONDITIONAL condition)* END (NEWLINE (block)+ | assign NEWLINE) WHITE? elif* (WHITE? ELSE END NEWLINE? (block)+)?;
block				: WHITE? line;
elif				: ELIF condition (CONDITIONAL condition)* END NEWLINE (block)+;
condition			: (literals | ID) arithmetic CON (literals | ID) arithmetic;

/*
 * Lexer Rules
 */

 fragment LOWERCASE : [a-z] ;
 fragment UPPERCASE : [A-Z] ;

 CONDITIONAL		: ('and'|'or'|'not');
 CON				: ('=='|'!='|'<'|'<='|'>'|'>=');
 IF					: ('if');
 ELIF               : ('elif');
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