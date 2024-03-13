grammar Grammar;

inicio : instruccion*;

instruccion : if_statement | otra_instruccion;

if_statement : 'if' '(' condicion ')' bloque ( 'else' instruccion )?;

condicion : expresion;

bloque : '{' (instruccion)* '}';

expresion : IDENTIFIER operador NUMERO;

otra_instruccion : expresion ';' | bloque;

operador : '>' | '<' | '>=' | '<=' | '==' | '!=' | '=';

IDENTIFIER : [a-zA-Z]+;
NUMERO : [0-9]+;

WS : [ \t\r\n]+ -> skip;



