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
    
    public static void main(String args[]) throws IOException {
        try {
//            // Lê todo o conteúdo do arquivo passado em args[0] e o transforma em
//            // uma source de caracteres(CharStream) necessário para o analizador léxico do antlr4
//            CharStream cs = CharStreams.fromFileName(args[0]);
//            trab4Lexer lex = new trab4Lexer(cs);
//        
//            Token t = null;
//            
//            // Faz com que a saida seja escrita em um arquivo
//            // Tal arquivo é passado por linha de comando durante a execução
//            PrintStream ps = new PrintStream(args[1]);
//            System.setOut(ps);
//            
//            //while responsável por verificar todos os token gerados do arquivo de entrada
//            //a condição de saida é o fim do arquivo
//            while ((t = lex.nextToken()).getType() != Token.EOF) {
//                //switch usado para identificar os tokens relacionados a erros lexicos
//                //tipo 19 == simbolo não identificado
//                switch (t.getType()) {
//                    case 18:
//                        System.out.println("Linha "+t.getLine()+": "+t.getText() + " - comentário não fechado");
//                        return;
//                    case 19:
//                        System.out.println("Linha "+t.getLine()+": "+t.getText() + " - simbolo nao identificado");
//                        return;
//                    default:
//                        break;
//                }
//                //Print responsavel por printar a saida no formato especificado nos testes
//                // <'texto', 'tipo token'>
//                System.out.println("<" + "'" + t.getText() + "'" + "," + trab4Lexer.VOCABULARY.getDisplayName(t.getType()) + ">");
//            }
            
//********************* CLASSE PRINCIPAL PARA SINTATICO *******************************************

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
            // A criação de tal lista foi necessária pois em alguns casos de texte ocorriam dois erros sintaticos
            // sendo sempre o ultimo a ser impresso.
            // Porem na saida esperada o erro necessário era sempre o primeiro.
            if(!(meuErrorListener.getErrors().isEmpty())){
                SyntaxError erro1 = meuErrorListener.getErrors().get(0);
            
            // retorna o elemento próximo ao erro sintatico e a linha do mesmo
            String palavra = erro1.getOffendingToken().getText();
            int line = erro1.getOffendingToken().getLine();
            
            // substituição necessária para um caso de teste
            if("<EOF>".equals(palavra)){
                palavra = "EOF";
            }
                       
            System.out.println("Linha " + line + ": erro sintatico proximo a " + palavra);
            }
            System.out.println("Fim da compilacao");
            
            // Erros semanticos
            
            Semantico as = new Semantico();
            as.visitCodigo(arvore);
            SemanticoUtils.errosSemanticos.forEach((s) -> System.out.println(s));
            if(!(SemanticoUtils.errosSemanticos.isEmpty())) {
                System.out.println("Fim da compilacao");
            }
            
//            if(SemanticoUtils.errosSemanticos.isEmpty()) {
//                GeradorHTML agc = new GeradorHTML();
//                agc.visitPrograma(arvore);
//                System.out.println(agc.saida.toString());
//                //try(PrintWriter pw = new PrintWriter(args[1])) {
//                //pw.print(agc.saida.toString());
//                //}
//            }
            
        }catch (IOException ex) {
        }
    }
    
}
