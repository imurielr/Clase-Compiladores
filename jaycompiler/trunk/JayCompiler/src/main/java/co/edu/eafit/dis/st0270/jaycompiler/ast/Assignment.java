package co.edu.eafit.dis.st0270.jaycompiler.ast;

import co.edu.eafit.dis.st0270.jaycompiler.visitors.Visitor;

public class Assignment
    extends Statement
    implements AST
{
    private Variable var;
    private Expression expr;

    public Assignment(Variable var, Expression expr) {

	this.var = var;
	this.expr = expr;
    }

    public Expression getExpression() {
	return expr;
    }

    public Variable getVariable() {
	return var;
    }

    public void accept(Visitor visitor) {

	visitor.visit(this);
    }
}
