package co.edu.eafit.dis.st0270.jaycompiler.ast;

import co.edu.eafit.dis.st0270.jaycompiler.visitors.Visitor;

public class Skip 
    extends Statement
    implements AST
{
    public Skip() { }

    public void accept(Visitor visitor) {

	visitor.visit(this);
   }
}
