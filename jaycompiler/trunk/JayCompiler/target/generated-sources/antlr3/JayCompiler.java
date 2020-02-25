// $ANTLR 3.5.2 JayCompiler.g 2018-04-12 14:26:29

package co.edu.eafit.dis.st0270.jaycompiler.lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JayCompiler extends Lexer {
	public static final int EOF=-1;
	public static final int BOOLEAN=4;
	public static final int COMMENT=5;
	public static final int ID=6;
	public static final int INT=7;
	public static final int KEYWORDS=8;
	public static final int OPERATORS=9;
	public static final int SEPARATORS=10;
	public static final int WS=11;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public JayCompiler() {} 
	public JayCompiler(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public JayCompiler(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "JayCompiler.g"; }

	// $ANTLR start "SEPARATORS"
	public final void mSEPARATORS() throws RecognitionException {
		try {
			int _type = SEPARATORS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayCompiler.g:14:2: ( '(' | ')' | '{' | '}' | ';' | ',' )
			// JayCompiler.g:
			{
			if ( (input.LA(1) >= '(' && input.LA(1) <= ')')||input.LA(1)==','||input.LA(1)==';'||input.LA(1)=='{'||input.LA(1)=='}' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEPARATORS"

	// $ANTLR start "OPERATORS"
	public final void mOPERATORS() throws RecognitionException {
		try {
			int _type = OPERATORS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayCompiler.g:23:2: ( '=' | '+' | '-' | '*' | '/' | '<' | '<=' | '>' | '>=' | '==' | '!=' | '&&' | '||' | '!' )
			int alt1=14;
			switch ( input.LA(1) ) {
			case '=':
				{
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='=') ) {
					alt1=10;
				}

				else {
					alt1=1;
				}

				}
				break;
			case '+':
				{
				alt1=2;
				}
				break;
			case '-':
				{
				alt1=3;
				}
				break;
			case '*':
				{
				alt1=4;
				}
				break;
			case '/':
				{
				alt1=5;
				}
				break;
			case '<':
				{
				int LA1_6 = input.LA(2);
				if ( (LA1_6=='=') ) {
					alt1=7;
				}

				else {
					alt1=6;
				}

				}
				break;
			case '>':
				{
				int LA1_7 = input.LA(2);
				if ( (LA1_7=='=') ) {
					alt1=9;
				}

				else {
					alt1=8;
				}

				}
				break;
			case '!':
				{
				int LA1_8 = input.LA(2);
				if ( (LA1_8=='=') ) {
					alt1=11;
				}

				else {
					alt1=14;
				}

				}
				break;
			case '&':
				{
				alt1=12;
				}
				break;
			case '|':
				{
				alt1=13;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// JayCompiler.g:23:4: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// JayCompiler.g:24:4: '+'
					{
					match('+'); 
					}
					break;
				case 3 :
					// JayCompiler.g:25:4: '-'
					{
					match('-'); 
					}
					break;
				case 4 :
					// JayCompiler.g:26:4: '*'
					{
					match('*'); 
					}
					break;
				case 5 :
					// JayCompiler.g:27:4: '/'
					{
					match('/'); 
					}
					break;
				case 6 :
					// JayCompiler.g:28:4: '<'
					{
					match('<'); 
					}
					break;
				case 7 :
					// JayCompiler.g:29:4: '<='
					{
					match("<="); 

					}
					break;
				case 8 :
					// JayCompiler.g:30:4: '>'
					{
					match('>'); 
					}
					break;
				case 9 :
					// JayCompiler.g:31:4: '>='
					{
					match(">="); 

					}
					break;
				case 10 :
					// JayCompiler.g:32:4: '=='
					{
					match("=="); 

					}
					break;
				case 11 :
					// JayCompiler.g:33:4: '!='
					{
					match("!="); 

					}
					break;
				case 12 :
					// JayCompiler.g:34:4: '&&'
					{
					match("&&"); 

					}
					break;
				case 13 :
					// JayCompiler.g:35:4: '||'
					{
					match("||"); 

					}
					break;
				case 14 :
					// JayCompiler.g:36:4: '!'
					{
					match('!'); 
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
	// $ANTLR end "OPERATORS"

	// $ANTLR start "KEYWORDS"
	public final void mKEYWORDS() throws RecognitionException {
		try {
			int _type = KEYWORDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayCompiler.g:40:5: ( 'boolean' | 'else' | 'if' | 'int' | 'main' | 'void' | 'while' )
			int alt2=7;
			switch ( input.LA(1) ) {
			case 'b':
				{
				alt2=1;
				}
				break;
			case 'e':
				{
				alt2=2;
				}
				break;
			case 'i':
				{
				int LA2_3 = input.LA(2);
				if ( (LA2_3=='f') ) {
					alt2=3;
				}
				else if ( (LA2_3=='n') ) {
					alt2=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 'm':
				{
				alt2=5;
				}
				break;
			case 'v':
				{
				alt2=6;
				}
				break;
			case 'w':
				{
				alt2=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// JayCompiler.g:40:7: 'boolean'
					{
					match("boolean"); 

					}
					break;
				case 2 :
					// JayCompiler.g:41:7: 'else'
					{
					match("else"); 

					}
					break;
				case 3 :
					// JayCompiler.g:42:7: 'if'
					{
					match("if"); 

					}
					break;
				case 4 :
					// JayCompiler.g:43:7: 'int'
					{
					match("int"); 

					}
					break;
				case 5 :
					// JayCompiler.g:44:7: 'main'
					{
					match("main"); 

					}
					break;
				case 6 :
					// JayCompiler.g:45:7: 'void'
					{
					match("void"); 

					}
					break;
				case 7 :
					// JayCompiler.g:46:7: 'while'
					{
					match("while"); 

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
	// $ANTLR end "KEYWORDS"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayCompiler.g:50:5: ( 'true' | 'false' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='t') ) {
				alt3=1;
			}
			else if ( (LA3_0=='f') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// JayCompiler.g:50:7: 'true'
					{
					match("true"); 

					}
					break;
				case 2 :
					// JayCompiler.g:51:7: 'false'
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
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayCompiler.g:55:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// JayCompiler.g:55:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// JayCompiler.g:55:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// JayCompiler.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
			// JayCompiler.g:58:5: ( ( '0' .. '9' )+ )
			// JayCompiler.g:58:7: ( '0' .. '9' )+
			{
			// JayCompiler.g:58:7: ( '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// JayCompiler.g:
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
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
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

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// JayCompiler.g:62:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='/') ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1=='/') ) {
					alt9=1;
				}
				else if ( (LA9_1=='*') ) {
					alt9=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// JayCompiler.g:62:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// JayCompiler.g:62:14: (~ ( '\\n' | '\\r' ) )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// JayCompiler.g:
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
							break loop6;
						}
					}

					// JayCompiler.g:62:28: ( '\\r' )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='\r') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// JayCompiler.g:62:28: '\\r'
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
					// JayCompiler.g:63:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// JayCompiler.g:63:14: ( options {greedy=false; } : . )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0=='*') ) {
							int LA8_1 = input.LA(2);
							if ( (LA8_1=='/') ) {
								alt8=2;
							}
							else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
								alt8=1;
							}

						}
						else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// JayCompiler.g:63:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop8;
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
			// JayCompiler.g:66:5: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' ) )
			// JayCompiler.g:66:9: ( ' ' | '\\t' | '\\r' | '\\n' | '\\f' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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
		// JayCompiler.g:1:8: ( SEPARATORS | OPERATORS | KEYWORDS | BOOLEAN | ID | INT | COMMENT | WS )
		int alt10=8;
		switch ( input.LA(1) ) {
		case '(':
		case ')':
		case ',':
		case ';':
		case '{':
		case '}':
			{
			alt10=1;
			}
			break;
		case '!':
		case '&':
		case '*':
		case '+':
		case '-':
		case '<':
		case '=':
		case '>':
		case '|':
			{
			alt10=2;
			}
			break;
		case '/':
			{
			int LA10_3 = input.LA(2);
			if ( (LA10_3=='*'||LA10_3=='/') ) {
				alt10=7;
			}

			else {
				alt10=2;
			}

			}
			break;
		case 'b':
			{
			int LA10_4 = input.LA(2);
			if ( (LA10_4=='o') ) {
				int LA10_16 = input.LA(3);
				if ( (LA10_16=='o') ) {
					int LA10_25 = input.LA(4);
					if ( (LA10_25=='l') ) {
						int LA10_34 = input.LA(5);
						if ( (LA10_34=='e') ) {
							int LA10_41 = input.LA(6);
							if ( (LA10_41=='a') ) {
								int LA10_45 = input.LA(7);
								if ( (LA10_45=='n') ) {
									int LA10_46 = input.LA(8);
									if ( ((LA10_46 >= '0' && LA10_46 <= '9')||(LA10_46 >= 'A' && LA10_46 <= 'Z')||(LA10_46 >= 'a' && LA10_46 <= 'z')) ) {
										alt10=5;
									}

									else {
										alt10=3;
									}

								}

								else {
									alt10=5;
								}

							}

							else {
								alt10=5;
							}

						}

						else {
							alt10=5;
						}

					}

					else {
						alt10=5;
					}

				}

				else {
					alt10=5;
				}

			}

			else {
				alt10=5;
			}

			}
			break;
		case 'e':
			{
			int LA10_5 = input.LA(2);
			if ( (LA10_5=='l') ) {
				int LA10_17 = input.LA(3);
				if ( (LA10_17=='s') ) {
					int LA10_26 = input.LA(4);
					if ( (LA10_26=='e') ) {
						int LA10_35 = input.LA(5);
						if ( ((LA10_35 >= '0' && LA10_35 <= '9')||(LA10_35 >= 'A' && LA10_35 <= 'Z')||(LA10_35 >= 'a' && LA10_35 <= 'z')) ) {
							alt10=5;
						}

						else {
							alt10=3;
						}

					}

					else {
						alt10=5;
					}

				}

				else {
					alt10=5;
				}

			}

			else {
				alt10=5;
			}

			}
			break;
		case 'i':
			{
			switch ( input.LA(2) ) {
			case 'f':
				{
				int LA10_18 = input.LA(3);
				if ( ((LA10_18 >= '0' && LA10_18 <= '9')||(LA10_18 >= 'A' && LA10_18 <= 'Z')||(LA10_18 >= 'a' && LA10_18 <= 'z')) ) {
					alt10=5;
				}

				else {
					alt10=3;
				}

				}
				break;
			case 'n':
				{
				int LA10_19 = input.LA(3);
				if ( (LA10_19=='t') ) {
					int LA10_28 = input.LA(4);
					if ( ((LA10_28 >= '0' && LA10_28 <= '9')||(LA10_28 >= 'A' && LA10_28 <= 'Z')||(LA10_28 >= 'a' && LA10_28 <= 'z')) ) {
						alt10=5;
					}

					else {
						alt10=3;
					}

				}

				else {
					alt10=5;
				}

				}
				break;
			default:
				alt10=5;
			}
			}
			break;
		case 'm':
			{
			int LA10_7 = input.LA(2);
			if ( (LA10_7=='a') ) {
				int LA10_20 = input.LA(3);
				if ( (LA10_20=='i') ) {
					int LA10_29 = input.LA(4);
					if ( (LA10_29=='n') ) {
						int LA10_36 = input.LA(5);
						if ( ((LA10_36 >= '0' && LA10_36 <= '9')||(LA10_36 >= 'A' && LA10_36 <= 'Z')||(LA10_36 >= 'a' && LA10_36 <= 'z')) ) {
							alt10=5;
						}

						else {
							alt10=3;
						}

					}

					else {
						alt10=5;
					}

				}

				else {
					alt10=5;
				}

			}

			else {
				alt10=5;
			}

			}
			break;
		case 'v':
			{
			int LA10_8 = input.LA(2);
			if ( (LA10_8=='o') ) {
				int LA10_21 = input.LA(3);
				if ( (LA10_21=='i') ) {
					int LA10_30 = input.LA(4);
					if ( (LA10_30=='d') ) {
						int LA10_37 = input.LA(5);
						if ( ((LA10_37 >= '0' && LA10_37 <= '9')||(LA10_37 >= 'A' && LA10_37 <= 'Z')||(LA10_37 >= 'a' && LA10_37 <= 'z')) ) {
							alt10=5;
						}

						else {
							alt10=3;
						}

					}

					else {
						alt10=5;
					}

				}

				else {
					alt10=5;
				}

			}

			else {
				alt10=5;
			}

			}
			break;
		case 'w':
			{
			int LA10_9 = input.LA(2);
			if ( (LA10_9=='h') ) {
				int LA10_22 = input.LA(3);
				if ( (LA10_22=='i') ) {
					int LA10_31 = input.LA(4);
					if ( (LA10_31=='l') ) {
						int LA10_38 = input.LA(5);
						if ( (LA10_38=='e') ) {
							int LA10_42 = input.LA(6);
							if ( ((LA10_42 >= '0' && LA10_42 <= '9')||(LA10_42 >= 'A' && LA10_42 <= 'Z')||(LA10_42 >= 'a' && LA10_42 <= 'z')) ) {
								alt10=5;
							}

							else {
								alt10=3;
							}

						}

						else {
							alt10=5;
						}

					}

					else {
						alt10=5;
					}

				}

				else {
					alt10=5;
				}

			}

			else {
				alt10=5;
			}

			}
			break;
		case 't':
			{
			int LA10_10 = input.LA(2);
			if ( (LA10_10=='r') ) {
				int LA10_23 = input.LA(3);
				if ( (LA10_23=='u') ) {
					int LA10_32 = input.LA(4);
					if ( (LA10_32=='e') ) {
						int LA10_39 = input.LA(5);
						if ( ((LA10_39 >= '0' && LA10_39 <= '9')||(LA10_39 >= 'A' && LA10_39 <= 'Z')||(LA10_39 >= 'a' && LA10_39 <= 'z')) ) {
							alt10=5;
						}

						else {
							alt10=4;
						}

					}

					else {
						alt10=5;
					}

				}

				else {
					alt10=5;
				}

			}

			else {
				alt10=5;
			}

			}
			break;
		case 'f':
			{
			int LA10_11 = input.LA(2);
			if ( (LA10_11=='a') ) {
				int LA10_24 = input.LA(3);
				if ( (LA10_24=='l') ) {
					int LA10_33 = input.LA(4);
					if ( (LA10_33=='s') ) {
						int LA10_40 = input.LA(5);
						if ( (LA10_40=='e') ) {
							int LA10_44 = input.LA(6);
							if ( ((LA10_44 >= '0' && LA10_44 <= '9')||(LA10_44 >= 'A' && LA10_44 <= 'Z')||(LA10_44 >= 'a' && LA10_44 <= 'z')) ) {
								alt10=5;
							}

							else {
								alt10=4;
							}

						}

						else {
							alt10=5;
						}

					}

					else {
						alt10=5;
					}

				}

				else {
					alt10=5;
				}

			}

			else {
				alt10=5;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'I':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'O':
		case 'P':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'c':
		case 'd':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 'u':
		case 'x':
		case 'y':
		case 'z':
			{
			alt10=5;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt10=6;
			}
			break;
		case '\t':
		case '\n':
		case '\f':
		case '\r':
		case ' ':
			{
			alt10=8;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 10, 0, input);
			throw nvae;
		}
		switch (alt10) {
			case 1 :
				// JayCompiler.g:1:10: SEPARATORS
				{
				mSEPARATORS(); 

				}
				break;
			case 2 :
				// JayCompiler.g:1:21: OPERATORS
				{
				mOPERATORS(); 

				}
				break;
			case 3 :
				// JayCompiler.g:1:31: KEYWORDS
				{
				mKEYWORDS(); 

				}
				break;
			case 4 :
				// JayCompiler.g:1:40: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 5 :
				// JayCompiler.g:1:48: ID
				{
				mID(); 

				}
				break;
			case 6 :
				// JayCompiler.g:1:51: INT
				{
				mINT(); 

				}
				break;
			case 7 :
				// JayCompiler.g:1:55: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 8 :
				// JayCompiler.g:1:63: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
