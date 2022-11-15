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
                string workingDirectory = "";
                string filePath = "";
                string fileName = "";
                Console.WriteLine("Please enter the .g4 File name");
                fileName = Console.ReadLine();
                Console.WriteLine("Please enter file path of G4 file.");
                workingDirectory = Console.ReadLine();
                Console.WriteLine("Please enter file path of the file you wish to test.");
                filePath = Console.ReadLine();
                string text = File.ReadAllText(filePath);

                // to type the EOF character and end the input: use CTRL+D, then press <enter>


                AntlrInputStream inputStream = new AntlrInputStream(text);
                FinalLexer Lexer = new FinalLexer(inputStream);
                CommonTokenStream tokens = new CommonTokenStream(Lexer);
                FinalParser parser = new FinalParser(tokens);
                parser.BuildParseTree = true;
                IParseTree tree = parser.prog();
                string stuff = tree.ToStringTree(parser);
                stuff = stuff.Replace("(expr", "\nexpr");
                Console.WriteLine(stuff);

                //GUI appear

                string command = fileName + " prog -gui";
                Process process = new Process();
                process.StartInfo.FileName = "antlr4-parse.exe";
                process.StartInfo.UseShellExecute = false;
                process.StartInfo.WindowStyle = ProcessWindowStyle.Normal;
                process.StartInfo.RedirectStandardInput = true;
                process.StartInfo.WorkingDirectory = workingDirectory;
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

