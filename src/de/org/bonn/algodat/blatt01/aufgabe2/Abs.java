package de.org.bonn.algodat.blatt01.aufgabe2;

/**
 * 
 * @author dginte2s
 *
 */

public class Abs implements Funktion{

	@Override
	public boolean hatWertFuer(double x) {
		return true;
	}

	@Override
	public double wert(double x) throws Exception {
		return (x < 0) ? x * (-1) : x;
	}
	
	public String toString(){
		return "|x|";
	}
}
