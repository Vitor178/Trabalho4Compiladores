// Generated from br/ufscar/dc/compiladores/trabalho4compiladores/trab4.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.trabalho4compiladores;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class trab4Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Inicio=1, Fim=2, Titulo=3, Enunciado=4, Definir=5, Pergunta=6, Opcao=7, 
		Abre_col=8, Fecha_col=9, ABREPAR=10, FECHAPAR=11, TEXTO=12, IDENT=13, 
		COMENTARIO=14, WS=15, Coment_N_fechado=16, ERROR=17;
	public static final int
		RULE_codigo = 0, RULE_titulo = 1, RULE_enunciado = 2, RULE_definicoes = 3, 
		RULE_definicao = 4, RULE_pergunta = 5, RULE_opcoes = 6, RULE_opcao = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"codigo", "titulo", "enunciado", "definicoes", "definicao", "pergunta", 
			"opcoes", "opcao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'fim'", "'titulo'", "'enunciado'", "'definir'", "'pergunta'", 
			"'op'", "'{'", "'}'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Inicio", "Fim", "Titulo", "Enunciado", "Definir", "Pergunta", 
			"Opcao", "Abre_col", "Fecha_col", "ABREPAR", "FECHAPAR", "TEXTO", "IDENT", 
			"COMENTARIO", "WS", "Coment_N_fechado", "ERROR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "trab4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public trab4Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CodigoContext extends ParserRuleContext {
		public TerminalNode Inicio() { return getToken(trab4Parser.Inicio, 0); }
		public TituloContext titulo() {
			return getRuleContext(TituloContext.class,0);
		}
		public EnunciadoContext enunciado() {
			return getRuleContext(EnunciadoContext.class,0);
		}
		public DefinicoesContext definicoes() {
			return getRuleContext(DefinicoesContext.class,0);
		}
		public TerminalNode Fim() { return getToken(trab4Parser.Fim, 0); }
		public CodigoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codigo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterCodigo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitCodigo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof trab4Visitor ) return ((trab4Visitor<? extends T>)visitor).visitCodigo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_codigo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(Inicio);
			setState(17);
			titulo();
			setState(18);
			enunciado();
			setState(19);
			definicoes();
			setState(20);
			match(Fim);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TituloContext extends ParserRuleContext {
		public TerminalNode Titulo() { return getToken(trab4Parser.Titulo, 0); }
		public TerminalNode ABREPAR() { return getToken(trab4Parser.ABREPAR, 0); }
		public TerminalNode TEXTO() { return getToken(trab4Parser.TEXTO, 0); }
		public TerminalNode FECHAPAR() { return getToken(trab4Parser.FECHAPAR, 0); }
		public TituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_titulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterTitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitTitulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof trab4Visitor ) return ((trab4Visitor<? extends T>)visitor).visitTitulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TituloContext titulo() throws RecognitionException {
		TituloContext _localctx = new TituloContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_titulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(Titulo);
			setState(23);
			match(ABREPAR);
			setState(24);
			match(TEXTO);
			setState(25);
			match(FECHAPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnunciadoContext extends ParserRuleContext {
		public TerminalNode Enunciado() { return getToken(trab4Parser.Enunciado, 0); }
		public TerminalNode ABREPAR() { return getToken(trab4Parser.ABREPAR, 0); }
		public TerminalNode TEXTO() { return getToken(trab4Parser.TEXTO, 0); }
		public TerminalNode FECHAPAR() { return getToken(trab4Parser.FECHAPAR, 0); }
		public EnunciadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enunciado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterEnunciado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitEnunciado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof trab4Visitor ) return ((trab4Visitor<? extends T>)visitor).visitEnunciado(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnunciadoContext enunciado() throws RecognitionException {
		EnunciadoContext _localctx = new EnunciadoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_enunciado);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(Enunciado);
			setState(28);
			match(ABREPAR);
			setState(29);
			match(TEXTO);
			setState(30);
			match(FECHAPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinicoesContext extends ParserRuleContext {
		public List<DefinicaoContext> definicao() {
			return getRuleContexts(DefinicaoContext.class);
		}
		public DefinicaoContext definicao(int i) {
			return getRuleContext(DefinicaoContext.class,i);
		}
		public DefinicoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterDefinicoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitDefinicoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof trab4Visitor ) return ((trab4Visitor<? extends T>)visitor).visitDefinicoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicoesContext definicoes() throws RecognitionException {
		DefinicoesContext _localctx = new DefinicoesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_definicoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Definir) {
				{
				{
				setState(32);
				definicao();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinicaoContext extends ParserRuleContext {
		public TerminalNode Definir() { return getToken(trab4Parser.Definir, 0); }
		public TerminalNode IDENT() { return getToken(trab4Parser.IDENT, 0); }
		public TerminalNode Abre_col() { return getToken(trab4Parser.Abre_col, 0); }
		public PerguntaContext pergunta() {
			return getRuleContext(PerguntaContext.class,0);
		}
		public OpcoesContext opcoes() {
			return getRuleContext(OpcoesContext.class,0);
		}
		public TerminalNode Fecha_col() { return getToken(trab4Parser.Fecha_col, 0); }
		public DefinicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterDefinicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitDefinicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof trab4Visitor ) return ((trab4Visitor<? extends T>)visitor).visitDefinicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinicaoContext definicao() throws RecognitionException {
		DefinicaoContext _localctx = new DefinicaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(Definir);
			setState(39);
			match(IDENT);
			setState(40);
			match(Abre_col);
			setState(41);
			pergunta();
			setState(42);
			opcoes();
			setState(43);
			match(Fecha_col);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PerguntaContext extends ParserRuleContext {
		public TerminalNode Pergunta() { return getToken(trab4Parser.Pergunta, 0); }
		public TerminalNode ABREPAR() { return getToken(trab4Parser.ABREPAR, 0); }
		public TerminalNode TEXTO() { return getToken(trab4Parser.TEXTO, 0); }
		public TerminalNode FECHAPAR() { return getToken(trab4Parser.FECHAPAR, 0); }
		public PerguntaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pergunta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterPergunta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitPergunta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof trab4Visitor ) return ((trab4Visitor<? extends T>)visitor).visitPergunta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerguntaContext pergunta() throws RecognitionException {
		PerguntaContext _localctx = new PerguntaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pergunta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(Pergunta);
			setState(46);
			match(ABREPAR);
			setState(47);
			match(TEXTO);
			setState(48);
			match(FECHAPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpcoesContext extends ParserRuleContext {
		public List<OpcaoContext> opcao() {
			return getRuleContexts(OpcaoContext.class);
		}
		public OpcaoContext opcao(int i) {
			return getRuleContext(OpcaoContext.class,i);
		}
		public OpcoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterOpcoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitOpcoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof trab4Visitor ) return ((trab4Visitor<? extends T>)visitor).visitOpcoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcoesContext opcoes() throws RecognitionException {
		OpcoesContext _localctx = new OpcoesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_opcoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				opcao();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Opcao );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpcaoContext extends ParserRuleContext {
		public TerminalNode Opcao() { return getToken(trab4Parser.Opcao, 0); }
		public TerminalNode ABREPAR() { return getToken(trab4Parser.ABREPAR, 0); }
		public TerminalNode TEXTO() { return getToken(trab4Parser.TEXTO, 0); }
		public TerminalNode FECHAPAR() { return getToken(trab4Parser.FECHAPAR, 0); }
		public OpcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterOpcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitOpcao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof trab4Visitor ) return ((trab4Visitor<? extends T>)visitor).visitOpcao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcaoContext opcao() throws RecognitionException {
		OpcaoContext _localctx = new OpcaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_opcao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(Opcao);
			setState(56);
			match(ABREPAR);
			setState(57);
			match(TEXTO);
			setState(58);
			match(FECHAPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23?\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\7\5$\n\5\f\5\16\5\'\13"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\6\b\66\n\b\r\b"+
		"\16\b\67\3\t\3\t\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2\28\2\22\3"+
		"\2\2\2\4\30\3\2\2\2\6\35\3\2\2\2\b%\3\2\2\2\n(\3\2\2\2\f/\3\2\2\2\16\65"+
		"\3\2\2\2\209\3\2\2\2\22\23\7\3\2\2\23\24\5\4\3\2\24\25\5\6\4\2\25\26\5"+
		"\b\5\2\26\27\7\4\2\2\27\3\3\2\2\2\30\31\7\5\2\2\31\32\7\f\2\2\32\33\7"+
		"\16\2\2\33\34\7\r\2\2\34\5\3\2\2\2\35\36\7\6\2\2\36\37\7\f\2\2\37 \7\16"+
		"\2\2 !\7\r\2\2!\7\3\2\2\2\"$\5\n\6\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%"+
		"&\3\2\2\2&\t\3\2\2\2\'%\3\2\2\2()\7\7\2\2)*\7\17\2\2*+\7\n\2\2+,\5\f\7"+
		"\2,-\5\16\b\2-.\7\13\2\2.\13\3\2\2\2/\60\7\b\2\2\60\61\7\f\2\2\61\62\7"+
		"\16\2\2\62\63\7\r\2\2\63\r\3\2\2\2\64\66\5\20\t\2\65\64\3\2\2\2\66\67"+
		"\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\17\3\2\2\29:\7\t\2\2:;\7\f\2\2;<\7"+
		"\16\2\2<=\7\r\2\2=\21\3\2\2\2\4%\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}