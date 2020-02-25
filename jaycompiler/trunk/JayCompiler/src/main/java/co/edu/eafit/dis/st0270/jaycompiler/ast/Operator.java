package co.edu.eafit.dis.st0270.jaycompiler.ast;

public enum Operator {
    AND,
    OR,
    LT,
    LE,
    EQ,
    NE,
    GT,
    GE,
    PLUS,
    MINUS,
    TIMES,
    DIV,
    NOT;

    public String getOpStr() {

	String ret = null;
	switch(this) {
	case AND:
	    ret = "&&";
	    break;
	case OR:
	    ret = "||";
	    break;
	case LT:
	    ret = "<";
	    break;
	case LE:
	    ret = "<=";
	    break;
	case EQ:
	    ret = "==";
	    break;
	case NE:
	    ret = "!=";
	    break;
	case GT:
	    ret = ">";
	    break;
	case GE:
	    ret = ">=";
	    break;
	case PLUS:
	    ret = "+";
	    break;
	case MINUS:
	    ret = "-";
	    break;
	case TIMES:
	    ret = "*";
	    break;
	case DIV:
	    ret = "/";
	    break;
	case NOT:
	    ret = "!";
	    break;
	}
	return ret;
    }

}
