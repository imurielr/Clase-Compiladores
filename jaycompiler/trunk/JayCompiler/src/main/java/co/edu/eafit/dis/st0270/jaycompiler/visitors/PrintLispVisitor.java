package co.edu.eafit.dis.st0270.jaycompiler.visitors;

import co.edu.eafit.dis.st0270.jaycompiler.ast.Program;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Assignment;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Binary;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Block;
import co.edu.eafit.dis.st0270.jaycompiler.ast.BoolValue;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Conditional;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Declaration;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Expression;
import co.edu.eafit.dis.st0270.jaycompiler.ast.IntValue;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Loop;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Operator;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Skip;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Statement;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Type;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Unary;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Variable;

public class PrintLispVisitor 
    implements Visitor {

    StringBuffer sb;
    public PrintLispVisitor() {

	sb = new StringBuffer();
    }

    public StringBuffer getStringBuffer() {

	return sb;
    }

    public void visit(Program aProgram) {

	sb.append("(Program ");
	for (Declaration d : aProgram.getDecPart()) {
	    PrintLispVisitor plv = new PrintLispVisitor();
	    plv.visit(d);
	    sb.append(plv.getStringBuffer());
	}
	PrintLispVisitor plv = new PrintLispVisitor();
	plv.visit(aProgram.getBody());
	sb.append(" ")
	    .append(plv.getStringBuffer())
	    .append(")");
    }

    public void visit(Assignment aAssign) {

	sb.append("(Assign ");
	PrintLispVisitor plv = new PrintLispVisitor();
	plv.visit(aAssign.getVariable());
	sb.append(plv.getStringBuffer())
	    .append(" ");
	plv = new PrintLispVisitor();
	plv.visit(aAssign.getExpression());
	sb.append(plv.getStringBuffer())
	    .append(")");
    }


    public void visit(Binary aBinary) {

	sb.append('(').append(aBinary.getOperator().getOpStr()).append(' ');
	PrintLispVisitor plv = new PrintLispVisitor();
	plv.visit(aBinary.getLeftTerm());
	sb.append(plv.getStringBuffer())
	    .append(' ');
	plv = new PrintLispVisitor();
	plv.visit(aBinary.getRightTerm());
	sb.append(plv.getStringBuffer())
	    .append(')');
    }

    public void visit(Block aBlock) {

	sb.append("(Block ");
	for (Statement s : aBlock.getStatements()) {
	    PrintLispVisitor plv = new PrintLispVisitor();
	    plv.visit(s);
	    sb.append(plv.getStringBuffer()).append('\n');
	}
	sb.append("\n)");
    }

    public void visit(BoolValue aBoolValue) {

	sb.append("(BoolValue ")
	    .append(aBoolValue.getValue())
	    .append(" )");
    }

    public void visit(Conditional aConditional) {

	sb.append("(If ");
	PrintLispVisitor plv = new PrintLispVisitor();
	plv.visit(aConditional.getCondition());
	sb.append(plv.getStringBuffer());
	sb.append(' ');
	plv = new PrintLispVisitor();
	plv.visit(aConditional.getThenStm());
	sb.append(plv.getStringBuffer());
	sb.append(' ');

	Statement s = aConditional.getElseStm();

	if (s == null) {

	    sb.append("()");
	}
	else {

	    plv = new PrintLispVisitor();
	    plv.visit(s);
	    sb.append(plv.getStringBuffer())
		.append(' ');
	}

	sb.append(')');
    }

    public void visit(Declaration aDeclaration) {
	sb.append("(Decl ");
	PrintLispVisitor plv = new PrintLispVisitor();
	plv.visit(aDeclaration.getType());
	sb.append(plv.getStringBuffer());
	sb.append(' ');
	plv = new PrintLispVisitor();
	plv.visit(aDeclaration.getVar());
	sb.append(plv.getStringBuffer())
	    .append(')');
    }
    
    private void visit(Expression expr) {

	if (expr instanceof Binary)    { visit((Binary) expr); return; }
	if (expr instanceof Unary)     { visit((Unary) expr); return; }
	if (expr instanceof Variable)  { visit((Variable) expr); return; }
	if (expr instanceof IntValue)  { visit((IntValue) expr); return; }
	if (expr instanceof BoolValue) { visit((BoolValue) expr); return; }
	
    }

    public void visit(IntValue aIntValue) {

	sb.append("(IntValue ")
	    .append(aIntValue.getValue())
	    .append(" )");
    }

    public void visit(Loop aLoop) {

	sb.append("(While ");
	PrintLispVisitor plv = new PrintLispVisitor();
	plv.visit(aLoop.getCondition());
	sb.append(plv.getStringBuffer())
	    .append(' ');
	plv = new PrintLispVisitor();
	plv.visit(aLoop.getBodyStm());
	sb.append(plv.getStringBuffer())
	    .append(" )");
    }

    public void visit(Skip aSkip) {
	sb.append("()");
    }

    private void visit(Statement stmt) {

	if (stmt instanceof Assignment)  { visit((Assignment) stmt); return; }
	if (stmt instanceof Block)       { visit((Block) stmt); return; }
	if (stmt instanceof Conditional) { visit((Conditional) stmt); return; }
	if (stmt instanceof Loop)        { visit((Loop) stmt); return; }
	if (stmt instanceof Skip)        { visit((Skip) stmt); return; }
	
    }

    public void visit(Type aType) {

	sb.append("(Type ")
	    .append(aType.getType().name())
	    .append(" )");
	
    }

    public void visit(Unary aUnary) {

	sb.append('(')
	    .append(aUnary.getOperator().getOpStr())
	    .append(' ');

	PrintLispVisitor plv = new PrintLispVisitor();
	plv.visit(aUnary.getExpression());
	sb.append(plv.getStringBuffer());
	sb.append(" )");
    }

    public void visit(Variable aVariable) {
	sb.append("(Var ")
	    .append(aVariable.getVariable())
	    .append(")");
    }
}
