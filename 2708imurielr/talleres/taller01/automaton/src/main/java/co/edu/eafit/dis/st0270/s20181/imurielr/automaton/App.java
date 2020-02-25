package co.edu.eafit.dis.st0270.s20181.imurielr.automaton;

import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Arrays;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.ImmutablePair;
import co.edu.eafit.dis.st0270.automaton.Automaton;
import co.edu.eafit.dis.st0270.automaton.State;
import co.edu.eafit.dis.st0270.automaton.AutomatonException;
public class App 
{
    private static State q0 = new State("q0");
    private static State q1 = new State("q1");
    private static State q2 = new State("q2");
    private static State q3 = new State("q3");
   
    private static Character ca = new Character('a');
    private static Character cb = new Character('b');
    private static Character cc = new Character('c');
    private static Character cd = new Character('d');

    private static Automaton noClean()
        throws AutomatonException, IllegalArgumentException{
        Set<State> states = new HashSet(Arrays.asList(q0,q1,q2,q3));
        Set<Character> alphabet = new HashSet(Arrays.asList(ca,cb,cc));
        Map<Pair<State,Character>,State> delta = new HashMap();

        delta.put(new ImmutablePair(q0,ca),q1);
        delta.put(new ImmutablePair(q0,cb),q2);
        delta.put(new ImmutablePair(q2,cc),q3);

        Set<State> finals = new HashSet(Arrays.asList(q3));
        return new ImplAutomaton(states, alphabet, delta, q0, finals);

    }


    private static Automaton clean()
	throws AutomatonException, IllegalArgumentException{
	Set<State> states = new HashSet(Arrays.asList(q0,q1,q2,q3));
	Set<Character> alphabet = new HashSet(Arrays.asList(ca,cb,cc,cd));
	Map<Pair<State,Character>,State> delta = new HashMap();

	delta.put(new ImmutablePair(q0,ca),q1);
	delta.put(new ImmutablePair(q1,cb),q2);
	delta.put(new ImmutablePair(q2,cd),q3);
	delta.put(new ImmutablePair(q0,cc),q3);
	delta.put(new ImmutablePair(q1,ca),q3);

	Set<State> finals = new HashSet(Arrays.asList(q3));
        return new ImplAutomaton(states, alphabet, delta, q0, finals);

    }
   
     private static Automaton cleanAutomaton()
      throws AutomatonException, IllegalArgumentException {
      
      Set<State> states = new HashSet(Arrays.asList(q0, q1));
      Set<Character> alphabet = new HashSet(Arrays.asList(ca, cb));
      Map<Pair<State,Character>,State> delta = new HashMap();

      delta.put(new ImmutablePair(q0,ca), q1);
      delta.put(new ImmutablePair(q1,cb), q1);

      Set<State> finals = new HashSet(Arrays.asList(q1));
      return new ImplAutomaton(states, alphabet, delta, q0, finals);
   }

   private static Automaton noCleanAutomaton()
      throws AutomatonException, IllegalArgumentException {

      Set<State> states = new HashSet(Arrays.asList(q0, q1, q2, q3));
      Set<Character> alphabet = new HashSet(Arrays.asList(ca, cb, cc, cd));
      
      Map<Pair<State,Character>,State> delta = new HashMap();

      delta.put(new ImmutablePair(q0,ca), q1);
      delta.put(new ImmutablePair(q0,cb), q2);
      delta.put(new ImmutablePair(q3,cc), q2);
      delta.put(new ImmutablePair(q2,cd), q2);

      Set<State> finals = new HashSet(Arrays.asList(q2));
      return new ImplAutomaton(states, alphabet, delta, q0, finals);
   }
    private static Automaton sucio()
        throws AutomatonException, IllegalArgumentException{
        Set<State> states = new HashSet(Arrays.asList(q0,q1,q2,q3));
        Set<Character> alphabet = new HashSet(Arrays.asList(ca,cb,cc));
        Map<Pair<State,Character>,State> delta = new HashMap();

        delta.put(new ImmutablePair(q0,ca),q1);
        delta.put(new ImmutablePair(q1,cb),q2);
        delta.put(new ImmutablePair(q0,cc),q3);

        Set<State> finals = new HashSet(Arrays.asList(q3));
        return new ImplAutomaton(states, alphabet, delta, q0, finals);

    }
   
    public static void main(String[] args) {

	try {

	    System.out.println("Clean automaton is clean: " + cleanAutomaton().isClean());
            System.out.println("Clean automaton is: " +  ((ImplAutomaton) cleanAutomaton()).toString());
            Automaton newClean = cleanAutomaton().cleaning();           
            System.out.println("New clean automaton is: " + ((ImplAutomaton) newClean).toString());
            
            System.out.println("No clean automaton is clean: " + noCleanAutomaton().isClean());
            System.out.println("No clean automaton is: " + ((ImplAutomaton) noCleanAutomaton()).toString());
            Automaton newClean2 = noCleanAutomaton().cleaning();
            System.out.println("No clean automaton is: " + ((ImplAutomaton) newClean2).toString());

	    System.out.println("Automata 3 is clean: " + noClean().isClean());
            System.out.println("Automata 3 is: " +  ((ImplAutomaton) noClean()).toString());
            Automaton newClean3 = noClean().cleaning();
            System.out.println("New clean automata 3 is: " + ((ImplAutomaton) newClean3).toString());                                                

            System.out.println("Automata 4 is clean: " + clean().isClean());
            System.out.println("Automata 4 is: " +  ((ImplAutomaton) clean()).toString());
            Automaton newClean4 = clean().cleaning();
            System.out.println("New clean automata 4 is: " + ((ImplAutomaton) newClean4).toString());

	    System.out.println("Automata 5 is clean: " + sucio().isClean());
            System.out.println("Automata 5 is: " +  ((ImplAutomaton) sucio()).toString());
            Automaton newClean5 = sucio().cleaning();
            System.out.println("New clean automata 5 is: " + ((ImplAutomaton) newClean5).toString());

	} catch (AutomatonException ae) {
	    System.err.println("Error on automaton");
	} catch (IllegalArgumentException iae) {
	    System.err.println("Illegal exception: " + iae);
	}
    }
}

