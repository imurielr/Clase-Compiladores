package co.edu.eafit.dis.st0270.jaycompiler.ast;

import co.edu.eafit.dis.st0270.jaycompiler.visitors.Visitor;

public class Variable 
    extends Expression
    implements AST
{
    private String id;

    public Variable(String id) {
	this.id = id;
    }

    public String getVariable() {

	return id;
    }

    public boolean equals (Object obj) {
	if (obj instanceof String) {
	    String s = (String) obj;
	    return id.equalsIgnoreCase(s);
	}
	return false;
    }

    public int hashCode() {

	return id.hashCode();
    }

    public void accept(Visitor visitor) {

	visitor.visit(this);
   }
}
