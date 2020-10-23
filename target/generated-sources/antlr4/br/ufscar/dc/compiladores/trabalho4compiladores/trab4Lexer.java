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
		Abre_col=8, Fecha_col=9, ABREPAR=10, FECHAPAR=11, TEXTO=12, IDENT=13, 
		COMENTARIO=14, WS=15, Coment_N_fechado=16, ERROR=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Inicio", "Fim", "Titulo", "Enunciado", "Definir", "Pergunta", "Opcao", 
			"Abre_col", "Fecha_col", "ABREPAR", "FECHAPAR", "TEXTO", "ESC_SEQ", "IDENT", 
			"COMENTARIO", "WS", "Coment_N_fechado", "ERROR"
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
		case 14:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7\rc\n\r\f\r\16\rf\13\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\7\17o\n\17\f\17\16\17r\13\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20z\n\20\f\20\16\20}\13\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u008e\n\22"+
		"\f\22\16\22\u0091\13\22\3\23\3\23\4{\u008f\2\24\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\17\37\20!\21#\22%\23\3\2\6"+
		"\3\2$$\5\2\62;C\\c|\7\2++\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0097\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'"+
		"\3\2\2\2\5.\3\2\2\2\7\62\3\2\2\2\t9\3\2\2\2\13C\3\2\2\2\rK\3\2\2\2\17"+
		"T\3\2\2\2\21W\3\2\2\2\23Y\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31_\3\2\2\2"+
		"\33i\3\2\2\2\35l\3\2\2\2\37s\3\2\2\2!\u0084\3\2\2\2#\u0087\3\2\2\2%\u0092"+
		"\3\2\2\2\'(\7k\2\2()\7p\2\2)*\7k\2\2*+\7e\2\2+,\7k\2\2,-\7q\2\2-\4\3\2"+
		"\2\2./\7h\2\2/\60\7k\2\2\60\61\7o\2\2\61\6\3\2\2\2\62\63\7v\2\2\63\64"+
		"\7k\2\2\64\65\7v\2\2\65\66\7w\2\2\66\67\7n\2\2\678\7q\2\28\b\3\2\2\29"+
		":\7g\2\2:;\7p\2\2;<\7w\2\2<=\7p\2\2=>\7e\2\2>?\7k\2\2?@\7c\2\2@A\7f\2"+
		"\2AB\7q\2\2B\n\3\2\2\2CD\7f\2\2DE\7g\2\2EF\7h\2\2FG\7k\2\2GH\7p\2\2HI"+
		"\7k\2\2IJ\7t\2\2J\f\3\2\2\2KL\7r\2\2LM\7g\2\2MN\7t\2\2NO\7i\2\2OP\7w\2"+
		"\2PQ\7p\2\2QR\7v\2\2RS\7c\2\2S\16\3\2\2\2TU\7q\2\2UV\7r\2\2V\20\3\2\2"+
		"\2WX\7}\2\2X\22\3\2\2\2YZ\7\177\2\2Z\24\3\2\2\2[\\\7*\2\2\\\26\3\2\2\2"+
		"]^\7+\2\2^\30\3\2\2\2_d\7$\2\2`c\5\33\16\2ac\n\2\2\2b`\3\2\2\2ba\3\2\2"+
		"\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7$\2\2h\32\3\2"+
		"\2\2ij\7^\2\2jk\7$\2\2k\34\3\2\2\2lp\t\3\2\2mo\t\4\2\2nm\3\2\2\2or\3\2"+
		"\2\2pn\3\2\2\2pq\3\2\2\2q\36\3\2\2\2rp\3\2\2\2st\7>\2\2tu\7#\2\2uv\7/"+
		"\2\2vw\7/\2\2w{\3\2\2\2xz\13\2\2\2yx\3\2\2\2z}\3\2\2\2{|\3\2\2\2{y\3\2"+
		"\2\2|~\3\2\2\2}{\3\2\2\2~\177\7/\2\2\177\u0080\7/\2\2\u0080\u0081\7@\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u0083\b\20\2\2\u0083 \3\2\2\2\u0084\u0085"+
		"\t\5\2\2\u0085\u0086\b\21\3\2\u0086\"\3\2\2\2\u0087\u0088\7>\2\2\u0088"+
		"\u0089\7#\2\2\u0089\u008a\7/\2\2\u008a\u008b\7/\2\2\u008b\u008f\3\2\2"+
		"\2\u008c\u008e\13\2\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090$\3\2\2\2\u0091\u008f\3\2\2\2"+
		"\u0092\u0093\13\2\2\2\u0093&\3\2\2\2\b\2bdp{\u008f\4\3\20\2\3\21\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}