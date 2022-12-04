// Generated from /Users/noahbackman/Documents/Fall 2022/PPL/4450_Semester_Project/AntlrCSharp/Final.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FinalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NL=4, CON=5, EQU=6, IF=7, ELIF=8, ELSE=9, WHILE=10, 
		FOR=11, IN=12, BREAK=13, CONTINUE=14, RETURN=15, DEF=16, END=17, NEWLINE=18, 
		WS=19, EQUALS=20, STAR=21, ARITHMETIC=22, INTEGER=23, BOOLEAN=24, FLOATS=25, 
		STRING=26, COMMENT=27, ID=28, INDENT=29, DEDENT=30;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_assign = 2, RULE_literals = 3, RULE_arithmetic = 4, 
		RULE_statements = 5, RULE_structureIf = 6, RULE_ifState = 7, RULE_elifState = 8, 
		RULE_elseState = 9, RULE_condition = 10, RULE_block = 11, RULE_whileState = 12, 
		RULE_forState = 13, RULE_funcDef = 14, RULE_funcCall = 15, RULE_args = 16, 
		RULE_comment = 17, RULE_loopControl = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "line", "assign", "literals", "arithmetic", "statements", "structureIf", 
			"ifState", "elifState", "elseState", "condition", "block", "whileState", 
			"forState", "funcDef", "funcCall", "args", "comment", "loopControl"
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
			"STRING", "COMMENT", "ID", "INDENT", "DEDENT"
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
	public String getGrammarFileName() { return "Final.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FinalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FinalParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << DEF) | (1L << COMMENT) | (1L << ID))) != 0)) {
				{
				{
				setState(38);
				line();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			match(EOF);
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

	public static class LineContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public LoopControlContext loopControl() {
			return getRuleContext(LoopControlContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TerminalNode NL() { return getToken(FinalParser.NL, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(46);
				assign();
				setState(48);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(47);
					comment();
					}
					break;
				}
				setState(51);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(50);
					match(NL);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(53);
				statements();
				setState(55);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(54);
					comment();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(57);
				loopControl();
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(58);
					comment();
					}
					break;
				}
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(61);
					match(NL);
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(64);
				funcCall();
				setState(66);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(65);
					comment();
					}
					break;
				}
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(68);
					match(NL);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(71);
				comment();
				}
				break;
			case 6:
				{
				setState(72);
				match(NL);
				}
				break;
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

	public static class AssignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(FinalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FinalParser.ID, i);
		}
		public TerminalNode EQUALS() { return getToken(FinalParser.EQUALS, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public TerminalNode CON() { return getToken(FinalParser.CON, 0); }
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public TerminalNode ARITHMETIC() { return getToken(FinalParser.ARITHMETIC, 0); }
		public TerminalNode STAR() { return getToken(FinalParser.STAR, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ID);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR || _la==ARITHMETIC) {
				{
				setState(76);
				_la = _input.LA(1);
				if ( !(_la==STAR || _la==ARITHMETIC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(79);
			match(EQUALS);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(80);
				match(CON);
				}
			}

			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(83);
				literals();
				}
				break;
			case 2:
				{
				setState(84);
				match(ID);
				}
				break;
			case 3:
				{
				setState(85);
				funcCall();
				}
				break;
			}
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(88);
				arithmetic();
				}
				break;
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

	public static class LiteralsContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(FinalParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(FinalParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(FinalParser.BOOLEAN, 0); }
		public TerminalNode FLOATS() { return getToken(FinalParser.FLOATS, 0); }
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << BOOLEAN) | (1L << FLOATS) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ArithmeticContext extends ParserRuleContext {
		public List<TerminalNode> ARITHMETIC() { return getTokens(FinalParser.ARITHMETIC); }
		public TerminalNode ARITHMETIC(int i) {
			return getToken(FinalParser.ARITHMETIC, i);
		}
		public List<TerminalNode> STAR() { return getTokens(FinalParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(FinalParser.STAR, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(FinalParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(FinalParser.INTEGER, i);
		}
		public List<TerminalNode> ID() { return getTokens(FinalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FinalParser.ID, i);
		}
		public List<TerminalNode> FLOATS() { return getTokens(FinalParser.FLOATS); }
		public TerminalNode FLOATS(int i) {
			return getToken(FinalParser.FLOATS, i);
		}
		public List<TerminalNode> STRING() { return getTokens(FinalParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(FinalParser.STRING, i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arithmetic);
		int _la;
		try {
			int _alt;
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case ARITHMETIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(93);
					_la = _input.LA(1);
					if ( !(_la==STAR || _la==ARITHMETIC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(94);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOATS) | (1L << STRING) | (1L << ID))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(97); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==STAR || _la==ARITHMETIC );
				}
				break;
			case CON:
			case INTEGER:
			case BOOLEAN:
			case FLOATS:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(99);
						condition();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(102); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StatementsContext extends ParserRuleContext {
		public StructureIfContext structureIf() {
			return getRuleContext(StructureIfContext.class,0);
		}
		public WhileStateContext whileState() {
			return getRuleContext(WhileStateContext.class,0);
		}
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public ForStateContext forState() {
			return getRuleContext(ForStateContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statements);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				structureIf();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				whileState();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				funcDef();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				forState();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StructureIfContext extends ParserRuleContext {
		public IfStateContext ifState() {
			return getRuleContext(IfStateContext.class,0);
		}
		public ElifStateContext elifState() {
			return getRuleContext(ElifStateContext.class,0);
		}
		public ElseStateContext elseState() {
			return getRuleContext(ElseStateContext.class,0);
		}
		public StructureIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureIf; }
	}

	public final StructureIfContext structureIf() throws RecognitionException {
		StructureIfContext _localctx = new StructureIfContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structureIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			ifState();
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(113);
				elifState();
				}
				break;
			}
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(116);
				elseState();
				}
				break;
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

	public static class IfStateContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FinalParser.IF, 0); }
		public TerminalNode END() { return getToken(FinalParser.END, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public IfStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifState; }
	}

	public final IfStateContext ifState() throws RecognitionException {
		IfStateContext _localctx = new IfStateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ifState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IF);
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				condition();
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CON) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << FLOATS) | (1L << STRING) | (1L << ID))) != 0) );
			setState(125);
			match(END);
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDENT:
				{
				setState(126);
				block();
				}
				break;
			case NL:
			case IF:
			case WHILE:
			case FOR:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case DEF:
			case COMMENT:
			case ID:
				{
				setState(127);
				line();
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

	public static class ElifStateContext extends ParserRuleContext {
		public List<TerminalNode> ELIF() { return getTokens(FinalParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(FinalParser.ELIF, i);
		}
		public List<TerminalNode> END() { return getTokens(FinalParser.END); }
		public TerminalNode END(int i) {
			return getToken(FinalParser.END, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ElifStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifState; }
	}

	public final ElifStateContext elifState() throws RecognitionException {
		ElifStateContext _localctx = new ElifStateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elifState);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(141); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(130);
					match(ELIF);
					setState(132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(131);
						condition();
						}
						}
						setState(134); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CON) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << FLOATS) | (1L << STRING) | (1L << ID))) != 0) );
					setState(136);
					match(END);
					setState(139);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INDENT:
						{
						setState(137);
						block();
						}
						break;
					case NL:
					case IF:
					case WHILE:
					case FOR:
					case BREAK:
					case CONTINUE:
					case RETURN:
					case DEF:
					case COMMENT:
					case ID:
						{
						setState(138);
						line();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(143); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ElseStateContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FinalParser.ELSE, 0); }
		public TerminalNode END() { return getToken(FinalParser.END, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ElseStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseState; }
	}

	public final ElseStateContext elseState() throws RecognitionException {
		ElseStateContext _localctx = new ElseStateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ELSE);
			setState(146);
			match(END);
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				block();
				}
				}
				setState(150); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INDENT );
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

	public static class ConditionContext extends ParserRuleContext {
		public List<LiteralsContext> literals() {
			return getRuleContexts(LiteralsContext.class);
		}
		public LiteralsContext literals(int i) {
			return getRuleContext(LiteralsContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(FinalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FinalParser.ID, i);
		}
		public List<TerminalNode> CON() { return getTokens(FinalParser.CON); }
		public TerminalNode CON(int i) {
			return getToken(FinalParser.CON, i);
		}
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public TerminalNode EQU() { return getToken(FinalParser.EQU, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(152);
				match(CON);
				}
			}

			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case BOOLEAN:
			case FLOATS:
			case STRING:
				{
				setState(155);
				literals();
				}
				break;
			case ID:
				{
				setState(156);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(159);
				arithmetic();
				}
				break;
			}
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(162);
				_la = _input.LA(1);
				if ( !(_la==CON || _la==EQU) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CON) {
					{
					setState(163);
					match(CON);
					}
				}

				setState(168);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER:
				case BOOLEAN:
				case FLOATS:
				case STRING:
					{
					setState(166);
					literals();
					}
					break;
				case ID:
					{
					setState(167);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(171);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(170);
					arithmetic();
					}
					break;
				}
				}
				break;
			}
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(175);
					match(CON);
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode INDENT() { return getToken(FinalParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(FinalParser.DEDENT, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(INDENT);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				line();
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << DEF) | (1L << COMMENT) | (1L << ID))) != 0) );
			setState(187);
			match(DEDENT);
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

	public static class WhileStateContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(FinalParser.WHILE, 0); }
		public TerminalNode END() { return getToken(FinalParser.END, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public WhileStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileState; }
	}

	public final WhileStateContext whileState() throws RecognitionException {
		WhileStateContext _localctx = new WhileStateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileState);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(WHILE);
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(190);
				condition();
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CON) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << FLOATS) | (1L << STRING) | (1L << ID))) != 0) );
			setState(195);
			match(END);
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDENT:
				{
				setState(196);
				block();
				}
				break;
			case NL:
			case IF:
			case WHILE:
			case FOR:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case DEF:
			case COMMENT:
			case ID:
				{
				setState(197);
				line();
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

	public static class ForStateContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FinalParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(FinalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FinalParser.ID, i);
		}
		public TerminalNode IN() { return getToken(FinalParser.IN, 0); }
		public TerminalNode END() { return getToken(FinalParser.END, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public ForStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forState; }
	}

	public final ForStateContext forState() throws RecognitionException {
		ForStateContext _localctx = new ForStateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(FOR);
			setState(201);
			match(ID);
			setState(202);
			match(IN);
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(203);
				literals();
				}
				break;
			case 2:
				{
				setState(204);
				match(ID);
				}
				break;
			case 3:
				{
				setState(205);
				funcCall();
				}
				break;
			}
			setState(208);
			match(END);
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDENT:
				{
				setState(209);
				block();
				}
				break;
			case NL:
			case IF:
			case WHILE:
			case FOR:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case DEF:
			case COMMENT:
			case ID:
				{
				setState(210);
				line();
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

	public static class FuncDefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(FinalParser.DEF, 0); }
		public TerminalNode ID() { return getToken(FinalParser.ID, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode END() { return getToken(FinalParser.END, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(DEF);
			setState(214);
			match(ID);
			setState(215);
			match(T__0);
			setState(216);
			args();
			setState(217);
			match(T__1);
			setState(218);
			match(END);
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDENT:
				{
				setState(219);
				block();
				}
				break;
			case NL:
			case IF:
			case WHILE:
			case FOR:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case DEF:
			case COMMENT:
			case ID:
				{
				setState(220);
				line();
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

	public static class FuncCallContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(FinalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FinalParser.ID, i);
		}
		public List<LiteralsContext> literals() {
			return getRuleContexts(LiteralsContext.class);
		}
		public LiteralsContext literals(int i) {
			return getRuleContext(LiteralsContext.class,i);
		}
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_funcCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(ID);
			setState(224);
			match(T__0);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << BOOLEAN) | (1L << FLOATS) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(227);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(225);
					match(ID);
					}
					break;
				case INTEGER:
				case BOOLEAN:
				case FLOATS:
				case STRING:
					{
					setState(226);
					literals();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(229);
					match(T__2);
					setState(232);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(230);
						match(ID);
						}
						break;
					case INTEGER:
					case BOOLEAN:
					case FLOATS:
					case STRING:
						{
						setState(231);
						literals();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(241);
			match(T__1);
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

	public static class ArgsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FinalParser.ID, 0); }
		public TerminalNode EQU() { return getToken(FinalParser.EQU, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(ID);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQU) {
				{
				setState(244);
				match(EQU);
				setState(245);
				literals();
				}
			}

			{
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(248);
				match(T__2);
				setState(249);
				args();
				}
			}

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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(FinalParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(COMMENT);
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

	public static class LoopControlContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(FinalParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(FinalParser.CONTINUE, 0); }
		public TerminalNode RETURN() { return getToken(FinalParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(FinalParser.ID, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public LoopControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopControl; }
	}

	public final LoopControlContext loopControl() throws RecognitionException {
		LoopControlContext _localctx = new LoopControlContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_loopControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				{
				setState(254);
				match(BREAK);
				}
				break;
			case CONTINUE:
				{
				setState(255);
				match(CONTINUE);
				}
				break;
			case RETURN:
				{
				setState(256);
				match(RETURN);
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(257);
					match(ID);
					}
					break;
				case 2:
					{
					setState(258);
					literals();
					}
					break;
				case 3:
					{
					setState(259);
					arithmetic();
					}
					break;
				}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u010b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\5\3\63"+
		"\n\3\3\3\5\3\66\n\3\3\3\3\3\5\3:\n\3\3\3\3\3\5\3>\n\3\3\3\5\3A\n\3\3\3"+
		"\3\3\5\3E\n\3\3\3\5\3H\n\3\3\3\3\3\5\3L\n\3\3\4\3\4\5\4P\n\4\3\4\3\4\5"+
		"\4T\n\4\3\4\3\4\3\4\5\4Y\n\4\3\4\5\4\\\n\4\3\5\3\5\3\6\3\6\6\6b\n\6\r"+
		"\6\16\6c\3\6\6\6g\n\6\r\6\16\6h\5\6k\n\6\3\7\3\7\3\7\3\7\5\7q\n\7\3\b"+
		"\3\b\5\bu\n\b\3\b\5\bx\n\b\3\t\3\t\6\t|\n\t\r\t\16\t}\3\t\3\t\3\t\5\t"+
		"\u0083\n\t\3\n\3\n\6\n\u0087\n\n\r\n\16\n\u0088\3\n\3\n\3\n\5\n\u008e"+
		"\n\n\6\n\u0090\n\n\r\n\16\n\u0091\3\13\3\13\3\13\6\13\u0097\n\13\r\13"+
		"\16\13\u0098\3\f\5\f\u009c\n\f\3\f\3\f\5\f\u00a0\n\f\3\f\5\f\u00a3\n\f"+
		"\3\f\3\f\5\f\u00a7\n\f\3\f\3\f\5\f\u00ab\n\f\3\f\5\f\u00ae\n\f\5\f\u00b0"+
		"\n\f\3\f\7\f\u00b3\n\f\f\f\16\f\u00b6\13\f\3\r\3\r\6\r\u00ba\n\r\r\r\16"+
		"\r\u00bb\3\r\3\r\3\16\3\16\6\16\u00c2\n\16\r\16\16\16\u00c3\3\16\3\16"+
		"\3\16\5\16\u00c9\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d1\n\17\3"+
		"\17\3\17\3\17\5\17\u00d6\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00e0\n\20\3\21\3\21\3\21\3\21\5\21\u00e6\n\21\3\21\3\21\3\21\5"+
		"\21\u00eb\n\21\7\21\u00ed\n\21\f\21\16\21\u00f0\13\21\5\21\u00f2\n\21"+
		"\3\21\3\21\3\22\3\22\3\22\5\22\u00f9\n\22\3\22\3\22\5\22\u00fd\n\22\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0107\n\24\5\24\u0109\n\24"+
		"\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\6\3\2\27\30"+
		"\3\2\31\34\5\2\31\31\33\34\36\36\3\2\7\b\2\u0130\2+\3\2\2\2\4K\3\2\2\2"+
		"\6M\3\2\2\2\b]\3\2\2\2\nj\3\2\2\2\fp\3\2\2\2\16r\3\2\2\2\20y\3\2\2\2\22"+
		"\u008f\3\2\2\2\24\u0093\3\2\2\2\26\u009b\3\2\2\2\30\u00b7\3\2\2\2\32\u00bf"+
		"\3\2\2\2\34\u00ca\3\2\2\2\36\u00d7\3\2\2\2 \u00e1\3\2\2\2\"\u00f5\3\2"+
		"\2\2$\u00fe\3\2\2\2&\u0108\3\2\2\2(*\5\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2"+
		"\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\2\2\3/\3\3\2\2\2\60\62\5\6\4\2"+
		"\61\63\5$\23\2\62\61\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\66\7\6\2\2"+
		"\65\64\3\2\2\2\65\66\3\2\2\2\66L\3\2\2\2\679\5\f\7\28:\5$\23\298\3\2\2"+
		"\29:\3\2\2\2:L\3\2\2\2;=\5&\24\2<>\5$\23\2=<\3\2\2\2=>\3\2\2\2>@\3\2\2"+
		"\2?A\7\6\2\2@?\3\2\2\2@A\3\2\2\2AL\3\2\2\2BD\5 \21\2CE\5$\23\2DC\3\2\2"+
		"\2DE\3\2\2\2EG\3\2\2\2FH\7\6\2\2GF\3\2\2\2GH\3\2\2\2HL\3\2\2\2IL\5$\23"+
		"\2JL\7\6\2\2K\60\3\2\2\2K\67\3\2\2\2K;\3\2\2\2KB\3\2\2\2KI\3\2\2\2KJ\3"+
		"\2\2\2L\5\3\2\2\2MO\7\36\2\2NP\t\2\2\2ON\3\2\2\2OP\3\2\2\2PQ\3\2\2\2Q"+
		"S\7\26\2\2RT\7\7\2\2SR\3\2\2\2ST\3\2\2\2TX\3\2\2\2UY\5\b\5\2VY\7\36\2"+
		"\2WY\5 \21\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y[\3\2\2\2Z\\\5\n\6\2[Z\3\2"+
		"\2\2[\\\3\2\2\2\\\7\3\2\2\2]^\t\3\2\2^\t\3\2\2\2_`\t\2\2\2`b\t\4\2\2a"+
		"_\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2dk\3\2\2\2eg\5\26\f\2fe\3\2\2\2"+
		"gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2ja\3\2\2\2jf\3\2\2\2k\13\3\2\2"+
		"\2lq\5\16\b\2mq\5\32\16\2nq\5\36\20\2oq\5\34\17\2pl\3\2\2\2pm\3\2\2\2"+
		"pn\3\2\2\2po\3\2\2\2q\r\3\2\2\2rt\5\20\t\2su\5\22\n\2ts\3\2\2\2tu\3\2"+
		"\2\2uw\3\2\2\2vx\5\24\13\2wv\3\2\2\2wx\3\2\2\2x\17\3\2\2\2y{\7\t\2\2z"+
		"|\5\26\f\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0082"+
		"\7\23\2\2\u0080\u0083\5\30\r\2\u0081\u0083\5\4\3\2\u0082\u0080\3\2\2\2"+
		"\u0082\u0081\3\2\2\2\u0083\21\3\2\2\2\u0084\u0086\7\n\2\2\u0085\u0087"+
		"\5\26\f\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2"+
		"\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008d\7\23\2\2\u008b\u008e"+
		"\5\30\r\2\u008c\u008e\5\4\3\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2"+
		"\u008e\u0090\3\2\2\2\u008f\u0084\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\23\3\2\2\2\u0093\u0094\7\13\2\2\u0094"+
		"\u0096\7\23\2\2\u0095\u0097\5\30\r\2\u0096\u0095\3\2\2\2\u0097\u0098\3"+
		"\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\25\3\2\2\2\u009a"+
		"\u009c\7\7\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009f\3\2"+
		"\2\2\u009d\u00a0\5\b\5\2\u009e\u00a0\7\36\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u00a3\5\n\6\2\u00a2\u00a1\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00af\3\2\2\2\u00a4\u00a6\t\5\2\2\u00a5"+
		"\u00a7\7\7\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\3\2"+
		"\2\2\u00a8\u00ab\5\b\5\2\u00a9\u00ab\7\36\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00ae\5\n\6\2\u00ad\u00ac\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00a4\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00b3\7\7\2\2\u00b2\u00b1\3\2"+
		"\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\27\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\7\37\2\2\u00b8\u00ba\5\4\3"+
		"\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7 \2\2\u00be\31\3\2\2\2\u00bf"+
		"\u00c1\7\f\2\2\u00c0\u00c2\5\26\f\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3"+
		"\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c8\7\23\2\2\u00c6\u00c9\5\30\r\2\u00c7\u00c9\5\4\3\2\u00c8\u00c6\3"+
		"\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\33\3\2\2\2\u00ca\u00cb\7\r\2\2\u00cb"+
		"\u00cc\7\36\2\2\u00cc\u00d0\7\16\2\2\u00cd\u00d1\5\b\5\2\u00ce\u00d1\7"+
		"\36\2\2\u00cf\u00d1\5 \21\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d5\7\23\2\2\u00d3\u00d6\5"+
		"\30\r\2\u00d4\u00d6\5\4\3\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\35\3\2\2\2\u00d7\u00d8\7\22\2\2\u00d8\u00d9\7\36\2\2\u00d9\u00da\7\3"+
		"\2\2\u00da\u00db\5\"\22\2\u00db\u00dc\7\4\2\2\u00dc\u00df\7\23\2\2\u00dd"+
		"\u00e0\5\30\r\2\u00de\u00e0\5\4\3\2\u00df\u00dd\3\2\2\2\u00df\u00de\3"+
		"\2\2\2\u00e0\37\3\2\2\2\u00e1\u00e2\7\36\2\2\u00e2\u00f1\7\3\2\2\u00e3"+
		"\u00e6\7\36\2\2\u00e4\u00e6\5\b\5\2\u00e5\u00e3\3\2\2\2\u00e5\u00e4\3"+
		"\2\2\2\u00e6\u00ee\3\2\2\2\u00e7\u00ea\7\5\2\2\u00e8\u00eb\7\36\2\2\u00e9"+
		"\u00eb\5\b\5\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ed\3\2"+
		"\2\2\u00ec\u00e7\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00e5\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\4\2\2\u00f4"+
		"!\3\2\2\2\u00f5\u00f8\7\36\2\2\u00f6\u00f7\7\b\2\2\u00f7\u00f9\5\b\5\2"+
		"\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00fb"+
		"\7\5\2\2\u00fb\u00fd\5\"\22\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2"+
		"\u00fd#\3\2\2\2\u00fe\u00ff\7\35\2\2\u00ff%\3\2\2\2\u0100\u0109\7\17\2"+
		"\2\u0101\u0109\7\20\2\2\u0102\u0106\7\21\2\2\u0103\u0107\7\36\2\2\u0104"+
		"\u0107\5\b\5\2\u0105\u0107\5\n\6\2\u0106\u0103\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0106\u0105\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0100\3\2\2\2\u0108"+
		"\u0101\3\2\2\2\u0108\u0102\3\2\2\2\u0109\'\3\2\2\2\61+\62\659=@DGKOSX"+
		"[chjptw}\u0082\u0088\u008d\u0091\u0098\u009b\u009f\u00a2\u00a6\u00aa\u00ad"+
		"\u00af\u00b4\u00bb\u00c3\u00c8\u00d0\u00d5\u00df\u00e5\u00ea\u00ee\u00f1"+
		"\u00f8\u00fc\u0106\u0108";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}