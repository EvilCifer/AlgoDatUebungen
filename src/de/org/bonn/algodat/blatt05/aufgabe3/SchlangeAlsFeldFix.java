package de.org.bonn.algodat.blatt05.aufgabe3;

/**
 * 
 * @author dginte2s
 *
 */

public class SchlangeAlsFeldFix<T> implements Schlange<T>{

	private static final int _SIZE = 10;
	private FeldFix<T> feld = new FeldFix<>(_SIZE);
	private int anfang;
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
		return feld.get(anfang);
	}
	
	@Override
	public T remove() {
		if(isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		T object = element();
		move();
		ende--;
		return object;
	}
	
	private void move(){
		FeldFix<T> feldTmp = new FeldFix<T>(_SIZE);
		for(int i = 0; i < _SIZE - 1; i++){
			feldTmp.set(i, feld.get(i + 1));
		}
		feld = feldTmp;
	}
	
	@Override
	public boolean isEmpty() {
		return anfang == 0 && ende == 0;
	}
}
