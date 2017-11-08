package de.org.bonn.algodat.blatt05.aufgabe3;

/**
 * 
 * @author dginte2s
 *
 */

public class StapelUtil{

	public static <T> int size(Stapel<T> s){
		StapelAlsFeldFix<T> stack = new StapelAlsFeldFix<T>();
		int counter = 0;
		while(!s.isEmpty()){
			stack.insert(s.remove());
			counter++;
		}
		while(!stack.isEmpty()){
			s.insert(stack.remove());
		}
		return counter;
	}
	
	public static <T> void revert(Stapel<T> s){
		SchlangeAlsFeldFix<T> queue = new SchlangeAlsFeldFix<T>();
		while(!s.isEmpty()){
			queue.insert(s.remove());
		}
		while(!queue.isEmpty()){
			s.insert(queue.remove());
		}
	}
	
	public static <T> void append(Stapel<? super T> ziel, Stapel<T> quelle){
		StapelAlsFeldFix<T> stack = new StapelAlsFeldFix<T>();
		while(!quelle.isEmpty()){
			stack.insert(quelle.remove());
		}
		while(!stack.isEmpty()){
			quelle.insert(stack.remove());
			ziel.insert(quelle.element());
		}
	}
}
