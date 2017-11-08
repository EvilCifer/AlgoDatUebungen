package de.org.bonn.algodat.blatt08.aufgabe2;

public interface Deque<T> extends Sequenz<T> {

	void insertFirst(T v);
	
	void insertLast(T v);
	/**
	 * @throws java.util.NoSuchElementException falls leer
	 */
	
	T getFirst();
	/**
	 * @throws java.util.NoSuchElementException falls leer
	 */
	
	T getLast();
	/**
	 * @return das vorherige erste Element
	 * @throws java.util.NoSuchElementException falls leer
	 */
	
	T setFirst(T v);
	/**
	 * @return das vorherig letzte Element
	 * @throws java.util.NoSuchElementException falls leer
	 */
	
	T setLast(T v);
	/**
	 * @return das vorherige erste Element
	 * @throws java.util.NoSuchElementException falls leer
	 */
	
	T removeFirst();
	/**
	 * @return das vorherig letzte Element
	 * @throws java.util.NoSuchElementException falls leer
	 */
	
	T removeLast();
}
