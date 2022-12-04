// Generated from /Users/noahbackman/Documents/Fall 2022/PPL/4450_Semester_Project/AntlrCSharp/Final.g4 by ANTLR 4.8

 using AntlrCSharp;
 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FinalLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NL=4, CON=5, EQU=6, IF=7, ELIF=8, ELSE=9, WHILE=10, 
		FOR=11, IN=12, BREAK=13, CONTINUE=14, RETURN=15, DEF=16, END=17, NEWLINE=18, 
		WS=19, EQUALS=20, STAR=21, ARITHMETIC=22, INTEGER=23, BOOLEAN=24, FLOATS=25, 
		STRING=26, COMMENT=27, ID=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "NL", "LOWERCASE", "UPPERCASE", "CON", "EQU", 
			"IF", "ELIF", "ELSE", "WHILE", "FOR", "IN", "BREAK", "CONTINUE", "RETURN", 
			"DEF", "END", "NEWLINE", "WS", "EQUALS", "STAR", "ARITHMETIC", "INTEGER", 
			"BOOLEAN", "FLOATS", "STRING", "COMMENT", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NL", "CON", "EQU", "IF", "ELIF", "ELSE", "WHILE", 
			"FOR", "IN", "BREAK", "CONTINUE", "RETURN", "DEF", "END", "NEWLINE", 
			"WS", "EQUALS", "STAR", "ARITHMETIC", "INTEGER", "BOOLEAN", "FLOATS", 
			"STRING", "COMMENT", "ID"
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


	 private DenterHelper denter;
	  
	 public override IToken NextToken()
	 {
	     if (denter == null)
	     {
	         denter = DenterHelper.Builder()
	             .Nl(NL)
	             .Indent(FinalParser.INDENT)
	             .Dedent(FinalParser.DEDENT)
	             .PullToken(base.NextToken);
	     }

	     return denter.NextToken();
	 }
	 

	public FinalLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Final.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00f8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\7\5G\n\5\f\5\16\5J\13\5\3\5\3\5\7\5N\n\5\f\5"+
		"\16\5Q\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b_\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tk\n\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\6\25\u00a4\n\25\r\25\16\25\u00a5\3\26\6"+
		"\26\u00a9\n\26\r\26\16\26\u00aa\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\31\5\31\u00b6\n\31\3\32\5\32\u00b9\n\32\3\32\6\32\u00bc\n\32\r\32\16"+
		"\32\u00bd\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00d2\n\33\3\34\5\34\u00d5\n\34\3"+
		"\34\7\34\u00d8\n\34\f\34\16\34\u00db\13\34\3\34\3\34\6\34\u00df\n\34\r"+
		"\34\16\34\u00e0\3\35\3\35\7\35\u00e5\n\35\f\35\16\35\u00e8\13\35\3\35"+
		"\3\35\3\36\3\36\7\36\u00ee\n\36\f\36\16\36\u00f1\13\36\3\37\3\37\6\37"+
		"\u00f5\n\37\r\37\16\37\u00f6\3\u00e6\2 \3\3\5\4\7\5\t\6\13\2\r\2\17\7"+
		"\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-"+
		"\26/\27\61\30\63\31\65\32\67\339\34;\35=\36\3\2\t\3\2c|\3\2C\\\4\2\f\f"+
		"\17\17\3\2\"\"\4\2--//\4\2\'\'\61\61\3\2\62;\2\u010e\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5A\3\2\2\2\7C"+
		"\3\2\2\2\tH\3\2\2\2\13R\3\2\2\2\rT\3\2\2\2\17^\3\2\2\2\21j\3\2\2\2\23"+
		"l\3\2\2\2\25o\3\2\2\2\27t\3\2\2\2\31y\3\2\2\2\33\177\3\2\2\2\35\u0083"+
		"\3\2\2\2\37\u0086\3\2\2\2!\u008c\3\2\2\2#\u0095\3\2\2\2%\u009c\3\2\2\2"+
		"\'\u00a0\3\2\2\2)\u00a3\3\2\2\2+\u00a8\3\2\2\2-\u00ae\3\2\2\2/\u00b0\3"+
		"\2\2\2\61\u00b5\3\2\2\2\63\u00b8\3\2\2\2\65\u00d1\3\2\2\2\67\u00d4\3\2"+
		"\2\29\u00e2\3\2\2\2;\u00eb\3\2\2\2=\u00f4\3\2\2\2?@\7*\2\2@\4\3\2\2\2"+
		"AB\7+\2\2B\6\3\2\2\2CD\7.\2\2D\b\3\2\2\2EG\7\17\2\2FE\3\2\2\2GJ\3\2\2"+
		"\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KO\7\f\2\2LN\7\13\2\2ML\3\2"+
		"\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\n\3\2\2\2QO\3\2\2\2RS\t\2\2\2S\f\3"+
		"\2\2\2TU\t\3\2\2U\16\3\2\2\2VW\7c\2\2WX\7p\2\2X_\7f\2\2YZ\7q\2\2Z_\7t"+
		"\2\2[\\\7p\2\2\\]\7q\2\2]_\7v\2\2^V\3\2\2\2^Y\3\2\2\2^[\3\2\2\2_\20\3"+
		"\2\2\2`a\7?\2\2ak\7?\2\2bc\7#\2\2ck\7?\2\2dk\7>\2\2ef\7>\2\2fk\7?\2\2"+
		"gk\7@\2\2hi\7@\2\2ik\7?\2\2j`\3\2\2\2jb\3\2\2\2jd\3\2\2\2je\3\2\2\2jg"+
		"\3\2\2\2jh\3\2\2\2k\22\3\2\2\2lm\7k\2\2mn\7h\2\2n\24\3\2\2\2op\7g\2\2"+
		"pq\7n\2\2qr\7k\2\2rs\7h\2\2s\26\3\2\2\2tu\7g\2\2uv\7n\2\2vw\7u\2\2wx\7"+
		"g\2\2x\30\3\2\2\2yz\7y\2\2z{\7j\2\2{|\7k\2\2|}\7n\2\2}~\7g\2\2~\32\3\2"+
		"\2\2\177\u0080\7h\2\2\u0080\u0081\7q\2\2\u0081\u0082\7t\2\2\u0082\34\3"+
		"\2\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\36\3\2\2\2\u0086\u0087"+
		"\7d\2\2\u0087\u0088\7t\2\2\u0088\u0089\7g\2\2\u0089\u008a\7c\2\2\u008a"+
		"\u008b\7m\2\2\u008b \3\2\2\2\u008c\u008d\7e\2\2\u008d\u008e\7q\2\2\u008e"+
		"\u008f\7p\2\2\u008f\u0090\7v\2\2\u0090\u0091\7k\2\2\u0091\u0092\7p\2\2"+
		"\u0092\u0093\7w\2\2\u0093\u0094\7g\2\2\u0094\"\3\2\2\2\u0095\u0096\7t"+
		"\2\2\u0096\u0097\7g\2\2\u0097\u0098\7v\2\2\u0098\u0099\7w\2\2\u0099\u009a"+
		"\7t\2\2\u009a\u009b\7p\2\2\u009b$\3\2\2\2\u009c\u009d\7f\2\2\u009d\u009e"+
		"\7g\2\2\u009e\u009f\7h\2\2\u009f&\3\2\2\2\u00a0\u00a1\7<\2\2\u00a1(\3"+
		"\2\2\2\u00a2\u00a4\t\4\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6*\3\2\2\2\u00a7\u00a9\t\5\2\2"+
		"\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\26\2\2\u00ad,\3\2\2\2\u00ae"+
		"\u00af\7?\2\2\u00af.\3\2\2\2\u00b0\u00b1\7,\2\2\u00b1\60\3\2\2\2\u00b2"+
		"\u00b6\t\6\2\2\u00b3\u00b6\5/\30\2\u00b4\u00b6\t\7\2\2\u00b5\u00b2\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\62\3\2\2\2\u00b7\u00b9"+
		"\7/\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00bc\t\b\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\64\3\2\2\2\u00bf\u00c0\7V\2\2\u00c0\u00c1"+
		"\7t\2\2\u00c1\u00c2\7w\2\2\u00c2\u00d2\7g\2\2\u00c3\u00c4\7v\2\2\u00c4"+
		"\u00c5\7t\2\2\u00c5\u00c6\7w\2\2\u00c6\u00d2\7g\2\2\u00c7\u00c8\7H\2\2"+
		"\u00c8\u00c9\7c\2\2\u00c9\u00ca\7n\2\2\u00ca\u00cb\7u\2\2\u00cb\u00d2"+
		"\7g\2\2\u00cc\u00cd\7h\2\2\u00cd\u00ce\7c\2\2\u00ce\u00cf\7n\2\2\u00cf"+
		"\u00d0\7u\2\2\u00d0\u00d2\7g\2\2\u00d1\u00bf\3\2\2\2\u00d1\u00c3\3\2\2"+
		"\2\u00d1\u00c7\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d2\66\3\2\2\2\u00d3\u00d5"+
		"\7/\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d9\3\2\2\2\u00d6"+
		"\u00d8\t\b\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc"+
		"\u00de\7\60\2\2\u00dd\u00df\t\b\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3"+
		"\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e18\3\2\2\2\u00e2\u00e6"+
		"\7$\2\2\u00e3\u00e5\13\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\u00ea\7$\2\2\u00ea:\3\2\2\2\u00eb\u00ef\7%\2\2\u00ec\u00ee"+
		"\n\4\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0<\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\5\13\6\2"+
		"\u00f3\u00f5\5\r\7\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7>\3\2\2\2\24\2H"+
		"O^j\u00a5\u00aa\u00b5\u00b8\u00bd\u00d1\u00d4\u00d9\u00e0\u00e6\u00ef"+
		"\u00f4\u00f6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}