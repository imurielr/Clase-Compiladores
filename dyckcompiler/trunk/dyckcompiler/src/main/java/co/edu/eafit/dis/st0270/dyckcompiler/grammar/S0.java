package co.edu.eafit.dis.st0270.dyckcompiler.grammar;

public class S0 extends NonTerminal {

    public boolean equals(Object obj) {
    	boolean ret = false;
    	if (obj instanceof S0) {
    	    ret = true;
    	}
    	return ret;
    }

    public int hashCode() {
	return GrammarSymbol.S0;
    }

    public String toString() {
	return "S0";
    }
}