// $ANTLR 3.5.2 JayAst.g 2018-04-12 14:26:29

package co.edu.eafit.dis.st0270.jaycompiler.parser;

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
import co.edu.eafit.dis.st0270.jaycompiler.ast.Program;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Skip;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Statement;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Type;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Unary;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Value;
import co.edu.eafit.dis.st0270.jaycompiler.ast.Variable;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JayAstParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADDOPER", "AND", "ASSIGN", "BOOLLIT", 
		"COMMA", "COMMENT", "DIVOPER", "ELSE", "EQ", "GET", "GT", "ID", "IF", 
		"INT", "LCURLY", "LET", "LPAREN", "LT", "MAIN", "NEG", "NEQ", "OR", "RCURLY", 
		"RPAREN", "SEMI", "SUBOPER", "TBOOL", "TIMESOPER", "TINT", "VOID", "WHILE", 
		"WS"
	};
	public static final int EOF=-1;
	public static final int ADDOPER=4;
	public static final int AND=5;
	public static final int ASSIGN=6;
	public static final int BOOLLIT=7;
	public static final int COMMA=8;
	public static final int COMMENT=9;
	public static final int DIVOPER=10;
	public static final int ELSE=11;
	public static final int EQ=12;
	public static final int GET=13;
	public static final int GT=14;
	public static final int ID=15;
	public static final int IF=16;
	public static final int INT=17;
	public static final int LCURLY=18;
	public static final int LET=19;
	public static final int LPAREN=20;
	public static final int LT=21;
	public static final int MAIN=22;
	public static final int NEG=23;
	public static final int NEQ=24;
	public static final int OR=25;
	public static final int RCURLY=26;
	public static final int RPAREN=27;
	public static final int SEMI=28;
	public static final int SUBOPER=29;
	public static final int TBOOL=30;
	public static final int TIMESOPER=31;
	public static final int TINT=32;
	public static final int VOID=33;
	public static final int WHILE=34;
	public static final int WS=35;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public JayAstParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public JayAstParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return JayAstParser.tokenNames; }
	@Override public String getGrammarFileName() { return "JayAst.g"; }



	// $ANTLR start "program"
	// JayAst.g:33:1: program returns [Program prog] : VOID MAIN LPAREN RPAREN LCURLY decls= declarations stmts= statements RCURLY EOF ;
	public final Program program() throws RecognitionException {
		Program prog = null;


		ArrayList<Declaration> decls =null;
		ArrayList<Statement> stmts =null;

		try {
			// JayAst.g:34:2: ( VOID MAIN LPAREN RPAREN LCURLY decls= declarations stmts= statements RCURLY EOF )
			// JayAst.g:34:4: VOID MAIN LPAREN RPAREN LCURLY decls= declarations stmts= statements RCURLY EOF
			{
			match(input,VOID,FOLLOW_VOID_in_program42); 
			match(input,MAIN,FOLLOW_MAIN_in_program44); 
			match(input,LPAREN,FOLLOW_LPAREN_in_program46); 
			match(input,RPAREN,FOLLOW_RPAREN_in_program48); 
			match(input,LCURLY,FOLLOW_LCURLY_in_program50); 
			pushFollow(FOLLOW_declarations_in_program54);
			decls=declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_program95);
			stmts=statements();
			state._fsp--;

			match(input,RCURLY,FOLLOW_RCURLY_in_program97); 
			match(input,EOF,FOLLOW_EOF_in_program99); 
			 prog = new Program(decls,new Block(stmts)); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return prog;
	}
	// $ANTLR end "program"



	// $ANTLR start "declarations"
	// JayAst.g:39:1: declarations returns [ArrayList<Declaration> decls] : (decl= declaration )* ;
	public final ArrayList<Declaration> declarations() throws RecognitionException {
		ArrayList<Declaration> decls = null;


		ArrayList<Declaration> decl =null;


		   decls = new ArrayList<Declaration>();

		try {
			// JayAst.g:43:2: ( (decl= declaration )* )
			// JayAst.g:43:4: (decl= declaration )*
			{
			// JayAst.g:43:4: (decl= declaration )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==TBOOL||LA1_0==TINT) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// JayAst.g:43:5: decl= declaration
					{
					pushFollow(FOLLOW_declaration_in_declarations140);
					decl=declaration();
					state._fsp--;

					 decls.addAll(decl); 
					}
					break;

				default :
					break loop1;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return decls;
	}
	// $ANTLR end "declarations"



	// $ANTLR start "declaration"
	// JayAst.g:46:1: declaration returns [ArrayList<Declaration> decl] : ty= type ids= identifiers SEMI ;
	public final ArrayList<Declaration> declaration() throws RecognitionException {
		ArrayList<Declaration> decl = null;


		Type ty =null;
		ArrayList<Variable> ids =null;


		  decl = new ArrayList<Declaration>();

		try {
			// JayAst.g:50:2: (ty= type ids= identifiers SEMI )
			// JayAst.g:50:4: ty= type ids= identifiers SEMI
			{
			pushFollow(FOLLOW_type_in_declaration166);
			ty=type();
			state._fsp--;

			pushFollow(FOLLOW_identifiers_in_declaration170);
			ids=identifiers();
			state._fsp--;

			match(input,SEMI,FOLLOW_SEMI_in_declaration172); 
			  for (Variable v : ids)
			               decl.add(new Declaration(v, ty));
			        
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return decl;
	}
	// $ANTLR end "declaration"



	// $ANTLR start "type"
	// JayAst.g:56:1: type returns [Type ty] : ( TINT | TBOOL );
	public final Type type() throws RecognitionException {
		Type ty = null;


		try {
			// JayAst.g:57:2: ( TINT | TBOOL )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==TINT) ) {
				alt2=1;
			}
			else if ( (LA2_0==TBOOL) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// JayAst.g:57:4: TINT
					{
					match(input,TINT,FOLLOW_TINT_in_type197); 
					 ty = new Type(Type.EnumType.INTEGER); 
					}
					break;
				case 2 :
					// JayAst.g:58:4: TBOOL
					{
					match(input,TBOOL,FOLLOW_TBOOL_in_type212); 
					 ty = new Type(Type.EnumType.BOOLEAN); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ty;
	}
	// $ANTLR end "type"



	// $ANTLR start "identifiers"
	// JayAst.g:61:1: identifiers returns [ArrayList<Variable> ids] : id= ID ( COMMA id2= ID )* ;
	public final ArrayList<Variable> identifiers() throws RecognitionException {
		ArrayList<Variable> ids = null;


		Token id=null;
		Token id2=null;


		  ids = new ArrayList<Variable>();

		try {
			// JayAst.g:65:2: (id= ID ( COMMA id2= ID )* )
			// JayAst.g:65:4: id= ID ( COMMA id2= ID )*
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_identifiers242); 
			 ids.add(new Variable((id!=null?id.getText():null))); 
			// JayAst.g:65:48: ( COMMA id2= ID )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==COMMA) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// JayAst.g:65:49: COMMA id2= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_identifiers247); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_identifiers251); 
					 ids.add(new Variable((id2!=null?id2.getText():null))); 
					}
					break;

				default :
					break loop3;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ids;
	}
	// $ANTLR end "identifiers"



	// $ANTLR start "statements"
	// JayAst.g:69:1: statements returns [ArrayList<Statement> stmts] : (stm= statement )* ;
	public final ArrayList<Statement> statements() throws RecognitionException {
		ArrayList<Statement> stmts = null;


		Statement stm =null;


		   stmts = new ArrayList<Statement>();

		try {
			// JayAst.g:73:2: ( (stm= statement )* )
			// JayAst.g:73:4: (stm= statement )*
			{
			// JayAst.g:73:4: (stm= statement )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= ID && LA4_0 <= IF)||LA4_0==LCURLY||LA4_0==SEMI||LA4_0==WHILE) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// JayAst.g:73:5: stm= statement
					{
					pushFollow(FOLLOW_statement_in_statements277);
					stm=statement();
					state._fsp--;

					 stmts.add(stm); 
					}
					break;

				default :
					break loop4;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stmts;
	}
	// $ANTLR end "statements"



	// $ANTLR start "statement"
	// JayAst.g:76:1: statement returns [Statement stm] : ( SEMI |blk= block |assign= assignment |ifstm= ifstatement |loop= whilestatement );
	public final Statement statement() throws RecognitionException {
		Statement stm = null;


		Statement blk =null;
		Assignment assign =null;
		Statement ifstm =null;
		Statement loop =null;

		try {
			// JayAst.g:77:2: ( SEMI |blk= block |assign= assignment |ifstm= ifstatement |loop= whilestatement )
			int alt5=5;
			switch ( input.LA(1) ) {
			case SEMI:
				{
				alt5=1;
				}
				break;
			case LCURLY:
				{
				alt5=2;
				}
				break;
			case ID:
				{
				alt5=3;
				}
				break;
			case IF:
				{
				alt5=4;
				}
				break;
			case WHILE:
				{
				alt5=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// JayAst.g:77:4: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_statement296); 
					 stm = new Skip(); 
					}
					break;
				case 2 :
					// JayAst.g:78:4: blk= block
					{
					pushFollow(FOLLOW_block_in_statement319);
					blk=block();
					state._fsp--;

					 stm = blk; 
					}
					break;
				case 3 :
					// JayAst.g:79:4: assign= assignment
					{
					pushFollow(FOLLOW_assignment_in_statement339);
					assign=assignment();
					state._fsp--;

					 stm = assign; 
					}
					break;
				case 4 :
					// JayAst.g:80:4: ifstm= ifstatement
					{
					pushFollow(FOLLOW_ifstatement_in_statement351);
					ifstm=ifstatement();
					state._fsp--;

					 stm = ifstm; 
					}
					break;
				case 5 :
					// JayAst.g:81:4: loop= whilestatement
					{
					pushFollow(FOLLOW_whilestatement_in_statement363);
					loop=whilestatement();
					state._fsp--;

					 stm = loop; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stm;
	}
	// $ANTLR end "statement"



	// $ANTLR start "block"
	// JayAst.g:84:1: block returns [Statement stm] : LCURLY stms= statements RCURLY ;
	public final Statement block() throws RecognitionException {
		Statement stm = null;


		ArrayList<Statement> stms =null;

		try {
			// JayAst.g:85:5: ( LCURLY stms= statements RCURLY )
			// JayAst.g:85:7: LCURLY stms= statements RCURLY
			{
			match(input,LCURLY,FOLLOW_LCURLY_in_block384); 
			pushFollow(FOLLOW_statements_in_block388);
			stms=statements();
			state._fsp--;

			match(input,RCURLY,FOLLOW_RCURLY_in_block390); 
			 stm = new Block(stms); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stm;
	}
	// $ANTLR end "block"



	// $ANTLR start "assignment"
	// JayAst.g:88:1: assignment returns [Assignment asg] : ID ASSIGN expr= expression SEMI ;
	public final Assignment assignment() throws RecognitionException {
		Assignment asg = null;


		Token ID1=null;
		Expression expr =null;

		try {
			// JayAst.g:89:2: ( ID ASSIGN expr= expression SEMI )
			// JayAst.g:89:4: ID ASSIGN expr= expression SEMI
			{
			ID1=(Token)match(input,ID,FOLLOW_ID_in_assignment407); 
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment409); 
			pushFollow(FOLLOW_expression_in_assignment413);
			expr=expression();
			state._fsp--;

			match(input,SEMI,FOLLOW_SEMI_in_assignment415); 
			 asg = new Assignment(new Variable((ID1!=null?ID1.getText():null)), expr); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return asg;
	}
	// $ANTLR end "assignment"



	// $ANTLR start "ifstatement"
	// JayAst.g:93:1: ifstatement returns [Statement stm] : IF LPAREN expr= expression RPAREN thenstm= statement ( options {greedy=true; } : ELSE elsestm= statement )? ;
	public final Statement ifstatement() throws RecognitionException {
		Statement stm = null;


		Expression expr =null;
		Statement thenstm =null;
		Statement elsestm =null;

		try {
			// JayAst.g:94:2: ( IF LPAREN expr= expression RPAREN thenstm= statement ( options {greedy=true; } : ELSE elsestm= statement )? )
			// JayAst.g:94:4: IF LPAREN expr= expression RPAREN thenstm= statement ( options {greedy=true; } : ELSE elsestm= statement )?
			{
			match(input,IF,FOLLOW_IF_in_ifstatement440); 
			match(input,LPAREN,FOLLOW_LPAREN_in_ifstatement442); 
			pushFollow(FOLLOW_expression_in_ifstatement446);
			expr=expression();
			state._fsp--;

			match(input,RPAREN,FOLLOW_RPAREN_in_ifstatement448); 
			pushFollow(FOLLOW_statement_in_ifstatement452);
			thenstm=statement();
			state._fsp--;

			// JayAst.g:94:55: ( options {greedy=true; } : ELSE elsestm= statement )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ELSE) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// JayAst.g:94:81: ELSE elsestm= statement
					{
					match(input,ELSE,FOLLOW_ELSE_in_ifstatement464); 
					pushFollow(FOLLOW_statement_in_ifstatement468);
					elsestm=statement();
					state._fsp--;

					}
					break;

			}

			 stm = new Conditional(expr, thenstm, elsestm); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stm;
	}
	// $ANTLR end "ifstatement"



	// $ANTLR start "whilestatement"
	// JayAst.g:98:1: whilestatement returns [Statement stm] : WHILE LPAREN expr= expression RPAREN body= statement ;
	public final Statement whilestatement() throws RecognitionException {
		Statement stm = null;


		Expression expr =null;
		Statement body =null;

		try {
			// JayAst.g:99:2: ( WHILE LPAREN expr= expression RPAREN body= statement )
			// JayAst.g:99:4: WHILE LPAREN expr= expression RPAREN body= statement
			{
			match(input,WHILE,FOLLOW_WHILE_in_whilestatement495); 
			match(input,LPAREN,FOLLOW_LPAREN_in_whilestatement497); 
			pushFollow(FOLLOW_expression_in_whilestatement501);
			expr=expression();
			state._fsp--;

			match(input,RPAREN,FOLLOW_RPAREN_in_whilestatement503); 
			pushFollow(FOLLOW_statement_in_whilestatement507);
			body=statement();
			state._fsp--;

			 stm = new Loop(expr, body); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return stm;
	}
	// $ANTLR end "whilestatement"



	// $ANTLR start "expression"
	// JayAst.g:103:1: expression returns [Expression expr] : left= conjunction ( OR right= conjunction )* ;
	public final Expression expression() throws RecognitionException {
		Expression expr = null;


		Expression left =null;
		Expression right =null;

		try {
			// JayAst.g:104:2: (left= conjunction ( OR right= conjunction )* )
			// JayAst.g:104:4: left= conjunction ( OR right= conjunction )*
			{
			pushFollow(FOLLOW_conjunction_in_expression534);
			left=conjunction();
			state._fsp--;

			 expr = left; 
			// JayAst.g:104:39: ( OR right= conjunction )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==OR) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// JayAst.g:104:40: OR right= conjunction
					{
					match(input,OR,FOLLOW_OR_in_expression539); 
					pushFollow(FOLLOW_conjunction_in_expression543);
					right=conjunction();
					state._fsp--;

					 expr = new Binary(Operator.OR, expr, right);
					}
					break;

				default :
					break loop7;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "expression"



	// $ANTLR start "conjunction"
	// JayAst.g:107:1: conjunction returns [Expression expr] : left= relation ( AND right= relation )* ;
	public final Expression conjunction() throws RecognitionException {
		Expression expr = null;


		Expression left =null;
		Expression right =null;

		try {
			// JayAst.g:108:2: (left= relation ( AND right= relation )* )
			// JayAst.g:108:4: left= relation ( AND right= relation )*
			{
			pushFollow(FOLLOW_relation_in_conjunction564);
			left=relation();
			state._fsp--;

			 expr = left; 
			// JayAst.g:108:36: ( AND right= relation )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==AND) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// JayAst.g:108:37: AND right= relation
					{
					match(input,AND,FOLLOW_AND_in_conjunction569); 
					pushFollow(FOLLOW_relation_in_conjunction573);
					right=relation();
					state._fsp--;

					 expr = new Binary(Operator.AND, expr, right);
					}
					break;

				default :
					break loop8;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "conjunction"



	// $ANTLR start "relation"
	// JayAst.g:111:1: relation returns [Expression relation] : left= addition (op= reloper right= addition )* ;
	public final Expression relation() throws RecognitionException {
		Expression relation = null;


		Expression left =null;
		Operator op =null;
		Expression right =null;

		try {
			// JayAst.g:112:2: (left= addition (op= reloper right= addition )* )
			// JayAst.g:112:4: left= addition (op= reloper right= addition )*
			{
			pushFollow(FOLLOW_addition_in_relation594);
			left=addition();
			state._fsp--;

			 relation = left; 
			// JayAst.g:112:41: (op= reloper right= addition )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= EQ && LA9_0 <= GT)||LA9_0==LET||LA9_0==LT||LA9_0==NEQ) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// JayAst.g:112:42: op= reloper right= addition
					{
					pushFollow(FOLLOW_reloper_in_relation602);
					op=reloper();
					state._fsp--;

					pushFollow(FOLLOW_addition_in_relation606);
					right=addition();
					state._fsp--;

					 relation = new Binary(op, relation, right); 
					}
					break;

				default :
					break loop9;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return relation;
	}
	// $ANTLR end "relation"



	// $ANTLR start "reloper"
	// JayAst.g:115:1: reloper returns [Operator op] : ( LT | LET | GT | GET | EQ | NEQ );
	public final Operator reloper() throws RecognitionException {
		Operator op = null;


		try {
			// JayAst.g:116:5: ( LT | LET | GT | GET | EQ | NEQ )
			int alt10=6;
			switch ( input.LA(1) ) {
			case LT:
				{
				alt10=1;
				}
				break;
			case LET:
				{
				alt10=2;
				}
				break;
			case GT:
				{
				alt10=3;
				}
				break;
			case GET:
				{
				alt10=4;
				}
				break;
			case EQ:
				{
				alt10=5;
				}
				break;
			case NEQ:
				{
				alt10=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// JayAst.g:116:7: LT
					{
					match(input,LT,FOLLOW_LT_in_reloper629); 
					 op = Operator.LT; 
					}
					break;
				case 2 :
					// JayAst.g:117:4: LET
					{
					match(input,LET,FOLLOW_LET_in_reloper642); 
					 op = Operator.LE; 
					}
					break;
				case 3 :
					// JayAst.g:118:4: GT
					{
					match(input,GT,FOLLOW_GT_in_reloper654); 
					 op = Operator.GT; 
					}
					break;
				case 4 :
					// JayAst.g:119:4: GET
					{
					match(input,GET,FOLLOW_GET_in_reloper667); 
					 op = Operator.GE; 
					}
					break;
				case 5 :
					// JayAst.g:120:4: EQ
					{
					match(input,EQ,FOLLOW_EQ_in_reloper679); 
					 op = Operator.EQ; 
					}
					break;
				case 6 :
					// JayAst.g:121:4: NEQ
					{
					match(input,NEQ,FOLLOW_NEQ_in_reloper692); 
					 op = Operator.NE; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "reloper"



	// $ANTLR start "addition"
	// JayAst.g:124:1: addition returns [Expression addition] : left= term (op= addopers right= term )* ;
	public final Expression addition() throws RecognitionException {
		Expression addition = null;


		Expression left =null;
		Operator op =null;
		Expression right =null;

		try {
			// JayAst.g:125:2: (left= term (op= addopers right= term )* )
			// JayAst.g:125:4: left= term (op= addopers right= term )*
			{
			pushFollow(FOLLOW_term_in_addition716);
			left=term();
			state._fsp--;

			 addition = left; 
			// JayAst.g:125:37: (op= addopers right= term )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==ADDOPER||LA11_0==SUBOPER) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// JayAst.g:125:38: op= addopers right= term
					{
					pushFollow(FOLLOW_addopers_in_addition724);
					op=addopers();
					state._fsp--;

					pushFollow(FOLLOW_term_in_addition728);
					right=term();
					state._fsp--;

					 addition = new Binary(op, addition, right); 
					}
					break;

				default :
					break loop11;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return addition;
	}
	// $ANTLR end "addition"



	// $ANTLR start "addopers"
	// JayAst.g:128:1: addopers returns [Operator op] : ( ADDOPER | SUBOPER );
	public final Operator addopers() throws RecognitionException {
		Operator op = null;


		try {
			// JayAst.g:129:2: ( ADDOPER | SUBOPER )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==ADDOPER) ) {
				alt12=1;
			}
			else if ( (LA12_0==SUBOPER) ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// JayAst.g:129:4: ADDOPER
					{
					match(input,ADDOPER,FOLLOW_ADDOPER_in_addopers747); 
					 op = Operator.PLUS; 
					}
					break;
				case 2 :
					// JayAst.g:130:4: SUBOPER
					{
					match(input,SUBOPER,FOLLOW_SUBOPER_in_addopers754); 
					 op = Operator.MINUS; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "addopers"



	// $ANTLR start "term"
	// JayAst.g:133:1: term returns [Expression term] : left= negation (op= multopers right= negation )* ;
	public final Expression term() throws RecognitionException {
		Expression term = null;


		Expression left =null;
		Operator op =null;
		Expression right =null;

		try {
			// JayAst.g:134:2: (left= negation (op= multopers right= negation )* )
			// JayAst.g:134:4: left= negation (op= multopers right= negation )*
			{
			pushFollow(FOLLOW_negation_in_term776);
			left=negation();
			state._fsp--;

			 term = left; 
			// JayAst.g:134:36: (op= multopers right= negation )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==DIVOPER||LA13_0==TIMESOPER) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// JayAst.g:134:37: op= multopers right= negation
					{
					pushFollow(FOLLOW_multopers_in_term783);
					op=multopers();
					state._fsp--;

					pushFollow(FOLLOW_negation_in_term787);
					right=negation();
					state._fsp--;

					 term = new Binary(op, term, right); 
					}
					break;

				default :
					break loop13;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return term;
	}
	// $ANTLR end "term"



	// $ANTLR start "multopers"
	// JayAst.g:138:1: multopers returns [Operator op] : ( TIMESOPER | DIVOPER );
	public final Operator multopers() throws RecognitionException {
		Operator op = null;


		try {
			// JayAst.g:139:2: ( TIMESOPER | DIVOPER )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==TIMESOPER) ) {
				alt14=1;
			}
			else if ( (LA14_0==DIVOPER) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// JayAst.g:139:4: TIMESOPER
					{
					match(input,TIMESOPER,FOLLOW_TIMESOPER_in_multopers807); 
					 op = Operator.TIMES; 
					}
					break;
				case 2 :
					// JayAst.g:140:4: DIVOPER
					{
					match(input,DIVOPER,FOLLOW_DIVOPER_in_multopers814); 
					 op = Operator.DIV; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return op;
	}
	// $ANTLR end "multopers"



	// $ANTLR start "negation"
	// JayAst.g:143:1: negation returns [Expression expr] : ( NEG )? fac= factor ;
	public final Expression negation() throws RecognitionException {
		Expression expr = null;


		Expression fac =null;


		    boolean neg = false;

		try {
			// JayAst.g:147:2: ( ( NEG )? fac= factor )
			// JayAst.g:147:4: ( NEG )? fac= factor
			{
			// JayAst.g:147:4: ( NEG )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==NEG) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// JayAst.g:147:5: NEG
					{
					match(input,NEG,FOLLOW_NEG_in_negation838); 
					neg = true; 
					}
					break;

			}

			pushFollow(FOLLOW_factor_in_negation846);
			fac=factor();
			state._fsp--;

			 expr = neg ? new Unary(Operator.NOT,fac) : fac; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "negation"



	// $ANTLR start "factor"
	// JayAst.g:151:1: factor returns [Expression expr] : ( ID |lit= literal | LPAREN expression RPAREN );
	public final Expression factor() throws RecognitionException {
		Expression expr = null;


		Token ID2=null;
		Value lit =null;

		try {
			// JayAst.g:152:2: ( ID |lit= literal | LPAREN expression RPAREN )
			int alt16=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt16=1;
				}
				break;
			case BOOLLIT:
			case INT:
				{
				alt16=2;
				}
				break;
			case LPAREN:
				{
				alt16=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// JayAst.g:152:4: ID
					{
					ID2=(Token)match(input,ID,FOLLOW_ID_in_factor869); 
					 expr = new Variable((ID2!=null?ID2.getText():null)); 
					}
					break;
				case 2 :
					// JayAst.g:153:4: lit= literal
					{
					pushFollow(FOLLOW_literal_in_factor880);
					lit=literal();
					state._fsp--;

					 expr =  lit; 
					}
					break;
				case 3 :
					// JayAst.g:154:4: LPAREN expression RPAREN
					{
					match(input,LPAREN,FOLLOW_LPAREN_in_factor887); 
					pushFollow(FOLLOW_expression_in_factor889);
					expression();
					state._fsp--;

					match(input,RPAREN,FOLLOW_RPAREN_in_factor891); 
					 expr = null; 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return expr;
	}
	// $ANTLR end "factor"



	// $ANTLR start "literal"
	// JayAst.g:157:1: literal returns [Value val] : ( INT | BOOLLIT );
	public final Value literal() throws RecognitionException {
		Value val = null;


		Token INT3=null;
		Token BOOLLIT4=null;

		try {
			// JayAst.g:158:2: ( INT | BOOLLIT )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==INT) ) {
				alt17=1;
			}
			else if ( (LA17_0==BOOLLIT) ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// JayAst.g:158:4: INT
					{
					INT3=(Token)match(input,INT,FOLLOW_INT_in_literal908); 
					 val = new IntValue((INT3!=null?INT3.getText():null)); 
					}
					break;
				case 2 :
					// JayAst.g:159:4: BOOLLIT
					{
					BOOLLIT4=(Token)match(input,BOOLLIT,FOLLOW_BOOLLIT_in_literal915); 
					 val = new BoolValue((BOOLLIT4!=null?BOOLLIT4.getText():null)); 
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return val;
	}
	// $ANTLR end "literal"

	// Delegated rules



	public static final BitSet FOLLOW_VOID_in_program42 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_MAIN_in_program44 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_LPAREN_in_program46 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_program48 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LCURLY_in_program50 = new BitSet(new long[]{0x0000000554058000L});
	public static final BitSet FOLLOW_declarations_in_program54 = new BitSet(new long[]{0x0000000414058000L});
	public static final BitSet FOLLOW_statements_in_program95 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RCURLY_in_program97 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program99 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations140 = new BitSet(new long[]{0x0000000140000002L});
	public static final BitSet FOLLOW_type_in_declaration166 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifiers_in_declaration170 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_declaration172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TINT_in_type197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TBOOL_in_type212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identifiers242 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_COMMA_in_identifiers247 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_identifiers251 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_statement_in_statements277 = new BitSet(new long[]{0x0000000410058002L});
	public static final BitSet FOLLOW_SEMI_in_statement296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_statement319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstatement_in_statement351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestatement_in_statement363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_block384 = new BitSet(new long[]{0x0000000414058000L});
	public static final BitSet FOLLOW_statements_in_block388 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RCURLY_in_block390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment407 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment409 = new BitSet(new long[]{0x0000000000928080L});
	public static final BitSet FOLLOW_expression_in_assignment413 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_assignment415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifstatement440 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_LPAREN_in_ifstatement442 = new BitSet(new long[]{0x0000000000928080L});
	public static final BitSet FOLLOW_expression_in_ifstatement446 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_ifstatement448 = new BitSet(new long[]{0x0000000410058000L});
	public static final BitSet FOLLOW_statement_in_ifstatement452 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ELSE_in_ifstatement464 = new BitSet(new long[]{0x0000000410058000L});
	public static final BitSet FOLLOW_statement_in_ifstatement468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whilestatement495 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_LPAREN_in_whilestatement497 = new BitSet(new long[]{0x0000000000928080L});
	public static final BitSet FOLLOW_expression_in_whilestatement501 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_whilestatement503 = new BitSet(new long[]{0x0000000410058000L});
	public static final BitSet FOLLOW_statement_in_whilestatement507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conjunction_in_expression534 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_OR_in_expression539 = new BitSet(new long[]{0x0000000000928080L});
	public static final BitSet FOLLOW_conjunction_in_expression543 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_relation_in_conjunction564 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AND_in_conjunction569 = new BitSet(new long[]{0x0000000000928080L});
	public static final BitSet FOLLOW_relation_in_conjunction573 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_addition_in_relation594 = new BitSet(new long[]{0x0000000001287002L});
	public static final BitSet FOLLOW_reloper_in_relation602 = new BitSet(new long[]{0x0000000000928080L});
	public static final BitSet FOLLOW_addition_in_relation606 = new BitSet(new long[]{0x0000000001287002L});
	public static final BitSet FOLLOW_LT_in_reloper629 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LET_in_reloper642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GT_in_reloper654 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GET_in_reloper667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EQ_in_reloper679 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEQ_in_reloper692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_addition716 = new BitSet(new long[]{0x0000000020000012L});
	public static final BitSet FOLLOW_addopers_in_addition724 = new BitSet(new long[]{0x0000000000928080L});
	public static final BitSet FOLLOW_term_in_addition728 = new BitSet(new long[]{0x0000000020000012L});
	public static final BitSet FOLLOW_ADDOPER_in_addopers747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SUBOPER_in_addopers754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_negation_in_term776 = new BitSet(new long[]{0x0000000080000402L});
	public static final BitSet FOLLOW_multopers_in_term783 = new BitSet(new long[]{0x0000000000928080L});
	public static final BitSet FOLLOW_negation_in_term787 = new BitSet(new long[]{0x0000000080000402L});
	public static final BitSet FOLLOW_TIMESOPER_in_multopers807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIVOPER_in_multopers814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEG_in_negation838 = new BitSet(new long[]{0x0000000000128080L});
	public static final BitSet FOLLOW_factor_in_negation846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_factor880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_factor887 = new BitSet(new long[]{0x0000000000928080L});
	public static final BitSet FOLLOW_expression_in_factor889 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_factor891 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_literal908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLLIT_in_literal915 = new BitSet(new long[]{0x0000000000000002L});
}
