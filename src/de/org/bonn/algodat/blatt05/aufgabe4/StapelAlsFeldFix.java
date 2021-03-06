package de.org.bonn.algodat.blatt05.aufgabe4;

/**
 * 
 * @author dginte2s
 *
 */

public class StapelAlsFeldFix<T> implements Stapel<T>{

	private FeldFix<T> feld = new FeldFix<>(10);
	private int ende;

	@Override
	public void insert(T e) {
		if(ende >= feld.size()){
			throw new OutOfMemoryError();
		}
		feld.set(ende, e);
		ende++;
	}
	
	@Override
	public T element() {
		if(isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		return feld.get(ende--);
	}
	
	@Override
	public T remove() {
		if(isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		ende--;
		return feld.get(ende);
	}
	
	@Override
	public boolean isEmpty() {
		return ende == 0;
	}
}
