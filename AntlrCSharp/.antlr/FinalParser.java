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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
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
				setState(58);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(57);
					match(NL);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(60);
				loopControl();
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(61);
					comment();
					}
					break;
				}
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(64);
					match(NL);
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(67);
				funcCall();
				setState(69);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(68);
					comment();
					}
					break;
				}
				setState(72);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(71);
					match(NL);
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(74);
				comment();
				}
				break;
			case 6:
				{
				setState(75);
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
			setState(78);
			match(ID);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STAR || _la==ARITHMETIC) {
				{
				setState(79);
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

			setState(82);
			match(EQUALS);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(83);
				match(CON);
				}
			}

			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(86);
				literals();
				}
				break;
			case 2:
				{
				setState(87);
				match(ID);
				}
				break;
			case 3:
				{
				setState(88);
				funcCall();
				}
				break;
			}
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(91);
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
			setState(94);
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
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
			case ARITHMETIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					_la = _input.LA(1);
					if ( !(_la==STAR || _la==ARITHMETIC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(97);
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
					setState(100); 
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
				setState(103); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(102);
						condition();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(105); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				structureIf();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				whileState();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				funcDef();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
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
		public ElseStateContext elseState() {
			return getRuleContext(ElseStateContext.class,0);
		}
		public ElifStateContext elifState() {
			return getRuleContext(ElifStateContext.class,0);
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				ifState();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				ifState();
				setState(117);
				elseState();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				ifState();
				setState(120);
				elifState();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				ifState();
				setState(123);
				elifState();
				setState(124);
				elseState();
				}
				break;
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
			setState(128);
			match(IF);
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				condition();
				}
				}
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CON) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << FLOATS) | (1L << STRING) | (1L << ID))) != 0) );
			setState(134);
			match(END);
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDENT:
				{
				setState(135);
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
				setState(136);
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
			setState(150); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(139);
					match(ELIF);
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(140);
						condition();
						}
						}
						setState(143); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CON) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << FLOATS) | (1L << STRING) | (1L << ID))) != 0) );
					setState(145);
					match(END);
					setState(148);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case INDENT:
						{
						setState(146);
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
						setState(147);
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
				setState(152); 
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
			setState(154);
			match(ELSE);
			setState(155);
			match(END);
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156);
				block();
				}
				}
				setState(159); 
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
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CON) {
				{
				setState(161);
				match(CON);
				}
			}

			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case BOOLEAN:
			case FLOATS:
			case STRING:
				{
				setState(164);
				literals();
				}
				break;
			case ID:
				{
				setState(165);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(168);
				arithmetic();
				}
				break;
			}
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==CON || _la==EQU) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CON) {
					{
					setState(172);
					match(CON);
					}
				}

				setState(177);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER:
				case BOOLEAN:
				case FLOATS:
				case STRING:
					{
					setState(175);
					literals();
					}
					break;
				case ID:
					{
					setState(176);
					match(ID);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(179);
					arithmetic();
					}
					break;
				}
				}
				break;
			}
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(184);
					match(CON);
					}
					} 
				}
				setState(189);
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
			setState(190);
			match(INDENT);
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				line();
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << RETURN) | (1L << DEF) | (1L << COMMENT) | (1L << ID))) != 0) );
			setState(196);
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
			setState(198);
			match(WHILE);
			setState(200); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(199);
				condition();
				}
				}
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CON) | (1L << INTEGER) | (1L << BOOLEAN) | (1L << FLOATS) | (1L << STRING) | (1L << ID))) != 0) );
			setState(204);
			match(END);
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDENT:
				{
				setState(205);
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
				setState(206);
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
			setState(209);
			match(FOR);
			setState(210);
			match(ID);
			setState(211);
			match(IN);
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(212);
				literals();
				}
				break;
			case 2:
				{
				setState(213);
				match(ID);
				}
				break;
			case 3:
				{
				setState(214);
				funcCall();
				}
				break;
			}
			setState(217);
			match(END);
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDENT:
				{
				setState(218);
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
				setState(219);
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
			setState(222);
			match(DEF);
			setState(223);
			match(ID);
			setState(224);
			match(T__0);
			setState(225);
			args();
			setState(226);
			match(T__1);
			setState(227);
			match(END);
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDENT:
				{
				setState(228);
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
				setState(229);
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
			setState(232);
			match(ID);
			setState(233);
			match(T__0);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << BOOLEAN) | (1L << FLOATS) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				setState(236);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(234);
					match(ID);
					}
					break;
				case INTEGER:
				case BOOLEAN:
				case FLOATS:
				case STRING:
					{
					setState(235);
					literals();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(238);
					match(T__2);
					setState(241);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(239);
						match(ID);
						}
						break;
					case INTEGER:
					case BOOLEAN:
					case FLOATS:
					case STRING:
						{
						setState(240);
						literals();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(250);
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
			setState(252);
			match(ID);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQU) {
				{
				setState(253);
				match(EQU);
				setState(254);
				literals();
				}
			}

			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(257);
				match(T__2);
				setState(258);
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
			setState(261);
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
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				{
				setState(263);
				match(BREAK);
				}
				break;
			case CONTINUE:
				{
				setState(264);
				match(CONTINUE);
				}
				break;
			case RETURN:
				{
				setState(265);
				match(RETURN);
				setState(269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(266);
					match(ID);
					}
					break;
				case 2:
					{
					setState(267);
					literals();
					}
					break;
				case 3:
					{
					setState(268);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u0114\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\5\3\63"+
		"\n\3\3\3\5\3\66\n\3\3\3\3\3\5\3:\n\3\3\3\5\3=\n\3\3\3\3\3\5\3A\n\3\3\3"+
		"\5\3D\n\3\3\3\3\3\5\3H\n\3\3\3\5\3K\n\3\3\3\3\3\5\3O\n\3\3\4\3\4\5\4S"+
		"\n\4\3\4\3\4\5\4W\n\4\3\4\3\4\3\4\5\4\\\n\4\3\4\5\4_\n\4\3\5\3\5\3\6\3"+
		"\6\6\6e\n\6\r\6\16\6f\3\6\6\6j\n\6\r\6\16\6k\5\6n\n\6\3\7\3\7\3\7\3\7"+
		"\5\7t\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0081\n\b\3"+
		"\t\3\t\6\t\u0085\n\t\r\t\16\t\u0086\3\t\3\t\3\t\5\t\u008c\n\t\3\n\3\n"+
		"\6\n\u0090\n\n\r\n\16\n\u0091\3\n\3\n\3\n\5\n\u0097\n\n\6\n\u0099\n\n"+
		"\r\n\16\n\u009a\3\13\3\13\3\13\6\13\u00a0\n\13\r\13\16\13\u00a1\3\f\5"+
		"\f\u00a5\n\f\3\f\3\f\5\f\u00a9\n\f\3\f\5\f\u00ac\n\f\3\f\3\f\5\f\u00b0"+
		"\n\f\3\f\3\f\5\f\u00b4\n\f\3\f\5\f\u00b7\n\f\5\f\u00b9\n\f\3\f\7\f\u00bc"+
		"\n\f\f\f\16\f\u00bf\13\f\3\r\3\r\6\r\u00c3\n\r\r\r\16\r\u00c4\3\r\3\r"+
		"\3\16\3\16\6\16\u00cb\n\16\r\16\16\16\u00cc\3\16\3\16\3\16\5\16\u00d2"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00da\n\17\3\17\3\17\3\17\5\17"+
		"\u00df\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e9\n\20\3"+
		"\21\3\21\3\21\3\21\5\21\u00ef\n\21\3\21\3\21\3\21\5\21\u00f4\n\21\7\21"+
		"\u00f6\n\21\f\21\16\21\u00f9\13\21\5\21\u00fb\n\21\3\21\3\21\3\22\3\22"+
		"\3\22\5\22\u0102\n\22\3\22\3\22\5\22\u0106\n\22\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\5\24\u0110\n\24\5\24\u0112\n\24\3\24\2\2\25\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\6\3\2\27\30\3\2\31\34\5\2\31\31"+
		"\33\34\36\36\3\2\7\b\2\u013b\2+\3\2\2\2\4N\3\2\2\2\6P\3\2\2\2\b`\3\2\2"+
		"\2\nm\3\2\2\2\fs\3\2\2\2\16\u0080\3\2\2\2\20\u0082\3\2\2\2\22\u0098\3"+
		"\2\2\2\24\u009c\3\2\2\2\26\u00a4\3\2\2\2\30\u00c0\3\2\2\2\32\u00c8\3\2"+
		"\2\2\34\u00d3\3\2\2\2\36\u00e0\3\2\2\2 \u00ea\3\2\2\2\"\u00fe\3\2\2\2"+
		"$\u0107\3\2\2\2&\u0111\3\2\2\2(*\5\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2"+
		"+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\2\2\3/\3\3\2\2\2\60\62\5\6\4\2\61\63"+
		"\5$\23\2\62\61\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\66\7\6\2\2\65\64"+
		"\3\2\2\2\65\66\3\2\2\2\66O\3\2\2\2\679\5\f\7\28:\5$\23\298\3\2\2\29:\3"+
		"\2\2\2:<\3\2\2\2;=\7\6\2\2<;\3\2\2\2<=\3\2\2\2=O\3\2\2\2>@\5&\24\2?A\5"+
		"$\23\2@?\3\2\2\2@A\3\2\2\2AC\3\2\2\2BD\7\6\2\2CB\3\2\2\2CD\3\2\2\2DO\3"+
		"\2\2\2EG\5 \21\2FH\5$\23\2GF\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IK\7\6\2\2JI\3"+
		"\2\2\2JK\3\2\2\2KO\3\2\2\2LO\5$\23\2MO\7\6\2\2N\60\3\2\2\2N\67\3\2\2\2"+
		"N>\3\2\2\2NE\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\5\3\2\2\2PR\7\36\2\2QS\t\2\2"+
		"\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TV\7\26\2\2UW\7\7\2\2VU\3\2\2\2VW\3\2"+
		"\2\2W[\3\2\2\2X\\\5\b\5\2Y\\\7\36\2\2Z\\\5 \21\2[X\3\2\2\2[Y\3\2\2\2["+
		"Z\3\2\2\2\\^\3\2\2\2]_\5\n\6\2^]\3\2\2\2^_\3\2\2\2_\7\3\2\2\2`a\t\3\2"+
		"\2a\t\3\2\2\2bc\t\2\2\2ce\t\4\2\2db\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2"+
		"\2\2gn\3\2\2\2hj\5\26\f\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3"+
		"\2\2\2md\3\2\2\2mi\3\2\2\2n\13\3\2\2\2ot\5\16\b\2pt\5\32\16\2qt\5\36\20"+
		"\2rt\5\34\17\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\r\3\2\2\2u\u0081"+
		"\5\20\t\2vw\5\20\t\2wx\5\24\13\2x\u0081\3\2\2\2yz\5\20\t\2z{\5\22\n\2"+
		"{\u0081\3\2\2\2|}\5\20\t\2}~\5\22\n\2~\177\5\24\13\2\177\u0081\3\2\2\2"+
		"\u0080u\3\2\2\2\u0080v\3\2\2\2\u0080y\3\2\2\2\u0080|\3\2\2\2\u0081\17"+
		"\3\2\2\2\u0082\u0084\7\t\2\2\u0083\u0085\5\26\f\2\u0084\u0083\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u008b\7\23\2\2\u0089\u008c\5\30\r\2\u008a\u008c\5\4\3\2"+
		"\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\21\3\2\2\2\u008d\u008f"+
		"\7\n\2\2\u008e\u0090\5\26\f\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2"+
		"\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0096"+
		"\7\23\2\2\u0094\u0097\5\30\r\2\u0095\u0097\5\4\3\2\u0096\u0094\3\2\2\2"+
		"\u0096\u0095\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u008d\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\23\3\2\2\2\u009c"+
		"\u009d\7\13\2\2\u009d\u009f\7\23\2\2\u009e\u00a0\5\30\r\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\25\3\2\2\2\u00a3\u00a5\7\7\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2"+
		"\2\u00a5\u00a8\3\2\2\2\u00a6\u00a9\5\b\5\2\u00a7\u00a9\7\36\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00ac\5\n"+
		"\6\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00b8\3\2\2\2\u00ad"+
		"\u00af\t\5\2\2\u00ae\u00b0\7\7\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00b4\5\b\5\2\u00b2\u00b4\7\36\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b7\5\n"+
		"\6\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00ad\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bd\3\2\2\2\u00ba\u00bc\7\7"+
		"\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\27\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\7\37\2"+
		"\2\u00c1\u00c3\5\4\3\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7 \2\2\u00c7"+
		"\31\3\2\2\2\u00c8\u00ca\7\f\2\2\u00c9\u00cb\5\26\f\2\u00ca\u00c9\3\2\2"+
		"\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00d1\7\23\2\2\u00cf\u00d2\5\30\r\2\u00d0\u00d2\5\4\3\2"+
		"\u00d1\u00cf\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2\33\3\2\2\2\u00d3\u00d4"+
		"\7\r\2\2\u00d4\u00d5\7\36\2\2\u00d5\u00d9\7\16\2\2\u00d6\u00da\5\b\5\2"+
		"\u00d7\u00da\7\36\2\2\u00d8\u00da\5 \21\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00de\7\23\2\2"+
		"\u00dc\u00df\5\30\r\2\u00dd\u00df\5\4\3\2\u00de\u00dc\3\2\2\2\u00de\u00dd"+
		"\3\2\2\2\u00df\35\3\2\2\2\u00e0\u00e1\7\22\2\2\u00e1\u00e2\7\36\2\2\u00e2"+
		"\u00e3\7\3\2\2\u00e3\u00e4\5\"\22\2\u00e4\u00e5\7\4\2\2\u00e5\u00e8\7"+
		"\23\2\2\u00e6\u00e9\5\30\r\2\u00e7\u00e9\5\4\3\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9\37\3\2\2\2\u00ea\u00eb\7\36\2\2\u00eb\u00fa\7\3\2"+
		"\2\u00ec\u00ef\7\36\2\2\u00ed\u00ef\5\b\5\2\u00ee\u00ec\3\2\2\2\u00ee"+
		"\u00ed\3\2\2\2\u00ef\u00f7\3\2\2\2\u00f0\u00f3\7\5\2\2\u00f1\u00f4\7\36"+
		"\2\2\u00f2\u00f4\5\b\5\2\u00f3\u00f1\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\u00ee\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7\4"+
		"\2\2\u00fd!\3\2\2\2\u00fe\u0101\7\36\2\2\u00ff\u0100\7\b\2\2\u0100\u0102"+
		"\5\b\5\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0104\7\5\2\2\u0104\u0106\5\"\22\2\u0105\u0103\3\2\2\2\u0105\u0106\3"+
		"\2\2\2\u0106#\3\2\2\2\u0107\u0108\7\35\2\2\u0108%\3\2\2\2\u0109\u0112"+
		"\7\17\2\2\u010a\u0112\7\20\2\2\u010b\u010f\7\21\2\2\u010c\u0110\7\36\2"+
		"\2\u010d\u0110\5\b\5\2\u010e\u0110\5\n\6\2\u010f\u010c\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u010f\u010e\3\2\2\2\u0110\u0112\3\2\2\2\u0111\u0109\3\2\2\2\u0111"+
		"\u010a\3\2\2\2\u0111\u010b\3\2\2\2\u0112\'\3\2\2\2\61+\62\659<@CGJNRV"+
		"[^fkms\u0080\u0086\u008b\u0091\u0096\u009a\u00a1\u00a4\u00a8\u00ab\u00af"+
		"\u00b3\u00b6\u00b8\u00bd\u00c4\u00cc\u00d1\u00d9\u00de\u00e8\u00ee\u00f3"+
		"\u00f7\u00fa\u0101\u0105\u010f\u0111";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}