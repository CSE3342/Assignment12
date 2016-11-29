// Generated from MyLanguage.g4 by ANTLR 4.5.3

    import java.io.*;
    import java.net.URL;
    import java.nio.charset.Charset;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ITEM=9, 
		WS=10;
	public static final int
		RULE_root_rule = 0, RULE_set_id_key_val = 1, RULE_get_id_key = 2, RULE_get_id = 3, 
		RULE_get_database = 4;
	public static final String[] ruleNames = {
		"root_rule", "set_id_key_val", "get_id_key", "get_id", "get_database"
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

	@Override
	public String getGrammarFileName() { return "MyLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    final private static String public_url = "http://lyle.smu.edu/~prestont/" +
	        "3342/dataService.php";
	    private static String setIdKeyVal(String id, String key, String val) {
	        return readFromUrl(public_url + "?id=" + id + "&key=" + key +
	                "&val=" + val);
	    }
	    private static String getIdKey(String id, String key) {
	        return readFromUrl(public_url + "?id=" + id + "&key=" + key);
	    }
	    private static String getId(String id) {
	        return readFromUrl(public_url + "?id=" + id);
	    }
	    private static String getDatabase() {
	        return readFromUrl(public_url);
	    }
	    private static String readFromUrl(String url) {
	        try {
	            InputStream is = new URL(url).openStream();
	            BufferedReader rd = new BufferedReader(
	                    new InputStreamReader(is, Charset.forName("UTF-8")));
	            StringBuilder sb = new StringBuilder();
	            int cp;
	            while ((cp = rd.read()) != -1) {
	                sb.append((char) cp);
	            }
	            return sb.toString();
	        }catch(Exception e) {
	            System.out.println("Exception thrown  :" + e);
	            return "";
	        }
	    }

	public MyLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Root_ruleContext extends ParserRuleContext {
		public Set_id_key_valContext set_id_key_val() {
			return getRuleContext(Set_id_key_valContext.class,0);
		}
		public Get_id_keyContext get_id_key() {
			return getRuleContext(Get_id_keyContext.class,0);
		}
		public Get_idContext get_id() {
			return getRuleContext(Get_idContext.class,0);
		}
		public Get_databaseContext get_database() {
			return getRuleContext(Get_databaseContext.class,0);
		}
		public Root_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterRoot_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitRoot_rule(this);
		}
	}

	public final Root_ruleContext root_rule() throws RecognitionException {
		Root_ruleContext _localctx = new Root_ruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(10);
				set_id_key_val();
				}
				break;
			case T__3:
				{
				setState(11);
				get_id_key();
				}
				break;
			case T__6:
				{
				setState(12);
				get_id();
				}
				break;
			case T__7:
				{
				setState(13);
				get_database();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Set_id_key_valContext extends ParserRuleContext {
		public Token id;
		public Token key;
		public Token val;
		public List<TerminalNode> ITEM() { return getTokens(MyLanguageParser.ITEM); }
		public TerminalNode ITEM(int i) {
			return getToken(MyLanguageParser.ITEM, i);
		}
		public Set_id_key_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_id_key_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterSet_id_key_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitSet_id_key_val(this);
		}
	}

	public final Set_id_key_valContext set_id_key_val() throws RecognitionException {
		Set_id_key_valContext _localctx = new Set_id_key_valContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_set_id_key_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
			setState(17);
			((Set_id_key_valContext)_localctx).id = match(ITEM);
			setState(18);
			match(T__1);
			setState(19);
			((Set_id_key_valContext)_localctx).key = match(ITEM);
			setState(20);
			match(T__2);
			setState(21);
			((Set_id_key_valContext)_localctx).val = match(ITEM);
			 System.out.println(
			                        setIdKeyVal((((Set_id_key_valContext)_localctx).id!=null?((Set_id_key_valContext)_localctx).id.getText():null),(((Set_id_key_valContext)_localctx).key!=null?((Set_id_key_valContext)_localctx).key.getText():null),(((Set_id_key_valContext)_localctx).val!=null?((Set_id_key_valContext)_localctx).val.getText():null))
			                      );
			                    
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

	public static class Get_id_keyContext extends ParserRuleContext {
		public Token id;
		public Token key;
		public List<TerminalNode> ITEM() { return getTokens(MyLanguageParser.ITEM); }
		public TerminalNode ITEM(int i) {
			return getToken(MyLanguageParser.ITEM, i);
		}
		public Get_id_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_id_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterGet_id_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitGet_id_key(this);
		}
	}

	public final Get_id_keyContext get_id_key() throws RecognitionException {
		Get_id_keyContext _localctx = new Get_id_keyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_get_id_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(T__3);
			setState(25);
			((Get_id_keyContext)_localctx).id = match(ITEM);
			setState(26);
			match(T__4);
			setState(27);
			((Get_id_keyContext)_localctx).key = match(ITEM);
			setState(28);
			match(T__5);

			    System.out.println(getIdKey((((Get_id_keyContext)_localctx).id!=null?((Get_id_keyContext)_localctx).id.getText():null),(((Get_id_keyContext)_localctx).key!=null?((Get_id_keyContext)_localctx).key.getText():null))); 
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

	public static class Get_idContext extends ParserRuleContext {
		public Token id;
		public TerminalNode ITEM() { return getToken(MyLanguageParser.ITEM, 0); }
		public Get_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterGet_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitGet_id(this);
		}
	}

	public final Get_idContext get_id() throws RecognitionException {
		Get_idContext _localctx = new Get_idContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_get_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__6);
			setState(32);
			((Get_idContext)_localctx).id = match(ITEM);
			setState(33);
			match(T__5);

			    System.out.println(getId((((Get_idContext)_localctx).id!=null?((Get_idContext)_localctx).id.getText():null))); 
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

	public static class Get_databaseContext extends ParserRuleContext {
		public Get_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterGet_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitGet_database(this);
		}
	}

	public final Get_databaseContext get_database() throws RecognitionException {
		Get_databaseContext _localctx = new Get_databaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_get_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__7);
			 System.out.println(getDatabase()); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f*\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\5\2\21\n\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\'\2\20\3\2\2\2\4\22\3\2\2\2\6\32\3\2\2"+
		"\2\b!\3\2\2\2\n&\3\2\2\2\f\21\5\4\3\2\r\21\5\6\4\2\16\21\5\b\5\2\17\21"+
		"\5\n\6\2\20\f\3\2\2\2\20\r\3\2\2\2\20\16\3\2\2\2\20\17\3\2\2\2\21\3\3"+
		"\2\2\2\22\23\7\3\2\2\23\24\7\13\2\2\24\25\7\4\2\2\25\26\7\13\2\2\26\27"+
		"\7\5\2\2\27\30\7\13\2\2\30\31\b\3\1\2\31\5\3\2\2\2\32\33\7\6\2\2\33\34"+
		"\7\13\2\2\34\35\7\7\2\2\35\36\7\13\2\2\36\37\7\b\2\2\37 \b\4\1\2 \7\3"+
		"\2\2\2!\"\7\t\2\2\"#\7\13\2\2#$\7\b\2\2$%\b\5\1\2%\t\3\2\2\2&\'\7\n\2"+
		"\2\'(\b\6\1\2(\13\3\2\2\2\3\20";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}