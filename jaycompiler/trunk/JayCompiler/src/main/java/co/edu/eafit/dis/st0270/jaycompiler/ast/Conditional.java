package co.edu.eafit.dis.st0270.jaycompiler.ast;

import co.edu.eafit.dis.st0270.jaycompiler.visitors.Visitor;

public class Conditional 
    extends Statement
    implements AST
{

    private Expression cond;
    private Statement thenStm;
    private Statement elseStm;

    public Conditional(Expression cond, 
		       Statement thenStm, Statement elseStm) {
	this.cond = cond;
	this.thenStm = thenStm;
	this.elseStm = elseStm;
    }

    
    public Conditional(Expression cond, 
		       Statement thenStm) {
	this.cond = cond;
	this.thenStm = thenStm;
	this.elseStm = null;
    }

    public Expression getCondition() {
	return cond;
    }

    public Statement getThenStm() {
	return thenStm;
    }

    public Statement getElseStm() {
	return elseStm;
    }

    public void accept(Visitor visitor) {

	visitor.visit(this);
   }
}
