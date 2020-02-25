// $ANTLR 3.5.2 Jay.g 2018-04-12 14:26:29

package co.edu.eafit.dis.st0270.jaycompiler.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class JayParser extends Parser {
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


	public JayParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public JayParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return JayParser.tokenNames; }
	@Override public String getGrammarFileName() { return "Jay.g"; }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// Jay.g:16:1: program : VOID MAIN LPAREN RPAREN LCURLY declarations statements RCURLY EOF ;
	public final JayParser.program_return program() throws RecognitionException {
		JayParser.program_return retval = new JayParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VOID1=null;
		Token MAIN2=null;
		Token LPAREN3=null;
		Token RPAREN4=null;
		Token LCURLY5=null;
		Token RCURLY8=null;
		Token EOF9=null;
		ParserRuleReturnScope declarations6 =null;
		ParserRuleReturnScope statements7 =null;

		Object VOID1_tree=null;
		Object MAIN2_tree=null;
		Object LPAREN3_tree=null;
		Object RPAREN4_tree=null;
		Object LCURLY5_tree=null;
		Object RCURLY8_tree=null;
		Object EOF9_tree=null;

		try {
			// Jay.g:17:2: ( VOID MAIN LPAREN RPAREN LCURLY declarations statements RCURLY EOF )
			// Jay.g:17:4: VOID MAIN LPAREN RPAREN LCURLY declarations statements RCURLY EOF
			{
			root_0 = (Object)adaptor.nil();


			VOID1=(Token)match(input,VOID,FOLLOW_VOID_in_program51); 
			VOID1_tree = (Object)adaptor.create(VOID1);
			adaptor.addChild(root_0, VOID1_tree);

			MAIN2=(Token)match(input,MAIN,FOLLOW_MAIN_in_program53); 
			MAIN2_tree = (Object)adaptor.create(MAIN2);
			adaptor.addChild(root_0, MAIN2_tree);

			LPAREN3=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_program55); 
			LPAREN3_tree = (Object)adaptor.create(LPAREN3);
			adaptor.addChild(root_0, LPAREN3_tree);

			RPAREN4=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_program57); 
			RPAREN4_tree = (Object)adaptor.create(RPAREN4);
			adaptor.addChild(root_0, RPAREN4_tree);

			LCURLY5=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_program59); 
			LCURLY5_tree = (Object)adaptor.create(LCURLY5);
			adaptor.addChild(root_0, LCURLY5_tree);

			pushFollow(FOLLOW_declarations_in_program61);
			declarations6=declarations();
			state._fsp--;

			adaptor.addChild(root_0, declarations6.getTree());

			pushFollow(FOLLOW_statements_in_program63);
			statements7=statements();
			state._fsp--;

			adaptor.addChild(root_0, statements7.getTree());

			RCURLY8=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_program65); 
			RCURLY8_tree = (Object)adaptor.create(RCURLY8);
			adaptor.addChild(root_0, RCURLY8_tree);

			EOF9=(Token)match(input,EOF,FOLLOW_EOF_in_program67); 
			EOF9_tree = (Object)adaptor.create(EOF9);
			adaptor.addChild(root_0, EOF9_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class declarations_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declarations"
	// Jay.g:20:1: declarations : ( declaration )* ;
	public final JayParser.declarations_return declarations() throws RecognitionException {
		JayParser.declarations_return retval = new JayParser.declarations_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope declaration10 =null;


		try {
			// Jay.g:21:2: ( ( declaration )* )
			// Jay.g:21:4: ( declaration )*
			{
			root_0 = (Object)adaptor.nil();


			// Jay.g:21:4: ( declaration )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==TBOOL||LA1_0==TINT) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Jay.g:21:5: declaration
					{
					pushFollow(FOLLOW_declaration_in_declarations79);
					declaration10=declaration();
					state._fsp--;

					adaptor.addChild(root_0, declaration10.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarations"


	public static class declaration_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// Jay.g:24:1: declaration : type identifiers SEMI ;
	public final JayParser.declaration_return declaration() throws RecognitionException {
		JayParser.declaration_return retval = new JayParser.declaration_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMI13=null;
		ParserRuleReturnScope type11 =null;
		ParserRuleReturnScope identifiers12 =null;

		Object SEMI13_tree=null;

		try {
			// Jay.g:25:2: ( type identifiers SEMI )
			// Jay.g:25:4: type identifiers SEMI
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_type_in_declaration92);
			type11=type();
			state._fsp--;

			adaptor.addChild(root_0, type11.getTree());

			pushFollow(FOLLOW_identifiers_in_declaration94);
			identifiers12=identifiers();
			state._fsp--;

			adaptor.addChild(root_0, identifiers12.getTree());

			SEMI13=(Token)match(input,SEMI,FOLLOW_SEMI_in_declaration96); 
			SEMI13_tree = (Object)adaptor.create(SEMI13);
			adaptor.addChild(root_0, SEMI13_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class type_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "type"
	// Jay.g:28:1: type : ( TINT | TBOOL );
	public final JayParser.type_return type() throws RecognitionException {
		JayParser.type_return retval = new JayParser.type_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set14=null;

		Object set14_tree=null;

		try {
			// Jay.g:29:2: ( TINT | TBOOL )
			// Jay.g:
			{
			root_0 = (Object)adaptor.nil();


			set14=input.LT(1);
			if ( input.LA(1)==TBOOL||input.LA(1)==TINT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set14));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class identifiers_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "identifiers"
	// Jay.g:33:1: identifiers : ID ( COMMA ID )* ;
	public final JayParser.identifiers_return identifiers() throws RecognitionException {
		JayParser.identifiers_return retval = new JayParser.identifiers_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID15=null;
		Token COMMA16=null;
		Token ID17=null;

		Object ID15_tree=null;
		Object COMMA16_tree=null;
		Object ID17_tree=null;

		try {
			// Jay.g:34:2: ( ID ( COMMA ID )* )
			// Jay.g:34:4: ID ( COMMA ID )*
			{
			root_0 = (Object)adaptor.nil();


			ID15=(Token)match(input,ID,FOLLOW_ID_in_identifiers123); 
			ID15_tree = (Object)adaptor.create(ID15);
			adaptor.addChild(root_0, ID15_tree);

			// Jay.g:34:7: ( COMMA ID )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==COMMA) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// Jay.g:34:8: COMMA ID
					{
					COMMA16=(Token)match(input,COMMA,FOLLOW_COMMA_in_identifiers126); 
					COMMA16_tree = (Object)adaptor.create(COMMA16);
					adaptor.addChild(root_0, COMMA16_tree);

					ID17=(Token)match(input,ID,FOLLOW_ID_in_identifiers128); 
					ID17_tree = (Object)adaptor.create(ID17);
					adaptor.addChild(root_0, ID17_tree);

					}
					break;

				default :
					break loop2;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identifiers"


	public static class statements_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// Jay.g:37:1: statements : ( statement )* ;
	public final JayParser.statements_return statements() throws RecognitionException {
		JayParser.statements_return retval = new JayParser.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope statement18 =null;


		try {
			// Jay.g:38:2: ( ( statement )* )
			// Jay.g:38:4: ( statement )*
			{
			root_0 = (Object)adaptor.nil();


			// Jay.g:38:4: ( statement )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= ID && LA3_0 <= IF)||LA3_0==LCURLY||LA3_0==SEMI||LA3_0==WHILE) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Jay.g:38:4: statement
					{
					pushFollow(FOLLOW_statement_in_statements141);
					statement18=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement18.getTree());

					}
					break;

				default :
					break loop3;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statements"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// Jay.g:41:1: statement : ( SEMI | block | assignment | ifstatement | whilestatement );
	public final JayParser.statement_return statement() throws RecognitionException {
		JayParser.statement_return retval = new JayParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMI19=null;
		ParserRuleReturnScope block20 =null;
		ParserRuleReturnScope assignment21 =null;
		ParserRuleReturnScope ifstatement22 =null;
		ParserRuleReturnScope whilestatement23 =null;

		Object SEMI19_tree=null;

		try {
			// Jay.g:42:2: ( SEMI | block | assignment | ifstatement | whilestatement )
			int alt4=5;
			switch ( input.LA(1) ) {
			case SEMI:
				{
				alt4=1;
				}
				break;
			case LCURLY:
				{
				alt4=2;
				}
				break;
			case ID:
				{
				alt4=3;
				}
				break;
			case IF:
				{
				alt4=4;
				}
				break;
			case WHILE:
				{
				alt4=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// Jay.g:42:4: SEMI
					{
					root_0 = (Object)adaptor.nil();


					SEMI19=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement153); 
					SEMI19_tree = (Object)adaptor.create(SEMI19);
					adaptor.addChild(root_0, SEMI19_tree);

					}
					break;
				case 2 :
					// Jay.g:43:4: block
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_block_in_statement158);
					block20=block();
					state._fsp--;

					adaptor.addChild(root_0, block20.getTree());

					}
					break;
				case 3 :
					// Jay.g:44:4: assignment
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_statement163);
					assignment21=assignment();
					state._fsp--;

					adaptor.addChild(root_0, assignment21.getTree());

					}
					break;
				case 4 :
					// Jay.g:45:4: ifstatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_ifstatement_in_statement168);
					ifstatement22=ifstatement();
					state._fsp--;

					adaptor.addChild(root_0, ifstatement22.getTree());

					}
					break;
				case 5 :
					// Jay.g:46:4: whilestatement
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_whilestatement_in_statement173);
					whilestatement23=whilestatement();
					state._fsp--;

					adaptor.addChild(root_0, whilestatement23.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class block_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "block"
	// Jay.g:49:1: block : LCURLY statements RCURLY ;
	public final JayParser.block_return block() throws RecognitionException {
		JayParser.block_return retval = new JayParser.block_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LCURLY24=null;
		Token RCURLY26=null;
		ParserRuleReturnScope statements25 =null;

		Object LCURLY24_tree=null;
		Object RCURLY26_tree=null;

		try {
			// Jay.g:49:7: ( LCURLY statements RCURLY )
			// Jay.g:49:9: LCURLY statements RCURLY
			{
			root_0 = (Object)adaptor.nil();


			LCURLY24=(Token)match(input,LCURLY,FOLLOW_LCURLY_in_block183); 
			LCURLY24_tree = (Object)adaptor.create(LCURLY24);
			adaptor.addChild(root_0, LCURLY24_tree);

			pushFollow(FOLLOW_statements_in_block185);
			statements25=statements();
			state._fsp--;

			adaptor.addChild(root_0, statements25.getTree());

			RCURLY26=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_block187); 
			RCURLY26_tree = (Object)adaptor.create(RCURLY26);
			adaptor.addChild(root_0, RCURLY26_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class assignment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// Jay.g:53:1: assignment : ID ASSIGN expression SEMI ;
	public final JayParser.assignment_return assignment() throws RecognitionException {
		JayParser.assignment_return retval = new JayParser.assignment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID27=null;
		Token ASSIGN28=null;
		Token SEMI30=null;
		ParserRuleReturnScope expression29 =null;

		Object ID27_tree=null;
		Object ASSIGN28_tree=null;
		Object SEMI30_tree=null;

		try {
			// Jay.g:54:2: ( ID ASSIGN expression SEMI )
			// Jay.g:54:4: ID ASSIGN expression SEMI
			{
			root_0 = (Object)adaptor.nil();


			ID27=(Token)match(input,ID,FOLLOW_ID_in_assignment199); 
			ID27_tree = (Object)adaptor.create(ID27);
			adaptor.addChild(root_0, ID27_tree);

			ASSIGN28=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment201); 
			ASSIGN28_tree = (Object)adaptor.create(ASSIGN28);
			adaptor.addChild(root_0, ASSIGN28_tree);

			pushFollow(FOLLOW_expression_in_assignment203);
			expression29=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression29.getTree());

			SEMI30=(Token)match(input,SEMI,FOLLOW_SEMI_in_assignment205); 
			SEMI30_tree = (Object)adaptor.create(SEMI30);
			adaptor.addChild(root_0, SEMI30_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class ifstatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "ifstatement"
	// Jay.g:57:1: ifstatement : IF LPAREN expression RPAREN statement ( options {greedy=true; } : ELSE statement )? ;
	public final JayParser.ifstatement_return ifstatement() throws RecognitionException {
		JayParser.ifstatement_return retval = new JayParser.ifstatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IF31=null;
		Token LPAREN32=null;
		Token RPAREN34=null;
		Token ELSE36=null;
		ParserRuleReturnScope expression33 =null;
		ParserRuleReturnScope statement35 =null;
		ParserRuleReturnScope statement37 =null;

		Object IF31_tree=null;
		Object LPAREN32_tree=null;
		Object RPAREN34_tree=null;
		Object ELSE36_tree=null;

		try {
			// Jay.g:58:2: ( IF LPAREN expression RPAREN statement ( options {greedy=true; } : ELSE statement )? )
			// Jay.g:58:4: IF LPAREN expression RPAREN statement ( options {greedy=true; } : ELSE statement )?
			{
			root_0 = (Object)adaptor.nil();


			IF31=(Token)match(input,IF,FOLLOW_IF_in_ifstatement216); 
			IF31_tree = (Object)adaptor.create(IF31);
			adaptor.addChild(root_0, IF31_tree);

			LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_ifstatement218); 
			LPAREN32_tree = (Object)adaptor.create(LPAREN32);
			adaptor.addChild(root_0, LPAREN32_tree);

			pushFollow(FOLLOW_expression_in_ifstatement220);
			expression33=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression33.getTree());

			RPAREN34=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_ifstatement222); 
			RPAREN34_tree = (Object)adaptor.create(RPAREN34);
			adaptor.addChild(root_0, RPAREN34_tree);

			pushFollow(FOLLOW_statement_in_ifstatement224);
			statement35=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement35.getTree());

			// Jay.g:58:42: ( options {greedy=true; } : ELSE statement )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ELSE) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// Jay.g:58:68: ELSE statement
					{
					ELSE36=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifstatement236); 
					ELSE36_tree = (Object)adaptor.create(ELSE36);
					adaptor.addChild(root_0, ELSE36_tree);

					pushFollow(FOLLOW_statement_in_ifstatement238);
					statement37=statement();
					state._fsp--;

					adaptor.addChild(root_0, statement37.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifstatement"


	public static class whilestatement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whilestatement"
	// Jay.g:61:1: whilestatement : WHILE LPAREN expression RPAREN statement ;
	public final JayParser.whilestatement_return whilestatement() throws RecognitionException {
		JayParser.whilestatement_return retval = new JayParser.whilestatement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHILE38=null;
		Token LPAREN39=null;
		Token RPAREN41=null;
		ParserRuleReturnScope expression40 =null;
		ParserRuleReturnScope statement42 =null;

		Object WHILE38_tree=null;
		Object LPAREN39_tree=null;
		Object RPAREN41_tree=null;

		try {
			// Jay.g:62:2: ( WHILE LPAREN expression RPAREN statement )
			// Jay.g:62:4: WHILE LPAREN expression RPAREN statement
			{
			root_0 = (Object)adaptor.nil();


			WHILE38=(Token)match(input,WHILE,FOLLOW_WHILE_in_whilestatement251); 
			WHILE38_tree = (Object)adaptor.create(WHILE38);
			adaptor.addChild(root_0, WHILE38_tree);

			LPAREN39=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_whilestatement253); 
			LPAREN39_tree = (Object)adaptor.create(LPAREN39);
			adaptor.addChild(root_0, LPAREN39_tree);

			pushFollow(FOLLOW_expression_in_whilestatement255);
			expression40=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression40.getTree());

			RPAREN41=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_whilestatement257); 
			RPAREN41_tree = (Object)adaptor.create(RPAREN41);
			adaptor.addChild(root_0, RPAREN41_tree);

			pushFollow(FOLLOW_statement_in_whilestatement259);
			statement42=statement();
			state._fsp--;

			adaptor.addChild(root_0, statement42.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whilestatement"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// Jay.g:65:1: expression : conjunction ( OR conjunction )* ;
	public final JayParser.expression_return expression() throws RecognitionException {
		JayParser.expression_return retval = new JayParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token OR44=null;
		ParserRuleReturnScope conjunction43 =null;
		ParserRuleReturnScope conjunction45 =null;

		Object OR44_tree=null;

		try {
			// Jay.g:66:2: ( conjunction ( OR conjunction )* )
			// Jay.g:66:4: conjunction ( OR conjunction )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_conjunction_in_expression270);
			conjunction43=conjunction();
			state._fsp--;

			adaptor.addChild(root_0, conjunction43.getTree());

			// Jay.g:66:16: ( OR conjunction )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==OR) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// Jay.g:66:17: OR conjunction
					{
					OR44=(Token)match(input,OR,FOLLOW_OR_in_expression273); 
					OR44_tree = (Object)adaptor.create(OR44);
					adaptor.addChild(root_0, OR44_tree);

					pushFollow(FOLLOW_conjunction_in_expression275);
					conjunction45=conjunction();
					state._fsp--;

					adaptor.addChild(root_0, conjunction45.getTree());

					}
					break;

				default :
					break loop6;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class conjunction_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conjunction"
	// Jay.g:69:1: conjunction : relation ( AND relation )* ;
	public final JayParser.conjunction_return conjunction() throws RecognitionException {
		JayParser.conjunction_return retval = new JayParser.conjunction_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND47=null;
		ParserRuleReturnScope relation46 =null;
		ParserRuleReturnScope relation48 =null;

		Object AND47_tree=null;

		try {
			// Jay.g:70:2: ( relation ( AND relation )* )
			// Jay.g:70:4: relation ( AND relation )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_relation_in_conjunction288);
			relation46=relation();
			state._fsp--;

			adaptor.addChild(root_0, relation46.getTree());

			// Jay.g:70:13: ( AND relation )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==AND) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// Jay.g:70:14: AND relation
					{
					AND47=(Token)match(input,AND,FOLLOW_AND_in_conjunction291); 
					AND47_tree = (Object)adaptor.create(AND47);
					adaptor.addChild(root_0, AND47_tree);

					pushFollow(FOLLOW_relation_in_conjunction293);
					relation48=relation();
					state._fsp--;

					adaptor.addChild(root_0, relation48.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conjunction"


	public static class relation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "relation"
	// Jay.g:73:1: relation : addition ( reloper addition )* ;
	public final JayParser.relation_return relation() throws RecognitionException {
		JayParser.relation_return retval = new JayParser.relation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope addition49 =null;
		ParserRuleReturnScope reloper50 =null;
		ParserRuleReturnScope addition51 =null;


		try {
			// Jay.g:74:2: ( addition ( reloper addition )* )
			// Jay.g:74:4: addition ( reloper addition )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_addition_in_relation306);
			addition49=addition();
			state._fsp--;

			adaptor.addChild(root_0, addition49.getTree());

			// Jay.g:74:13: ( reloper addition )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= EQ && LA8_0 <= GT)||LA8_0==LET||LA8_0==LT||LA8_0==NEQ) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Jay.g:74:14: reloper addition
					{
					pushFollow(FOLLOW_reloper_in_relation309);
					reloper50=reloper();
					state._fsp--;

					adaptor.addChild(root_0, reloper50.getTree());

					pushFollow(FOLLOW_addition_in_relation311);
					addition51=addition();
					state._fsp--;

					adaptor.addChild(root_0, addition51.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relation"


	public static class reloper_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "reloper"
	// Jay.g:77:1: reloper : ( LT | LET | GT | GET | EQ | NEQ );
	public final JayParser.reloper_return reloper() throws RecognitionException {
		JayParser.reloper_return retval = new JayParser.reloper_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set52=null;

		Object set52_tree=null;

		try {
			// Jay.g:78:5: ( LT | LET | GT | GET | EQ | NEQ )
			// Jay.g:
			{
			root_0 = (Object)adaptor.nil();


			set52=input.LT(1);
			if ( (input.LA(1) >= EQ && input.LA(1) <= GT)||input.LA(1)==LET||input.LA(1)==LT||input.LA(1)==NEQ ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set52));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "reloper"


	public static class addition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addition"
	// Jay.g:86:1: addition : term ( addopers term )* ;
	public final JayParser.addition_return addition() throws RecognitionException {
		JayParser.addition_return retval = new JayParser.addition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope term53 =null;
		ParserRuleReturnScope addopers54 =null;
		ParserRuleReturnScope term55 =null;


		try {
			// Jay.g:87:2: ( term ( addopers term )* )
			// Jay.g:87:4: term ( addopers term )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_term_in_addition363);
			term53=term();
			state._fsp--;

			adaptor.addChild(root_0, term53.getTree());

			// Jay.g:87:9: ( addopers term )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==ADDOPER||LA9_0==SUBOPER) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Jay.g:87:10: addopers term
					{
					pushFollow(FOLLOW_addopers_in_addition366);
					addopers54=addopers();
					state._fsp--;

					adaptor.addChild(root_0, addopers54.getTree());

					pushFollow(FOLLOW_term_in_addition368);
					term55=term();
					state._fsp--;

					adaptor.addChild(root_0, term55.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addition"


	public static class addopers_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "addopers"
	// Jay.g:90:1: addopers : ( ADDOPER | SUBOPER );
	public final JayParser.addopers_return addopers() throws RecognitionException {
		JayParser.addopers_return retval = new JayParser.addopers_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set56=null;

		Object set56_tree=null;

		try {
			// Jay.g:91:2: ( ADDOPER | SUBOPER )
			// Jay.g:
			{
			root_0 = (Object)adaptor.nil();


			set56=input.LT(1);
			if ( input.LA(1)==ADDOPER||input.LA(1)==SUBOPER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set56));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addopers"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// Jay.g:94:1: term : negation ( multopers negation )* ;
	public final JayParser.term_return term() throws RecognitionException {
		JayParser.term_return retval = new JayParser.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope negation57 =null;
		ParserRuleReturnScope multopers58 =null;
		ParserRuleReturnScope negation59 =null;


		try {
			// Jay.g:95:2: ( negation ( multopers negation )* )
			// Jay.g:95:4: negation ( multopers negation )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_negation_in_term395);
			negation57=negation();
			state._fsp--;

			adaptor.addChild(root_0, negation57.getTree());

			// Jay.g:95:13: ( multopers negation )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==DIVOPER||LA10_0==TIMESOPER) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// Jay.g:95:14: multopers negation
					{
					pushFollow(FOLLOW_multopers_in_term398);
					multopers58=multopers();
					state._fsp--;

					adaptor.addChild(root_0, multopers58.getTree());

					pushFollow(FOLLOW_negation_in_term400);
					negation59=negation();
					state._fsp--;

					adaptor.addChild(root_0, negation59.getTree());

					}
					break;

				default :
					break loop10;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class multopers_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multopers"
	// Jay.g:98:1: multopers : ( TIMESOPER | DIVOPER );
	public final JayParser.multopers_return multopers() throws RecognitionException {
		JayParser.multopers_return retval = new JayParser.multopers_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set60=null;

		Object set60_tree=null;

		try {
			// Jay.g:99:2: ( TIMESOPER | DIVOPER )
			// Jay.g:
			{
			root_0 = (Object)adaptor.nil();


			set60=input.LT(1);
			if ( input.LA(1)==DIVOPER||input.LA(1)==TIMESOPER ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set60));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multopers"


	public static class negation_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "negation"
	// Jay.g:103:1: negation : ( NEG )? factor ;
	public final JayParser.negation_return negation() throws RecognitionException {
		JayParser.negation_return retval = new JayParser.negation_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NEG61=null;
		ParserRuleReturnScope factor62 =null;

		Object NEG61_tree=null;

		try {
			// Jay.g:104:2: ( ( NEG )? factor )
			// Jay.g:104:4: ( NEG )? factor
			{
			root_0 = (Object)adaptor.nil();


			// Jay.g:104:4: ( NEG )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==NEG) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// Jay.g:104:4: NEG
					{
					NEG61=(Token)match(input,NEG,FOLLOW_NEG_in_negation429); 
					NEG61_tree = (Object)adaptor.create(NEG61);
					adaptor.addChild(root_0, NEG61_tree);

					}
					break;

			}

			pushFollow(FOLLOW_factor_in_negation432);
			factor62=factor();
			state._fsp--;

			adaptor.addChild(root_0, factor62.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "negation"


	public static class factor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// Jay.g:107:1: factor : ( ID | literal | LPAREN expression RPAREN );
	public final JayParser.factor_return factor() throws RecognitionException {
		JayParser.factor_return retval = new JayParser.factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ID63=null;
		Token LPAREN65=null;
		Token RPAREN67=null;
		ParserRuleReturnScope literal64 =null;
		ParserRuleReturnScope expression66 =null;

		Object ID63_tree=null;
		Object LPAREN65_tree=null;
		Object RPAREN67_tree=null;

		try {
			// Jay.g:108:2: ( ID | literal | LPAREN expression RPAREN )
			int alt12=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt12=1;
				}
				break;
			case BOOLLIT:
			case INT:
				{
				alt12=2;
				}
				break;
			case LPAREN:
				{
				alt12=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// Jay.g:108:4: ID
					{
					root_0 = (Object)adaptor.nil();


					ID63=(Token)match(input,ID,FOLLOW_ID_in_factor443); 
					ID63_tree = (Object)adaptor.create(ID63);
					adaptor.addChild(root_0, ID63_tree);

					}
					break;
				case 2 :
					// Jay.g:109:4: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_factor448);
					literal64=literal();
					state._fsp--;

					adaptor.addChild(root_0, literal64.getTree());

					}
					break;
				case 3 :
					// Jay.g:110:4: LPAREN expression RPAREN
					{
					root_0 = (Object)adaptor.nil();


					LPAREN65=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_factor453); 
					LPAREN65_tree = (Object)adaptor.create(LPAREN65);
					adaptor.addChild(root_0, LPAREN65_tree);

					pushFollow(FOLLOW_expression_in_factor455);
					expression66=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression66.getTree());

					RPAREN67=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_factor457); 
					RPAREN67_tree = (Object)adaptor.create(RPAREN67);
					adaptor.addChild(root_0, RPAREN67_tree);

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factor"


	public static class literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// Jay.g:113:1: literal : ( INT | BOOLLIT );
	public final JayParser.literal_return literal() throws RecognitionException {
		JayParser.literal_return retval = new JayParser.literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set68=null;

		Object set68_tree=null;

		try {
			// Jay.g:114:2: ( INT | BOOLLIT )
			// Jay.g:
			{
			root_0 = (Object)adaptor.nil();


			set68=input.LT(1);
			if ( input.LA(1)==BOOLLIT||input.LA(1)==INT ) {
				input.consume();
				adaptor.addChild(root_0, (Object)adaptor.create(set68));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literal"

	// Delegated rules



	public static final BitSet FOLLOW_VOID_in_program51 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_MAIN_in_program53 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_LPAREN_in_program55 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_program57 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_LCURLY_in_program59 = new BitSet(new long[]{0x0000000554058000L});
	public static final BitSet FOLLOW_declarations_in_program61 = new BitSet(new long[]{0x0000000414058000L});
	public static final BitSet FOLLOW_statements_in_program63 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RCURLY_in_program65 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations79 = new BitSet(new long[]{0x0000000140000002L});
	public static final BitSet FOLLOW_type_in_declaration92 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_identifiers_in_declaration94 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_declaration96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_identifiers123 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_COMMA_in_identifiers126 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_identifiers128 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_statement_in_statements141 = new BitSet(new long[]{0x0000000410058002L});
	public static final BitSet FOLLOW_SEMI_in_statement153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_statement158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_statement163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstatement_in_statement168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestatement_in_statement173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LCURLY_in_block183 = new BitSet(new long[]{0x0000000414058000L});
	public static final BitSet FOLLOW_statements_in_block185 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_RCURLY_in_block187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment199 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment201 = new BitSet(new long[]{0x0000000000928080L});
	public static final BitSet FOLLOW_expression_in_assignment203 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_SEMI_in_assignment205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_ifstatement216 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_LPAREN_in_ifstatement218 = new BitSet(new long[]{0x0000000000928080L});
	public static final BitSet FOLLOW_expression_in_ifstatement220 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_ifstatement222 = new BitSet(new long[]{0x0000000410058000L});
	public static final BitSet FOLLOW_statement_in_ifstatement224 = new BitSet(new long[]{0x0000000000000802L});
	public static final BitSet FOLLOW_ELSE_in_ifstatement236 = new BitSet(new long[]{0x0000000410058000L});
	public static final BitSet FOLLOW_statement_in_ifstatement238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_whilestatement251 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_LPAREN_in_whilestatement253 = new BitSet(new long[]{0x0000000000928080L});
	public static final BitSet FOLLOW_expression_in_whilestatement255 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_whilestatement257 = new BitSet(new long[]{0x0000000410058000L});
	public static final BitSet FOLLOW_statement_in_whilestatement259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conjunction_in_expression270 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_OR_in_expression273 = new BitSet(new long[]{0x0000000000928080L});
	public static final BitSet FOLLOW_conjunction_in_expression275 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_relation_in_conjunction288 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_AND_in_conjunction291 = new BitSet(new long[]{0x0000000000928080L});
	public static final BitSet FOLLOW_relation_in_conjunction293 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_addition_in_relation306 = new BitSet(new long[]{0x0000000001287002L});
	public static final BitSet FOLLOW_reloper_in_relation309 = new BitSet(new long[]{0x0000000000928080L});
	public static final BitSet FOLLOW_addition_in_relation311 = new BitSet(new long[]{0x0000000001287002L});
	public static final BitSet FOLLOW_term_in_addition363 = new BitSet(new long[]{0x0000000020000012L});
	public static final BitSet FOLLOW_addopers_in_addition366 = new BitSet(new long[]{0x0000000000928080L});
	public static final BitSet FOLLOW_term_in_addition368 = new BitSet(new long[]{0x0000000020000012L});
	public static final BitSet FOLLOW_negation_in_term395 = new BitSet(new long[]{0x0000000080000402L});
	public static final BitSet FOLLOW_multopers_in_term398 = new BitSet(new long[]{0x0000000000928080L});
	public static final BitSet FOLLOW_negation_in_term400 = new BitSet(new long[]{0x0000000080000402L});
	public static final BitSet FOLLOW_NEG_in_negation429 = new BitSet(new long[]{0x0000000000128080L});
	public static final BitSet FOLLOW_factor_in_negation432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_factor443 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_factor448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_factor453 = new BitSet(new long[]{0x0000000000928080L});
	public static final BitSet FOLLOW_expression_in_factor455 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_RPAREN_in_factor457 = new BitSet(new long[]{0x0000000000000002L});
}
