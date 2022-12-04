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


 using AntlrCSharp;
 
using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.2")]
[System.CLSCompliant(false)]
public partial class FinalLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		T__0=1, T__1=2, T__2=3, NL=4, CON=5, EQU=6, IF=7, ELIF=8, ELSE=9, WHILE=10, 
		FOR=11, IN=12, BREAK=13, CONTINUE=14, RETURN=15, DEF=16, END=17, NEWLINE=18, 
		WS=19, EQUALS=20, STAR=21, ARITHMETIC=22, INTEGER=23, BOOLEAN=24, FLOATS=25, 
		STRING=26, COMMENT=27, ID=28;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"T__0", "T__1", "T__2", "NL", "LOWERCASE", "UPPERCASE", "CON", "EQU", 
		"IF", "ELIF", "ELSE", "WHILE", "FOR", "IN", "BREAK", "CONTINUE", "RETURN", 
		"DEF", "END", "NEWLINE", "WS", "EQUALS", "STAR", "ARITHMETIC", "INTEGER", 
		"BOOLEAN", "FLOATS", "STRING", "COMMENT", "ID"
	};


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
	 

	public FinalLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public FinalLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "'('", "')'", "','", null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "'*'"
	};
	private static readonly string[] _SymbolicNames = {
		null, null, null, null, "NL", "CON", "EQU", "IF", "ELIF", "ELSE", "WHILE", 
		"FOR", "IN", "BREAK", "CONTINUE", "RETURN", "DEF", "END", "NEWLINE", "WS", 
		"EQUALS", "STAR", "ARITHMETIC", "INTEGER", "BOOLEAN", "FLOATS", "STRING", 
		"COMMENT", "ID"
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

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static FinalLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', '\x1E', '\xF8', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
		'\x4', '\x3', '\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', 
		'\x5', '\x4', '\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', 
		'\t', '\b', '\x4', '\t', '\t', '\t', '\x4', '\n', '\t', '\n', '\x4', '\v', 
		'\t', '\v', '\x4', '\f', '\t', '\f', '\x4', '\r', '\t', '\r', '\x4', '\xE', 
		'\t', '\xE', '\x4', '\xF', '\t', '\xF', '\x4', '\x10', '\t', '\x10', '\x4', 
		'\x11', '\t', '\x11', '\x4', '\x12', '\t', '\x12', '\x4', '\x13', '\t', 
		'\x13', '\x4', '\x14', '\t', '\x14', '\x4', '\x15', '\t', '\x15', '\x4', 
		'\x16', '\t', '\x16', '\x4', '\x17', '\t', '\x17', '\x4', '\x18', '\t', 
		'\x18', '\x4', '\x19', '\t', '\x19', '\x4', '\x1A', '\t', '\x1A', '\x4', 
		'\x1B', '\t', '\x1B', '\x4', '\x1C', '\t', '\x1C', '\x4', '\x1D', '\t', 
		'\x1D', '\x4', '\x1E', '\t', '\x1E', '\x4', '\x1F', '\t', '\x1F', '\x3', 
		'\x2', '\x3', '\x2', '\x3', '\x3', '\x3', '\x3', '\x3', '\x4', '\x3', 
		'\x4', '\x3', '\x5', '\a', '\x5', 'G', '\n', '\x5', '\f', '\x5', '\xE', 
		'\x5', 'J', '\v', '\x5', '\x3', '\x5', '\x3', '\x5', '\a', '\x5', 'N', 
		'\n', '\x5', '\f', '\x5', '\xE', '\x5', 'Q', '\v', '\x5', '\x3', '\x6', 
		'\x3', '\x6', '\x3', '\a', '\x3', '\a', '\x3', '\b', '\x3', '\b', '\x3', 
		'\b', '\x3', '\b', '\x3', '\b', '\x3', '\b', '\x3', '\b', '\x3', '\b', 
		'\x5', '\b', '_', '\n', '\b', '\x3', '\t', '\x3', '\t', '\x3', '\t', '\x3', 
		'\t', '\x3', '\t', '\x3', '\t', '\x3', '\t', '\x3', '\t', '\x3', '\t', 
		'\x3', '\t', '\x5', '\t', 'k', '\n', '\t', '\x3', '\n', '\x3', '\n', '\x3', 
		'\n', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', '\x3', '\v', 
		'\x3', '\f', '\x3', '\f', '\x3', '\f', '\x3', '\f', '\x3', '\f', '\x3', 
		'\r', '\x3', '\r', '\x3', '\r', '\x3', '\r', '\x3', '\r', '\x3', '\r', 
		'\x3', '\xE', '\x3', '\xE', '\x3', '\xE', '\x3', '\xE', '\x3', '\xF', 
		'\x3', '\xF', '\x3', '\xF', '\x3', '\x10', '\x3', '\x10', '\x3', '\x10', 
		'\x3', '\x10', '\x3', '\x10', '\x3', '\x10', '\x3', '\x11', '\x3', '\x11', 
		'\x3', '\x11', '\x3', '\x11', '\x3', '\x11', '\x3', '\x11', '\x3', '\x11', 
		'\x3', '\x11', '\x3', '\x11', '\x3', '\x12', '\x3', '\x12', '\x3', '\x12', 
		'\x3', '\x12', '\x3', '\x12', '\x3', '\x12', '\x3', '\x12', '\x3', '\x13', 
		'\x3', '\x13', '\x3', '\x13', '\x3', '\x13', '\x3', '\x14', '\x3', '\x14', 
		'\x3', '\x15', '\x6', '\x15', '\xA4', '\n', '\x15', '\r', '\x15', '\xE', 
		'\x15', '\xA5', '\x3', '\x16', '\x6', '\x16', '\xA9', '\n', '\x16', '\r', 
		'\x16', '\xE', '\x16', '\xAA', '\x3', '\x16', '\x3', '\x16', '\x3', '\x17', 
		'\x3', '\x17', '\x3', '\x18', '\x3', '\x18', '\x3', '\x19', '\x3', '\x19', 
		'\x3', '\x19', '\x5', '\x19', '\xB6', '\n', '\x19', '\x3', '\x1A', '\x5', 
		'\x1A', '\xB9', '\n', '\x1A', '\x3', '\x1A', '\x6', '\x1A', '\xBC', '\n', 
		'\x1A', '\r', '\x1A', '\xE', '\x1A', '\xBD', '\x3', '\x1B', '\x3', '\x1B', 
		'\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1B', 
		'\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1B', 
		'\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1B', 
		'\x3', '\x1B', '\x5', '\x1B', '\xD2', '\n', '\x1B', '\x3', '\x1C', '\x5', 
		'\x1C', '\xD5', '\n', '\x1C', '\x3', '\x1C', '\a', '\x1C', '\xD8', '\n', 
		'\x1C', '\f', '\x1C', '\xE', '\x1C', '\xDB', '\v', '\x1C', '\x3', '\x1C', 
		'\x3', '\x1C', '\x6', '\x1C', '\xDF', '\n', '\x1C', '\r', '\x1C', '\xE', 
		'\x1C', '\xE0', '\x3', '\x1D', '\x3', '\x1D', '\a', '\x1D', '\xE5', '\n', 
		'\x1D', '\f', '\x1D', '\xE', '\x1D', '\xE8', '\v', '\x1D', '\x3', '\x1D', 
		'\x3', '\x1D', '\x3', '\x1E', '\x3', '\x1E', '\a', '\x1E', '\xEE', '\n', 
		'\x1E', '\f', '\x1E', '\xE', '\x1E', '\xF1', '\v', '\x1E', '\x3', '\x1F', 
		'\x3', '\x1F', '\x6', '\x1F', '\xF5', '\n', '\x1F', '\r', '\x1F', '\xE', 
		'\x1F', '\xF6', '\x3', '\xE6', '\x2', ' ', '\x3', '\x3', '\x5', '\x4', 
		'\a', '\x5', '\t', '\x6', '\v', '\x2', '\r', '\x2', '\xF', '\a', '\x11', 
		'\b', '\x13', '\t', '\x15', '\n', '\x17', '\v', '\x19', '\f', '\x1B', 
		'\r', '\x1D', '\xE', '\x1F', '\xF', '!', '\x10', '#', '\x11', '%', '\x12', 
		'\'', '\x13', ')', '\x14', '+', '\x15', '-', '\x16', '/', '\x17', '\x31', 
		'\x18', '\x33', '\x19', '\x35', '\x1A', '\x37', '\x1B', '\x39', '\x1C', 
		';', '\x1D', '=', '\x1E', '\x3', '\x2', '\t', '\x3', '\x2', '\x63', '|', 
		'\x3', '\x2', '\x43', '\\', '\x4', '\x2', '\f', '\f', '\xF', '\xF', '\x3', 
		'\x2', '\"', '\"', '\x4', '\x2', '-', '-', '/', '/', '\x4', '\x2', '\'', 
		'\'', '\x31', '\x31', '\x3', '\x2', '\x32', ';', '\x2', '\x10E', '\x2', 
		'\x3', '\x3', '\x2', '\x2', '\x2', '\x2', '\x5', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\a', '\x3', '\x2', '\x2', '\x2', '\x2', '\t', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\xF', '\x3', '\x2', '\x2', '\x2', '\x2', '\x11', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x13', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x15', '\x3', '\x2', '\x2', '\x2', '\x2', '\x17', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x19', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1B', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x1D', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x1F', '\x3', '\x2', '\x2', '\x2', '\x2', '!', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '#', '\x3', '\x2', '\x2', '\x2', '\x2', '%', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\'', '\x3', '\x2', '\x2', '\x2', '\x2', ')', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '+', '\x3', '\x2', '\x2', '\x2', '\x2', '-', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '/', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x31', '\x3', '\x2', '\x2', '\x2', '\x2', '\x33', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x35', '\x3', '\x2', '\x2', '\x2', '\x2', '\x37', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x39', '\x3', '\x2', '\x2', '\x2', '\x2', 
		';', '\x3', '\x2', '\x2', '\x2', '\x2', '=', '\x3', '\x2', '\x2', '\x2', 
		'\x3', '?', '\x3', '\x2', '\x2', '\x2', '\x5', '\x41', '\x3', '\x2', '\x2', 
		'\x2', '\a', '\x43', '\x3', '\x2', '\x2', '\x2', '\t', 'H', '\x3', '\x2', 
		'\x2', '\x2', '\v', 'R', '\x3', '\x2', '\x2', '\x2', '\r', 'T', '\x3', 
		'\x2', '\x2', '\x2', '\xF', '^', '\x3', '\x2', '\x2', '\x2', '\x11', 'j', 
		'\x3', '\x2', '\x2', '\x2', '\x13', 'l', '\x3', '\x2', '\x2', '\x2', '\x15', 
		'o', '\x3', '\x2', '\x2', '\x2', '\x17', 't', '\x3', '\x2', '\x2', '\x2', 
		'\x19', 'y', '\x3', '\x2', '\x2', '\x2', '\x1B', '\x7F', '\x3', '\x2', 
		'\x2', '\x2', '\x1D', '\x83', '\x3', '\x2', '\x2', '\x2', '\x1F', '\x86', 
		'\x3', '\x2', '\x2', '\x2', '!', '\x8C', '\x3', '\x2', '\x2', '\x2', '#', 
		'\x95', '\x3', '\x2', '\x2', '\x2', '%', '\x9C', '\x3', '\x2', '\x2', 
		'\x2', '\'', '\xA0', '\x3', '\x2', '\x2', '\x2', ')', '\xA3', '\x3', '\x2', 
		'\x2', '\x2', '+', '\xA8', '\x3', '\x2', '\x2', '\x2', '-', '\xAE', '\x3', 
		'\x2', '\x2', '\x2', '/', '\xB0', '\x3', '\x2', '\x2', '\x2', '\x31', 
		'\xB5', '\x3', '\x2', '\x2', '\x2', '\x33', '\xB8', '\x3', '\x2', '\x2', 
		'\x2', '\x35', '\xD1', '\x3', '\x2', '\x2', '\x2', '\x37', '\xD4', '\x3', 
		'\x2', '\x2', '\x2', '\x39', '\xE2', '\x3', '\x2', '\x2', '\x2', ';', 
		'\xEB', '\x3', '\x2', '\x2', '\x2', '=', '\xF4', '\x3', '\x2', '\x2', 
		'\x2', '?', '@', '\a', '*', '\x2', '\x2', '@', '\x4', '\x3', '\x2', '\x2', 
		'\x2', '\x41', '\x42', '\a', '+', '\x2', '\x2', '\x42', '\x6', '\x3', 
		'\x2', '\x2', '\x2', '\x43', '\x44', '\a', '.', '\x2', '\x2', '\x44', 
		'\b', '\x3', '\x2', '\x2', '\x2', '\x45', 'G', '\a', '\xF', '\x2', '\x2', 
		'\x46', '\x45', '\x3', '\x2', '\x2', '\x2', 'G', 'J', '\x3', '\x2', '\x2', 
		'\x2', 'H', '\x46', '\x3', '\x2', '\x2', '\x2', 'H', 'I', '\x3', '\x2', 
		'\x2', '\x2', 'I', 'K', '\x3', '\x2', '\x2', '\x2', 'J', 'H', '\x3', '\x2', 
		'\x2', '\x2', 'K', 'O', '\a', '\f', '\x2', '\x2', 'L', 'N', '\a', '\v', 
		'\x2', '\x2', 'M', 'L', '\x3', '\x2', '\x2', '\x2', 'N', 'Q', '\x3', '\x2', 
		'\x2', '\x2', 'O', 'M', '\x3', '\x2', '\x2', '\x2', 'O', 'P', '\x3', '\x2', 
		'\x2', '\x2', 'P', '\n', '\x3', '\x2', '\x2', '\x2', 'Q', 'O', '\x3', 
		'\x2', '\x2', '\x2', 'R', 'S', '\t', '\x2', '\x2', '\x2', 'S', '\f', '\x3', 
		'\x2', '\x2', '\x2', 'T', 'U', '\t', '\x3', '\x2', '\x2', 'U', '\xE', 
		'\x3', '\x2', '\x2', '\x2', 'V', 'W', '\a', '\x63', '\x2', '\x2', 'W', 
		'X', '\a', 'p', '\x2', '\x2', 'X', '_', '\a', '\x66', '\x2', '\x2', 'Y', 
		'Z', '\a', 'q', '\x2', '\x2', 'Z', '_', '\a', 't', '\x2', '\x2', '[', 
		'\\', '\a', 'p', '\x2', '\x2', '\\', ']', '\a', 'q', '\x2', '\x2', ']', 
		'_', '\a', 'v', '\x2', '\x2', '^', 'V', '\x3', '\x2', '\x2', '\x2', '^', 
		'Y', '\x3', '\x2', '\x2', '\x2', '^', '[', '\x3', '\x2', '\x2', '\x2', 
		'_', '\x10', '\x3', '\x2', '\x2', '\x2', '`', '\x61', '\a', '?', '\x2', 
		'\x2', '\x61', 'k', '\a', '?', '\x2', '\x2', '\x62', '\x63', '\a', '#', 
		'\x2', '\x2', '\x63', 'k', '\a', '?', '\x2', '\x2', '\x64', 'k', '\a', 
		'>', '\x2', '\x2', '\x65', '\x66', '\a', '>', '\x2', '\x2', '\x66', 'k', 
		'\a', '?', '\x2', '\x2', 'g', 'k', '\a', '@', '\x2', '\x2', 'h', 'i', 
		'\a', '@', '\x2', '\x2', 'i', 'k', '\a', '?', '\x2', '\x2', 'j', '`', 
		'\x3', '\x2', '\x2', '\x2', 'j', '\x62', '\x3', '\x2', '\x2', '\x2', 'j', 
		'\x64', '\x3', '\x2', '\x2', '\x2', 'j', '\x65', '\x3', '\x2', '\x2', 
		'\x2', 'j', 'g', '\x3', '\x2', '\x2', '\x2', 'j', 'h', '\x3', '\x2', '\x2', 
		'\x2', 'k', '\x12', '\x3', '\x2', '\x2', '\x2', 'l', 'm', '\a', 'k', '\x2', 
		'\x2', 'm', 'n', '\a', 'h', '\x2', '\x2', 'n', '\x14', '\x3', '\x2', '\x2', 
		'\x2', 'o', 'p', '\a', 'g', '\x2', '\x2', 'p', 'q', '\a', 'n', '\x2', 
		'\x2', 'q', 'r', '\a', 'k', '\x2', '\x2', 'r', 's', '\a', 'h', '\x2', 
		'\x2', 's', '\x16', '\x3', '\x2', '\x2', '\x2', 't', 'u', '\a', 'g', '\x2', 
		'\x2', 'u', 'v', '\a', 'n', '\x2', '\x2', 'v', 'w', '\a', 'u', '\x2', 
		'\x2', 'w', 'x', '\a', 'g', '\x2', '\x2', 'x', '\x18', '\x3', '\x2', '\x2', 
		'\x2', 'y', 'z', '\a', 'y', '\x2', '\x2', 'z', '{', '\a', 'j', '\x2', 
		'\x2', '{', '|', '\a', 'k', '\x2', '\x2', '|', '}', '\a', 'n', '\x2', 
		'\x2', '}', '~', '\a', 'g', '\x2', '\x2', '~', '\x1A', '\x3', '\x2', '\x2', 
		'\x2', '\x7F', '\x80', '\a', 'h', '\x2', '\x2', '\x80', '\x81', '\a', 
		'q', '\x2', '\x2', '\x81', '\x82', '\a', 't', '\x2', '\x2', '\x82', '\x1C', 
		'\x3', '\x2', '\x2', '\x2', '\x83', '\x84', '\a', 'k', '\x2', '\x2', '\x84', 
		'\x85', '\a', 'p', '\x2', '\x2', '\x85', '\x1E', '\x3', '\x2', '\x2', 
		'\x2', '\x86', '\x87', '\a', '\x64', '\x2', '\x2', '\x87', '\x88', '\a', 
		't', '\x2', '\x2', '\x88', '\x89', '\a', 'g', '\x2', '\x2', '\x89', '\x8A', 
		'\a', '\x63', '\x2', '\x2', '\x8A', '\x8B', '\a', 'm', '\x2', '\x2', '\x8B', 
		' ', '\x3', '\x2', '\x2', '\x2', '\x8C', '\x8D', '\a', '\x65', '\x2', 
		'\x2', '\x8D', '\x8E', '\a', 'q', '\x2', '\x2', '\x8E', '\x8F', '\a', 
		'p', '\x2', '\x2', '\x8F', '\x90', '\a', 'v', '\x2', '\x2', '\x90', '\x91', 
		'\a', 'k', '\x2', '\x2', '\x91', '\x92', '\a', 'p', '\x2', '\x2', '\x92', 
		'\x93', '\a', 'w', '\x2', '\x2', '\x93', '\x94', '\a', 'g', '\x2', '\x2', 
		'\x94', '\"', '\x3', '\x2', '\x2', '\x2', '\x95', '\x96', '\a', 't', '\x2', 
		'\x2', '\x96', '\x97', '\a', 'g', '\x2', '\x2', '\x97', '\x98', '\a', 
		'v', '\x2', '\x2', '\x98', '\x99', '\a', 'w', '\x2', '\x2', '\x99', '\x9A', 
		'\a', 't', '\x2', '\x2', '\x9A', '\x9B', '\a', 'p', '\x2', '\x2', '\x9B', 
		'$', '\x3', '\x2', '\x2', '\x2', '\x9C', '\x9D', '\a', '\x66', '\x2', 
		'\x2', '\x9D', '\x9E', '\a', 'g', '\x2', '\x2', '\x9E', '\x9F', '\a', 
		'h', '\x2', '\x2', '\x9F', '&', '\x3', '\x2', '\x2', '\x2', '\xA0', '\xA1', 
		'\a', '<', '\x2', '\x2', '\xA1', '(', '\x3', '\x2', '\x2', '\x2', '\xA2', 
		'\xA4', '\t', '\x4', '\x2', '\x2', '\xA3', '\xA2', '\x3', '\x2', '\x2', 
		'\x2', '\xA4', '\xA5', '\x3', '\x2', '\x2', '\x2', '\xA5', '\xA3', '\x3', 
		'\x2', '\x2', '\x2', '\xA5', '\xA6', '\x3', '\x2', '\x2', '\x2', '\xA6', 
		'*', '\x3', '\x2', '\x2', '\x2', '\xA7', '\xA9', '\t', '\x5', '\x2', '\x2', 
		'\xA8', '\xA7', '\x3', '\x2', '\x2', '\x2', '\xA9', '\xAA', '\x3', '\x2', 
		'\x2', '\x2', '\xAA', '\xA8', '\x3', '\x2', '\x2', '\x2', '\xAA', '\xAB', 
		'\x3', '\x2', '\x2', '\x2', '\xAB', '\xAC', '\x3', '\x2', '\x2', '\x2', 
		'\xAC', '\xAD', '\b', '\x16', '\x2', '\x2', '\xAD', ',', '\x3', '\x2', 
		'\x2', '\x2', '\xAE', '\xAF', '\a', '?', '\x2', '\x2', '\xAF', '.', '\x3', 
		'\x2', '\x2', '\x2', '\xB0', '\xB1', '\a', ',', '\x2', '\x2', '\xB1', 
		'\x30', '\x3', '\x2', '\x2', '\x2', '\xB2', '\xB6', '\t', '\x6', '\x2', 
		'\x2', '\xB3', '\xB6', '\x5', '/', '\x18', '\x2', '\xB4', '\xB6', '\t', 
		'\a', '\x2', '\x2', '\xB5', '\xB2', '\x3', '\x2', '\x2', '\x2', '\xB5', 
		'\xB3', '\x3', '\x2', '\x2', '\x2', '\xB5', '\xB4', '\x3', '\x2', '\x2', 
		'\x2', '\xB6', '\x32', '\x3', '\x2', '\x2', '\x2', '\xB7', '\xB9', '\a', 
		'/', '\x2', '\x2', '\xB8', '\xB7', '\x3', '\x2', '\x2', '\x2', '\xB8', 
		'\xB9', '\x3', '\x2', '\x2', '\x2', '\xB9', '\xBB', '\x3', '\x2', '\x2', 
		'\x2', '\xBA', '\xBC', '\t', '\b', '\x2', '\x2', '\xBB', '\xBA', '\x3', 
		'\x2', '\x2', '\x2', '\xBC', '\xBD', '\x3', '\x2', '\x2', '\x2', '\xBD', 
		'\xBB', '\x3', '\x2', '\x2', '\x2', '\xBD', '\xBE', '\x3', '\x2', '\x2', 
		'\x2', '\xBE', '\x34', '\x3', '\x2', '\x2', '\x2', '\xBF', '\xC0', '\a', 
		'V', '\x2', '\x2', '\xC0', '\xC1', '\a', 't', '\x2', '\x2', '\xC1', '\xC2', 
		'\a', 'w', '\x2', '\x2', '\xC2', '\xD2', '\a', 'g', '\x2', '\x2', '\xC3', 
		'\xC4', '\a', 'v', '\x2', '\x2', '\xC4', '\xC5', '\a', 't', '\x2', '\x2', 
		'\xC5', '\xC6', '\a', 'w', '\x2', '\x2', '\xC6', '\xD2', '\a', 'g', '\x2', 
		'\x2', '\xC7', '\xC8', '\a', 'H', '\x2', '\x2', '\xC8', '\xC9', '\a', 
		'\x63', '\x2', '\x2', '\xC9', '\xCA', '\a', 'n', '\x2', '\x2', '\xCA', 
		'\xCB', '\a', 'u', '\x2', '\x2', '\xCB', '\xD2', '\a', 'g', '\x2', '\x2', 
		'\xCC', '\xCD', '\a', 'h', '\x2', '\x2', '\xCD', '\xCE', '\a', '\x63', 
		'\x2', '\x2', '\xCE', '\xCF', '\a', 'n', '\x2', '\x2', '\xCF', '\xD0', 
		'\a', 'u', '\x2', '\x2', '\xD0', '\xD2', '\a', 'g', '\x2', '\x2', '\xD1', 
		'\xBF', '\x3', '\x2', '\x2', '\x2', '\xD1', '\xC3', '\x3', '\x2', '\x2', 
		'\x2', '\xD1', '\xC7', '\x3', '\x2', '\x2', '\x2', '\xD1', '\xCC', '\x3', 
		'\x2', '\x2', '\x2', '\xD2', '\x36', '\x3', '\x2', '\x2', '\x2', '\xD3', 
		'\xD5', '\a', '/', '\x2', '\x2', '\xD4', '\xD3', '\x3', '\x2', '\x2', 
		'\x2', '\xD4', '\xD5', '\x3', '\x2', '\x2', '\x2', '\xD5', '\xD9', '\x3', 
		'\x2', '\x2', '\x2', '\xD6', '\xD8', '\t', '\b', '\x2', '\x2', '\xD7', 
		'\xD6', '\x3', '\x2', '\x2', '\x2', '\xD8', '\xDB', '\x3', '\x2', '\x2', 
		'\x2', '\xD9', '\xD7', '\x3', '\x2', '\x2', '\x2', '\xD9', '\xDA', '\x3', 
		'\x2', '\x2', '\x2', '\xDA', '\xDC', '\x3', '\x2', '\x2', '\x2', '\xDB', 
		'\xD9', '\x3', '\x2', '\x2', '\x2', '\xDC', '\xDE', '\a', '\x30', '\x2', 
		'\x2', '\xDD', '\xDF', '\t', '\b', '\x2', '\x2', '\xDE', '\xDD', '\x3', 
		'\x2', '\x2', '\x2', '\xDF', '\xE0', '\x3', '\x2', '\x2', '\x2', '\xE0', 
		'\xDE', '\x3', '\x2', '\x2', '\x2', '\xE0', '\xE1', '\x3', '\x2', '\x2', 
		'\x2', '\xE1', '\x38', '\x3', '\x2', '\x2', '\x2', '\xE2', '\xE6', '\a', 
		'$', '\x2', '\x2', '\xE3', '\xE5', '\v', '\x2', '\x2', '\x2', '\xE4', 
		'\xE3', '\x3', '\x2', '\x2', '\x2', '\xE5', '\xE8', '\x3', '\x2', '\x2', 
		'\x2', '\xE6', '\xE7', '\x3', '\x2', '\x2', '\x2', '\xE6', '\xE4', '\x3', 
		'\x2', '\x2', '\x2', '\xE7', '\xE9', '\x3', '\x2', '\x2', '\x2', '\xE8', 
		'\xE6', '\x3', '\x2', '\x2', '\x2', '\xE9', '\xEA', '\a', '$', '\x2', 
		'\x2', '\xEA', ':', '\x3', '\x2', '\x2', '\x2', '\xEB', '\xEF', '\a', 
		'%', '\x2', '\x2', '\xEC', '\xEE', '\n', '\x4', '\x2', '\x2', '\xED', 
		'\xEC', '\x3', '\x2', '\x2', '\x2', '\xEE', '\xF1', '\x3', '\x2', '\x2', 
		'\x2', '\xEF', '\xED', '\x3', '\x2', '\x2', '\x2', '\xEF', '\xF0', '\x3', 
		'\x2', '\x2', '\x2', '\xF0', '<', '\x3', '\x2', '\x2', '\x2', '\xF1', 
		'\xEF', '\x3', '\x2', '\x2', '\x2', '\xF2', '\xF5', '\x5', '\v', '\x6', 
		'\x2', '\xF3', '\xF5', '\x5', '\r', '\a', '\x2', '\xF4', '\xF2', '\x3', 
		'\x2', '\x2', '\x2', '\xF4', '\xF3', '\x3', '\x2', '\x2', '\x2', '\xF5', 
		'\xF6', '\x3', '\x2', '\x2', '\x2', '\xF6', '\xF4', '\x3', '\x2', '\x2', 
		'\x2', '\xF6', '\xF7', '\x3', '\x2', '\x2', '\x2', '\xF7', '>', '\x3', 
		'\x2', '\x2', '\x2', '\x14', '\x2', 'H', 'O', '^', 'j', '\xA5', '\xAA', 
		'\xB5', '\xB8', '\xBD', '\xD1', '\xD4', '\xD9', '\xE0', '\xE6', '\xEF', 
		'\xF4', '\xF6', '\x3', '\b', '\x2', '\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
