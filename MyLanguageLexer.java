// Generated from MyLanguage.g4 by ANTLR 4.5.3

    import java.io.*;
    import java.net.URL;
    import java.nio.charset.Charset;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ITEM=9, 
		WS=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "ITEM", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Hey, let me tell you that '", "' has a '", "' of '", "'Do you know '", 
		"''s '", "'?'", "'What's the scoop on '", "'What do we know?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "ITEM", "WS"
	};
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


	public MyLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\f\u0085\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\6\n{\n\n\r\n\16\n"+
		"|\3\13\6\13\u0080\n\13\r\13\16\13\u0081\3\13\3\13\2\2\f\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\5\4\2C\\c|\7\2&&\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\u0086\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\3\27\3\2\2\2\5\62\3\2\2\2\7:\3\2\2\2\t?\3\2\2\2\13L\3\2\2\2\rP\3\2"+
		"\2\2\17R\3\2\2\2\21g\3\2\2\2\23x\3\2\2\2\25\177\3\2\2\2\27\30\7J\2\2\30"+
		"\31\7g\2\2\31\32\7{\2\2\32\33\7.\2\2\33\34\7\"\2\2\34\35\7n\2\2\35\36"+
		"\7g\2\2\36\37\7v\2\2\37 \7\"\2\2 !\7o\2\2!\"\7g\2\2\"#\7\"\2\2#$\7v\2"+
		"\2$%\7g\2\2%&\7n\2\2&\'\7n\2\2\'(\7\"\2\2()\7{\2\2)*\7q\2\2*+\7w\2\2+"+
		",\7\"\2\2,-\7v\2\2-.\7j\2\2./\7c\2\2/\60\7v\2\2\60\61\7\"\2\2\61\4\3\2"+
		"\2\2\62\63\7\"\2\2\63\64\7j\2\2\64\65\7c\2\2\65\66\7u\2\2\66\67\7\"\2"+
		"\2\678\7c\2\289\7\"\2\29\6\3\2\2\2:;\7\"\2\2;<\7q\2\2<=\7h\2\2=>\7\"\2"+
		"\2>\b\3\2\2\2?@\7F\2\2@A\7q\2\2AB\7\"\2\2BC\7{\2\2CD\7q\2\2DE\7w\2\2E"+
		"F\7\"\2\2FG\7m\2\2GH\7p\2\2HI\7q\2\2IJ\7y\2\2JK\7\"\2\2K\n\3\2\2\2LM\7"+
		")\2\2MN\7u\2\2NO\7\"\2\2O\f\3\2\2\2PQ\7A\2\2Q\16\3\2\2\2RS\7Y\2\2ST\7"+
		"j\2\2TU\7c\2\2UV\7v\2\2VW\7)\2\2WX\7u\2\2XY\7\"\2\2YZ\7v\2\2Z[\7j\2\2"+
		"[\\\7g\2\2\\]\7\"\2\2]^\7u\2\2^_\7e\2\2_`\7q\2\2`a\7q\2\2ab\7r\2\2bc\7"+
		"\"\2\2cd\7q\2\2de\7p\2\2ef\7\"\2\2f\20\3\2\2\2gh\7Y\2\2hi\7j\2\2ij\7c"+
		"\2\2jk\7v\2\2kl\7\"\2\2lm\7f\2\2mn\7q\2\2no\7\"\2\2op\7y\2\2pq\7g\2\2"+
		"qr\7\"\2\2rs\7m\2\2st\7p\2\2tu\7q\2\2uv\7y\2\2vw\7A\2\2w\22\3\2\2\2xz"+
		"\t\2\2\2y{\t\3\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\24\3\2\2\2"+
		"~\u0080\t\4\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\13\2\2\u0084\26\3\2\2"+
		"\2\5\2|\u0081\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}