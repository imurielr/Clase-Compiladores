package co.edu.eafit.dis.st0270.jaycompiler.ast;

import java.util.ArrayList;
import co.edu.eafit.dis.st0270.jaycompiler.visitors.Visitor;

public class Block 
    extends Statement 
    implements AST {
    private ArrayList<Statement> members;

    public Block() {

	members = new ArrayList<Statement>();
    }

    public Block(ArrayList<Statement> members) {

	this.members = members;
    }

    public void addStatement(Statement stm) {

	members.add(stm);
    }

    public ArrayList<Statement> getStatements() {

	return members;
    }

    public void accept(Visitor visitor) {

	visitor.visit(this);
   }
}
