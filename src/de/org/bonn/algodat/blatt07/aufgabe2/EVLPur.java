package de.org.bonn.algodat.blatt07.aufgabe2;

/**
 * 
 * @author dginte2s
 *
 */

public class EVLPur<T> {

	private EVL<T> liste = new EVL<T>();
	
	public int total(){
		return liste.total() - 1;
	}
	
	public boolean isEmpty(){
		return liste.isEmpty();
	}
	
	public T getFirst(){
		return liste.getFirst();
	}
	
	public void setFirst(T v){
		liste.setFirst(v);
	}
	
	public void insertFirst(T v){
		liste.insertFirst(v);
	}
	
	public T removeFirst(){
		return liste.removeFirst();
	}
}
