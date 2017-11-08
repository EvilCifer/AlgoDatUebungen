package de.org.bonn.algodat.blatt03.aufgabe4;

/**
 * 
 * @author dginte2s
 *
 */

public interface Feld<T> {
	boolean isEmpty();
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
	T set(int p, T e);
	/**
	* @throws IndexOutOfBoundsException falls p oder q ungueltig
	*/
	void swap(int p, int q);
}
