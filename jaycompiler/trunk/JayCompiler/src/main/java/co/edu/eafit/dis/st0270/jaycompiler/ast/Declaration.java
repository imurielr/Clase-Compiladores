package co.edu.eafit.dis.st0270.jaycompiler.ast;

import co.edu.eafit.dis.st0270.jaycompiler.visitors.Visitor;

public class Declaration
    implements AST {

    private Variable var;
    private Type t;

    public Declaration(Variable var, Type t) {
	this.var = var;
	this.t = t;
    }

    public Type getType() {

	return t;
    }

    public Variable getVar() {

	return var;
    }


    public void setType(Type t) {

	this.t = t;
    }

    public void setVar(Variable var) {

	this.var = var;
    }

    public void accept(Visitor visitor) {

	visitor.visit(this);
   }
}
