// Generated from br/ufscar/dc/compiladores/trabalho4compiladores/trab4.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.trabalho4compiladores;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link trab4Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface trab4Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link trab4Parser#codigo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodigo(trab4Parser.CodigoContext ctx);
	/**
	 * Visit a parse tree produced by {@link trab4Parser#titulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitulo(trab4Parser.TituloContext ctx);
	/**
	 * Visit a parse tree produced by {@link trab4Parser#enunciado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnunciado(trab4Parser.EnunciadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link trab4Parser#definicoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicoes(trab4Parser.DefinicoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link trab4Parser#definicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicao(trab4Parser.DefinicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link trab4Parser#pergunta}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPergunta(trab4Parser.PerguntaContext ctx);
	/**
	 * Visit a parse tree produced by {@link trab4Parser#opcoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcoes(trab4Parser.OpcoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link trab4Parser#opcao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpcao(trab4Parser.OpcaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link trab4Parser#texto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTexto(trab4Parser.TextoContext ctx);
}