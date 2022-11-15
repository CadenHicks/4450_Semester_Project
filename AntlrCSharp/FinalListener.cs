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

using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="FinalParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.2")]
[System.CLSCompliant(false)]
public interface IFinalListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by <see cref="FinalParser.prog"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterProg([NotNull] FinalParser.ProgContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FinalParser.prog"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitProg([NotNull] FinalParser.ProgContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FinalParser.line"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLine([NotNull] FinalParser.LineContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FinalParser.line"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLine([NotNull] FinalParser.LineContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FinalParser.assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAssign([NotNull] FinalParser.AssignContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FinalParser.assign"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAssign([NotNull] FinalParser.AssignContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FinalParser.literals"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLiterals([NotNull] FinalParser.LiteralsContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FinalParser.literals"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLiterals([NotNull] FinalParser.LiteralsContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FinalParser.arithmetic"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterArithmetic([NotNull] FinalParser.ArithmeticContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FinalParser.arithmetic"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitArithmetic([NotNull] FinalParser.ArithmeticContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FinalParser.statements"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStatements([NotNull] FinalParser.StatementsContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FinalParser.statements"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStatements([NotNull] FinalParser.StatementsContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FinalParser.block"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBlock([NotNull] FinalParser.BlockContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FinalParser.block"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBlock([NotNull] FinalParser.BlockContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FinalParser.elif"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterElif([NotNull] FinalParser.ElifContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FinalParser.elif"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitElif([NotNull] FinalParser.ElifContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="FinalParser.condition"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCondition([NotNull] FinalParser.ConditionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="FinalParser.condition"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCondition([NotNull] FinalParser.ConditionContext context);
}
