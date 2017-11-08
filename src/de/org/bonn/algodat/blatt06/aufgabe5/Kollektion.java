package de.org.bonn.algodat.blatt06.aufgabe5;

public interface Kollektion<T> {

	/**
	 * @return intern insgesamt verbrauchter Speicherplatz
	 */
	
	int total();
	
	boolean isEmpty();
}
