package de.org.bonn.algodat.blatt02.aufgabe1;

/**
 * 
 * @author dginte2s
 *
 */

public class Wurzel implements Funktion{

	@Override
	public boolean hatWertFuer(double x) {
		return (x < 0) ? false : true;
	}

	@Override
	public double wert(double x) throws ValueOutOfRangeException {
		assert x >= 0 : "Wurzel aus negativer Zahl nicht moeglich!";
		return Math.sqrt(x);
	}
	
	public String toString(){
		return "sqrt(x)";
	}
}
