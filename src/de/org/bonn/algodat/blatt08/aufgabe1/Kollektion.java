package de.org.bonn.algodat.blatt08.aufgabe1;

public interface Kollektion<T> {

	/**
	 * @return intern insgesamt verbrauchter Speicherplatz
	 */
	
	int total();
	
	boolean isEmpty();
}
