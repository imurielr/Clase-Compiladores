package co.edu.eafit.dis.st0270.jaycompiler.tokens;

public class BooleanLiteralToken
	extends LiteralToken {

	private Boolean value;

	public BooleanLiteralToken(String literal, int linea, int column) {
		super(linea, column);
		this.value = new Boolean(literal);
	}

	public Boolean getValue() {
		return value;
	}

	public String toString() {
		return "Boolean: " + value + " " + super.toString();
	}
}
