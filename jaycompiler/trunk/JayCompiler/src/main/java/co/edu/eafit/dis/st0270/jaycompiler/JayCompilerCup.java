package co.edu.eafit.dis.st0270.jaycompiler;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java_cup.runtime.ComplexSymbolFactory;
import co.edu.eafit.dis.st0270.jaycompiler.jflex.JayCompilerCupLexer;
import co.edu.eafit.dis.st0270.jaycompiler.parser.JayCompilerParserCup;


public class JayCompilerCup {

   private static void usage() {
      System.err.println("Uso: " +
                         "co.edu.eafit.dis.st0270.jaycompiler.JayCompilerCup" +
                         " <jaysrcfiles> ...");
      System.exit(0);
   }
   
   public static void main(String args[]) {
      if (args.length == 0)
         usage();
      
      for (int i = 0; i < args.length; ++i) {
         
         JayCompilerCupLexer scanner = null;
         JayCompilerParserCup parser = null;

         try {
            scanner = new JayCompilerCupLexer(new FileReader(args[i]));
            parser = new JayCompilerParserCup(scanner,
                                              new ComplexSymbolFactory());
            parser.parse();
         }
         catch (FileNotFoundException fnfe) {
            System.err.println("File " + args[i] +
                               " not found");
            System.exit(1);
         }
         catch (IOException ioe) {
            System.err.println("IO Exception on file: " + args[i] +
                               " " + ioe);
            System.exit(1);
         }
         catch (Exception e) {
            
            parser.report_error("Syntax error file: " +
                                args[i] + " ", null);
            parser.dump_stack();
            System.exit(1);
         }
      }
   }
}
