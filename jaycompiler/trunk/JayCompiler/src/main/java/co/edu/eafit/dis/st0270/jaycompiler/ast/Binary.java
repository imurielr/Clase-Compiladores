package co.edu.eafit.dis.st0270.jaycompiler.ast;

import co.edu.eafit.dis.st0270.jaycompiler.visitors.Visitor;

public class Binary extends Expression implements AST {

    private Expression leftTerm, rightTerm;
    private Operator op;

    public Binary(Operator op, Expression leftTerm, Expression rightTerm) {

	this.op = op;
	this.leftTerm = leftTerm;
	this.rightTerm = rightTerm;
    }

    public Operator getOperator() {

	return op;
    }

    public Expression getLeftTerm() {

	return leftTerm;
    }

    public Expression getRightTerm() {

	return rightTerm;
    }

    public void accept(Visitor visitor) {

	visitor.visit(this);
   }
}
