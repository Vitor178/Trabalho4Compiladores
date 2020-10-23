// Generated from br/ufscar/dc/compiladores/trabalho4compiladores/trab4.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.trabalho4compiladores;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link trab4Parser}.
 */
public interface trab4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link trab4Parser#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(trab4Parser.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(trab4Parser.CodigoContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#titulo}.
	 * @param ctx the parse tree
	 */
	void enterTitulo(trab4Parser.TituloContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#titulo}.
	 * @param ctx the parse tree
	 */
	void exitTitulo(trab4Parser.TituloContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#enunciado}.
	 * @param ctx the parse tree
	 */
	void enterEnunciado(trab4Parser.EnunciadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#enunciado}.
	 * @param ctx the parse tree
	 */
	void exitEnunciado(trab4Parser.EnunciadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#definicoes}.
	 * @param ctx the parse tree
	 */
	void enterDefinicoes(trab4Parser.DefinicoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#definicoes}.
	 * @param ctx the parse tree
	 */
	void exitDefinicoes(trab4Parser.DefinicoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#definicao}.
	 * @param ctx the parse tree
	 */
	void enterDefinicao(trab4Parser.DefinicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#definicao}.
	 * @param ctx the parse tree
	 */
	void exitDefinicao(trab4Parser.DefinicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#pergunta}.
	 * @param ctx the parse tree
	 */
	void enterPergunta(trab4Parser.PerguntaContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#pergunta}.
	 * @param ctx the parse tree
	 */
	void exitPergunta(trab4Parser.PerguntaContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#opcoes}.
	 * @param ctx the parse tree
	 */
	void enterOpcoes(trab4Parser.OpcoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#opcoes}.
	 * @param ctx the parse tree
	 */
	void exitOpcoes(trab4Parser.OpcoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#opcao}.
	 * @param ctx the parse tree
	 */
	void enterOpcao(trab4Parser.OpcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#opcao}.
	 * @param ctx the parse tree
	 */
	void exitOpcao(trab4Parser.OpcaoContext ctx);
}