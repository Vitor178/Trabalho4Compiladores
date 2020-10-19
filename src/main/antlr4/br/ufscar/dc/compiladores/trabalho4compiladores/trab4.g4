grammar trab4;


// ************************************* Palavras Reservadas *************************************
HTML_abre      : '<html>' ;

HTML_fecha     : '</html>' ;

HEAD_abre      : '<head>' ;

HEAD_fecha     : '</head>' ;

BODY_abre      : '<body>' ;

BODY_fecha     : '</body>' ;

TITLE_abre     : '<title>' ;

TITLE_fecha    : '</title>' ;

FORM_abre      : '<form' ;

FORM_fecha     : '</form>' ;

LABEL_abre     : '<label>' ;

LABEL_fecha    : '</label>' ;

INPUT_abre     : '<input' ;

INPUT_fecha     : '/>' ;

TYPE           : 'type' ; 

NAME           : 'name' ;

VALUE          : 'value' ;

ID             : 'id' ;

METHOD         : 'method' ;

ACTION         : 'action' ;

CLASS          : 'class' ;

BR             : '<br/>' ;

P              : '<p>'  ;

H1_abre        : '<h1>' ;

H1_fecha       : '</h1>' ;

H2_abre        : '<h2>' ;

H2_fecha       : '</h2>' ;

H3_abre        : '<h3>' ;

H3_fecha       : '</h3>' ;

H4_abre        : '<h4>' ;

H4_fecha       : '</h4>' ;

H5_abre        : '<h5>' ;

H5_fecha       : '</h5>' ;

// ************************************* Elementos do código *************************************

Menor          : '<' ;

Maior          : '>' ;

Barra          : '/' ;

Abre_colchete  : '[' ;

Fecha_colchete : ']' ;

Virgula        : ',' ;

Ponto          : '.' ;

DELIM	       : ':' ;

ABREPAR        : '(' ;

FECHAPAR       : ')' ;

//tudo o que estiver dentro do ()* poderá ocorrer nenhuma, uma ou várias vezes
// o ~() significa "qualquer coisa é permitida menos o que está dentro dos parênteses"
CADEIA         : '"' ( ESC_SEQ | ~('"'|'\\'|'\n') )* '"' ;

// o 'fragment' é usado quando a regra não gerará um token
// ,ou seja, só será usada por outra regra
fragment
ESC_SEQ        : '\\"';	

// o ()+ significa que o que está dentro deverá ocorrer pelo menos 1 vez
NUM_INT	       : ('0'..'9')+ ;

//o ()? significa que o que está dentro do parênteses é opcional
NUM_REAL       : ('0'..'9')+ ('.' ('0'..'9')+)? ;

IDENT          : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

// o skip() é usado para ignorar a regra
COMENTARIO     : '<!--' .*? '-->' {skip();} ;

FRASE          : ~( '\n' | '\t' | '<' )+;

WS             : ( ' ' | '\t' | '\r' | '\n' ) {skip();} ;

Ponteiro       : '^' ;

Endereco       : '&' ;

Porcent        : '%' ;

// ************************************* Operadores *************************************

MaiorIgual     : '>=' ;

MenosIgual     : '<=' ;

Diferente      : '<>' ;

Igual          : '=' ;

Mais           : '+' ;

Menos          : '-' ;

Vezes          : '*' ;


// ************************************* Erros *************************************

// quando há um '\n' antes do fim da cadeia
Cadeia_errada  : '"' ( ESC_SEQ | ~('"'|'\\') )* '\n' ;

// quando não foi encontrada regra que representa o elemento
ERROR          : . ;
	
// ************************************* Gramatica *************************************

codigo         : '<html>' head body '</html>' ;

head           : '<head>' head_interno '</head>' ;

body           : '<body>' body_interno '</body>' ;

head_interno   : ( title ) ;

body_interno   : ( FRASE | form | label | '<br/>' | h1 | h2 | h3 | h4 | h5 )* ;

title          : '<title>' FRASE '</title>' ;

form           : '<form' ( id | name | method | action )* '>' form_interno '</form>' ;

form_interno   : ( FRASE | '<p/>' | label | '<br/>' | h1 | h2 | h3 | h4 | h5 )* ;

label          : '<label>' input FRASE '</label>' ;

input          : '<input' type name value '/>' ;

h1             : '<' 'h1' '>' FRASE '<' '/' 'h1' '>' ;

h2             : '<' 'h2' '>' FRASE '<' '/' 'h2' '>' ;

h3             : '<' 'h3' '>' FRASE '<' '/' 'h3' '>' ;

h4             : '<' 'h4' '>' FRASE '<' '/' 'h4' '>' ;

h5             : '<' 'h5' '>' FRASE '<' '/' 'h5' '>' ;

id             : 'id' '=' CADEIA ;

type           : 'type' '=' CADEIA ;

name           : 'name' '=' CADEIA ;

method         : 'method' '=' CADEIA ;

action         : 'action' '=' CADEIA ;

value          : 'value' '=' CADEIA ;


//********************************************************************************

//programa : declaracoes 'algoritmo' corpo 'fim_algoritmo';

//declaracoes : (decl_local_global)* ;
	
//decl_local_global : declaracao_local | declaracao_global ;

//declaracao_local : 'declare' variavel | 
//                   'constante' IDENT ':' tipo_basico '=' valor_constante | 
//                   'tipo' IDENT ':' tipo ;

//variavel : identificador (',' identificador)* ':' tipo ;

//identificador : IDENT ('.' IDENT)* dimensao ;

//dimensao : ('[' exp_aritmetica ']')* ;

//tipo : registro | tipo_estendido ;

//tipo_basico : 'literal' | 'inteiro' | 'real' | 'logico' ;

//tipo_basico_ident : tipo_basico | IDENT ;

//tipo_estendido : ('^')? tipo_basico_ident ;

//valor_constante : CADEIA | NUM_INT | NUM_REAL | 'verdadeiro' | 'falso' ;

//registro : 'registro' (variavel)* 'fim_registro' ;

//declaracao_global : 'procedimento' IDENT '(' (parametros)? ')' (declaracao_local)* (cmd)* 'fim_procedimento' | 
//                    'funcao' IDENT '(' (parametros)? ')' ':' tipo_estendido (declaracao_local)* (cmd)* 'fim_funcao' ;

//parametro : ('var')? identificador (',' identificador)* ':' tipo_estendido ;

//parametros : parametro (',' parametro)* ;

//corpo : (declaracao_local)* (cmd)* ;

//cmd : cmdLeia | cmdEscreva | cmdSe | cmdCaso | cmdPara | cmdEnquanto |
//      cmdFaca | cmdAtribuicao | cmdChamada | cmdRetorne ;

//cmdLeia : 'leia' '(' ('^')? identificador (',' ('^')? identificador)* ')' ;

//cmdEscreva : 'escreva' '(' expressao (',' expressao)* ')' ;

//cmdSe : 'se' expressao 'entao' (cmd)* ('senao' (cmd)*)? 'fim_se' ;

//cmdCaso : 'caso' exp_aritmetica 'seja' selecao ('senao' (cmd)*)? 'fim_caso' ;

//cmdPara : 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' (cmd)* 'fim_para' ;

//cmdEnquanto : 'enquanto' expressao 'faca' (cmd)* 'fim_enquanto' ;

//cmdFaca : 'faca' (cmd)* 'ate' expressao ;

//cmdAtribuicao : ('^')? identificador '<-' expressao ;

//cmdChamada : IDENT '(' expressao (',' expressao)* ')' ;

//cmdRetorne : 'retorne' expressao ;

//selecao : (item_selecao)* ;

//item_selecao : constantes ':' (cmd)* ;

//constantes : numero_intervalo (',' numero_intervalo)* ;

//numero_intervalo : (op_unario)? NUM_INT ('..' (op_unario)? NUM_INT)? ;

//op_unario : '-' ;

//exp_aritmetica : termo (op1 termo)* ;

//termo : fator (op2 fator)* ;

//fator : parcela (op3 parcela)* ;

//op1 : '+' | '-' ;

//op2 : '*' | '/' ;

//op3 : '%' ;

//parcela : (op_unario)? parcela_unario | parcela_nao_unario ;

//parcela_unario : ('^')? identificador | IDENT '(' expressao (',' expressao)* ')' | 
//                 NUM_INT | NUM_REAL | '(' expressao ')' ;

//parcela_nao_unario : '&' identificador | CADEIA ;

//exp_relacional : exp_aritmetica (op_relacional exp_aritmetica)? ;

//op_relacional : '=' | '<>' | '>=' | '<=' | '>' | '<' ;

//expressao : termo_logico (op_logico_1 termo_logico)* ;

//termo_logico : fator_logico (op_logico_2 fator_logico)* ;

//fator_logico : ('nao')? parcela_logica ;

//parcela_logica : ( 'verdadeiro' | 'falso' ) | exp_relacional ;

//op_logico_1 : 'ou' ;

//op_logico_2 : 'e' ;

