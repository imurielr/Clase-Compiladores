/**
 *  JayCompilerLexerAntlr4 class shows how a scanner generated by
 *  ANTLR4 is running to process only tokens. The tokens generated
 *  are produced by @see org.antlr.v4.runtime.Token.
 */

package co.edu.eafit.dis.st0270.jaycompiler;

import co.edu.eafit.dis.st0270.jaycompiler.lexer.JayLexer;
import java.io.IOException;
import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.atn.ATNConfigSet;


public class JayCompilerLexerAntlr4 {

    private static void usage(int errcode) {
        System.err.println("Usage: java JayCompilerLexerAntrl4 <file>");
        System.exit(errcode);
    }

    private static class ManageErrorClass implements ANTLRErrorListener {
	
	public void reportAmbiguity(Parser recognizer, DFA dfa,
				    int startIndex, int stopIndex, boolean exact,
				    BitSet ambigAlts, ATNConfigSet configs) {
	}
	
	public void reportAttemptingFullContext(Parser recognizer, DFA dfa,
						int startIndex, int stopIndex,
						BitSet conflictingAlts, ATNConfigSet configs) {
	}

	public void reportContextSensitivity(Parser recognizer, DFA dfa,
					     int startIndex, int stopIndex,
					     int prediction, ATNConfigSet configs) {
	}

	public void syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol,
				int line, int charPositionInLine, String msg,
				RecognitionException e) {

	    ANTLRFileStream fileinput =
		(ANTLRFileStream) recognizer.getInputStream();

	    String input =
	    	fileinput.toString();

	    String lines[] = input.split("\n");

	    System.err.print("Error at line: " + line + 
			     " column: " + charPositionInLine +
			     " token: " +
			     lines[line - 1].charAt(charPositionInLine));
		
	    System.exit(1);
	}
	
    }

    private static void printToken(Token t, String type) {

        System.out.println("Token: " + t.getText() +
                           " line: " + t.getLine() +
                           " column: " +
                           t.getCharPositionInLine() +
                           " type: " + type +
                           " typeId: " + t.getType());
    }

    /**
     * This method start the scanner.
     * <p>
     * @param args It accepts only one file name.
     *
     */
    public static void main(String args[]) {

        if (args.length != 1) {
            usage(1);
        }

        ANTLRFileStream afs = null;

        try {

            afs = new ANTLRFileStream(args[0]);
        }
        catch (IOException ioe) {
            System.err.println("Error: " + ioe);
            usage(2);
        }

        JayLexer lexer = new JayLexer(afs);
	lexer.removeErrorListeners();
	lexer.addErrorListener(new ManageErrorClass());
	
        Token t = lexer.nextToken();
        Token eof = lexer.emitEOF();

        while (t.getType() != eof.getType()) {

            switch(t.getType()) {

            case JayLexer.COMMENT:
            case JayLexer.WS:

                // Ignore files
                break;

            case JayLexer.SEPARATORS:

                printToken(t, "separators");
                break;

            case JayLexer.OPERATORS:

                printToken(t, "operators");
                break;

            case JayLexer.KEYWORDS:

                printToken(t, "keywords");
                break;

            case JayLexer.BOOLEAN:
            case JayLexer.INT:

                printToken(t, "literal");
                break;

            case JayLexer.ID:

                printToken(t, "Id");
                break;

            default:

                System.err.println("This cannot happen here");
                printToken(t, "unknown");
                System.exit(1);
            }

            t = lexer.nextToken();
        }

    }
}