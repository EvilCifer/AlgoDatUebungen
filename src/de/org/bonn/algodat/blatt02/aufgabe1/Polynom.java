package de.org.bonn.algodat.blatt02.aufgabe1;

/**
 * 
 * @author dginte2s
 *
 */

public class Polynom implements Funktion{

	private double[] werte;
	
	public Polynom(double[] werte){
		this.werte = werte;
	}
	
	@Override
	public boolean hatWertFuer(double x) {
		return true;
	}

	@Override
	public double wert(double x) throws ValueOutOfRangeException {
		double result = 0;
		for(int i = 0; i < werte.length; i++){
			result += werte[i] * pow(x, i);
		}
		return result;
	}
	
	private double pow(double x, int exponent){
		double result = 1.0;
		for(int i = 0; i < exponent; i++){
			result *= x;
		}
		return result;
	}
	
	public String toString(){
		String funktion = "";
		for(int i = 0; i < werte.length; i++){
			funktion = werte[i] + "*x^" + i + ((i > 0) ? " + " : "") + funktion;
		}
		return funktion;
	}
}
