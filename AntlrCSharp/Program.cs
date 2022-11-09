using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System;
using System.Text;

namespace AntlrCSharp
{
    public class Program
    {
        static void Main(string[] args)
        {
            try
            {
                string input = "";
                StringBuilder text = new StringBuilder();
                Console.WriteLine("Input Expression.");

                // to type the EOF character and end the input: use CTRL+D, then press <enter>
                while ((input = Console.ReadLine()) != "\u0004")
                {
                    text.AppendLine(input);
                }

                AntlrInputStream inputStream = new AntlrInputStream(text.ToString());
                FinalLexer Lexer = new FinalLexer(inputStream);
                CommonTokenStream tokens = new CommonTokenStream(Lexer);
                FinalParser parser = new FinalParser(tokens);
                parser.BuildParseTree = true;
                IParseTree tree = parser.prog();
                Printer printer = new Printer();
                ParseTreeWalker.Default.Walk(printer, tree);
            }
            catch (Exception ex)
            {
                Console.WriteLine("Error: " + ex);
            }
        }
    }
}

