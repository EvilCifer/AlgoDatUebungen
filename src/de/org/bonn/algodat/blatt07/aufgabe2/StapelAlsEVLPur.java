package de.org.bonn.algodat.blatt07.aufgabe2;

/**
 * 
 * @author dginte2s
 *
 */

public class StapelAlsEVLPur<T> implements Stapel<T> {

	private EVLPur<T> liste = new EVLPur<T>();
	
	public int total(){
		return liste.total();
	}
	
	public boolean isEmpty(){
		return liste.isEmpty();
	}
	
	@Override
	public void insert(T v) {
		liste.insertFirst(v);
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
