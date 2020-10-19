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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, HTML_abre=7, HTML_fecha=8, 
		HEAD_abre=9, HEAD_fecha=10, BODY_abre=11, BODY_fecha=12, TITLE_abre=13, 
		TITLE_fecha=14, FORM_abre=15, FORM_fecha=16, LABEL_abre=17, LABEL_fecha=18, 
		INPUT_abre=19, INPUT_fecha=20, TYPE=21, NAME=22, VALUE=23, ID=24, METHOD=25, 
		ACTION=26, CLASS=27, BR=28, P=29, H1_abre=30, H1_fecha=31, H2_abre=32, 
		H2_fecha=33, H3_abre=34, H3_fecha=35, H4_abre=36, H4_fecha=37, H5_abre=38, 
		H5_fecha=39, Menor=40, Maior=41, Barra=42, Abre_colchete=43, Fecha_colchete=44, 
		Virgula=45, Ponto=46, DELIM=47, ABREPAR=48, FECHAPAR=49, CADEIA=50, NUM_INT=51, 
		NUM_REAL=52, IDENT=53, COMENTARIO=54, FRASE=55, WS=56, Ponteiro=57, Endereco=58, 
		Porcent=59, MaiorIgual=60, MenosIgual=61, Diferente=62, Igual=63, Mais=64, 
		Menos=65, Vezes=66, Cadeia_errada=67, ERROR=68;
	public static final int
		RULE_codigo = 0, RULE_head = 1, RULE_body = 2, RULE_head_interno = 3, 
		RULE_body_interno = 4, RULE_title = 5, RULE_form = 6, RULE_form_interno = 7, 
		RULE_label = 8, RULE_input = 9, RULE_h1 = 10, RULE_h2 = 11, RULE_h3 = 12, 
		RULE_h4 = 13, RULE_h5 = 14, RULE_id = 15, RULE_type = 16, RULE_name = 17, 
		RULE_method = 18, RULE_action = 19, RULE_value = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"codigo", "head", "body", "head_interno", "body_interno", "title", "form", 
			"form_interno", "label", "input", "h1", "h2", "h3", "h4", "h5", "id", 
			"type", "name", "method", "action", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<p/>'", "'h1'", "'h2'", "'h3'", "'h4'", "'h5'", "'<html>'", "'</html>'", 
			"'<head>'", "'</head>'", "'<body>'", "'</body>'", "'<title>'", "'</title>'", 
			"'<form'", "'</form>'", "'<label>'", "'</label>'", "'<input'", "'/>'", 
			"'type'", "'name'", "'value'", "'id'", "'method'", "'action'", "'class'", 
			"'<br/>'", "'<p>'", "'<h1>'", "'</h1>'", "'<h2>'", "'</h2>'", "'<h3>'", 
			"'</h3>'", "'<h4>'", "'</h4>'", "'<h5>'", "'</h5>'", "'<'", "'>'", "'/'", 
			"'['", "']'", "','", "'.'", "':'", "'('", "')'", null, null, null, null, 
			null, null, null, "'^'", "'&'", "'%'", "'>='", "'<='", "'<>'", "'='", 
			"'+'", "'-'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "HTML_abre", "HTML_fecha", 
			"HEAD_abre", "HEAD_fecha", "BODY_abre", "BODY_fecha", "TITLE_abre", "TITLE_fecha", 
			"FORM_abre", "FORM_fecha", "LABEL_abre", "LABEL_fecha", "INPUT_abre", 
			"INPUT_fecha", "TYPE", "NAME", "VALUE", "ID", "METHOD", "ACTION", "CLASS", 
			"BR", "P", "H1_abre", "H1_fecha", "H2_abre", "H2_fecha", "H3_abre", "H3_fecha", 
			"H4_abre", "H4_fecha", "H5_abre", "H5_fecha", "Menor", "Maior", "Barra", 
			"Abre_colchete", "Fecha_colchete", "Virgula", "Ponto", "DELIM", "ABREPAR", 
			"FECHAPAR", "CADEIA", "NUM_INT", "NUM_REAL", "IDENT", "COMENTARIO", "FRASE", 
			"WS", "Ponteiro", "Endereco", "Porcent", "MaiorIgual", "MenosIgual", 
			"Diferente", "Igual", "Mais", "Menos", "Vezes", "Cadeia_errada", "ERROR"
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
		public TerminalNode HTML_abre() { return getToken(trab4Parser.HTML_abre, 0); }
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode HTML_fecha() { return getToken(trab4Parser.HTML_fecha, 0); }
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
	}

	public final CodigoContext codigo() throws RecognitionException {
		CodigoContext _localctx = new CodigoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_codigo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(HTML_abre);
			setState(43);
			head();
			setState(44);
			body();
			setState(45);
			match(HTML_fecha);
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

	public static class HeadContext extends ParserRuleContext {
		public TerminalNode HEAD_abre() { return getToken(trab4Parser.HEAD_abre, 0); }
		public Head_internoContext head_interno() {
			return getRuleContext(Head_internoContext.class,0);
		}
		public TerminalNode HEAD_fecha() { return getToken(trab4Parser.HEAD_fecha, 0); }
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitHead(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(HEAD_abre);
			setState(48);
			head_interno();
			setState(49);
			match(HEAD_fecha);
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

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode BODY_abre() { return getToken(trab4Parser.BODY_abre, 0); }
		public Body_internoContext body_interno() {
			return getRuleContext(Body_internoContext.class,0);
		}
		public TerminalNode BODY_fecha() { return getToken(trab4Parser.BODY_fecha, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(BODY_abre);
			setState(52);
			body_interno();
			setState(53);
			match(BODY_fecha);
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

	public static class Head_internoContext extends ParserRuleContext {
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public Head_internoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head_interno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterHead_interno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitHead_interno(this);
		}
	}

	public final Head_internoContext head_interno() throws RecognitionException {
		Head_internoContext _localctx = new Head_internoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_head_interno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(55);
			title();
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

	public static class Body_internoContext extends ParserRuleContext {
		public List<TerminalNode> FRASE() { return getTokens(trab4Parser.FRASE); }
		public TerminalNode FRASE(int i) {
			return getToken(trab4Parser.FRASE, i);
		}
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> BR() { return getTokens(trab4Parser.BR); }
		public TerminalNode BR(int i) {
			return getToken(trab4Parser.BR, i);
		}
		public List<H1Context> h1() {
			return getRuleContexts(H1Context.class);
		}
		public H1Context h1(int i) {
			return getRuleContext(H1Context.class,i);
		}
		public List<H2Context> h2() {
			return getRuleContexts(H2Context.class);
		}
		public H2Context h2(int i) {
			return getRuleContext(H2Context.class,i);
		}
		public List<H3Context> h3() {
			return getRuleContexts(H3Context.class);
		}
		public H3Context h3(int i) {
			return getRuleContext(H3Context.class,i);
		}
		public List<H4Context> h4() {
			return getRuleContexts(H4Context.class);
		}
		public H4Context h4(int i) {
			return getRuleContext(H4Context.class,i);
		}
		public List<H5Context> h5() {
			return getRuleContexts(H5Context.class);
		}
		public H5Context h5(int i) {
			return getRuleContext(H5Context.class,i);
		}
		public Body_internoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_interno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterBody_interno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitBody_interno(this);
		}
	}

	public final Body_internoContext body_interno() throws RecognitionException {
		Body_internoContext _localctx = new Body_internoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body_interno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FORM_abre) | (1L << LABEL_abre) | (1L << BR) | (1L << Menor) | (1L << FRASE))) != 0)) {
				{
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(57);
					match(FRASE);
					}
					break;
				case 2:
					{
					setState(58);
					form();
					}
					break;
				case 3:
					{
					setState(59);
					label();
					}
					break;
				case 4:
					{
					setState(60);
					match(BR);
					}
					break;
				case 5:
					{
					setState(61);
					h1();
					}
					break;
				case 6:
					{
					setState(62);
					h2();
					}
					break;
				case 7:
					{
					setState(63);
					h3();
					}
					break;
				case 8:
					{
					setState(64);
					h4();
					}
					break;
				case 9:
					{
					setState(65);
					h5();
					}
					break;
				}
				}
				setState(70);
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TITLE_abre() { return getToken(trab4Parser.TITLE_abre, 0); }
		public TerminalNode FRASE() { return getToken(trab4Parser.FRASE, 0); }
		public TerminalNode TITLE_fecha() { return getToken(trab4Parser.TITLE_fecha, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitTitle(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(TITLE_abre);
			setState(72);
			match(FRASE);
			setState(73);
			match(TITLE_fecha);
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

	public static class FormContext extends ParserRuleContext {
		public TerminalNode FORM_abre() { return getToken(trab4Parser.FORM_abre, 0); }
		public TerminalNode Maior() { return getToken(trab4Parser.Maior, 0); }
		public Form_internoContext form_interno() {
			return getRuleContext(Form_internoContext.class,0);
		}
		public TerminalNode FORM_fecha() { return getToken(trab4Parser.FORM_fecha, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitForm(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_form);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(FORM_abre);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << ID) | (1L << METHOD) | (1L << ACTION))) != 0)) {
				{
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(76);
					id();
					}
					break;
				case NAME:
					{
					setState(77);
					name();
					}
					break;
				case METHOD:
					{
					setState(78);
					method();
					}
					break;
				case ACTION:
					{
					setState(79);
					action();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(Maior);
			setState(86);
			form_interno();
			setState(87);
			match(FORM_fecha);
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

	public static class Form_internoContext extends ParserRuleContext {
		public List<TerminalNode> FRASE() { return getTokens(trab4Parser.FRASE); }
		public TerminalNode FRASE(int i) {
			return getToken(trab4Parser.FRASE, i);
		}
		public List<LabelContext> label() {
			return getRuleContexts(LabelContext.class);
		}
		public LabelContext label(int i) {
			return getRuleContext(LabelContext.class,i);
		}
		public List<TerminalNode> BR() { return getTokens(trab4Parser.BR); }
		public TerminalNode BR(int i) {
			return getToken(trab4Parser.BR, i);
		}
		public List<H1Context> h1() {
			return getRuleContexts(H1Context.class);
		}
		public H1Context h1(int i) {
			return getRuleContext(H1Context.class,i);
		}
		public List<H2Context> h2() {
			return getRuleContexts(H2Context.class);
		}
		public H2Context h2(int i) {
			return getRuleContext(H2Context.class,i);
		}
		public List<H3Context> h3() {
			return getRuleContexts(H3Context.class);
		}
		public H3Context h3(int i) {
			return getRuleContext(H3Context.class,i);
		}
		public List<H4Context> h4() {
			return getRuleContexts(H4Context.class);
		}
		public H4Context h4(int i) {
			return getRuleContext(H4Context.class,i);
		}
		public List<H5Context> h5() {
			return getRuleContexts(H5Context.class);
		}
		public H5Context h5(int i) {
			return getRuleContext(H5Context.class,i);
		}
		public Form_internoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form_interno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterForm_interno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitForm_interno(this);
		}
	}

	public final Form_internoContext form_interno() throws RecognitionException {
		Form_internoContext _localctx = new Form_internoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_form_interno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << LABEL_abre) | (1L << BR) | (1L << Menor) | (1L << FRASE))) != 0)) {
				{
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(89);
					match(FRASE);
					}
					break;
				case 2:
					{
					setState(90);
					match(T__0);
					}
					break;
				case 3:
					{
					setState(91);
					label();
					}
					break;
				case 4:
					{
					setState(92);
					match(BR);
					}
					break;
				case 5:
					{
					setState(93);
					h1();
					}
					break;
				case 6:
					{
					setState(94);
					h2();
					}
					break;
				case 7:
					{
					setState(95);
					h3();
					}
					break;
				case 8:
					{
					setState(96);
					h4();
					}
					break;
				case 9:
					{
					setState(97);
					h5();
					}
					break;
				}
				}
				setState(102);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode LABEL_abre() { return getToken(trab4Parser.LABEL_abre, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode FRASE() { return getToken(trab4Parser.FRASE, 0); }
		public TerminalNode LABEL_fecha() { return getToken(trab4Parser.LABEL_fecha, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(LABEL_abre);
			setState(104);
			input();
			setState(105);
			match(FRASE);
			setState(106);
			match(LABEL_fecha);
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT_abre() { return getToken(trab4Parser.INPUT_abre, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode INPUT_fecha() { return getToken(trab4Parser.INPUT_fecha, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(INPUT_abre);
			setState(109);
			type();
			setState(110);
			name();
			setState(111);
			value();
			setState(112);
			match(INPUT_fecha);
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

	public static class H1Context extends ParserRuleContext {
		public List<TerminalNode> Menor() { return getTokens(trab4Parser.Menor); }
		public TerminalNode Menor(int i) {
			return getToken(trab4Parser.Menor, i);
		}
		public List<TerminalNode> Maior() { return getTokens(trab4Parser.Maior); }
		public TerminalNode Maior(int i) {
			return getToken(trab4Parser.Maior, i);
		}
		public TerminalNode FRASE() { return getToken(trab4Parser.FRASE, 0); }
		public TerminalNode Barra() { return getToken(trab4Parser.Barra, 0); }
		public H1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterH1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitH1(this);
		}
	}

	public final H1Context h1() throws RecognitionException {
		H1Context _localctx = new H1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_h1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(Menor);
			setState(115);
			match(T__1);
			setState(116);
			match(Maior);
			setState(117);
			match(FRASE);
			setState(118);
			match(Menor);
			setState(119);
			match(Barra);
			setState(120);
			match(T__1);
			setState(121);
			match(Maior);
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

	public static class H2Context extends ParserRuleContext {
		public List<TerminalNode> Menor() { return getTokens(trab4Parser.Menor); }
		public TerminalNode Menor(int i) {
			return getToken(trab4Parser.Menor, i);
		}
		public List<TerminalNode> Maior() { return getTokens(trab4Parser.Maior); }
		public TerminalNode Maior(int i) {
			return getToken(trab4Parser.Maior, i);
		}
		public TerminalNode FRASE() { return getToken(trab4Parser.FRASE, 0); }
		public TerminalNode Barra() { return getToken(trab4Parser.Barra, 0); }
		public H2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterH2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitH2(this);
		}
	}

	public final H2Context h2() throws RecognitionException {
		H2Context _localctx = new H2Context(_ctx, getState());
		enterRule(_localctx, 22, RULE_h2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(Menor);
			setState(124);
			match(T__2);
			setState(125);
			match(Maior);
			setState(126);
			match(FRASE);
			setState(127);
			match(Menor);
			setState(128);
			match(Barra);
			setState(129);
			match(T__2);
			setState(130);
			match(Maior);
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

	public static class H3Context extends ParserRuleContext {
		public List<TerminalNode> Menor() { return getTokens(trab4Parser.Menor); }
		public TerminalNode Menor(int i) {
			return getToken(trab4Parser.Menor, i);
		}
		public List<TerminalNode> Maior() { return getTokens(trab4Parser.Maior); }
		public TerminalNode Maior(int i) {
			return getToken(trab4Parser.Maior, i);
		}
		public TerminalNode FRASE() { return getToken(trab4Parser.FRASE, 0); }
		public TerminalNode Barra() { return getToken(trab4Parser.Barra, 0); }
		public H3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterH3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitH3(this);
		}
	}

	public final H3Context h3() throws RecognitionException {
		H3Context _localctx = new H3Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_h3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(Menor);
			setState(133);
			match(T__3);
			setState(134);
			match(Maior);
			setState(135);
			match(FRASE);
			setState(136);
			match(Menor);
			setState(137);
			match(Barra);
			setState(138);
			match(T__3);
			setState(139);
			match(Maior);
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

	public static class H4Context extends ParserRuleContext {
		public List<TerminalNode> Menor() { return getTokens(trab4Parser.Menor); }
		public TerminalNode Menor(int i) {
			return getToken(trab4Parser.Menor, i);
		}
		public List<TerminalNode> Maior() { return getTokens(trab4Parser.Maior); }
		public TerminalNode Maior(int i) {
			return getToken(trab4Parser.Maior, i);
		}
		public TerminalNode FRASE() { return getToken(trab4Parser.FRASE, 0); }
		public TerminalNode Barra() { return getToken(trab4Parser.Barra, 0); }
		public H4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterH4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitH4(this);
		}
	}

	public final H4Context h4() throws RecognitionException {
		H4Context _localctx = new H4Context(_ctx, getState());
		enterRule(_localctx, 26, RULE_h4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(Menor);
			setState(142);
			match(T__4);
			setState(143);
			match(Maior);
			setState(144);
			match(FRASE);
			setState(145);
			match(Menor);
			setState(146);
			match(Barra);
			setState(147);
			match(T__4);
			setState(148);
			match(Maior);
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

	public static class H5Context extends ParserRuleContext {
		public List<TerminalNode> Menor() { return getTokens(trab4Parser.Menor); }
		public TerminalNode Menor(int i) {
			return getToken(trab4Parser.Menor, i);
		}
		public List<TerminalNode> Maior() { return getTokens(trab4Parser.Maior); }
		public TerminalNode Maior(int i) {
			return getToken(trab4Parser.Maior, i);
		}
		public TerminalNode FRASE() { return getToken(trab4Parser.FRASE, 0); }
		public TerminalNode Barra() { return getToken(trab4Parser.Barra, 0); }
		public H5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterH5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitH5(this);
		}
	}

	public final H5Context h5() throws RecognitionException {
		H5Context _localctx = new H5Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_h5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(Menor);
			setState(151);
			match(T__5);
			setState(152);
			match(Maior);
			setState(153);
			match(FRASE);
			setState(154);
			match(Menor);
			setState(155);
			match(Barra);
			setState(156);
			match(T__5);
			setState(157);
			match(Maior);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(trab4Parser.ID, 0); }
		public TerminalNode Igual() { return getToken(trab4Parser.Igual, 0); }
		public TerminalNode CADEIA() { return getToken(trab4Parser.CADEIA, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(ID);
			setState(160);
			match(Igual);
			setState(161);
			match(CADEIA);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(trab4Parser.TYPE, 0); }
		public TerminalNode Igual() { return getToken(trab4Parser.Igual, 0); }
		public TerminalNode CADEIA() { return getToken(trab4Parser.CADEIA, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(TYPE);
			setState(164);
			match(Igual);
			setState(165);
			match(CADEIA);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(trab4Parser.NAME, 0); }
		public TerminalNode Igual() { return getToken(trab4Parser.Igual, 0); }
		public TerminalNode CADEIA() { return getToken(trab4Parser.CADEIA, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(NAME);
			setState(168);
			match(Igual);
			setState(169);
			match(CADEIA);
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

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(trab4Parser.METHOD, 0); }
		public TerminalNode Igual() { return getToken(trab4Parser.Igual, 0); }
		public TerminalNode CADEIA() { return getToken(trab4Parser.CADEIA, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(METHOD);
			setState(172);
			match(Igual);
			setState(173);
			match(CADEIA);
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

	public static class ActionContext extends ParserRuleContext {
		public TerminalNode ACTION() { return getToken(trab4Parser.ACTION, 0); }
		public TerminalNode Igual() { return getToken(trab4Parser.Igual, 0); }
		public TerminalNode CADEIA() { return getToken(trab4Parser.CADEIA, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ACTION);
			setState(176);
			match(Igual);
			setState(177);
			match(CADEIA);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode VALUE() { return getToken(trab4Parser.VALUE, 0); }
		public TerminalNode Igual() { return getToken(trab4Parser.Igual, 0); }
		public TerminalNode CADEIA() { return getToken(trab4Parser.CADEIA, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof trab4Listener ) ((trab4Listener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(VALUE);
			setState(180);
			match(Igual);
			setState(181);
			match(CADEIA);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3F\u00ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6"+
		"E\n\6\f\6\16\6H\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bS\n\b\f\b"+
		"\16\bV\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\te\n"+
		"\t\f\t\16\th\13\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\2\2\27\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*\2\2\2\u00ba\2,\3\2\2\2\4\61\3\2\2\2"+
		"\6\65\3\2\2\2\b9\3\2\2\2\nF\3\2\2\2\fI\3\2\2\2\16M\3\2\2\2\20f\3\2\2\2"+
		"\22i\3\2\2\2\24n\3\2\2\2\26t\3\2\2\2\30}\3\2\2\2\32\u0086\3\2\2\2\34\u008f"+
		"\3\2\2\2\36\u0098\3\2\2\2 \u00a1\3\2\2\2\"\u00a5\3\2\2\2$\u00a9\3\2\2"+
		"\2&\u00ad\3\2\2\2(\u00b1\3\2\2\2*\u00b5\3\2\2\2,-\7\t\2\2-.\5\4\3\2./"+
		"\5\6\4\2/\60\7\n\2\2\60\3\3\2\2\2\61\62\7\13\2\2\62\63\5\b\5\2\63\64\7"+
		"\f\2\2\64\5\3\2\2\2\65\66\7\r\2\2\66\67\5\n\6\2\678\7\16\2\28\7\3\2\2"+
		"\29:\5\f\7\2:\t\3\2\2\2;E\79\2\2<E\5\16\b\2=E\5\22\n\2>E\7\36\2\2?E\5"+
		"\26\f\2@E\5\30\r\2AE\5\32\16\2BE\5\34\17\2CE\5\36\20\2D;\3\2\2\2D<\3\2"+
		"\2\2D=\3\2\2\2D>\3\2\2\2D?\3\2\2\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2"+
		"\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2G\13\3\2\2\2HF\3\2\2\2IJ\7\17\2\2JK"+
		"\79\2\2KL\7\20\2\2L\r\3\2\2\2MT\7\21\2\2NS\5 \21\2OS\5$\23\2PS\5&\24\2"+
		"QS\5(\25\2RN\3\2\2\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2"+
		"TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7+\2\2XY\5\20\t\2YZ\7\22\2\2Z\17\3\2"+
		"\2\2[e\79\2\2\\e\7\3\2\2]e\5\22\n\2^e\7\36\2\2_e\5\26\f\2`e\5\30\r\2a"+
		"e\5\32\16\2be\5\34\17\2ce\5\36\20\2d[\3\2\2\2d\\\3\2\2\2d]\3\2\2\2d^\3"+
		"\2\2\2d_\3\2\2\2d`\3\2\2\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2eh\3\2\2\2fd\3"+
		"\2\2\2fg\3\2\2\2g\21\3\2\2\2hf\3\2\2\2ij\7\23\2\2jk\5\24\13\2kl\79\2\2"+
		"lm\7\24\2\2m\23\3\2\2\2no\7\25\2\2op\5\"\22\2pq\5$\23\2qr\5*\26\2rs\7"+
		"\26\2\2s\25\3\2\2\2tu\7*\2\2uv\7\4\2\2vw\7+\2\2wx\79\2\2xy\7*\2\2yz\7"+
		",\2\2z{\7\4\2\2{|\7+\2\2|\27\3\2\2\2}~\7*\2\2~\177\7\5\2\2\177\u0080\7"+
		"+\2\2\u0080\u0081\79\2\2\u0081\u0082\7*\2\2\u0082\u0083\7,\2\2\u0083\u0084"+
		"\7\5\2\2\u0084\u0085\7+\2\2\u0085\31\3\2\2\2\u0086\u0087\7*\2\2\u0087"+
		"\u0088\7\6\2\2\u0088\u0089\7+\2\2\u0089\u008a\79\2\2\u008a\u008b\7*\2"+
		"\2\u008b\u008c\7,\2\2\u008c\u008d\7\6\2\2\u008d\u008e\7+\2\2\u008e\33"+
		"\3\2\2\2\u008f\u0090\7*\2\2\u0090\u0091\7\7\2\2\u0091\u0092\7+\2\2\u0092"+
		"\u0093\79\2\2\u0093\u0094\7*\2\2\u0094\u0095\7,\2\2\u0095\u0096\7\7\2"+
		"\2\u0096\u0097\7+\2\2\u0097\35\3\2\2\2\u0098\u0099\7*\2\2\u0099\u009a"+
		"\7\b\2\2\u009a\u009b\7+\2\2\u009b\u009c\79\2\2\u009c\u009d\7*\2\2\u009d"+
		"\u009e\7,\2\2\u009e\u009f\7\b\2\2\u009f\u00a0\7+\2\2\u00a0\37\3\2\2\2"+
		"\u00a1\u00a2\7\32\2\2\u00a2\u00a3\7A\2\2\u00a3\u00a4\7\64\2\2\u00a4!\3"+
		"\2\2\2\u00a5\u00a6\7\27\2\2\u00a6\u00a7\7A\2\2\u00a7\u00a8\7\64\2\2\u00a8"+
		"#\3\2\2\2\u00a9\u00aa\7\30\2\2\u00aa\u00ab\7A\2\2\u00ab\u00ac\7\64\2\2"+
		"\u00ac%\3\2\2\2\u00ad\u00ae\7\33\2\2\u00ae\u00af\7A\2\2\u00af\u00b0\7"+
		"\64\2\2\u00b0\'\3\2\2\2\u00b1\u00b2\7\34\2\2\u00b2\u00b3\7A\2\2\u00b3"+
		"\u00b4\7\64\2\2\u00b4)\3\2\2\2\u00b5\u00b6\7\31\2\2\u00b6\u00b7\7A\2\2"+
		"\u00b7\u00b8\7\64\2\2\u00b8+\3\2\2\2\bDFRTdf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}