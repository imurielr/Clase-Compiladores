package co.edu.eafit.dis.st0270.jaycompiler.visitors;

import co.edu.eafit.dis.st0270.jaycompiler.ast.Program;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Assignment;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Binary;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Block;
import co.edu.eafit.dis.st0270.jaycompiler.ast.BoolValue;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Conditional;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Declaration;
import co.edu.eafit.dis.st0270.jaycompiler.ast.IntValue;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Loop;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Skip;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Type;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Unary;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Variable;

public interface Visitor {

    public void visit(Program aProgram);
    public void visit(Assignment aAssign);
    public void visit(Binary aBinary);
    public void visit(Block aBlock);
    public void visit(BoolValue aBoolValue);
    public void visit(Conditional aConditional);
    public void visit(Declaration aDeclaration);
    public void visit(IntValue aIntValue);
    public void visit(Loop aLoop);
    public void visit(Skip aSkip);
    public void visit(Type aType);
    public void visit(Unary aUnary);
    public void visit(Variable aVariable);
}
