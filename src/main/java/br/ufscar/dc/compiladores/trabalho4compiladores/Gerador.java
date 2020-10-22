package br.ufscar.dc.compiladores.trabalho4compiladores;

import br.ufscar.dc.compiladores.trabalho4compiladores.TabelaDeSimbolos.Tipo;
import java.util.ArrayList;

public class Gerador extends trab4BaseVisitor<Void>{
    StringBuilder saida;
    TabelaDeSimbolos tabela;

    public Gerador() {
        saida = new StringBuilder();
        this.tabela = new TabelaDeSimbolos();
    }
    
    @Override
    public Void visitCodigo(trab4Parser.CodigoContext ctx) {
        saida.append("<html>\n");
        visitTitulo(ctx.titulo());
        visitEnunciado(ctx.enunciado());
        visitDefinicoes(ctx.definicoes());
        saida.append("</html>\n");
        return null;
    }
    
    @Override
    public Void visitTitulo(trab4Parser.TituloContext ctx){
        String ident = "\t";
        saida.append(ident + "<head>\n");
        String texto = ctx.TEXTO().getText();
        saida.append(ident + "\t<title>" + texto.substring(1,texto.length()-1) + "</title>\n");
        saida.append(ident + "</head>\n\n");
        
        return null;
    }
    
    @Override
    public Void visitEnunciado(trab4Parser.EnunciadoContext ctx){
        String ident = "\t";
        saida.append(ident + "<body>\n");
        String texto = ctx.TEXTO().getText();
        saida.append(ident + "\t<h2>" + texto.substring(1,texto.length()-1) + "</h2>\n");
        
        return null;
    }

    @Override
    public Void visitDefinicoes(trab4Parser.DefinicoesContext ctx){
        saida.append("\t\t<form id=\"\" name=\"\" method=\"\" action=\"\">\n");
        ctx.definicao().forEach(dec -> visitDefinicao(dec));
        saida.append("\t\t<input type=\"submit\" name=\"\" id = \"\" value=\"\"/>\n");
        saida.append("\t\t</form>\n");
        saida.append("\t</body>\n");
        return null;
    }
    
    @Override
    public Void visitDefinicao(trab4Parser.DefinicaoContext ctx){
        String ident = "\t\t";
        saida.append(ident + "<h4>" + ctx.IDENT().getText() + "</h4>\n");
        visitPergunta(ctx.pergunta());
        visitOpcoes(ctx.opcoes());
        saida.append(ident + "<br>\n");
        
        
        return null;
    }
    
    @Override
    public Void visitPergunta(trab4Parser.PerguntaContext ctx){
        String ident = "\t\t";
        String texto = ctx.TEXTO().getText();
        saida.append(ident + "<h5>" + texto.substring(1,texto.length()-1) + "</h5>\n");
        
        return null;
    }
    
    @Override
    public Void visitOpcoes(trab4Parser.OpcoesContext ctx){
        ctx.opcao().forEach(dec -> visitOpcao(dec));
        
        return null;
    }
    
    @Override
    public Void visitOpcao(trab4Parser.OpcaoContext ctx){
        String ident = "\t\t";
        String texto = ctx.TEXTO().getText();
        saida.append(ident + "<label><input type=\"radio\" name=\"\" value=\"\" />" + texto.substring(1,texto.length()-1) + "</label>\n");
        saida.append(ident + "<br>\n");
        return null;
    }
    
}
