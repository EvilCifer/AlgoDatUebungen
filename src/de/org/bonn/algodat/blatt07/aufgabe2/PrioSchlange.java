package de.org.bonn.algodat.blatt07.aufgabe2;

public interface PrioSchlange<T> extends Sequenz<T> {

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
