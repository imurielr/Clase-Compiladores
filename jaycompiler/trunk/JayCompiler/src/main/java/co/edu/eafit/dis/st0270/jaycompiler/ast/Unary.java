package co.edu.eafit.dis.st0270.jaycompiler.ast;

import co.edu.eafit.dis.st0270.jaycompiler.visitors.Visitor;

public class Unary 
    extends Expression
    implements AST
{
    private Operator op;
    private Expression expr;

    public Unary(Operator op, Expression expr) {

	this.op = op;
	this.expr = expr;
    }

    public Operator getOperator() {

	return op;
    }

    public Expression getExpression() {

	return expr;
    }

    public void accept(Visitor visitor) {

	visitor.visit(this);
   }
}
