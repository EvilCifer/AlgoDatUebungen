package de.org.bonn.algodat.blatt05.aufgabe2;

/**
 * 
 * @author dginte2s
 *
 */

public class SchlangeAlsFeldFix<T> implements Schlange<T>{

	private FeldFix<T> feld = new FeldFix<>(10);
	private int anfang;
	private int ende;
	
	@Override
	public void insert(T e) {
		if(ende > feld.size()){
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
		return feld.get(anfang);
	}
	
	@Override
	public T remove() {
		if(isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		T object = element();
		anfang++;
		return object;
	}
	
	@Override
	public boolean isEmpty() {
		return feld.isEmpty();
	}
}
