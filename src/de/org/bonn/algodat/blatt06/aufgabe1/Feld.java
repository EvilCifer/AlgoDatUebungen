package de.org.bonn.algodat.blatt06.aufgabe1;

public interface Feld<T> extends Sequenz<T>, Iterable<T> {

	int size();
	/**
	 * @return Element an Position p
	 * @throws IndexOutOfBoundsException falls p ungueltig
	 */
	
	T get(int p);
	/**
	 * @return vorheriges Element an Position p
	 * @throws IndexOutOfBoundsException falls p ungueltig
	 */
	
	T set(int p, T v);
	/**
	 * @throws IndexOutOfBoundsException falls p oder q ungueltig
	 */
	
	void swap(int p, int q);
	
	java.util.Iterator<T> iterator(int p);
	
	java.util.Iterator<T> iterator(int p, int e);
}
