package co.edu.eafit.dis.st0270.jaycompiler;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import java.io.IOException;
import co.edu.eafit.dis.st0270.jaycompiler.parser.JayAstParser;
import co.edu.eafit.dis.st0270.jaycompiler.parser.JayAstLexer;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Program;
import co.edu.eafit.dis.st0270.jaycompiler.visitors.PrintLispVisitor;

public class JayAntlrAstMain {

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

	JayAstLexer lexer   = new JayAstLexer(afs);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	JayAstParser parser = new JayAstParser(tokens);

	try {

	    Program prg = parser.program();
	    PrintLispVisitor plv = new PrintLispVisitor();
	    plv.visit(prg);
	    System.out.println(plv.getStringBuffer());
	} catch(RecognitionException re) {
	    System.err.println("Exception: " + re);
	    System.exit(1);
	}
    }
}
