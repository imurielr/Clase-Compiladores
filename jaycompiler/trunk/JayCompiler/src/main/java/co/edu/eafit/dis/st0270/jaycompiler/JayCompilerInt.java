package co.edu.eafit.dis.st0270.jaycompiler;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import co.edu.eafit.dis.st0270.jaycompiler.jflex.JayCompilerLexerInt;
import co.edu.eafit.dis.st0270.jaycompiler.tokens.EnumToken;

public class JayCompilerInt {

    private static void usage(int errcode) {
    	System.err.println("Usage: java " +
			   "co.edu.eafit.dis.st0270.jaycompiler."+
			   "JayCompilerInt <file>");
    	System.exit(errcode);
    }

    public static void main(String args[]) {

    	if (args.length != 1) {
	    usage(1);
    	}
	
    	InputStreamReader isr = null;
    	try {
	    isr = new InputStreamReader(new FileInputStream(args[0]));
    	}
    	catch (FileNotFoundException fnfe) {
	    System.err.println(fnfe);
	    usage(2);
    	}

    	try {
	    JayCompilerLexerInt lexer = new JayCompilerLexerInt(isr);
	    
	    int t = lexer.getNextToken();
	    while (t != lexer.YYEOF) {
		System.out.println("Token: " + t +
				   " valor: " + lexer.yytext() +
				   " linea: " + lexer.getLine() +
				   " column: " + lexer.getColumn()
				   );
		
		t = lexer.getNextToken();
	    }
    	}
    	catch (Exception e) {
	    System.err.println(e);
	    System.exit(3);
    	}
    }
}
