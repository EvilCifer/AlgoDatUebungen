package de.org.bonn.algodat.blatt05.aufgabe3;

/**
 * 
 * @author dginte2s
 *
 */

public class SchlangeUtil{
	
	public static<T> int size(Schlange<T> w){
		SchlangeAlsFeldFix<T> schlange = new SchlangeAlsFeldFix<T>();
		int counter = 0;
		while(!w.isEmpty()){
			schlange.insert(w.remove());
			counter++;
		}
		while(!schlange.isEmpty()){
			w.insert(schlange.remove());
		}
		return counter;
	}
	
	public static <T> void revert(Schlange<T> w){
		StapelAlsFeldFix<T> stapel = new StapelAlsFeldFix<T>();
		while(!w.isEmpty()){
			stapel.insert(w.remove());
		}
		while(!stapel.isEmpty()){
			w.insert(stapel.remove());
		}
	}
	
	public static <T> void append(Schlange<? super T> ziel, Schlange<T> quelle){
		SchlangeAlsFeldFix<T> schlange = new SchlangeAlsFeldFix<T>();
		while(!quelle.isEmpty()){
			T object = quelle.remove();
			schlange.insert(object);
			ziel.insert(object);
		}
		while(!schlange.isEmpty()){
			quelle.insert(schlange.remove());
		}
	}
}
