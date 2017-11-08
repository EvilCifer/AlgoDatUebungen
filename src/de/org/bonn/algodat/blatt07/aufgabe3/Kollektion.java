package de.org.bonn.algodat.blatt07.aufgabe3;

public interface Kollektion<T> {

	/**
	 * @return intern insgesamt verbrauchter Speicherplatz
	 */
	
	int total();
	
	boolean isEmpty();
}
