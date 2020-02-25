package co.edu.eafit.dis.st0270.jaycompiler.ast;

import co.edu.eafit.dis.st0270.jaycompiler.visitors.Visitor;

public class Loop 
    extends Statement
    implements AST
{

    private Expression cond;
    private Statement bodyStm;

    public Loop(Expression cond, 
		Statement bodyStm) {
	this.cond = cond;
	this.bodyStm = bodyStm;
    }

    public Expression getCondition() {
	return cond;
    }

    public Statement getBodyStm() {
	return bodyStm;
    }

    public void accept(Visitor visitor) {

	visitor.visit(this);
   }
}
