// Generated from br/ufscar/dc/compiladores/trabalho4compiladores/trab4.g4 by ANTLR 4.7.2
package br.ufscar.dc.compiladores.trabalho4compiladores;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class trab4Lexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "HTML_abre", "HTML_fecha", 
			"HEAD_abre", "HEAD_fecha", "BODY_abre", "BODY_fecha", "TITLE_abre", "TITLE_fecha", 
			"FORM_abre", "FORM_fecha", "LABEL_abre", "LABEL_fecha", "INPUT_abre", 
			"INPUT_fecha", "TYPE", "NAME", "VALUE", "ID", "METHOD", "ACTION", "CLASS", 
			"BR", "P", "H1_abre", "H1_fecha", "H2_abre", "H2_fecha", "H3_abre", "H3_fecha", 
			"H4_abre", "H4_fecha", "H5_abre", "H5_fecha", "Menor", "Maior", "Barra", 
			"Abre_colchete", "Fecha_colchete", "Virgula", "Ponto", "DELIM", "ABREPAR", 
			"FECHAPAR", "CADEIA", "ESC_SEQ", "NUM_INT", "NUM_REAL", "IDENT", "COMENTARIO", 
			"FRASE", "WS", "Ponteiro", "Endereco", "Porcent", "MaiorIgual", "MenosIgual", 
			"Diferente", "Igual", "Mais", "Menos", "Vezes", "Cadeia_errada", "ERROR"
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


	public trab4Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "trab4.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 54:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 56:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2F\u01e6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)"+
		"\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\63\7\63\u0188\n\63\f\63\16\63\u018b\13\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\65\6\65\u0193\n\65\r\65\16\65\u0194\3\66\6\66\u0198\n\66"+
		"\r\66\16\66\u0199\3\66\3\66\6\66\u019e\n\66\r\66\16\66\u019f\5\66\u01a2"+
		"\n\66\3\67\3\67\7\67\u01a6\n\67\f\67\16\67\u01a9\13\67\38\38\38\38\38"+
		"\38\78\u01b1\n8\f8\168\u01b4\138\38\38\38\38\38\38\39\69\u01bd\n9\r9\16"+
		"9\u01be\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3"+
		"B\3B\3C\3C\3D\3D\3E\3E\3E\7E\u01de\nE\fE\16E\u01e1\13E\3E\3E\3F\3F\3\u01b2"+
		"\2G\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\2i\65k\66"+
		"m\67o8q9s:u;w<y={>}?\177@\u0081A\u0083B\u0085C\u0087D\u0089E\u008bF\3"+
		"\2\b\5\2\f\f$$^^\4\2C\\c|\6\2\62;C\\aac|\4\2\13\f>>\5\2\13\f\17\17\"\""+
		"\4\2$$^^\2\u01ef\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m"+
		"\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2"+
		"\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2"+
		"\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d"+
		"\3\2\2\2\5\u0092\3\2\2\2\7\u0095\3\2\2\2\t\u0098\3\2\2\2\13\u009b\3\2"+
		"\2\2\r\u009e\3\2\2\2\17\u00a1\3\2\2\2\21\u00a8\3\2\2\2\23\u00b0\3\2\2"+
		"\2\25\u00b7\3\2\2\2\27\u00bf\3\2\2\2\31\u00c6\3\2\2\2\33\u00ce\3\2\2\2"+
		"\35\u00d6\3\2\2\2\37\u00df\3\2\2\2!\u00e5\3\2\2\2#\u00ed\3\2\2\2%\u00f5"+
		"\3\2\2\2\'\u00fe\3\2\2\2)\u0105\3\2\2\2+\u0108\3\2\2\2-\u010d\3\2\2\2"+
		"/\u0112\3\2\2\2\61\u0118\3\2\2\2\63\u011b\3\2\2\2\65\u0122\3\2\2\2\67"+
		"\u0129\3\2\2\29\u012f\3\2\2\2;\u0135\3\2\2\2=\u0139\3\2\2\2?\u013e\3\2"+
		"\2\2A\u0144\3\2\2\2C\u0149\3\2\2\2E\u014f\3\2\2\2G\u0154\3\2\2\2I\u015a"+
		"\3\2\2\2K\u015f\3\2\2\2M\u0165\3\2\2\2O\u016a\3\2\2\2Q\u0170\3\2\2\2S"+
		"\u0172\3\2\2\2U\u0174\3\2\2\2W\u0176\3\2\2\2Y\u0178\3\2\2\2[\u017a\3\2"+
		"\2\2]\u017c\3\2\2\2_\u017e\3\2\2\2a\u0180\3\2\2\2c\u0182\3\2\2\2e\u0184"+
		"\3\2\2\2g\u018e\3\2\2\2i\u0192\3\2\2\2k\u0197\3\2\2\2m\u01a3\3\2\2\2o"+
		"\u01aa\3\2\2\2q\u01bc\3\2\2\2s\u01c0\3\2\2\2u\u01c3\3\2\2\2w\u01c5\3\2"+
		"\2\2y\u01c7\3\2\2\2{\u01c9\3\2\2\2}\u01cc\3\2\2\2\177\u01cf\3\2\2\2\u0081"+
		"\u01d2\3\2\2\2\u0083\u01d4\3\2\2\2\u0085\u01d6\3\2\2\2\u0087\u01d8\3\2"+
		"\2\2\u0089\u01da\3\2\2\2\u008b\u01e4\3\2\2\2\u008d\u008e\7>\2\2\u008e"+
		"\u008f\7r\2\2\u008f\u0090\7\61\2\2\u0090\u0091\7@\2\2\u0091\4\3\2\2\2"+
		"\u0092\u0093\7j\2\2\u0093\u0094\7\63\2\2\u0094\6\3\2\2\2\u0095\u0096\7"+
		"j\2\2\u0096\u0097\7\64\2\2\u0097\b\3\2\2\2\u0098\u0099\7j\2\2\u0099\u009a"+
		"\7\65\2\2\u009a\n\3\2\2\2\u009b\u009c\7j\2\2\u009c\u009d\7\66\2\2\u009d"+
		"\f\3\2\2\2\u009e\u009f\7j\2\2\u009f\u00a0\7\67\2\2\u00a0\16\3\2\2\2\u00a1"+
		"\u00a2\7>\2\2\u00a2\u00a3\7j\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7o\2\2"+
		"\u00a5\u00a6\7n\2\2\u00a6\u00a7\7@\2\2\u00a7\20\3\2\2\2\u00a8\u00a9\7"+
		">\2\2\u00a9\u00aa\7\61\2\2\u00aa\u00ab\7j\2\2\u00ab\u00ac\7v\2\2\u00ac"+
		"\u00ad\7o\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7@\2\2\u00af\22\3\2\2\2\u00b0"+
		"\u00b1\7>\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7c\2\2"+
		"\u00b4\u00b5\7f\2\2\u00b5\u00b6\7@\2\2\u00b6\24\3\2\2\2\u00b7\u00b8\7"+
		">\2\2\u00b8\u00b9\7\61\2\2\u00b9\u00ba\7j\2\2\u00ba\u00bb\7g\2\2\u00bb"+
		"\u00bc\7c\2\2\u00bc\u00bd\7f\2\2\u00bd\u00be\7@\2\2\u00be\26\3\2\2\2\u00bf"+
		"\u00c0\7>\2\2\u00c0\u00c1\7d\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3\7f\2\2"+
		"\u00c3\u00c4\7{\2\2\u00c4\u00c5\7@\2\2\u00c5\30\3\2\2\2\u00c6\u00c7\7"+
		">\2\2\u00c7\u00c8\7\61\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca\7q\2\2\u00ca"+
		"\u00cb\7f\2\2\u00cb\u00cc\7{\2\2\u00cc\u00cd\7@\2\2\u00cd\32\3\2\2\2\u00ce"+
		"\u00cf\7>\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7v\2\2"+
		"\u00d2\u00d3\7n\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7@\2\2\u00d5\34\3\2"+
		"\2\2\u00d6\u00d7\7>\2\2\u00d7\u00d8\7\61\2\2\u00d8\u00d9\7v\2\2\u00d9"+
		"\u00da\7k\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7g\2\2"+
		"\u00dd\u00de\7@\2\2\u00de\36\3\2\2\2\u00df\u00e0\7>\2\2\u00e0\u00e1\7"+
		"h\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7o\2\2\u00e4 "+
		"\3\2\2\2\u00e5\u00e6\7>\2\2\u00e6\u00e7\7\61\2\2\u00e7\u00e8\7h\2\2\u00e8"+
		"\u00e9\7q\2\2\u00e9\u00ea\7t\2\2\u00ea\u00eb\7o\2\2\u00eb\u00ec\7@\2\2"+
		"\u00ec\"\3\2\2\2\u00ed\u00ee\7>\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7c"+
		"\2\2\u00f0\u00f1\7d\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4"+
		"\7@\2\2\u00f4$\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6\u00f7\7\61\2\2\u00f7\u00f8"+
		"\7n\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa\7d\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		"\u00fc\7n\2\2\u00fc\u00fd\7@\2\2\u00fd&\3\2\2\2\u00fe\u00ff\7>\2\2\u00ff"+
		"\u0100\7k\2\2\u0100\u0101\7p\2\2\u0101\u0102\7r\2\2\u0102\u0103\7w\2\2"+
		"\u0103\u0104\7v\2\2\u0104(\3\2\2\2\u0105\u0106\7\61\2\2\u0106\u0107\7"+
		"@\2\2\u0107*\3\2\2\2\u0108\u0109\7v\2\2\u0109\u010a\7{\2\2\u010a\u010b"+
		"\7r\2\2\u010b\u010c\7g\2\2\u010c,\3\2\2\2\u010d\u010e\7p\2\2\u010e\u010f"+
		"\7c\2\2\u010f\u0110\7o\2\2\u0110\u0111\7g\2\2\u0111.\3\2\2\2\u0112\u0113"+
		"\7x\2\2\u0113\u0114\7c\2\2\u0114\u0115\7n\2\2\u0115\u0116\7w\2\2\u0116"+
		"\u0117\7g\2\2\u0117\60\3\2\2\2\u0118\u0119\7k\2\2\u0119\u011a\7f\2\2\u011a"+
		"\62\3\2\2\2\u011b\u011c\7o\2\2\u011c\u011d\7g\2\2\u011d\u011e\7v\2\2\u011e"+
		"\u011f\7j\2\2\u011f\u0120\7q\2\2\u0120\u0121\7f\2\2\u0121\64\3\2\2\2\u0122"+
		"\u0123\7c\2\2\u0123\u0124\7e\2\2\u0124\u0125\7v\2\2\u0125\u0126\7k\2\2"+
		"\u0126\u0127\7q\2\2\u0127\u0128\7p\2\2\u0128\66\3\2\2\2\u0129\u012a\7"+
		"e\2\2\u012a\u012b\7n\2\2\u012b\u012c\7c\2\2\u012c\u012d\7u\2\2\u012d\u012e"+
		"\7u\2\2\u012e8\3\2\2\2\u012f\u0130\7>\2\2\u0130\u0131\7d\2\2\u0131\u0132"+
		"\7t\2\2\u0132\u0133\7\61\2\2\u0133\u0134\7@\2\2\u0134:\3\2\2\2\u0135\u0136"+
		"\7>\2\2\u0136\u0137\7r\2\2\u0137\u0138\7@\2\2\u0138<\3\2\2\2\u0139\u013a"+
		"\7>\2\2\u013a\u013b\7j\2\2\u013b\u013c\7\63\2\2\u013c\u013d\7@\2\2\u013d"+
		">\3\2\2\2\u013e\u013f\7>\2\2\u013f\u0140\7\61\2\2\u0140\u0141\7j\2\2\u0141"+
		"\u0142\7\63\2\2\u0142\u0143\7@\2\2\u0143@\3\2\2\2\u0144\u0145\7>\2\2\u0145"+
		"\u0146\7j\2\2\u0146\u0147\7\64\2\2\u0147\u0148\7@\2\2\u0148B\3\2\2\2\u0149"+
		"\u014a\7>\2\2\u014a\u014b\7\61\2\2\u014b\u014c\7j\2\2\u014c\u014d\7\64"+
		"\2\2\u014d\u014e\7@\2\2\u014eD\3\2\2\2\u014f\u0150\7>\2\2\u0150\u0151"+
		"\7j\2\2\u0151\u0152\7\65\2\2\u0152\u0153\7@\2\2\u0153F\3\2\2\2\u0154\u0155"+
		"\7>\2\2\u0155\u0156\7\61\2\2\u0156\u0157\7j\2\2\u0157\u0158\7\65\2\2\u0158"+
		"\u0159\7@\2\2\u0159H\3\2\2\2\u015a\u015b\7>\2\2\u015b\u015c\7j\2\2\u015c"+
		"\u015d\7\66\2\2\u015d\u015e\7@\2\2\u015eJ\3\2\2\2\u015f\u0160\7>\2\2\u0160"+
		"\u0161\7\61\2\2\u0161\u0162\7j\2\2\u0162\u0163\7\66\2\2\u0163\u0164\7"+
		"@\2\2\u0164L\3\2\2\2\u0165\u0166\7>\2\2\u0166\u0167\7j\2\2\u0167\u0168"+
		"\7\67\2\2\u0168\u0169\7@\2\2\u0169N\3\2\2\2\u016a\u016b\7>\2\2\u016b\u016c"+
		"\7\61\2\2\u016c\u016d\7j\2\2\u016d\u016e\7\67\2\2\u016e\u016f\7@\2\2\u016f"+
		"P\3\2\2\2\u0170\u0171\7>\2\2\u0171R\3\2\2\2\u0172\u0173\7@\2\2\u0173T"+
		"\3\2\2\2\u0174\u0175\7\61\2\2\u0175V\3\2\2\2\u0176\u0177\7]\2\2\u0177"+
		"X\3\2\2\2\u0178\u0179\7_\2\2\u0179Z\3\2\2\2\u017a\u017b\7.\2\2\u017b\\"+
		"\3\2\2\2\u017c\u017d\7\60\2\2\u017d^\3\2\2\2\u017e\u017f\7<\2\2\u017f"+
		"`\3\2\2\2\u0180\u0181\7*\2\2\u0181b\3\2\2\2\u0182\u0183\7+\2\2\u0183d"+
		"\3\2\2\2\u0184\u0189\7$\2\2\u0185\u0188\5g\64\2\u0186\u0188\n\2\2\2\u0187"+
		"\u0185\3\2\2\2\u0187\u0186\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u0187\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0189\3\2\2\2\u018c"+
		"\u018d\7$\2\2\u018df\3\2\2\2\u018e\u018f\7^\2\2\u018f\u0190\7$\2\2\u0190"+
		"h\3\2\2\2\u0191\u0193\4\62;\2\u0192\u0191\3\2\2\2\u0193\u0194\3\2\2\2"+
		"\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195j\3\2\2\2\u0196\u0198\4"+
		"\62;\2\u0197\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u01a1\3\2\2\2\u019b\u019d\7\60\2\2\u019c\u019e\4"+
		"\62;\2\u019d\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u019b\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2l\3\2\2\2\u01a3\u01a7\t\3\2\2\u01a4\u01a6\t\4\2\2\u01a5\u01a4"+
		"\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"n\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\7>\2\2\u01ab\u01ac\7#\2\2\u01ac"+
		"\u01ad\7/\2\2\u01ad\u01ae\7/\2\2\u01ae\u01b2\3\2\2\2\u01af\u01b1\13\2"+
		"\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b2"+
		"\u01b0\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b5\u01b6\7/"+
		"\2\2\u01b6\u01b7\7/\2\2\u01b7\u01b8\7@\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba"+
		"\b8\2\2\u01bap\3\2\2\2\u01bb\u01bd\n\5\2\2\u01bc\u01bb\3\2\2\2\u01bd\u01be"+
		"\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bfr\3\2\2\2\u01c0"+
		"\u01c1\t\6\2\2\u01c1\u01c2\b:\3\2\u01c2t\3\2\2\2\u01c3\u01c4\7`\2\2\u01c4"+
		"v\3\2\2\2\u01c5\u01c6\7(\2\2\u01c6x\3\2\2\2\u01c7\u01c8\7\'\2\2\u01c8"+
		"z\3\2\2\2\u01c9\u01ca\7@\2\2\u01ca\u01cb\7?\2\2\u01cb|\3\2\2\2\u01cc\u01cd"+
		"\7>\2\2\u01cd\u01ce\7?\2\2\u01ce~\3\2\2\2\u01cf\u01d0\7>\2\2\u01d0\u01d1"+
		"\7@\2\2\u01d1\u0080\3\2\2\2\u01d2\u01d3\7?\2\2\u01d3\u0082\3\2\2\2\u01d4"+
		"\u01d5\7-\2\2\u01d5\u0084\3\2\2\2\u01d6\u01d7\7/\2\2\u01d7\u0086\3\2\2"+
		"\2\u01d8\u01d9\7,\2\2\u01d9\u0088\3\2\2\2\u01da\u01df\7$\2\2\u01db\u01de"+
		"\5g\64\2\u01dc\u01de\n\7\2\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2\u01de"+
		"\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2"+
		"\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\7\f\2\2\u01e3\u008a\3\2\2\2\u01e4"+
		"\u01e5\13\2\2\2\u01e5\u008c\3\2\2\2\16\2\u0187\u0189\u0194\u0199\u019f"+
		"\u01a1\u01a7\u01b2\u01be\u01dd\u01df\4\38\2\3:\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}