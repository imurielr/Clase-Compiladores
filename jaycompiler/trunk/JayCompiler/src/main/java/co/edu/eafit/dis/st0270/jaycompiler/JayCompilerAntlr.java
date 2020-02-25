package co.edu.eafit.dis.st0270.jaycompiler;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.Token;
import java.io.IOException;
import co.edu.eafit.dis.st0270.jaycompiler.lexer.JayCompiler;

public class JayCompilerAntlr {

	public static void main(String args[]) {

	if (args.length != 1) {
	    System.err.println("Error: Uso JayCompilerAntlr File");
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

	JayCompiler lexer = new JayCompiler(afs);

	Token t = lexer.nextToken();
	Token eof = lexer.getEOFToken();

	while (t.getType() != eof.getType()) {
	    switch(t.getType()) {
	    case JayCompiler.COMMENT:
	    case JayCompiler.WS:
		break;
	    default:
		System.out.println("Token: " + t.getText() + " fila: " + t.getLine() +
				   " columna: " + t.getCharPositionInLine()
				   + " tipo: " + t.getType());
		break;
	    }
	    t = lexer.nextToken();
	}
    }
}
