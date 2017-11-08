package de.org.bonn.algodat.blatt11.aufgabe6;

/**
 * 
 * @author dginte2s
 *
 */

public class SchlangeAlsEVL<T> implements Schlange<T> {

	private EVL<T> liste = new EVL<T>();
	
	public int total(){
		return liste.total();
	}
	
	public boolean isEmpty(){
		return liste.isEmpty();
	}
	
	@Override
	public void insert(T v) {
		liste.insertLast(v);
	}

	@Override
	public T element() {
		return liste.getFirst();
	}

	@Override
	public T remove() {
		return liste.removeFirst();
	}
}
