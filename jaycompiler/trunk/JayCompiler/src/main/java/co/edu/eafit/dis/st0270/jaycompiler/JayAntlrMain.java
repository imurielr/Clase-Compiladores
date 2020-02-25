package co.edu.eafit.dis.st0270.jaycompiler;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import java.io.IOException;
import co.edu.eafit.dis.st0270.jaycompiler.parser.JayParser;
import co.edu.eafit.dis.st0270.jaycompiler.parser.JayLexer;

public class JayAntlrMain {

    public static void main(String args[]) {

	if (args.length != 1) {
	    System.err.println("Error: Uso JayAntlrMain File");
	    System.exit(1);
	}

	ANTLRFileStream afs = null;

	try {
	    afs = new ANTLRFileStream(args[0]);
	}
	catch (IOException ioe) {
	    System.err.println("Error: " + ioe);
	    System.exit(1);
	}

	JayLexer lexer   = new JayLexer(afs);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	JayParser parser = new JayParser(tokens);

	try {
	    parser.program();
	} catch(RecognitionException re) {
	    System.err.println("Exception: " + re);
	    System.exit(1);
	}
    }
}
