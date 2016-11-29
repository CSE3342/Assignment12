// Generated from C:/Users/PrestonSSD2/PhpstormProjects/Assignment12\BankDeposit.g4 by ANTLR 4.5.3

    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BankDepositParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUM=1, ACTION=2, ID=3, WS=4;
	public static final int
		RULE_s = 0, RULE_r = 1;
	public static final String[] ruleNames = {
		"s", "r"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUM", "ACTION", "ID", "WS"
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
	public String getGrammarFileName() { return "BankDeposit.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String, Integer> visitors = new HashMap<String, Integer>() ;

	    void doBanking(String user, String action, int amt) {
	        if (!visitors.containsKey(user) ) {
	            visitors.put(user,0);
	        }

	        int currentBalance = visitors.get(user);
	        if ( action.equals("dep") )
	            visitors.put(user, currentBalance + amt);
	        else if ( action.equals("withdraw") )
	            visitors.put(user, currentBalance - amt);
	    }

	    void showBalances() {
	        for (Map.Entry<String, Integer> entry : visitors.entrySet()) {
	            String key = entry.getKey();
	            Integer value = entry.getValue();
	            System.out.println(key + " has balance = " + value);
	        }
	    }

	public BankDepositParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SContext extends ParserRuleContext {
		public List<RContext> r() {
			return getRuleContexts(RContext.class);
		}
		public RContext r(int i) {
			return getRuleContext(RContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BankDepositListener ) ((BankDepositListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BankDepositListener ) ((BankDepositListener)listener).exitS(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				r();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			 showBalances(); 
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

	public static class RContext extends ParserRuleContext {
		public Token ID;
		public Token ACTION;
		public Token NUM;
		public TerminalNode ID() { return getToken(BankDepositParser.ID, 0); }
		public TerminalNode ACTION() { return getToken(BankDepositParser.ACTION, 0); }
		public TerminalNode NUM() { return getToken(BankDepositParser.NUM, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BankDepositListener ) ((BankDepositListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BankDepositListener ) ((BankDepositListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11);
			((RContext)_localctx).ID = match(ID);
			setState(12);
			((RContext)_localctx).ACTION = match(ACTION);
			setState(13);
			((RContext)_localctx).NUM = match(NUM);
			 doBanking((((RContext)_localctx).ID!=null?((RContext)_localctx).ID.getText():null), (((RContext)_localctx).ACTION!=null?((RContext)_localctx).ACTION.getText():null), (((RContext)_localctx).NUM!=null?Integer.valueOf(((RContext)_localctx).NUM.getText()):0)); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\6\23\4\2\t\2\4\3"+
		"\t\3\3\2\6\2\b\n\2\r\2\16\2\t\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\2\2\4\2"+
		"\4\2\2\21\2\7\3\2\2\2\4\r\3\2\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\t\3\2\2\2"+
		"\t\7\3\2\2\2\t\n\3\2\2\2\n\13\3\2\2\2\13\f\b\2\1\2\f\3\3\2\2\2\r\16\7"+
		"\5\2\2\16\17\7\4\2\2\17\20\7\3\2\2\20\21\b\3\1\2\21\5\3\2\2\2\3\t";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}