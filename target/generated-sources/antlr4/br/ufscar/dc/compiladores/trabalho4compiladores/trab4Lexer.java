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
		Inicio=1, Fim=2, Titulo=3, Enunciado=4, Definir=5, Definicoes=6, Pergunta=7, 
		Opcao=8, Ponto=9, Virgula=10, Abre_col=11, Fecha_col=12, ABREPAR=13, FECHAPAR=14, 
		TEXTO=15, IDENT=16, COMENTARIO=17, WS=18, Coment_N_fechado=19, ERROR=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Inicio", "Fim", "Titulo", "Enunciado", "Definir", "Definicoes", "Pergunta", 
			"Opcao", "Ponto", "Virgula", "Abre_col", "Fecha_col", "ABREPAR", "FECHAPAR", 
			"TEXTO", "ESC_SEQ", "IDENT", "COMENTARIO", "WS", "Coment_N_fechado", 
			"ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'inicio'", "'fim'", "'titulo'", "'enunciado'", "'definir'", "'definicoes'", 
			"'pergunta'", "'op'", "'.'", "','", "'{'", "'}'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Inicio", "Fim", "Titulo", "Enunciado", "Definir", "Definicoes", 
			"Pergunta", "Opcao", "Ponto", "Virgula", "Abre_col", "Fecha_col", "ABREPAR", 
			"FECHAPAR", "TEXTO", "IDENT", "COMENTARIO", "WS", "Coment_N_fechado", 
			"ERROR"
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
		case 17:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u00a9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20"+
		"\7\20x\n\20\f\20\16\20{\13\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\7\22"+
		"\u0084\n\22\f\22\16\22\u0087\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u008f\n\23\f\23\16\23\u0092\13\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00a3\n\25\f\25\16\25\u00a6"+
		"\13\25\3\26\3\26\4\u0090\u00a4\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\2#\22%\23\'\24)\25+\26\3\2\6"+
		"\3\2$$\5\2\62;C\\c|\7\2\60\60\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00ac\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5\64\3\2\2\2\78\3\2\2"+
		"\2\t?\3\2\2\2\13I\3\2\2\2\rQ\3\2\2\2\17\\\3\2\2\2\21e\3\2\2\2\23h\3\2"+
		"\2\2\25j\3\2\2\2\27l\3\2\2\2\31n\3\2\2\2\33p\3\2\2\2\35r\3\2\2\2\37t\3"+
		"\2\2\2!~\3\2\2\2#\u0081\3\2\2\2%\u0088\3\2\2\2\'\u0099\3\2\2\2)\u009c"+
		"\3\2\2\2+\u00a7\3\2\2\2-.\7k\2\2./\7p\2\2/\60\7k\2\2\60\61\7e\2\2\61\62"+
		"\7k\2\2\62\63\7q\2\2\63\4\3\2\2\2\64\65\7h\2\2\65\66\7k\2\2\66\67\7o\2"+
		"\2\67\6\3\2\2\289\7v\2\29:\7k\2\2:;\7v\2\2;<\7w\2\2<=\7n\2\2=>\7q\2\2"+
		">\b\3\2\2\2?@\7g\2\2@A\7p\2\2AB\7w\2\2BC\7p\2\2CD\7e\2\2DE\7k\2\2EF\7"+
		"c\2\2FG\7f\2\2GH\7q\2\2H\n\3\2\2\2IJ\7f\2\2JK\7g\2\2KL\7h\2\2LM\7k\2\2"+
		"MN\7p\2\2NO\7k\2\2OP\7t\2\2P\f\3\2\2\2QR\7f\2\2RS\7g\2\2ST\7h\2\2TU\7"+
		"k\2\2UV\7p\2\2VW\7k\2\2WX\7e\2\2XY\7q\2\2YZ\7g\2\2Z[\7u\2\2[\16\3\2\2"+
		"\2\\]\7r\2\2]^\7g\2\2^_\7t\2\2_`\7i\2\2`a\7w\2\2ab\7p\2\2bc\7v\2\2cd\7"+
		"c\2\2d\20\3\2\2\2ef\7q\2\2fg\7r\2\2g\22\3\2\2\2hi\7\60\2\2i\24\3\2\2\2"+
		"jk\7.\2\2k\26\3\2\2\2lm\7}\2\2m\30\3\2\2\2no\7\177\2\2o\32\3\2\2\2pq\7"+
		"*\2\2q\34\3\2\2\2rs\7+\2\2s\36\3\2\2\2ty\7$\2\2ux\5!\21\2vx\n\2\2\2wu"+
		"\3\2\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|"+
		"}\7$\2\2} \3\2\2\2~\177\7^\2\2\177\u0080\7$\2\2\u0080\"\3\2\2\2\u0081"+
		"\u0085\t\3\2\2\u0082\u0084\t\4\2\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086$\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0088\u0089\7>\2\2\u0089\u008a\7#\2\2\u008a\u008b\7/\2\2\u008b"+
		"\u008c\7/\2\2\u008c\u0090\3\2\2\2\u008d\u008f\13\2\2\2\u008e\u008d\3\2"+
		"\2\2\u008f\u0092\3\2\2\2\u0090\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7/\2\2\u0094\u0095\7/\2"+
		"\2\u0095\u0096\7@\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\23\2\2\u0098&"+
		"\3\2\2\2\u0099\u009a\t\5\2\2\u009a\u009b\b\24\3\2\u009b(\3\2\2\2\u009c"+
		"\u009d\7>\2\2\u009d\u009e\7#\2\2\u009e\u009f\7/\2\2\u009f\u00a0\7/\2\2"+
		"\u00a0\u00a4\3\2\2\2\u00a1\u00a3\13\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6"+
		"\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5*\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00a8\13\2\2\2\u00a8,\3\2\2\2\b\2wy\u0085\u0090\u00a4"+
		"\4\3\23\2\3\24\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}