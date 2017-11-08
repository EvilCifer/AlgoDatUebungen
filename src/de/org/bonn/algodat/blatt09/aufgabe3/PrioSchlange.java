package de.org.bonn.algodat.blatt09.aufgabe3;

public interface PrioSchlange<T> extends Sequenz<T> {

	boolean isEmpty();
	
	void insert(T v);
	/**
	 * @throws java.util.NoSuchElementException falls leer
	 */
	
	T element();
	/**
	 * @throws java.util.NoSuchElementException falls leer
	 */
	
	T remove();
}
