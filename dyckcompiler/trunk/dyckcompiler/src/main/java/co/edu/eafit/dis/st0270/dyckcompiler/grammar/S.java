package co.edu.eafit.dis.st0270.dyckcompiler.grammar;

public class S extends NonTerminal {

    public boolean equals(Object obj) {
    	boolean ret = false;
    	if (obj instanceof S) {
    	    ret = true;
    	}
    	return ret;
    }

    public int hashCode() {
	return GrammarSymbol.S;
    }

    public String toString() {
	return "S";
    }
}