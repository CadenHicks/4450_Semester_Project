grammar Final;

 tokens { INDENT, DEDENT }

 @lexer::header {
 using AntlrCSharp;
 }

 @lexer::members {
 private DenterHelper denter;
  
 public override IToken NextToken()
 {
     if (denter == null)
     {
         denter = DenterHelper.Builder()
             .Nl(NL)
             .Indent(FinalParser.INDENT)
             .Dedent(FinalParser.DEDENT)
             .PullToken(base.NextToken);
     }

     return denter.NextToken();
 }
 }

 //NL: ('\r'* '\n' '\t'*); //For tabs just switch out ' '* with '\t'*E;
 NL: [\r\n\t?]+;

prog: line* EOF; 

line				: (assign comment?  NL?| statements comment? | loopControl comment?  NL?| funcCall comment?  NL?| comment | NL);
assign				: ID (ARITHMETIC | '*')? EQUALS CON? (literals | ID | funcCall) arithmetic?;
literals			: (STRING | INTEGER | BOOLEAN | FLOATS);
arithmetic          : ((ARITHMETIC| '*') (INTEGER | ID | FLOATS | STRING))+
                    | (condition)+
                    ;
statements          : structureIf | whileState | funcDef | forState;
structureIf         : ifState elifState? elseState?;
ifState             : IF condition+ END (block|line);
elifState           : (ELIF condition+ END (block |line))+;
elseState           : ELSE END block+;
condition           : CON? (literals | ID) arithmetic? ((CON | EQU) CON? (literals | ID) arithmetic?)? CON*;
block               : INDENT line+ DEDENT;
whileState          : WHILE condition+ END (block|line);
forState            : FOR ID IN (literals | ID | funcCall) END (block|line);
funcDef             : DEF ID '(' args ')' END (block|line);
funcCall            : ID '(' ((ID | literals) (',' (ID | literals))*)? ')';
args                : ID (EQU literals)?((',' args)?);
comment             : COMMENT;
loopControl         : (BREAK | CONTINUE | RETURN (ID | literals | arithmetic));

/*
 * Lexer Rules
 */

 fragment LOWERCASE : [a-z] ;
 fragment UPPERCASE : [A-Z] ;

 CON        		: ('and'|'or'|'not');
 EQU				: ('=='|'!='|'<'|'<='|'>'|'>=');
 IF					: ('if');
 ELIF               : ('elif');
 ELSE				: ('else');
 WHILE              : ('while');
 FOR                : ('for');
 IN                 : ('in');
 BREAK              : ('break');
 CONTINUE           : ('continue');
 RETURN             : ('return');
 DEF                : ('def');
 END				: (':');
 NEWLINE			: [\r\n]+;
 //INDENT				: [\t]+;
 WS					: [ ]+ -> skip;
 EQUALS             : ('=');
 STAR               : '*';
 ARITHMETIC         : ('+'|'-'|STAR|'/'|'%');
 INTEGER            : '-'? [0-9]+;
 BOOLEAN			: ('True' |'true'|'False'|'false');
 FLOATS				: '-'? [0-9]* '.' [0-9]+;
 STRING				: ('"'.*?'"');  
 COMMENT            : '#' ~( '\r' | '\n' )*;
 ID                 : (LOWERCASE | UPPERCASE)+;
