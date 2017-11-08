package de.org.bonn.algodat.blatt05.aufgabe4;

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
