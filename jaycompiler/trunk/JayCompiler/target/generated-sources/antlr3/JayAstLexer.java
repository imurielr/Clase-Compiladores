// $ANTLR 3.5.2 JayAst.g 2018-04-12 14:26:29

package co.edu.eafit.dis.st0270.jaycompiler.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JayAstLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public JayAstLexer() {} 
	public JayAstLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public JayAstLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "JayAst.g"; }

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:162:6: ( 'main' )
			// JayAst.g:162:8: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:165:6: ( 'void' )
			// JayAst.g:165:8: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:168:4: ( 'if' )
			// JayAst.g:168:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:171:6: ( 'else' )
			// JayAst.g:171:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:174:7: ( 'while' )
			// JayAst.g:174:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "TINT"
	public final void mTINT() throws RecognitionException {
		try {
			int _type = TINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:177:6: ( 'int' )
			// JayAst.g:177:8: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TINT"

	// $ANTLR start "TBOOL"
	public final void mTBOOL() throws RecognitionException {
		try {
			int _type = TBOOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:180:7: ( 'boolean' )
			// JayAst.g:180:9: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TBOOL"

	// $ANTLR start "BOOLLIT"
	public final void mBOOLLIT() throws RecognitionException {
		try {
			int _type = BOOLLIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:184:2: ( 'true' | 'false' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='t') ) {
				alt1=1;
			}
			else if ( (LA1_0=='f') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// JayAst.g:184:4: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// JayAst.g:185:4: 'false'
					{
					match("false"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLLIT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:188:6: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// JayAst.g:188:8: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// JayAst.g:188:32: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// JayAst.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:191:5: ( ( '0' .. '9' )+ )
			// JayAst.g:191:7: ( '0' .. '9' )+
			{
			// JayAst.g:191:7: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// JayAst.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "NEG"
	public final void mNEG() throws RecognitionException {
		try {
			int _type = NEG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:194:5: ( '!' )
			// JayAst.g:194:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEG"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:197:7: ( ',' )
			// JayAst.g:197:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:200:8: ( '=' )
			// JayAst.g:200:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:203:6: ( ';' )
			// JayAst.g:203:8: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:206:4: ( '||' )
			// JayAst.g:206:6: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:209:5: ( '&&' )
			// JayAst.g:209:7: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:212:4: ( '<' )
			// JayAst.g:212:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "LET"
	public final void mLET() throws RecognitionException {
		try {
			int _type = LET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:215:5: ( '<=' )
			// JayAst.g:215:7: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LET"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:218:4: ( '>' )
			// JayAst.g:218:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "GET"
	public final void mGET() throws RecognitionException {
		try {
			int _type = GET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:221:5: ( '>=' )
			// JayAst.g:221:7: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GET"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:224:4: ( '==' )
			// JayAst.g:224:6: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NEQ"
	public final void mNEQ() throws RecognitionException {
		try {
			int _type = NEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:227:5: ( '!=' )
			// JayAst.g:227:7: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ"

	// $ANTLR start "ADDOPER"
	public final void mADDOPER() throws RecognitionException {
		try {
			int _type = ADDOPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:230:9: ( '+' )
			// JayAst.g:230:11: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDOPER"

	// $ANTLR start "SUBOPER"
	public final void mSUBOPER() throws RecognitionException {
		try {
			int _type = SUBOPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:233:9: ( '-' )
			// JayAst.g:233:11: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUBOPER"

	// $ANTLR start "TIMESOPER"
	public final void mTIMESOPER() throws RecognitionException {
		try {
			int _type = TIMESOPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:236:11: ( '*' )
			// JayAst.g:236:13: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMESOPER"

	// $ANTLR start "DIVOPER"
	public final void mDIVOPER() throws RecognitionException {
		try {
			int _type = DIVOPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:239:9: ( '/' )
			// JayAst.g:239:11: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVOPER"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:242:8: ( '{' )
			// JayAst.g:242:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:245:8: ( '}' )
			// JayAst.g:245:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:248:9: ( '(' )
			// JayAst.g:248:11: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:251:8: ( ')' )
			// JayAst.g:251:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:255:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='/') ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='/') ) {
					alt7=1;
				}
				else if ( (LA7_1=='*') ) {
					alt7=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// JayAst.g:255:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// JayAst.g:255:14: (~ ( '\\n' | '\\r' ) )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFF')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// JayAst.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					}

					// JayAst.g:255:28: ( '\\r' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='\r') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// JayAst.g:255:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// JayAst.g:256:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// JayAst.g:256:14: ( options {greedy=false; } : . )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0=='*') ) {
							int LA6_1 = input.LA(2);
							if ( (LA6_1=='/') ) {
								alt6=2;
							}
							else if ( ((LA6_1 >= '\u0000' && LA6_1 <= '.')||(LA6_1 >= '0' && LA6_1 <= '\uFFFF')) ) {
								alt6=1;
							}

						}
						else if ( ((LA6_0 >= '\u0000' && LA6_0 <= ')')||(LA6_0 >= '+' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// JayAst.g:256:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop6;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayAst.g:259:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// JayAst.g:259:9: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// JayAst.g:1:8: ( MAIN | VOID | IF | ELSE | WHILE | TINT | TBOOL | BOOLLIT | ID | INT | NEG | COMMA | ASSIGN | SEMI | OR | AND | LT | LET | GT | GET | EQ | NEQ | ADDOPER | SUBOPER | TIMESOPER | DIVOPER | LCURLY | RCURLY | LPAREN | RPAREN | COMMENT | WS )
		int alt8=32;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// JayAst.g:1:10: MAIN
				{
				mMAIN(); 

				}
				break;
			case 2 :
				// JayAst.g:1:15: VOID
				{
				mVOID(); 

				}
				break;
			case 3 :
				// JayAst.g:1:20: IF
				{
				mIF(); 

				}
				break;
			case 4 :
				// JayAst.g:1:23: ELSE
				{
				mELSE(); 

				}
				break;
			case 5 :
				// JayAst.g:1:28: WHILE
				{
				mWHILE(); 

				}
				break;
			case 6 :
				// JayAst.g:1:34: TINT
				{
				mTINT(); 

				}
				break;
			case 7 :
				// JayAst.g:1:39: TBOOL
				{
				mTBOOL(); 

				}
				break;
			case 8 :
				// JayAst.g:1:45: BOOLLIT
				{
				mBOOLLIT(); 

				}
				break;
			case 9 :
				// JayAst.g:1:53: ID
				{
				mID(); 

				}
				break;
			case 10 :
				// JayAst.g:1:56: INT
				{
				mINT(); 

				}
				break;
			case 11 :
				// JayAst.g:1:60: NEG
				{
				mNEG(); 

				}
				break;
			case 12 :
				// JayAst.g:1:64: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 13 :
				// JayAst.g:1:70: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 14 :
				// JayAst.g:1:77: SEMI
				{
				mSEMI(); 

				}
				break;
			case 15 :
				// JayAst.g:1:82: OR
				{
				mOR(); 

				}
				break;
			case 16 :
				// JayAst.g:1:85: AND
				{
				mAND(); 

				}
				break;
			case 17 :
				// JayAst.g:1:89: LT
				{
				mLT(); 

				}
				break;
			case 18 :
				// JayAst.g:1:92: LET
				{
				mLET(); 

				}
				break;
			case 19 :
				// JayAst.g:1:96: GT
				{
				mGT(); 

				}
				break;
			case 20 :
				// JayAst.g:1:99: GET
				{
				mGET(); 

				}
				break;
			case 21 :
				// JayAst.g:1:103: EQ
				{
				mEQ(); 

				}
				break;
			case 22 :
				// JayAst.g:1:106: NEQ
				{
				mNEQ(); 

				}
				break;
			case 23 :
				// JayAst.g:1:110: ADDOPER
				{
				mADDOPER(); 

				}
				break;
			case 24 :
				// JayAst.g:1:118: SUBOPER
				{
				mSUBOPER(); 

				}
				break;
			case 25 :
				// JayAst.g:1:126: TIMESOPER
				{
				mTIMESOPER(); 

				}
				break;
			case 26 :
				// JayAst.g:1:136: DIVOPER
				{
				mDIVOPER(); 

				}
				break;
			case 27 :
				// JayAst.g:1:144: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 28 :
				// JayAst.g:1:151: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 29 :
				// JayAst.g:1:158: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 30 :
				// JayAst.g:1:165: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 31 :
				// JayAst.g:1:172: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 32 :
				// JayAst.g:1:180: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\1\uffff\10\11\2\uffff\1\46\1\uffff\1\50\3\uffff\1\52\1\54\3\uffff\1\56"+
		"\5\uffff\2\11\1\61\6\11\12\uffff\2\11\1\uffff\1\72\5\11\1\100\1\101\1"+
		"\uffff\1\102\2\11\1\105\1\11\3\uffff\1\107\1\11\1\uffff\1\105\1\uffff"+
		"\1\11\1\112\1\uffff";
	static final String DFA8_eofS =
		"\113\uffff";
	static final String DFA8_minS =
		"\1\11\1\141\1\157\1\146\1\154\1\150\1\157\1\162\1\141\2\uffff\1\75\1\uffff"+
		"\1\75\3\uffff\2\75\3\uffff\1\52\5\uffff\2\151\1\60\1\164\1\163\1\151\1"+
		"\157\1\165\1\154\12\uffff\1\156\1\144\1\uffff\1\60\1\145\2\154\1\145\1"+
		"\163\2\60\1\uffff\1\60\2\145\1\60\1\145\3\uffff\1\60\1\141\1\uffff\1\60"+
		"\1\uffff\1\156\1\60\1\uffff";
	static final String DFA8_maxS =
		"\1\175\1\141\1\157\1\156\1\154\1\150\1\157\1\162\1\141\2\uffff\1\75\1"+
		"\uffff\1\75\3\uffff\2\75\3\uffff\1\57\5\uffff\2\151\1\172\1\164\1\163"+
		"\1\151\1\157\1\165\1\154\12\uffff\1\156\1\144\1\uffff\1\172\1\145\2\154"+
		"\1\145\1\163\2\172\1\uffff\1\172\2\145\1\172\1\145\3\uffff\1\172\1\141"+
		"\1\uffff\1\172\1\uffff\1\156\1\172\1\uffff";
	static final String DFA8_acceptS =
		"\11\uffff\1\11\1\12\1\uffff\1\14\1\uffff\1\16\1\17\1\20\2\uffff\1\27\1"+
		"\30\1\31\1\uffff\1\33\1\34\1\35\1\36\1\40\11\uffff\1\26\1\13\1\25\1\15"+
		"\1\22\1\21\1\24\1\23\1\37\1\32\2\uffff\1\3\10\uffff\1\6\5\uffff\1\1\1"+
		"\2\1\4\2\uffff\1\10\1\uffff\1\5\2\uffff\1\7";
	static final String DFA8_specialS =
		"\113\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\33\2\uffff\1\33\22\uffff\1\33\1\13\4\uffff\1\20\1\uffff\1\31\1\32"+
			"\1\25\1\23\1\14\1\24\1\uffff\1\26\12\12\1\uffff\1\16\1\21\1\15\1\22\2"+
			"\uffff\32\11\4\uffff\1\11\1\uffff\1\11\1\6\2\11\1\4\1\10\2\11\1\3\3\11"+
			"\1\1\6\11\1\7\1\11\1\2\1\5\3\11\1\27\1\17\1\30",
			"\1\34",
			"\1\35",
			"\1\36\7\uffff\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"",
			"",
			"\1\45",
			"",
			"\1\47",
			"",
			"",
			"",
			"\1\51",
			"\1\53",
			"",
			"",
			"",
			"\1\55\4\uffff\1\55",
			"",
			"",
			"",
			"",
			"",
			"\1\57",
			"\1\60",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\70",
			"\1\71",
			"",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"\1\103",
			"\1\104",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"\1\106",
			"",
			"",
			"",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"\1\110",
			"",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			"",
			"\1\111",
			"\12\11\7\uffff\32\11\4\uffff\1\11\1\uffff\32\11",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( MAIN | VOID | IF | ELSE | WHILE | TINT | TBOOL | BOOLLIT | ID | INT | NEG | COMMA | ASSIGN | SEMI | OR | AND | LT | LET | GT | GET | EQ | NEQ | ADDOPER | SUBOPER | TIMESOPER | DIVOPER | LCURLY | RCURLY | LPAREN | RPAREN | COMMENT | WS );";
		}
	}

}
