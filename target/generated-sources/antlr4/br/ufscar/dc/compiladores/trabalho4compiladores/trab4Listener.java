// Generated from br/ufscar/dc/compiladores/trabalho4compiladores/trab4.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.trabalho4compiladores;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link trab4Parser}.
 */
public interface trab4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link trab4Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(trab4Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(trab4Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(trab4Parser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(trab4Parser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(trab4Parser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(trab4Parser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(trab4Parser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(trab4Parser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(trab4Parser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(trab4Parser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(trab4Parser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(trab4Parser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(trab4Parser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(trab4Parser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(trab4Parser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(trab4Parser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(trab4Parser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(trab4Parser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(trab4Parser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(trab4Parser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(trab4Parser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(trab4Parser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(trab4Parser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(trab4Parser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(trab4Parser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(trab4Parser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(trab4Parser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(trab4Parser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(trab4Parser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(trab4Parser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(trab4Parser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(trab4Parser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(trab4Parser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(trab4Parser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(trab4Parser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(trab4Parser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(trab4Parser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(trab4Parser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(trab4Parser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(trab4Parser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(trab4Parser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(trab4Parser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(trab4Parser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(trab4Parser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(trab4Parser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(trab4Parser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(trab4Parser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(trab4Parser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(trab4Parser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(trab4Parser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(trab4Parser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(trab4Parser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(trab4Parser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(trab4Parser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(trab4Parser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(trab4Parser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(trab4Parser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(trab4Parser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(trab4Parser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(trab4Parser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(trab4Parser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(trab4Parser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(trab4Parser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(trab4Parser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(trab4Parser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(trab4Parser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(trab4Parser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(trab4Parser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(trab4Parser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(trab4Parser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(trab4Parser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(trab4Parser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(trab4Parser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(trab4Parser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(trab4Parser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(trab4Parser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(trab4Parser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(trab4Parser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(trab4Parser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(trab4Parser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(trab4Parser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(trab4Parser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(trab4Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(trab4Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(trab4Parser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(trab4Parser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(trab4Parser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(trab4Parser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(trab4Parser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(trab4Parser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(trab4Parser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(trab4Parser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(trab4Parser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(trab4Parser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(trab4Parser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(trab4Parser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(trab4Parser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(trab4Parser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link trab4Parser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(trab4Parser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link trab4Parser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(trab4Parser.Op_logico_2Context ctx);
}