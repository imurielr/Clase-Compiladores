// Generated from JayLexer.g4 by ANTLR 4.5.3

package co.edu.eafit.dis.st0270.jaycompiler.lexer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JayLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEPARATORS=1, OPERATORS=2, KEYWORDS=3, BOOLEAN=4, ID=5, INT=6, COMMENT=7, 
		WS=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SEPARATORS", "OPERATORS", "KEYWORDS", "BOOLEAN", "ID", "INT", "COMMENT", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEPARATORS", "OPERATORS", "KEYWORDS", "BOOLEAN", "ID", "INT", "COMMENT", 
		"WS"
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


	public JayLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JayLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\u0081\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3%\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4D\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\7\6S\n\6\f\6\16\6V\13\6\3\7\3\7\3"+
		"\7\7\7[\n\7\f\7\16\7^\13\7\5\7`\n\7\3\b\3\b\3\b\3\b\7\bf\n\b\f\b\16\b"+
		"i\13\b\3\b\5\bl\n\b\3\b\3\b\3\b\3\b\3\b\7\bs\n\b\f\b\16\bv\13\b\3\b\3"+
		"\b\5\bz\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3t\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\3\2\b\7\2*+..==}}\177\177\6\2,-//\61\61>?\4\2C\\c|\5\2\62;C\\"+
		"c|\4\2\f\f\17\17\5\2\13\f\16\17\"\"\u0096\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\3\23\3\2\2\2\5$\3\2\2\2\7C\3\2\2\2\tN\3\2\2\2\13P\3\2\2\2\r_\3\2\2"+
		"\2\17y\3\2\2\2\21}\3\2\2\2\23\24\t\2\2\2\24\4\3\2\2\2\25%\t\3\2\2\26\27"+
		"\7>\2\2\27%\7?\2\2\30%\7@\2\2\31\32\7@\2\2\32%\7?\2\2\33\34\7?\2\2\34"+
		"%\7?\2\2\35\36\7#\2\2\36%\7?\2\2\37 \7(\2\2 %\7(\2\2!\"\7~\2\2\"%\7~\2"+
		"\2#%\7#\2\2$\25\3\2\2\2$\26\3\2\2\2$\30\3\2\2\2$\31\3\2\2\2$\33\3\2\2"+
		"\2$\35\3\2\2\2$\37\3\2\2\2$!\3\2\2\2$#\3\2\2\2%\6\3\2\2\2&\'\7d\2\2\'"+
		"(\7q\2\2()\7q\2\2)*\7n\2\2*+\7g\2\2+,\7c\2\2,D\7p\2\2-.\7g\2\2./\7n\2"+
		"\2/\60\7u\2\2\60D\7g\2\2\61\62\7k\2\2\62D\7h\2\2\63\64\7k\2\2\64\65\7"+
		"p\2\2\65D\7v\2\2\66\67\7o\2\2\678\7c\2\289\7k\2\29D\7p\2\2:;\7x\2\2;<"+
		"\7q\2\2<=\7k\2\2=D\7f\2\2>?\7y\2\2?@\7j\2\2@A\7k\2\2AB\7n\2\2BD\7g\2\2"+
		"C&\3\2\2\2C-\3\2\2\2C\61\3\2\2\2C\63\3\2\2\2C\66\3\2\2\2C:\3\2\2\2C>\3"+
		"\2\2\2D\b\3\2\2\2EF\7v\2\2FG\7t\2\2GH\7w\2\2HO\7g\2\2IJ\7h\2\2JK\7c\2"+
		"\2KL\7n\2\2LM\7u\2\2MO\7g\2\2NE\3\2\2\2NI\3\2\2\2O\n\3\2\2\2PT\t\4\2\2"+
		"QS\t\5\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\f\3\2\2\2VT\3\2\2"+
		"\2W`\7\62\2\2X\\\4\63;\2Y[\4\62;\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3"+
		"\2\2\2]`\3\2\2\2^\\\3\2\2\2_W\3\2\2\2_X\3\2\2\2`\16\3\2\2\2ab\7\61\2\2"+
		"bc\7\61\2\2cg\3\2\2\2df\n\6\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2"+
		"\2hk\3\2\2\2ig\3\2\2\2jl\7\17\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mz\7\f"+
		"\2\2no\7\61\2\2op\7,\2\2pt\3\2\2\2qs\13\2\2\2rq\3\2\2\2sv\3\2\2\2tu\3"+
		"\2\2\2tr\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7,\2\2xz\7\61\2\2ya\3\2\2\2yn\3"+
		"\2\2\2z{\3\2\2\2{|\b\b\2\2|\20\3\2\2\2}~\t\7\2\2~\177\3\2\2\2\177\u0080"+
		"\b\t\2\2\u0080\22\3\2\2\2\r\2$CNT\\_gkty\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}