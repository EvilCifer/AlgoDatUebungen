package de.org.bonn.algodat.blatt05.aufgabe3;

public interface PrioSchlange<T> extends Sequenz<T>{

	void insert(T e);
	/**
	 * @throws java.util.NoSuchElementException falls leer
	 */
	T element();
	/**
	 * @throws java.util.NoSuchElementException falls leer
	 */
	T remove();
}
