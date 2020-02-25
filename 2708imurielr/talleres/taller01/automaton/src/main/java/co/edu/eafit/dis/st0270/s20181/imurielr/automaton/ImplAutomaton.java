package co.edu.eafit.dis.st0270.s20181.imurielr.automaton;

import co.edu.eafit.dis.st0270.automaton.*;
import org.apache.commons.lang3.tuple.*;
import java.util.*;

public class ImplAutomaton extends Automaton{

    public ImplAutomaton(Set<State> states, 
			 Set<Character> alphabet, 
			 Map<Pair<State,Character>,State> delta, 
			 State initial, 
			 Set<State> finals) throws IllegalArgumentException, AutomatonException {
	super(states, alphabet, delta, initial, finals);
    }

    private ArrayList<State> getSuccessors(State s){
	State sucesor = s;
	ArrayList<State> sucesores = new ArrayList<State>();
	for(Character c : alphabet){
            sucesor = delta.get(new ImmutablePair(s,c));
            if(sucesor != null){
                sucesores.add(sucesor);
            }
        }
	return sucesores;
    }

    private boolean accesible(State s){
	ArrayList<State> visitados = new ArrayList<State>();
	return accesible(initial, s, visitados);
    }

    private boolean accesible(State actual, State s, ArrayList<State> visitados){
	if(!visitados.contains(actual)){
	    visitados.add(actual);
	}
	ArrayList<State> sucesores = getSuccessors(actual);
	if(sucesores != null){
	    for(State sucesor : sucesores){
		if(!visitados.contains(sucesor)){
		    accesible(sucesor, s, visitados);  
		}
	    }
	}
	if(visitados.contains(s)){
	    return true;
	}
	return false;
    }

    private boolean postaccesible(State s){
	ArrayList<State> visitados = new ArrayList<State>();
	return postaccesible(s,finals,visitados);
    }

    private boolean postaccesible(State actual, Set<State> f, ArrayList<State> visitados){
	if(!visitados.contains(actual)){
	    visitados.add(actual);
	}
	ArrayList<State> sucesores = getSuccessors(actual);
	if(sucesores.isEmpty() && !finals.contains(actual)){
	    visitados.remove(actual);
	    return false;
	}
	else{
	    for(State sucesor : sucesores){
		if(!visitados.contains(sucesor)){
		    postaccesible(sucesor, f, visitados);
		}
	    }
	}
	return true;
    }

    public boolean isClean(){
	for(State s : states){
	    if(!accesible(s) || !postaccesible(s)){
		return false;
	    }
	}
	return true;
    }

    public Automaton cleaning() throws AutomatonException{
	Set<State> estados = new HashSet();                                                                                    
	Set<Character> alfabeto = new HashSet();                                                                   
	Map<Pair<State,Character>,State> d = new HashMap();                                                                                          
	Set<State> finales = new HashSet();

	if(isClean()){
	    return new ImplAutomaton(states, alphabet, delta, initial, finals);
	}
	for(State s : states){
	    if(accesible(s) && postaccesible(s)){
		estados.add(s);
		for(Character c : alphabet){
		    if(delta.get(new ImmutablePair(s,c)) != null && accesible(delta.get(new ImmutablePair(s,c))) && postaccesible(delta.get(new ImmutablePair(s,c)))){
			d.put(new ImmutablePair(s,c),delta.get(new ImmutablePair(s,c)));
			if(!alfabeto.contains(c)){
			    alfabeto.add(c);
			}
		    }
		}
	    }
	}
	for(State f : finals){
	    if(accesible(f)){
		finales.add(f);
	    }
	}
	if(!postaccesible(initial)){
	    ArrayList<State> e = new ArrayList<State>(estados);
	    initial = e.get(0);
	}
	return new ImplAutomaton(estados,alfabeto,d,initial,finales).cleaning();
    }

    public boolean isMinimal(){
	return true;
    }

    public Automaton getMinimal(){
	return null;
    }
    
    public String toString(){
	String res = "{\nQ = "+states+"\n"+"∑ = "+alphabet+"\n"+"δ = "+"\n";
	for(Map.Entry<Pair<State,Character>,State> entry : delta.entrySet()){
	    res += "δ"+entry.getKey() + " = " + entry.getValue()+"\n";
	}
	res += "q0 = "+initial+"\n"+"F = "+finals+"\n}";
	return res;
    }
}
