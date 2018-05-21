grammar robotControl;
// Parser Rules
script
    : (stment)*;

ifStment
: (IF LNBRACKET expr RNBRACKET LCBRACKET stment* RCBRACKET)
| (IF LNBRACKET expr RNBRACKET LCBRACKET stment* RCBRACKET ELSE LCBRACKET stment* RCBRACKET);

whileStment
: WHILE LNBRACKET (expr|mathExpr) RNBRACKET LCBRACKET stment* RCBRACKET;

stment
: ifStment
| whileStment
| robotStmentDouble
| robotStmentInt
| assignement
| initiailizeRobot;

robotStmentDouble
: VARNAME DOT (LEFT | RIGHT | FRONT | BACK) LNBRACKET DOUBLE RNBRACKET SEMICOLON
;

robotStmentInt:
 VARNAME DOT SETSPEED LNBRACKET (mathExpr|varName) RNBRACKET SEMICOLON
 ;

mathExpr
: mathExprDouble
| mathExprInt
;

mathExprInt
:(VARNAME|INT) ((OPPLUS | OPMINUS | OPMUL | OPDIV) (VARNAME|INT))*
;

mathExprDouble
:(VARNAME|DOUBLE) ((OPPLUS | OPMINUS | OPMUL | OPDIV) (VARNAME|DOUBLE))*
;
expr
: mathExpr relOp mathExpr;

assignement
: assignementDouble
| assignementString
| assignementInt;

//assignementNormal
//: varType VARNAME OPASSIGN VARNAME SEMICOLON | varType VARNAME SEMICOLON;

assignementInt
: VARINT VARNAME OPASSIGN mathExprInt SEMICOLON
| VARINT VARNAME OPASSIGN VARNAME SEMICOLON;

assignementString
: VARSTRING VARNAME OPASSIGN STRING SEMICOLON;

initiailizeRobot
: VARROBOT VARNAME LNBRACKET STRING RNBRACKET SEMICOLON;

assignementDouble
: VARDOUBLE VARNAME OPASSIGN mathExprDouble SEMICOLON
| VARDOUBLE VARNAME OPASSIGN VARNAME SEMICOLON;

relOp
: OPGREATER
| OPSMALLER
| OPEQUAL;

varType
: VARSTRING
| VARINT
| VARDOUBLE
| VARROBOT;

//varInt: VARINT;
//varDouble: VARDOUBLE;
//varRobot: VARROBOT;
varName: VARNAME;




//Lexer Rules
DOT: '.';
IF: 'if';
ELSE: 'else';
WHILE: 'while';

LEFT: 'left';
RIGHT: 'right';
FRONT: 'front';
BACK: 'back';

LCBRACKET: '{';
RCBRACKET: '}';

LNBRACKET: '(';
RNBRACKET: ')';

LSBRACKET: '[';
RSBRACKET: ']';
OPPLUS: '+';
OPMINUS: '-';
OPMUL: '*';
OPDIV: '/';
OPGREATER: '>';
OPSMALLER: '<';
OPEQUAL: '==';
OPASSIGN: '=';


SEMICOLON: ';';
VARINT: 'int';
VARROBOT: 'robot';
VARSTRING: 'string';
VARDOUBLE: 'double';
SETSPEED: 'setSpeed';

INT: ('0'|'-'?[1-9][0-9]*);
VARNAME: [a-zA-Z]([a-zA-Z]|INT)*;
STRING: '"'.+?'"';
DOUBLE: ([0-9]*'.'[0-9]);
WHITESPACE: ' ' -> skip ;
COMMENT:  '//' ~( '\r' | '\n' )*  -> skip;