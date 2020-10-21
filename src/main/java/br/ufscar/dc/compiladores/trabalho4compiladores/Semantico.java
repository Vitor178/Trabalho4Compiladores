package br.ufscar.dc.compiladores.trabalho4compiladores;

import br.ufscar.dc.compiladores.trabalho4compiladores.TabelaDeSimbolos.Tipo;
import java.util.ArrayList;
import java.util.List;

public class Semantico extends trab4BaseVisitor<Void> {

    Escopos escoposAninhados;

    @Override
    public Void visitCodigo(trab4Parser.CodigoContext ctx) {
        escoposAninhados = new Escopos();
        return super.visitCodigo(ctx);
    }
    
    @Override
    public Void visitTitulo(trab4Parser.TituloContext ctx){
        return super.visitTitulo(ctx);
    }
    
    @Override
    public Void visitEnunciado(trab4Parser.EnunciadoContext ctx){
        return super.visitEnunciado(ctx);
    }

    @Override
    public Void visitDefinicoes(trab4Parser.DefinicoesContext ctx){
        return super.visitDefinicoes(ctx);
    }
    
    @Override
    public Void visitDefinicao(trab4Parser.DefinicaoContext ctx){
        TabelaDeSimbolos escopoAtual = escoposAninhados.obterEscopoAtual();
        String identificador = ctx.IDENT().getText();
        
        if (escopoAtual.existe(identificador)){
            SemanticoUtils.adicionarErroSemantico(ctx.getStart(), "Identificador " + identificador + " ja declarado anteriormente");
        } else {
            escopoAtual.adicionar(identificador, Tipo.IDENTIFICADOR);
        }
      
        return super.visitDefinicao(ctx);
    }
    
    @Override
    public Void visitPergunta(trab4Parser.PerguntaContext ctx){
        TabelaDeSimbolos escopoAtual = escoposAninhados.obterEscopoAtual();
        String pergunta = ctx.TEXTO().getText();
        if (escopoAtual.existe(pergunta)){
            SemanticoUtils.adicionarErroSemantico(ctx.getStart(), "Pergunta " + pergunta + " ja declarada anteriormente");
        } else {
            escopoAtual.adicionar(pergunta, Tipo.PERGUNTA);
        }
        
        return super.visitPergunta(ctx);
    }
    
    @Override
    public Void visitOpcoes(trab4Parser.OpcoesContext ctx){
        escoposAninhados.criarNovoEscopo();
        TabelaDeSimbolos escopoAtual = escoposAninhados.obterEscopoAtual();

        for(var d : ctx.opcao()){
            if (escopoAtual.existe(d.TEXTO().getText())){
                SemanticoUtils.adicionarErroSemantico(d.getStart(), "Opcao " + d.TEXTO().getText() + " ja declarada anteriormente");
            } else {
                escopoAtual.adicionar(d.TEXTO().getText(), Tipo.OPCAO);
            }
        }
        escoposAninhados.abandonarEscopo();
        return super.visitOpcoes(ctx);
    }
    
    @Override
    public Void visitOpcao(trab4Parser.OpcaoContext ctx){
        return super.visitOpcao(ctx);
    }
    
}