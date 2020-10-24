package br.ufscar.dc.compiladores.trabalho4compiladores;

import br.ufscar.dc.compiladores.trabalho4compiladores.TabelaDeSimbolos.Tipo;


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
        // verificar se no nome da alternativa ja não foi usado em outra questão
        TabelaDeSimbolos escopoAtualTemp = escoposAninhados.obterEscopoAtual();
        boolean ok = true;
        for(var o : ctx.opcao()){
            if (escopoAtualTemp.existe(o.IDENT(0).getText())){
                SemanticoUtils.adicionarErroSemantico(o.getStart(), "Nome da alternativa " + o.TEXTO().getText() + " ja declarado em outra questão");
                ok = false;                     
            }
        }
        //se o nome não foi usado em outra questão a variavel ok é true
        if(ok){
            escopoAtualTemp.adicionar(ctx.opcao(0).IDENT(0).getText(), Tipo.NOME);
        }
        
        escoposAninhados.criarNovoEscopo();
        TabelaDeSimbolos escopoAtual = escoposAninhados.obterEscopoAtual();
        //adiciona o primeiro nome da primeira alternativa para verificar se as outras alternativas
        //terão o mesmo nome
        escopoAtual.adicionar(ctx.opcao(0).IDENT(0).getText(), Tipo.NOME);
        
        for(var d : ctx.opcao()){
            //se o nome da alternativa não existir na mesma questão
            if (!(escopoAtualTemp.existe(d.IDENT(0).getText()))){
                SemanticoUtils.adicionarErroSemantico(d.getStart(), "Todas as alternativas de uma mesma questão precisam ter o mesmo nome ");
            }
            //se o texto da alternativa já existir na mesma questão
            if (escopoAtual.existe(d.TEXTO().getText())){
                SemanticoUtils.adicionarErroSemantico(d.getStart(), "Alternativa " + d.TEXTO().getText() + " ja declarada anteriormente");
            }
            // se o valor da alternativa já existir na mesma questãos
            if (escopoAtual.existe(d.IDENT(1).getText())){
                SemanticoUtils.adicionarErroSemantico(d.getStart(), "Valor da alternativa " + d.IDENT(1).getText() + " ja declarado anteriormente");
            } else {
                escopoAtual.adicionar(d.TEXTO().getText(), Tipo.OPCAO);
                escopoAtual.adicionar(d.IDENT(1).getText(), Tipo.VALOR);
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