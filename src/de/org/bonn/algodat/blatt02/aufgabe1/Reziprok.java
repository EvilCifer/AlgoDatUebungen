package de.org.bonn.algodat.blatt02.aufgabe1;

/**
 * 
 * @author dginte2s
 *
 */

public class Reziprok implements Funktion{

	@Override
	public boolean hatWertFuer(double x) {
		return (x != 0) ? true : false;
	}

	@Override
	public double wert(double x) throws ValueOutOfRangeException {
		assert x != 0 : "Teilen durch 0 nicht moeglich!";
		return 1 / x;
	}
	
	public String toString(){
		return "1/x";
	}
}
