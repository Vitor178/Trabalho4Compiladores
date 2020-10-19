package br.ufscar.dc.compiladores.trabalho4compiladores;

import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Principal {
    
    public static void main(String args[]) throws IOException {
        try {
      
            MeuErrorListener meuErrorListener = new MeuErrorListener();
            CharStream cs = CharStreams.fromFileName(args[0]);
            trab4Lexer lexer = new trab4Lexer(cs);
            
            // Faz com que a saida seja escrita em um arquivo
            // Tal arquivo é passado por linha de comando durante a execução
            PrintStream ps = new PrintStream(args[1]);
            System.setOut(ps);

            // Retorna todos os tokens encontrados no código analisado.
            // Verifica se foi encontrado algum token relacionado a erro lexo.
            // Caso um token de erro é encontrado a respectiva saida é imprimida e
            // o programa encerra a execução.
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            tokens.fill();
            List<Token> token_list = tokens.getTokens();
            token_list.forEach(token -> {
                switch (token.getType()) {
                    case 66:
                        System.out.println("Linha "+token.getLine()+": comentario nao fechado");
                        System.out.println("Fim da compilacao");
                        System.exit(0);
                    case 67:
                        System.out.println("Linha "+token.getLine()+": cadeia literal nao fechada");
                        System.out.println("Fim da compilacao");
                        System.exit(0);
                    case 68:
                        System.out.println("Linha "+token.getLine()+": "+token.getText() + " - simbolo nao identificado");
                        System.out.println("Fim da compilacao");
                        System.exit(0);
                    default:
                        break;
                }
            });
            
            //Remove os outros ErrorListeners e adiciona o MeuErrorListener
            trab4Parser parser = new trab4Parser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(meuErrorListener);
            parser.programa();
            
            // Retorna o primeiro erro gerado na lista de erros
            // A criação de tal lista foi necessária pois em alguns casos de texte ocorriam dois erros sintaticos
            // sendo sempre o ultimo a ser impresso.
            // Porem na saida esperada o erro necessário era sempre o primeiro.
            SyntaxError erro1 = meuErrorListener.getErrors().get(0);
            
            // retorna o elemento próximo ao erro sintatico e a linha do mesmo
            String palavra = erro1.getOffendingToken().getText();
            int line = erro1.getOffendingToken().getLine();
            
            // substituição necessária para um caso de teste
            if("<EOF>".equals(palavra)){
                palavra = "EOF";
            }
                       
            System.out.println("Linha " + line + ": erro sintatico proximo a " + palavra);
            System.out.println("Fim da compilacao");
            
        }catch (IOException ex) {
        }
    }
    
}