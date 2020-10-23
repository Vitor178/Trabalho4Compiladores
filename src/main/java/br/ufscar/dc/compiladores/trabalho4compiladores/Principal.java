package br.ufscar.dc.compiladores.trabalho4compiladores;

import br.ufscar.dc.compiladores.trabalho4compiladores.trab4Parser.CodigoContext;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Principal {
    
    public static void main(String args[]) throws IOException, NullPointerException {
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
                    case 18:
                        System.out.println("Linha "+token.getLine()+": "+token.getText() + " - comentário não fechado");
                        System.out.println("Fim da compilacao");
                        System.exit(0);
                    case 19:
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
            CodigoContext arvore = parser.codigo();
            
            // Retorna o primeiro erro gerado na lista de erros
            if(!(meuErrorListener.getErrors().isEmpty())){
                SyntaxError erro1 = meuErrorListener.getErrors().get(0);
            
                // retorna o elemento próximo ao erro sintatico e a linha do mesmo
                String palavra = erro1.getOffendingToken().getText();
                int line = erro1.getOffendingToken().getLine();
            
                       
                System.out.println("Linha " + line + ": erro sintatico proximo a " + palavra);
                System.out.println("Fim da compilacao");
                System.exit(0);
            }
         
            
            // Erros semanticos
            
            Semantico as = new Semantico();
            as.visitCodigo(arvore);
            SemanticoUtils.errosSemanticos.forEach((s) -> System.out.println(s));
            if(!(SemanticoUtils.errosSemanticos.isEmpty())) {
                System.out.println("Fim da compilacao");
            }
            
            if(SemanticoUtils.errosSemanticos.isEmpty()) {
                Gerador agc = new Gerador();
                agc.visitCodigo(arvore);
                System.out.println(agc.saida.toString());
                
            }
            
        }catch (IOException | NullPointerException ex) {
        }
    }
    
}
