package co.edu.eafit.dis.st0270.jaycompiler.ast;

import co.edu.eafit.dis.st0270.jaycompiler.visitors.Visitor;

public class IntValue
    extends Value
    implements AST
{
    public int value;

    public IntValue(int value) {
	this.value = value;
    }

    public IntValue(String value)
	throws NumberFormatException {

	this.value = Integer.parseInt(value);
    }

    public int getValue() {
	return value;
    }

    public void accept(Visitor visitor) {

	visitor.visit(this);
   }
}
