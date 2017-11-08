package de.org.bonn.algodat.blatt02.aufgabe1;

/**
 * 
 * @author dginte2s
 *
 */

public interface Funktion {
	boolean hatWertFuer(double x);
	double wert(double x) throws ValueOutOfRangeException;
}