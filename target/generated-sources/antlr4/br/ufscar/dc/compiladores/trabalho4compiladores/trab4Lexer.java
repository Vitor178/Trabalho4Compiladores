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
		Inicio=1, Fim=2, Titulo=3, Enunciado=4, Definir=5, Pergunta=6, Opcao=7, 
		Abre_col=8, Fecha_col=9, ABREPAR=10, FECHAPAR=11, TEXTO=12, NUM_INT=13, 
		NUM_REAL=14, IDENT=15, COMENTARIO=16, WS=17, Coment_N_fechado=18, ERROR=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Inicio", "Fim", "Titulo", "Enunciado", "Definir", "Pergunta", "Opcao", 
			"Abre_col", "Fecha_col", "ABREPAR", "FECHAPAR", "TEXTO", "ESC_SEQ", "NUM_INT", 
			"NUM_REAL", "IDENT", "COMENTARIO", "WS", "Coment_N_fechado", "ERROR"
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
			"Opcao", "Abre_col", "Fecha_col", "ABREPAR", "FECHAPAR", "TEXTO", "NUM_INT", 
			"NUM_REAL", "IDENT", "COMENTARIO", "WS", "Coment_N_fechado", "ERROR"
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
		case 16:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7\rg"+
		"\n\r\f\r\16\rj\13\r\3\r\3\r\3\16\3\16\3\16\3\17\6\17r\n\17\r\17\16\17"+
		"s\3\20\6\20w\n\20\r\20\16\20x\3\20\3\20\6\20}\n\20\r\20\16\20~\5\20\u0081"+
		"\n\20\3\21\3\21\7\21\u0085\n\21\f\21\16\21\u0088\13\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u0090\n\22\f\22\16\22\u0093\13\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00a4"+
		"\n\24\f\24\16\24\u00a7\13\24\3\25\3\25\4\u0091\u00a5\2\26\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\17\37\20!\21#\22"+
		"%\23\'\24)\25\3\2\6\3\2$$\4\2C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2"+
		"\u00b1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5\62\3\2\2\2\7\66\3\2\2\2"+
		"\t=\3\2\2\2\13G\3\2\2\2\rO\3\2\2\2\17X\3\2\2\2\21[\3\2\2\2\23]\3\2\2\2"+
		"\25_\3\2\2\2\27a\3\2\2\2\31c\3\2\2\2\33m\3\2\2\2\35q\3\2\2\2\37v\3\2\2"+
		"\2!\u0082\3\2\2\2#\u0089\3\2\2\2%\u009a\3\2\2\2\'\u009d\3\2\2\2)\u00a8"+
		"\3\2\2\2+,\7k\2\2,-\7p\2\2-.\7k\2\2./\7e\2\2/\60\7k\2\2\60\61\7q\2\2\61"+
		"\4\3\2\2\2\62\63\7h\2\2\63\64\7k\2\2\64\65\7o\2\2\65\6\3\2\2\2\66\67\7"+
		"v\2\2\678\7k\2\289\7v\2\29:\7w\2\2:;\7n\2\2;<\7q\2\2<\b\3\2\2\2=>\7g\2"+
		"\2>?\7p\2\2?@\7w\2\2@A\7p\2\2AB\7e\2\2BC\7k\2\2CD\7c\2\2DE\7f\2\2EF\7"+
		"q\2\2F\n\3\2\2\2GH\7f\2\2HI\7g\2\2IJ\7h\2\2JK\7k\2\2KL\7p\2\2LM\7k\2\2"+
		"MN\7t\2\2N\f\3\2\2\2OP\7r\2\2PQ\7g\2\2QR\7t\2\2RS\7i\2\2ST\7w\2\2TU\7"+
		"p\2\2UV\7v\2\2VW\7c\2\2W\16\3\2\2\2XY\7q\2\2YZ\7r\2\2Z\20\3\2\2\2[\\\7"+
		"}\2\2\\\22\3\2\2\2]^\7\177\2\2^\24\3\2\2\2_`\7*\2\2`\26\3\2\2\2ab\7+\2"+
		"\2b\30\3\2\2\2ch\7$\2\2dg\5\33\16\2eg\n\2\2\2fd\3\2\2\2fe\3\2\2\2gj\3"+
		"\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7$\2\2l\32\3\2\2\2mn"+
		"\7^\2\2no\7$\2\2o\34\3\2\2\2pr\4\62;\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2s"+
		"t\3\2\2\2t\36\3\2\2\2uw\4\62;\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2"+
		"\2y\u0080\3\2\2\2z|\7\60\2\2{}\4\62;\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~"+
		"\177\3\2\2\2\177\u0081\3\2\2\2\u0080z\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		" \3\2\2\2\u0082\u0086\t\3\2\2\u0083\u0085\t\4\2\2\u0084\u0083\3\2\2\2"+
		"\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\"\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7>\2\2\u008a\u008b\7#\2\2\u008b"+
		"\u008c\7/\2\2\u008c\u008d\7/\2\2\u008d\u0091\3\2\2\2\u008e\u0090\13\2"+
		"\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u0092\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7/"+
		"\2\2\u0095\u0096\7/\2\2\u0096\u0097\7@\2\2\u0097\u0098\3\2\2\2\u0098\u0099"+
		"\b\22\2\2\u0099$\3\2\2\2\u009a\u009b\t\5\2\2\u009b\u009c\b\23\3\2\u009c"+
		"&\3\2\2\2\u009d\u009e\7>\2\2\u009e\u009f\7#\2\2\u009f\u00a0\7/\2\2\u00a0"+
		"\u00a1\7/\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a4\13\2\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"(\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\13\2\2\2\u00a9*\3\2\2\2\f\2"+
		"fhsx~\u0080\u0086\u0091\u00a5\4\3\22\2\3\23\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}