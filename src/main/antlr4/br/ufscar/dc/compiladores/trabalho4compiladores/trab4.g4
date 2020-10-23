grammar trab4;


// ************************************* Palavras Reservadas *************************************

Inicio         : 'inicio' ;

Fim            : 'fim' ;

Titulo         : 'titulo' ;

Enunciado      : 'enunciado' ;

Definir        : 'definir' ;

Pergunta       : 'pergunta' ;

Opcao          : 'op' ;

// ************************************* Elementos do código *************************************

Abre_col       : '{' ;

Fecha_col      : '}' ;

ABREPAR        : '(' ;

FECHAPAR       : ')' ;

//tudo o que estiver dentro do ()* poderá ocorrer nenhuma, uma ou várias vezes
// o ~() significa "qualquer coisa é permitida menos o que está dentro dos parênteses"
TEXTO         : '"' ( ESC_SEQ | ~('"') )* '"' ;

// o 'fragment' é usado quando a regra não gerará um token
// ,ou seja, só será usada por outra regra
fragment
ESC_SEQ        : '\\"';	

IDENT          : ('a'..'z'|'A'..'Z'|'0'..'9') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|')')* ;

// o skip() é usado para ignorar a regra
COMENTARIO     : '<!--' .*? '-->' {skip();} ;

//FRASE          : ~( '\n' | '\t' | '<' )+;

WS             : ( ' ' | '\t' | '\r' | '\n' ) {skip();} ;



// ************************************* Erros *************************************

//quando o comentário não é fechado
Coment_N_fechado : '<!--' .*?  ;

// quando não foi encontrada regra que representa o elemento
ERROR          : . ;
	
// ************************************* Gramatica *************************************

codigo         : 'inicio' titulo enunciado definicoes 'fim' ;

titulo         : 'titulo' '(' TEXTO ')';

enunciado      : 'enunciado' '(' TEXTO ')' ;

definicoes     : (definicao)* ;

definicao      : 'definir' IDENT '{' pergunta opcoes '}' ;

pergunta       : 'pergunta' '(' TEXTO ')' ;

opcoes         : (opcao)+ ;

opcao          : 'op' '(' TEXTO ')' ;


