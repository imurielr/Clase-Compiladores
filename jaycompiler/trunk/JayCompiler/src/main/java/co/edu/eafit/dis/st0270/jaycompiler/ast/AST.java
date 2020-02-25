package co.edu.eafit.dis.st0270.jaycompiler.ast;

import co.edu.eafit.dis.st0270.jaycompiler.visitors.Visitor;

public interface AST {

    void accept(Visitor visitor);
}
