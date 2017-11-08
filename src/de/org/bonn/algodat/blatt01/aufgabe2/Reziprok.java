package de.org.bonn.algodat.blatt01.aufgabe2;

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
	public double wert(double x) throws Exception {
		return 1 / x;
	}
	
	public String toString(){
		return "1/x";
	}
}
