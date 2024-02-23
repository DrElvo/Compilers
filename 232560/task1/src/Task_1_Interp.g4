grammar Task_1_Interp;

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

expr
    :	ID                                  #Identifier
    |	INT_PIECE                              #Int
    |	BOOL_PIECE                             #Boolean
    |   ID Assign expr                      #Assignment
    |	LPAREN expr binop expr RPAREN       #Parens
    |	ID LPAREN args RPAREN               #FunctionCall
    |	block                               #Multi_Block
    |	IF expr THEN block ELSE block       #IfStatement
    |	WHILE expr DO block                 #WhileLoop
    |	REPEAT block UNTIL expr             #RepeatLoop
    |	PRINT expr                          #Print
    |	SPACE                               #Space
    |	NEWLINE                             #Newline
    |	SKIPP                               #Skip
;

args
    :(expr (COMMA expr)*)?
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




//TYPE PIECES
BOOL_PIECE : 'true'|'false';
INT_PIECE : [0] | [1-9][0-9]* ;
//TYPES
TYPE :	'int' | 'bool' | 'unit' ;
ID : [a-zA-Z]([a-zA-Z0-9_])*;

WS : [ \n\r\t]+ -> skip ;

