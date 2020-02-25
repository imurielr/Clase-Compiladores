package co.edu.eafit.dis.st0270.jaycompiler.ast;

import java.util.ArrayList;
import co.edu.eafit.dis.st0270.jaycompiler.visitors.Visitor;

public class Program implements AST {

    private ArrayList<Declaration> decpart;
    private Block body;

    public Program(ArrayList<Declaration> decpart,
		   Block body) {

	this.decpart = decpart;
	this.body = body;
    }


    public ArrayList<Declaration> getDecPart() {

	return decpart;
    }

    public Block getBody() {

	return body;
    }

    public void accept(Visitor visitor) {

	visitor.visit(this);
   }
}
