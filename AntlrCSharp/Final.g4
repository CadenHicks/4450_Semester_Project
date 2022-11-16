grammar Final;

/*
 * Parser Rules
 */
//assign              : (INTEGER | ID)  ARITHMETIC? EQUALS (INTEGER | ID) (ARITHMETIC (INTEGER | ID))* NEWLINE;

prog: line* EOF; 

//expr:	line;

line				: NEWLINE* (assign | statements) NEWLINE*;																//start of file can have newlines in front of it and contains either an assignment or statement and then ends with newline or no newline
assign				: ID ARITHMETIC? EQUALS (literals | ID) arithmetic;														//assigns to a variable so another variable or a literal and then can also have a arithmetic expression
literals			: (STRING | INTEGER | BOOLEAN | FLOATS);																//contains all basic data types of python
arithmetic          : (ARITHMETIC (INTEGER | ID | FLOATS | STRING))*;														//allows for making of a arithmetic expression
statements			: ifState;																								//Can add other statements like while or for here later
ifState				: IF conState WHITE? elif* (WHITE? ELSE END oneLine)?;													//starts the if statement and the sets a conditional statement and allows for elif and else statements as well
block				: WHITE? line;																							//defines a block of code in a statment or loop
elif				: ELIF conState;																						//defines a elif with conditional statement
condition			: (INTEGER | ID | FLOATS | STRING | ID) arithmetic EQU (literals | ID) arithmetic CON?;				    //defines a conditional statement between literals and variables
booleanCon			: CON* (BOOLEAN | ID) CON?;
conState			: (condition| booleanCon)+ END oneLine;																    // defines the beginning of each statement type
oneLine				: (NEWLINE (block)+ | assign NEWLINE);																	//defines a one line statement or a multiline statement

/*
 * Lexer Rules
 */

 fragment LOWERCASE : [a-z] ;
 fragment UPPERCASE : [A-Z] ;

 CON				: ('and'|'or'|'not');
 EQU			    : ('=='|'!='|'<'|'<='|'>'|'>=');
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