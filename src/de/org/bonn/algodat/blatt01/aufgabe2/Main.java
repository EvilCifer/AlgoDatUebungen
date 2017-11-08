package de.org.bonn.algodat.blatt01.aufgabe2;

/**
 * 
 * @author dginte2s
 *
 */

public class Main {

	public static void main(String[] args){
		RezWurzel rez = new RezWurzel();
		System.out.println(rez.toString());
		
		System.out.println(rez.hatWertFuer(0));
		
		double[] arr = {2, 3, 1, 4, 5};
		
		Polynom poly = new Polynom(arr);
		
		System.out.println(poly.toString());
	}
}
