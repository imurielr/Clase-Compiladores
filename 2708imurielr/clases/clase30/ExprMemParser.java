
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class ExprMemParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return ExprMemSymbols.class;
}

  /** Default constructor. */
  @Deprecated
  public ExprMemParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public ExprMemParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ExprMemParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\015\000\002\002\004\000\002\002\003\000\002\003" +
    "\005\000\002\003\005\000\002\003\003\000\002\004\005" +
    "\000\002\004\005\000\002\004\003\000\002\005\003\000" +
    "\002\005\004\000\002\006\003\000\002\006\003\000\002" +
    "\006\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\025\000\010\004\010\012\004\013\012\001\002\000" +
    "\020\002\ufff6\005\ufff6\006\ufff6\007\ufff6\010\ufff6\011\ufff6" +
    "\014\ufff6\001\002\000\016\002\ufffa\005\ufffa\006\ufffa\007" +
    "\ufffa\010\ufffa\014\ufffa\001\002\000\016\002\ufffd\005\ufffd" +
    "\006\ufffd\007\020\010\017\014\ufffd\001\002\000\020\002" +
    "\ufff9\005\ufff9\006\ufff9\007\ufff9\010\ufff9\011\027\014\ufff9" +
    "\001\002\000\020\002\ufff7\005\ufff7\006\ufff7\007\ufff7\010" +
    "\ufff7\011\ufff7\014\ufff7\001\002\000\004\002\026\001\002" +
    "\000\010\004\010\012\004\013\012\001\002\000\010\002" +
    "\000\005\015\006\014\001\002\000\010\004\010\012\004" +
    "\013\012\001\002\000\010\004\010\012\004\013\012\001" +
    "\002\000\016\002\uffff\005\uffff\006\uffff\007\020\010\017" +
    "\014\uffff\001\002\000\010\004\010\012\004\013\012\001" +
    "\002\000\010\004\010\012\004\013\012\001\002\000\016" +
    "\002\ufffc\005\ufffc\006\ufffc\007\ufffc\010\ufffc\014\ufffc\001" +
    "\002\000\016\002\ufffb\005\ufffb\006\ufffb\007\ufffb\010\ufffb" +
    "\014\ufffb\001\002\000\016\002\ufffe\005\ufffe\006\ufffe\007" +
    "\020\010\017\014\ufffe\001\002\000\010\005\015\006\014" +
    "\014\025\001\002\000\020\002\ufff5\005\ufff5\006\ufff5\007" +
    "\ufff5\010\ufff5\011\ufff5\014\ufff5\001\002\000\004\002\001" +
    "\001\002\000\016\002\ufff8\005\ufff8\006\ufff8\007\ufff8\010" +
    "\ufff8\014\ufff8\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\025\000\014\002\010\003\012\004\005\005\004\006" +
    "\006\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\012\003\023\004\005\005\004\006\006\001\001" +
    "\000\002\001\001\000\010\004\022\005\004\006\006\001" +
    "\001\000\010\004\015\005\004\006\006\001\001\000\002" +
    "\001\001\000\006\005\021\006\006\001\001\000\006\005" +
    "\020\006\006\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ExprMemParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ExprMemParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ExprMemParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



       	    private Integer memory = new Integer(0);

	    public Integer getMemory() {
	    	   return memory;
	    }
       	    

/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$ExprMemParser$actions {
  private final ExprMemParser parser;

  /** Constructor */
  CUP$ExprMemParser$actions(ExprMemParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$ExprMemParser$do_action_part00000000(
    int                        CUP$ExprMemParser$act_num,
    java_cup.runtime.lr_parser CUP$ExprMemParser$parser,
    java.util.Stack            CUP$ExprMemParser$stack,
    int                        CUP$ExprMemParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ExprMemParser$result;

      /* select the action based on the action number */
      switch (CUP$ExprMemParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= prog EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-1)).right;
		Integer start_val = (Integer)((java_cup.runtime.Symbol) CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-1)).value;
		RESULT = start_val;
              CUP$ExprMemParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-1)), ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ExprMemParser$parser.done_parsing();
          return CUP$ExprMemParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // prog ::= expr 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$ExprMemParser$stack.peek()).value;
		 RESULT = e; 
              CUP$ExprMemParser$result = parser.getSymbolFactory().newSymbol("prog",0, ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), RESULT);
            }
          return CUP$ExprMemParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr ::= expr ADD term 
            {
              Integer RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-2)).right;
		Integer l = (Integer)((java_cup.runtime.Symbol) CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()).right;
		Integer r = (Integer)((java_cup.runtime.Symbol) CUP$ExprMemParser$stack.peek()).value;
		 RESULT = l + r; 
              CUP$ExprMemParser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-2)), ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), RESULT);
            }
          return CUP$ExprMemParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr ::= expr SUB term 
            {
              Integer RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-2)).right;
		Integer l = (Integer)((java_cup.runtime.Symbol) CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()).right;
		Integer r = (Integer)((java_cup.runtime.Symbol) CUP$ExprMemParser$stack.peek()).value;
		 RESULT = l - r; 
              CUP$ExprMemParser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-2)), ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), RESULT);
            }
          return CUP$ExprMemParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr ::= term 
            {
              Integer RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()).right;
		Integer t = (Integer)((java_cup.runtime.Symbol) CUP$ExprMemParser$stack.peek()).value;
		 RESULT = t;	   
              CUP$ExprMemParser$result = parser.getSymbolFactory().newSymbol("expr",1, ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), RESULT);
            }
          return CUP$ExprMemParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // term ::= term TIMES storable 
            {
              Integer RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-2)).right;
		Integer l = (Integer)((java_cup.runtime.Symbol) CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()).right;
		Integer r = (Integer)((java_cup.runtime.Symbol) CUP$ExprMemParser$stack.peek()).value;
		 RESULT = l * r; 
              CUP$ExprMemParser$result = parser.getSymbolFactory().newSymbol("term",2, ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-2)), ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), RESULT);
            }
          return CUP$ExprMemParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // term ::= term DIV storable 
            {
              Integer RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-2)).right;
		Integer l = (Integer)((java_cup.runtime.Symbol) CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-2)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()).left;
		int rright = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()).right;
		Integer r = (Integer)((java_cup.runtime.Symbol) CUP$ExprMemParser$stack.peek()).value;
		 RESULT = l / r; 
              CUP$ExprMemParser$result = parser.getSymbolFactory().newSymbol("term",2, ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-2)), ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), RESULT);
            }
          return CUP$ExprMemParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // term ::= storable 
            {
              Integer RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()).right;
		Integer s = (Integer)((java_cup.runtime.Symbol) CUP$ExprMemParser$stack.peek()).value;
		 RESULT = s;	   
              CUP$ExprMemParser$result = parser.getSymbolFactory().newSymbol("term",2, ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), RESULT);
            }
          return CUP$ExprMemParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // storable ::= factor 
            {
              Integer RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()).right;
		Integer f = (Integer)((java_cup.runtime.Symbol) CUP$ExprMemParser$stack.peek()).value;
		 RESULT = f; 
              CUP$ExprMemParser$result = parser.getSymbolFactory().newSymbol("storable",3, ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), RESULT);
            }
          return CUP$ExprMemParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // storable ::= factor STORE 
            {
              Integer RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-1)).left;
		int fright = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-1)).right;
		Integer f = (Integer)((java_cup.runtime.Symbol) CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-1)).value;
		 memory = f;
	     	      		   	   RESULT = memory; 
					
              CUP$ExprMemParser$result = parser.getSymbolFactory().newSymbol("storable",3, ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-1)), ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), RESULT);
            }
          return CUP$ExprMemParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // factor ::= NUMBER 
            {
              Integer RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$ExprMemParser$stack.peek()).value;
		 RESULT = (Integer) n; 
              CUP$ExprMemParser$result = parser.getSymbolFactory().newSymbol("factor",4, ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), RESULT);
            }
          return CUP$ExprMemParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // factor ::= RECALL 
            {
              Integer RESULT =null;
		 RESULT = memory; 
              CUP$ExprMemParser$result = parser.getSymbolFactory().newSymbol("factor",4, ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), RESULT);
            }
          return CUP$ExprMemParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // factor ::= LPAREN expr RPAREN 
            {
              Integer RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-1)).right;
		Integer e = (Integer)((java_cup.runtime.Symbol) CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-1)).value;
		 RESULT = e; 
              CUP$ExprMemParser$result = parser.getSymbolFactory().newSymbol("factor",4, ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.elementAt(CUP$ExprMemParser$top-2)), ((java_cup.runtime.Symbol)CUP$ExprMemParser$stack.peek()), RESULT);
            }
          return CUP$ExprMemParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$ExprMemParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$ExprMemParser$do_action(
    int                        CUP$ExprMemParser$act_num,
    java_cup.runtime.lr_parser CUP$ExprMemParser$parser,
    java.util.Stack            CUP$ExprMemParser$stack,
    int                        CUP$ExprMemParser$top)
    throws java.lang.Exception
    {
              return CUP$ExprMemParser$do_action_part00000000(
                               CUP$ExprMemParser$act_num,
                               CUP$ExprMemParser$parser,
                               CUP$ExprMemParser$stack,
                               CUP$ExprMemParser$top);
    }
}

}
