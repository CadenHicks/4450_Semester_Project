//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.2
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from Final.g4 by ANTLR 4.9.2

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using System.Diagnostics;
using System.Collections.Generic;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.2")]
[System.CLSCompliant(false)]
public partial class FinalParser : Parser {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		EQUALS=1, ARITHMETIC=2, INTEGER=3, ID=4;
	public const int
		RULE_assign = 0, RULE_arithmetic = 1;
	public static readonly string[] ruleNames = {
		"assign", "arithmetic"
	};

	private static readonly string[] _LiteralNames = {
	};
	private static readonly string[] _SymbolicNames = {
		null, "EQUALS", "ARITHMETIC", "INTEGER", "ID"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "Final.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static FinalParser() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}

		public FinalParser(ITokenStream input) : this(input, Console.Out, Console.Error) { }

		public FinalParser(ITokenStream input, TextWriter output, TextWriter errorOutput)
		: base(input, output, errorOutput)
	{
		Interpreter = new ParserATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	public partial class AssignContext : ParserRuleContext {
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode EQUALS() { return GetToken(FinalParser.EQUALS, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode[] INTEGER() { return GetTokens(FinalParser.INTEGER); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode INTEGER(int i) {
			return GetToken(FinalParser.INTEGER, i);
		}
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode[] ID() { return GetTokens(FinalParser.ID); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode ID(int i) {
			return GetToken(FinalParser.ID, i);
		}
		[System.Diagnostics.DebuggerNonUserCode] public ArithmeticContext arithmetic() {
			return GetRuleContext<ArithmeticContext>(0);
		}
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode ARITHMETIC() { return GetToken(FinalParser.ARITHMETIC, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_assign; } }
		[System.Diagnostics.DebuggerNonUserCode]
		public override void EnterRule(IParseTreeListener listener) {
			IFinalListener typedListener = listener as IFinalListener;
			if (typedListener != null) typedListener.EnterAssign(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override void ExitRule(IParseTreeListener listener) {
			IFinalListener typedListener = listener as IFinalListener;
			if (typedListener != null) typedListener.ExitAssign(this);
		}
	}

	[RuleVersion(0)]
	public AssignContext assign() {
		AssignContext _localctx = new AssignContext(Context, State);
		EnterRule(_localctx, 0, RULE_assign);
		int _la;
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 4;
			_la = TokenStream.LA(1);
			if ( !(_la==INTEGER || _la==ID) ) {
			ErrorHandler.RecoverInline(this);
			}
			else {
				ErrorHandler.ReportMatch(this);
			    Consume();
			}
			State = 6;
			ErrorHandler.Sync(this);
			_la = TokenStream.LA(1);
			if (_la==ARITHMETIC) {
				{
				State = 5;
				Match(ARITHMETIC);
				}
			}

			State = 8;
			Match(EQUALS);
			State = 12;
			ErrorHandler.Sync(this);
			switch ( Interpreter.AdaptivePredict(TokenStream,1,Context) ) {
			case 1:
				{
				State = 9;
				arithmetic();
				}
				break;
			case 2:
				{
				State = 10;
				Match(INTEGER);
				}
				break;
			case 3:
				{
				State = 11;
				Match(ID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	public partial class ArithmeticContext : ParserRuleContext {
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode ARITHMETIC() { return GetToken(FinalParser.ARITHMETIC, 0); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode[] INTEGER() { return GetTokens(FinalParser.INTEGER); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode INTEGER(int i) {
			return GetToken(FinalParser.INTEGER, i);
		}
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode[] ID() { return GetTokens(FinalParser.ID); }
		[System.Diagnostics.DebuggerNonUserCode] public ITerminalNode ID(int i) {
			return GetToken(FinalParser.ID, i);
		}
		[System.Diagnostics.DebuggerNonUserCode] public ArithmeticContext arithmetic() {
			return GetRuleContext<ArithmeticContext>(0);
		}
		public ArithmeticContext(ParserRuleContext parent, int invokingState)
			: base(parent, invokingState)
		{
		}
		public override int RuleIndex { get { return RULE_arithmetic; } }
		[System.Diagnostics.DebuggerNonUserCode]
		public override void EnterRule(IParseTreeListener listener) {
			IFinalListener typedListener = listener as IFinalListener;
			if (typedListener != null) typedListener.EnterArithmetic(this);
		}
		[System.Diagnostics.DebuggerNonUserCode]
		public override void ExitRule(IParseTreeListener listener) {
			IFinalListener typedListener = listener as IFinalListener;
			if (typedListener != null) typedListener.ExitArithmetic(this);
		}
	}

	[RuleVersion(0)]
	public ArithmeticContext arithmetic() {
		ArithmeticContext _localctx = new ArithmeticContext(Context, State);
		EnterRule(_localctx, 2, RULE_arithmetic);
		int _la;
		try {
			EnterOuterAlt(_localctx, 1);
			{
			State = 14;
			_la = TokenStream.LA(1);
			if ( !(_la==INTEGER || _la==ID) ) {
			ErrorHandler.RecoverInline(this);
			}
			else {
				ErrorHandler.ReportMatch(this);
			    Consume();
			}
			State = 15;
			Match(ARITHMETIC);
			State = 19;
			ErrorHandler.Sync(this);
			switch ( Interpreter.AdaptivePredict(TokenStream,2,Context) ) {
			case 1:
				{
				State = 16;
				arithmetic();
				}
				break;
			case 2:
				{
				State = 17;
				Match(INTEGER);
				}
				break;
			case 3:
				{
				State = 18;
				Match(ID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			ErrorHandler.ReportError(this, re);
			ErrorHandler.Recover(this, re);
		}
		finally {
			ExitRule();
		}
		return _localctx;
	}

	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x3', '\x6', '\x18', '\x4', '\x2', '\t', '\x2', '\x4', '\x3', 
		'\t', '\x3', '\x3', '\x2', '\x3', '\x2', '\x5', '\x2', '\t', '\n', '\x2', 
		'\x3', '\x2', '\x3', '\x2', '\x3', '\x2', '\x3', '\x2', '\x5', '\x2', 
		'\xF', '\n', '\x2', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', '\x3', 
		'\x3', '\x3', '\x5', '\x3', '\x16', '\n', '\x3', '\x3', '\x3', '\x2', 
		'\x2', '\x4', '\x2', '\x4', '\x2', '\x3', '\x3', '\x2', '\x5', '\x6', 
		'\x2', '\x1A', '\x2', '\x6', '\x3', '\x2', '\x2', '\x2', '\x4', '\x10', 
		'\x3', '\x2', '\x2', '\x2', '\x6', '\b', '\t', '\x2', '\x2', '\x2', '\a', 
		'\t', '\a', '\x4', '\x2', '\x2', '\b', '\a', '\x3', '\x2', '\x2', '\x2', 
		'\b', '\t', '\x3', '\x2', '\x2', '\x2', '\t', '\n', '\x3', '\x2', '\x2', 
		'\x2', '\n', '\xE', '\a', '\x3', '\x2', '\x2', '\v', '\xF', '\x5', '\x4', 
		'\x3', '\x2', '\f', '\xF', '\a', '\x5', '\x2', '\x2', '\r', '\xF', '\a', 
		'\x6', '\x2', '\x2', '\xE', '\v', '\x3', '\x2', '\x2', '\x2', '\xE', '\f', 
		'\x3', '\x2', '\x2', '\x2', '\xE', '\r', '\x3', '\x2', '\x2', '\x2', '\xF', 
		'\x3', '\x3', '\x2', '\x2', '\x2', '\x10', '\x11', '\t', '\x2', '\x2', 
		'\x2', '\x11', '\x15', '\a', '\x4', '\x2', '\x2', '\x12', '\x16', '\x5', 
		'\x4', '\x3', '\x2', '\x13', '\x16', '\a', '\x5', '\x2', '\x2', '\x14', 
		'\x16', '\a', '\x6', '\x2', '\x2', '\x15', '\x12', '\x3', '\x2', '\x2', 
		'\x2', '\x15', '\x13', '\x3', '\x2', '\x2', '\x2', '\x15', '\x14', '\x3', 
		'\x2', '\x2', '\x2', '\x16', '\x5', '\x3', '\x2', '\x2', '\x2', '\x5', 
		'\b', '\xE', '\x15',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}