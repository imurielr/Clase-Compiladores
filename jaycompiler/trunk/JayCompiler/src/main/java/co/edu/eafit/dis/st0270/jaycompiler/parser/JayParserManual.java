package co.edu.eafit.dis.st0270.jaycompiler.parser;

import co.edu.eafit.dis.st0270.jaycompiler.jflex.JayCompilerLexer;
import co.edu.eafit.dis.st0270.jaycompiler.tokens.Token;
import co.edu.eafit.dis.st0270.jaycompiler.tokens.KeywordToken;
import co.edu.eafit.dis.st0270.jaycompiler.tokens.IdentifierToken;
import co.edu.eafit.dis.st0270.jaycompiler.tokens.IntegerLiteralToken;
import co.edu.eafit.dis.st0270.jaycompiler.tokens.OperatorToken;
import co.edu.eafit.dis.st0270.jaycompiler.tokens.SeparatorToken;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Assignment;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Binary;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Block;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Conditional;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Declaration;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Expression;
import co.edu.eafit.dis.st0270.jaycompiler.ast.IntValue;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Operator;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Program;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Loop;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Type;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Skip;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Statement;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Unary;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Variable;
import java.io.IOException;
import java.util.ArrayList;

public class JayParserManual {

    private JayCompilerLexer lexer = null;
    private Token cc = null;

    public JayParserManual(JayCompilerLexer lexer) {

	this.lexer = lexer;
    }

    private boolean isAKeywordToken(Token t, KeywordToken.EnumKeyword key) {
	boolean ret = false;

	if (t instanceof KeywordToken) {
	    KeywordToken kt = (KeywordToken) t;

	    if (kt.getEnumKeyword() == key)
		ret = true;
	}

	return ret;
    }

    private void checkingKeywordToken(Token t, KeywordToken.EnumKeyword key)
	throws JayParserManualException
    {
	if (t instanceof KeywordToken) {

	    KeywordToken kt = (KeywordToken) t;
	    if (!(kt.getEnumKeyword() == key)) {
		throw new JayParserManualException("Expected keyword "
						   + key.name()
						   + " at line: "
						   + kt.getLine()
						   + " col: " + kt.getColumn());
	    }
	}
	else {
	    throw new JayParserManualException("Excepted keyword "
					       + key.name()
					       + " at line: "
					       + t.getLine()
					       + " col: " + t.getColumn()
					       + " found: " + t);
	}
    }


    private boolean isSeparatorToken(Token t, SeparatorToken.EnumSeparator sep) {
	boolean ret = false;

	if (t instanceof SeparatorToken) {
	    SeparatorToken stkn = (SeparatorToken) t;

	    if (stkn.getEnumSeparator() == sep)
		ret = true;
	}

	return ret;
    }

    private void checkingSeparatorToken(Token t, SeparatorToken.EnumSeparator sep)
	throws JayParserManualException
    {
	if (!(t instanceof SeparatorToken))
	    throw new JayParserManualException("Excepted separator "
					       + sep.name()
					       + " at line: "
					       + t.getLine()
					       + " col: " + t.getColumn()
					       + " found: " + t);

	SeparatorToken stkn = (SeparatorToken) t;

	if (stkn.getEnumSeparator() != sep)
	    throw new JayParserManualException("Excepted separator "
					       + sep.name()
					       + " at line: "
					       + t.getLine()
					       + " col: " + t.getColumn()
					       + " found: " + t);
    }

    public Program program()
	throws JayParserManualException, IOException
    {
	cc = lexer.getNextToken();

	checkingKeywordToken(cc, KeywordToken.EnumKeyword.VOID);

	cc = lexer.getNextToken();

	checkingKeywordToken(cc, KeywordToken.EnumKeyword.MAIN);

	cc = lexer.getNextToken();

	checkingSeparatorToken(cc, SeparatorToken.EnumSeparator.LPAREN);

	cc = lexer.getNextToken();

	checkingSeparatorToken(cc, SeparatorToken.EnumSeparator.RPAREN);

	cc = lexer.getNextToken();

	checkingSeparatorToken(cc, SeparatorToken.EnumSeparator.LCURLY);

	// Here start the interesting part of the rule
	Program prog = null;

	cc = lexer.getNextToken();

	ArrayList<Declaration> decls = declarations();
	ArrayList<Statement>   stmts = statements();

	prog = new Program(decls, new Block(stmts));

	checkingSeparatorToken(cc, SeparatorToken.EnumSeparator.RCURLY);

	return prog;
    }

    public ArrayList<Declaration> declarations()
	throws JayParserManualException, IOException {

	ArrayList<Declaration> decls = new ArrayList<Declaration>();
	decls = declarations2(decls);
	return decls;
    }

    public ArrayList<Declaration> declarations1(ArrayList<Declaration> prv)
	throws JayParserManualException, IOException {

	prv.addAll(declaration());

	return prv;
    }

    public ArrayList<Declaration> declarations2(ArrayList<Declaration> prv)
	throws JayParserManualException, IOException {
	cc = lexer.getNextToken();

	// Look-ahead lecture
	if (isAKeywordToken(cc, KeywordToken.EnumKeyword.INT) ||
	    isAKeywordToken(cc, KeywordToken.EnumKeyword.BOOLEAN)) {

	    declarations1(prv);
	}
	else {
	    lexer.yypushback(lexer.yylength());
	}

	return prv;
    }

    public ArrayList<Declaration> declaration()
	throws JayParserManualException, IOException
    {
	ArrayList<Declaration> decl = new ArrayList<Declaration>();

	Type.EnumType ety = type();

	ArrayList<Variable> ids = identifiers();

	for (Variable v : ids)
	    decl.add(new Declaration(v, new Type(ety)));

	return decl;
    }

    public Type.EnumType type()
	throws JayParserManualException {

	if (isAKeywordToken(cc, KeywordToken.EnumKeyword.INT)) {
	    return Type.EnumType.INTEGER;

	}
	else if (isAKeywordToken(cc, KeywordToken.EnumKeyword.BOOLEAN)) {
	    return Type.EnumType.BOOLEAN;
	}

	throw new JayParserManualException("Expected "
					   + KeywordToken.EnumKeyword.INT
					   + " or "
					   + KeywordToken.EnumKeyword.BOOLEAN
					   + " found: " + cc);
    }

    public ArrayList<Variable> identifiers()
	throws JayParserManualException, IOException
    {
	ArrayList<Variable> ids = new ArrayList<Variable>();

	ids.add(identifier());

	ids = identifiers2(ids);
	return ids;
    }

    public ArrayList<Variable> identifiers1(ArrayList<Variable> ids)
	throws JayParserManualException, IOException
    {
	checkingSeparatorToken(cc, SeparatorToken.EnumSeparator.COMMA);
	ids.add(identifier());
	ids = identifiers2(ids);

	return ids;
    }

    public ArrayList<Variable> identifiers2(ArrayList<Variable> ids)
	throws JayParserManualException, IOException
    {
	cc = lexer.getNextToken();

	if (isSeparatorToken(cc, SeparatorToken.EnumSeparator.COMMA))
	    ids = identifiers1(ids);

	return ids;
    }

    private IdentifierToken checkingIdentifierToken(Token t)
	throws JayParserManualException
    {
	if (!(t instanceof IdentifierToken))
	    throw new JayParserManualException("Expected Id at line: "
					       + t.getLine()
					       + " col: "
					       + t.getColumn()
					       + " found: " + t);
	return (IdentifierToken) t;
    }

    private boolean isIdentifierToken(Token t)
	throws JayParserManualException
    {
	boolean ret = true;
	if (!(t instanceof IdentifierToken))
	    ret = false;

	return ret;
    }

    public Variable identifier()
	throws JayParserManualException, IOException
    {
	cc = lexer.getNextToken();
	IdentifierToken it = checkingIdentifierToken(cc);
	return new Variable(it.getId());
    }

    public ArrayList<Statement> statements()
	throws JayParserManualException, IOException {
	ArrayList<Statement> stmts = new ArrayList<Statement>();

	stmts = statements2(stmts);
	return stmts;
    }

    public ArrayList<Statement> statements1(ArrayList<Statement> stmts)
	throws JayParserManualException, IOException {

	stmts.add(statement());
	stmts = statements2(stmts);
	return stmts;
    }

    private boolean isStartStatement(Token t) {
	boolean ret = false;

	if (t instanceof SeparatorToken
	    && ((SeparatorToken) t).getEnumSeparator()
	    == SeparatorToken.EnumSeparator.COMMA)
	    ret = true;
	else if (t instanceof KeywordToken) {
	    if  (((KeywordToken) t).getEnumKeyword() ==
		 KeywordToken.EnumKeyword.IF ||
		 ((KeywordToken) t).getEnumKeyword() ==
		 KeywordToken.EnumKeyword.WHILE)
		ret = true;
	}
	else if (t instanceof IdentifierToken)
	    ret = true;

	return ret;
    }

    public ArrayList<Statement> statements2(ArrayList<Statement> stmts)
	throws JayParserManualException, IOException
    {
	cc = lexer.getNextToken();

	if (isStartStatement(cc)) {

	    lexer.yypushback(lexer.yylength());
	    stmts = statements1(stmts);
	}
	else {
	    lexer.yypushback(lexer.yylength());
	}

	return stmts;
    }

    private boolean startsStatementWithComma(Token t) {
	boolean ret = false;

	if (t instanceof SeparatorToken
	    && ((SeparatorToken) t).getEnumSeparator()
	    == SeparatorToken.EnumSeparator.COMMA)
	    ret = true;

	return ret;
    }

    private boolean startsStatementWithIf(Token t) {
	boolean ret = false;

	if (t instanceof KeywordToken) {
	    if (((KeywordToken) t).getEnumKeyword() ==
		KeywordToken.EnumKeyword.IF)
		ret = true;
	}

	return ret;
    }

    private boolean startsStatementWithWhile(Token t) {
	boolean ret = false;
	if (t instanceof KeywordToken) {
	    if (((KeywordToken) t).getEnumKeyword() ==
		KeywordToken.EnumKeyword.WHILE)
		ret = true;
	}

	return ret;
    }

    private boolean startsStatementWithVariable(Token t) {
	boolean ret = false;

	if (t instanceof IdentifierToken)
	    ret = true;

	return ret;
    }

    public Statement statement()
	throws JayParserManualException, IOException
    {
	cc = lexer.getNextToken();
	Statement stmt = null;

	if (startsStatementWithComma(cc)) {

	    stmt = new Skip();
	}
	else if (startsStatementWithVariable(cc)) {

	    stmt = assignment();
	}
	else if (startsStatementWithIf(cc)) {

	    stmt = ifstatement();
	}
	else if (startsStatementWithWhile(cc)) {

 	    stmt = whilestatement();
	}
	else {
	    throw new JayParserManualException("Expected ; "
					       + "or Variable "
					       + "or if or while "
					       + cc.getLine()
					       + " col: "
					       + cc.getColumn()
					       + " found: " + cc);
	}
	return stmt;
    }

    private void checkingOpToken(Token t, OperatorToken.EnumOperator op)
	throws JayParserManualException
    {
	if (!(t instanceof  OperatorToken))
	    throw new JayParserManualException("Expected Operator "
					       + op.name()
					       + " at line: "
					       + t.getLine()
					       + " col: "
					       + t.getColumn()
					       + " found: " + t);
	if (((OperatorToken) t).getEnumOperator() != op) {

	    throw new JayParserManualException("Expected Operator "
					       + op.name()
					       + " at line: "
					       + t.getLine()
					       + " col: "
					       + t.getColumn()
					       + " found: " + t);
	}

	return;
    }


    private void checkingOpToken(Token t, OperatorToken.EnumOperator ops[])
	throws JayParserManualException
    {
	StringBuffer sb = new StringBuffer();

	for (int i = 0; i < ops.length; i++) {
	    sb.append(ops[i].name());
	    sb.append(' ');
	}

	if (!(t instanceof  OperatorToken))
	    throw new JayParserManualException("Expected Operator "
					       + sb
					       + " at line: "
					       + t.getLine()
					       + " col: "
					       + t.getColumn()
					       + " found: " + t);

	for (int i = 0; i < ops.length; i++) {

	    if (((OperatorToken) t).getEnumOperator() == ops[i])
		return;
	}


	throw new JayParserManualException("Expected Operators: "
					   + sb
					   + " at line: "
					   + t.getLine()
					   + " col: "
					   + t.getColumn()
					   + " found: " + t);

    }

    private boolean isOpToken(Token t, OperatorToken.EnumOperator op)
    {
	boolean ret = true;

	if (!(t instanceof OperatorToken))
	    ret = false;
	else if (((OperatorToken) t).getEnumOperator() != op)
	    ret = false;

	return ret;
    }

    private boolean isOpToken(Token t, OperatorToken.EnumOperator ops[])
    {
	boolean ret = true;

	if (!(t instanceof OperatorToken))
	    ret = false;
	else {
	    ret = false;
	    for (int i = 0; i < ops.length; i++) {

		if (((OperatorToken) t).getEnumOperator() == ops[i]) {
		    ret = true;
		    break;
		}
	    }
	}

	return ret;
    }

    public Statement ifstatement()
	throws JayParserManualException, IOException
    {
	checkingKeywordToken(cc, KeywordToken.EnumKeyword.IF);
	cc = lexer.getNextToken();
	checkingSeparatorToken(cc, SeparatorToken.EnumSeparator.LPAREN);
	Expression cond = expression();
	cc = lexer.getNextToken();
	checkingSeparatorToken(cc, SeparatorToken.EnumSeparator.RPAREN);
	Statement thenStmt = statement();
	Statement elseStmt = null;
	cc = lexer.getNextToken();
	if (isAKeywordToken(cc, KeywordToken.EnumKeyword.ELSE)) {

	    elseStmt = statement();
	}
	else {

	    lexer.yypushback(lexer.yylength());
	}
	return new Conditional(cond, thenStmt, elseStmt);
    }

    public Statement whilestatement()
    	throws JayParserManualException, IOException
    {
    	checkingKeywordToken(cc, KeywordToken.EnumKeyword.WHILE);

	cc = lexer.getNextToken();
	checkingSeparatorToken(cc, SeparatorToken.EnumSeparator.LPAREN);

	Expression cond = expression();

	cc = lexer.getNextToken();
	checkingSeparatorToken(cc, SeparatorToken.EnumSeparator.RPAREN);

	Statement body = statement();

	return new Loop(cond, body);
    }

    public Statement assignment()
	throws JayParserManualException, IOException
    {

	Variable var = identifier();

	cc = lexer.getNextToken();

	checkingOpToken(cc, OperatorToken.EnumOperator.ASSIGN);

	Expression expr = expression();

	cc = lexer.getNextToken();

	checkingSeparatorToken(cc, SeparatorToken.EnumSeparator.SEMI);

	return new Assignment(var, expr);
    }

    public Expression expression()
	throws JayParserManualException, IOException
    {
	return restExpression2(conjuction());
    }

    public Expression restExpression1(Expression leftExpr)
	throws JayParserManualException, IOException
    {
	checkingOpToken(cc, OperatorToken.EnumOperator.OR);

	Expression rightExpr = conjuction();

	Expression bin = new Binary(Operator.OR,
				    leftExpr, rightExpr);

	return restExpression2(bin);
    }

    public Expression restExpression2(Expression leftExpr)
	throws JayParserManualException, IOException
    {
	cc = lexer.getNextToken();

	if (isOpToken(cc, OperatorToken.EnumOperator.OR)) {
	    return restExpression1(leftExpr);
	}
	else {

	    lexer.yypushback(lexer.yylength());
	}

	return leftExpr;
    }

    public Expression conjuction()
	throws JayParserManualException, IOException
    {
	return restConjuction2(relation());
    }

    public Expression restConjuction1(Expression leftExpr)
	throws JayParserManualException, IOException
    {

	checkingOpToken(cc, OperatorToken.EnumOperator.AND);

	Expression rightExpr = relation();

	Expression bin = new Binary(Operator.AND,
				    leftExpr, rightExpr);

	return restExpression2(bin);
    }

    public Expression restConjuction2(Expression leftExpr)
	throws JayParserManualException, IOException
    {
	cc = lexer.getNextToken();

	if (isOpToken(cc, OperatorToken.EnumOperator.AND)) {
	    return restConjuction1(leftExpr);
	}
	else {

	    lexer.yypushback(lexer.yylength());
	}

	return leftExpr;
    }


    public Expression relation()
	throws JayParserManualException, IOException
    {
	return restRelation2(addition());
    }

    private Operator fromOpTknToOp(OperatorToken.EnumOperator op)
    {
	Operator ret = Operator.NOT;

	if (op == OperatorToken.EnumOperator.PLUS)
	    ret = Operator.PLUS;
        else if (op == OperatorToken.EnumOperator.MINUS)
	    ret = Operator.MINUS;
	else if (op == OperatorToken.EnumOperator.TIMES)
	    ret = Operator.TIMES;
	else if (op == OperatorToken.EnumOperator.DIVIDE)
	    ret = Operator.DIV;
	else if (op == OperatorToken.EnumOperator.LT)
	    ret = Operator.LT;
	else if (op == OperatorToken.EnumOperator.LET)
	    ret = Operator.LE;
	else if (op == OperatorToken.EnumOperator.GT)
	    ret = Operator.GT;
	else if (op == OperatorToken.EnumOperator.GET)
	    ret = Operator.GE;
	else if (op == OperatorToken.EnumOperator.EQ)
	    ret = Operator.EQ;
	else if (op == OperatorToken.EnumOperator.NEQ)
	    ret = Operator.NE;
	else if (op == OperatorToken.EnumOperator.AND)
	    ret = Operator.AND;
	else if (op == OperatorToken.EnumOperator.OR)
	    ret = Operator.OR;
	else if (op == OperatorToken.EnumOperator.NOT)
	    ret = Operator.NOT;

	return ret;
    }

    public Expression restRelation1(Expression leftExpr)
	throws JayParserManualException, IOException
    {

	OperatorToken.EnumOperator ops[] = {
	    OperatorToken.EnumOperator.LT,
	    OperatorToken.EnumOperator.LET,
	    OperatorToken.EnumOperator.GT,
	    OperatorToken.EnumOperator.GET,
	    OperatorToken.EnumOperator.EQ,
	    OperatorToken.EnumOperator.NEQ
	};

	checkingOpToken(cc, ops);

	Expression rightExpr = addition();

	Expression bin =
	    new Binary(fromOpTknToOp(((OperatorToken) cc).getEnumOperator()),
		       leftExpr, rightExpr);

	return restRelation2(bin);
    }

    public Expression restRelation2(Expression leftExpr)
	throws JayParserManualException, IOException
    {
	cc = lexer.getNextToken();

	OperatorToken.EnumOperator ops[] = {
	    OperatorToken.EnumOperator.LT,
	    OperatorToken.EnumOperator.LET,
	    OperatorToken.EnumOperator.GT,
	    OperatorToken.EnumOperator.GET,
	    OperatorToken.EnumOperator.EQ,
	    OperatorToken.EnumOperator.NEQ
	};

	if (isOpToken(cc, ops)) {
	    return restRelation1(leftExpr);
	}
	else {

	    lexer.yypushback(lexer.yylength());
	}

	return leftExpr;
    }

    public Expression addition()
	throws JayParserManualException, IOException
    {
	return restAddition2(addition());
    }

    public Expression restAddition1(Expression leftExpr)
	throws JayParserManualException, IOException
    {

	OperatorToken.EnumOperator ops[] = {
	    OperatorToken.EnumOperator.PLUS,
	    OperatorToken.EnumOperator.MINUS
	};

	checkingOpToken(cc, ops);

	Expression rightExpr = term();

	Expression bin =
	    new Binary(fromOpTknToOp(((OperatorToken) cc).getEnumOperator()),
		       leftExpr, rightExpr);

	return restAddition2(bin);
    }

    public Expression restAddition2(Expression leftExpr)
	throws JayParserManualException, IOException
    {
	cc = lexer.getNextToken();

	OperatorToken.EnumOperator ops[] = {
	    OperatorToken.EnumOperator.PLUS,
	    OperatorToken.EnumOperator.MINUS
	};


	if (isOpToken(cc, ops)) {

	    return restAddition1(leftExpr);
	}
	else {

	    lexer.yypushback(lexer.yylength());
	}

	return leftExpr;
    }

    public Expression term()
	throws JayParserManualException, IOException
    {
	return restTerm2(negation());
    }

    public Expression restTerm1(Expression leftExpr)
	throws JayParserManualException, IOException
    {

	OperatorToken.EnumOperator ops[] = {
	    OperatorToken.EnumOperator.TIMES,
	    OperatorToken.EnumOperator.DIVIDE
	};

	checkingOpToken(cc, ops);

	Expression rightExpr = negation();

	Expression bin =
	    new Binary(fromOpTknToOp(((OperatorToken) cc).getEnumOperator()),
		       leftExpr, rightExpr);

	return restTerm2(bin);
    }

    public Expression restTerm2(Expression leftExpr)
	throws JayParserManualException, IOException
    {
	cc = lexer.getNextToken();

	OperatorToken.EnumOperator ops[] = {
	    OperatorToken.EnumOperator.TIMES,
	    OperatorToken.EnumOperator.DIVIDE
	};


	if (isOpToken(cc, ops)) {

	    return restTerm1(leftExpr);
	}
	else {

	    lexer.yypushback(lexer.yylength());
	}

	return leftExpr;
    }

    public Expression negation()
	throws JayParserManualException, IOException
    {
	cc = lexer.getNextToken();

	if (isOpToken(cc, OperatorToken.EnumOperator.NOT)) {
	    return new Unary(Operator.NOT, factor());
	}
	else {

	    lexer.yypushback(lexer.yylength());
	}

	return factor();
    }

    public Expression factor()
	throws JayParserManualException, IOException
    {
	cc = lexer.getNextToken();

	if (cc instanceof IdentifierToken) {
	    return new Variable(((IdentifierToken) cc).getId());
	}
	else if (cc instanceof IntegerLiteralToken) {
	    return new IntValue(((IntegerLiteralToken) cc).getValue());
	}
	else if (isSeparatorToken(cc, SeparatorToken.EnumSeparator.LPAREN)) {
	    Expression expr = expression();
	    cc = lexer.getNextToken();
	    if (isSeparatorToken(cc, SeparatorToken.EnumSeparator.RPAREN)) {
		return expr;
	    }
	    throw new JayParserManualException("Expected ) "
					   + " at line: "
					   + cc.getLine()
					   + " col: "
					   + cc.getColumn()
					   + " found: " + cc);
	}

	throw new JayParserManualException("Expected Identifier, number or ( "
					   + " at line: "
					   + cc.getLine()
					   + " col: "
					   + cc.getColumn()
					   + " found: " + cc);
    }
}
