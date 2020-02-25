package co.edu.eafit.dis.st0270.jaycompiler.ast;

import co.edu.eafit.dis.st0270.jaycompiler.visitors.Visitor;

public class BoolValue extends Value implements AST {

    private boolean value;

    public BoolValue(boolean value) {

	this.value = value;
    }

    public BoolValue(String value) {

	this.value = Boolean.parseBoolean(value);
    }

    public boolean getValue() {
	return value;
    }

    public void accept(Visitor visitor) {

	visitor.visit(this);
   }
}
