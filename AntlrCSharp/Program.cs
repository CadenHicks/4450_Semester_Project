using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System;
using System.Text;
using System.Diagnostics;




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
                string stuff = tree.ToStringTree(parser);
                stuff = stuff.Replace("(expr", "\nexpr");
                Console.WriteLine(stuff);

                //GUI appear
                
                string command = "Final.g4 prog -gui";
                Process process = new Process();
                process.StartInfo.FileName = "antlr4-parse.exe";
                process.StartInfo.UseShellExecute = false;
                process.StartInfo.WindowStyle = ProcessWindowStyle.Normal;
                process.StartInfo.RedirectStandardInput = true;
                process.StartInfo.WorkingDirectory = @"C:\Users\caden\source\repos\Semester_Project_4450\AntlrCSharp";
                process.StartInfo.Verb = "runas";
                process.StartInfo.Arguments = command;
                process.Start();
                process.StandardInput.WriteLine(text);
                process.StandardInput.Close();
                process.WaitForExit();
                
                //Console.WriteLine(text);


            }
            catch (Exception ex)
            {
                Console.WriteLine("Error: " + ex);
            }
        }
    }
}

