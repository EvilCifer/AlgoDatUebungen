package de.org.bonn.algodat.blatt01.aufgabe2;

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
	public double wert(double x) throws Exception {
		return Math.sqrt(x);
	}
	
	public String toString(){
		return "sqrt(x)";
	}
}
