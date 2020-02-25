package co.edu.eafit.dis.st0270.jaycompiler.ast;

import co.edu.eafit.dis.st0270.jaycompiler.visitors.Visitor;

public class Type
    implements AST
{
    public enum EnumType {
	INTEGER, BOOLEAN, UNDEF
    };

    private EnumType type;

    public Type(EnumType type) {
	this.type = type;
    }

    public boolean isBoolean() {

	return type == EnumType.BOOLEAN;
    }

    public boolean isInteger() {

	return type == EnumType.INTEGER;
    }

    public boolean isUndefined() {

	return type == EnumType.UNDEF;
    }

    public EnumType getType() {

	return type;
    }

    public void accept(Visitor visitor) {

	visitor.visit(this);
   }
}
