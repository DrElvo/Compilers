grammar Task_2_Language;

program
    :declar+
    EOF
;

type
    :TYPE
;

declar
    :type ID LPAREN paramDecla RPAREN body
;

paramDecla
    :(type ID (COMMA type ID)*)?
;

body
    :LBRACE localDecla* ene RBRACE
;

localDecla
    :type ID Assign expr SEMICOLON
;

block
    :LBRACE ene RBRACE
;

ene
    :expr (SEMICOLON expr)*
;

args
    :(expr (COMMA expr)*)?
;

expr
    :	ID                                  #Identifier
    |   ID Assign expr                      #Assignment
    |	ID LPAREN args RPAREN               #FunctionCall
    |	LPAREN expr binop expr RPAREN       #Parens
    |	block                               #Multi_Block
    |	IF expr THEN block ELSE block       #IfStatement
    |	WHILE expr DO block                 #WhileLoop
    |	REPEAT block UNTIL expr             #RepeatLoop
    |	PRINT expr                          #Print
    |	INT_D                              #Int
    |	BOOL_D                             #Boolean
    |	SPACE                               #Space
    |	NEWLINE                           #Newline
    |	SKIPP                               #Skip
;


//Binary Operations
binop
    :Equals
    |LessThan
    |MoreThan
    |LessThanEq
    |MoreThanEq
    |AND
    |OR
    |XOR
    |Plus
    |Minus
    |Mult
    |Div
;

//PAREN DEFINITION / BRACKET DEFINITION
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SEMICOLON: ';';
COMMA: ',';

//OPERATION LANUGAGE
Equals : '==';
LessThan: '<';
MoreThan: '>';
LessThanEq: '<=';
MoreThanEq: '>=';
AND: '&';
OR: '|';
XOR: '^';
Plus: '+';
Minus: '-';
Div: '/';
Mult: '*';
Assign: ':=';

//IF, WHILE AND REPEAT LANGUAGE
IF: 'if';
THEN: 'then';
ELSE: 'else';
WHILE: 'while';
DO: 'do';
REPEAT: 'repeat';
UNTIL: 'until';
PRINT:'print';
SKIPP: 'skip';
SPACE: 'space';
NEWLINE: 'newline';

//TYPES
TYPE :	'int' | 'bool' | 'unit' ;

//OTHER
ID : [a-zA-Z]([a-zA-Z0-9_])*;
WS : [ \n\r\t]+ -> skip ;
BOOL_D : 'true'|'false';
INT_D : [0] | [1-9][0-9]* ;