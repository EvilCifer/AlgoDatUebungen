package de.org.bonn.algodat.blatt08.aufgabe2;

public interface Liste<T> extends Deque<T>, Feld<T> {

	/**
	 * @throws IndexOutOfBoundsException falls Position p ungueltig
	 */
	
	void insert(int p, T v);
	/**
	 * @return vorheriges Element an Position p
	 * @throws IndexOutOfBoundsException falls Position p ungueltig
	 */
	
	T remove(int p);
}
