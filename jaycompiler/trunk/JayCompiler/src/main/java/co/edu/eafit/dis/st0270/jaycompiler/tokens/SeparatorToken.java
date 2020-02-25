package co.edu.eafit.dis.st0270.jaycompiler.tokens;

public class SeparatorToken
    extends Token {

    public enum EnumSeparator {
	LPAREN,
	RPAREN,
	LCURLY,
	RCURLY,
	SEMI,
	COMMA;

	static public EnumSeparator getSeparatorOrdinal(String name) throws Error
	{
	    
	    switch(name.charAt(0)) {
	    case '(' : return LPAREN;
	    case ')' : return RPAREN;
	    case '{' : return LCURLY;
	    case '}' : return RCURLY;
	    case ';' : return SEMI;
	    case ',' : return COMMA;
	    }
	    throw new Error("Unknown separator ordinal");
	}
    }
    private String separator;

    public SeparatorToken(String separator, int linea, int column) {
	super(linea, column);
	this.separator = new String(separator);
    }

    public String toString() {
	return "Separator: " + separator + " " + super.toString();
    }

    public EnumSeparator getEnumSeparator() 
	throws Error
    {
	return EnumSeparator.getSeparatorOrdinal(separator);
    }
}
