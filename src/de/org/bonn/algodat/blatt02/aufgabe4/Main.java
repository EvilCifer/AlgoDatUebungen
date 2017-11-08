package de.org.bonn.algodat.blatt02.aufgabe4;

/**
 * 
 * @author dginte2s
 *
 */

public class Main {

	public static void main(String[] args){
		Paar<Integer, String> paar = new Paar<Integer, String>(2, "zwei");
		System.out.println(paar.erstes());
		System.out.println(paar.zweites());
		paar.setErstes(3);
		paar.setZweites("drei");
		System.out.println(paar.toString());
		Paar<Integer, String> paar2 = new Paar<Integer, String>(3, "drei");
		System.out.println(paar.equals(paar2));
		Paar<String, String> paar3 = new Paar<String, String>("", null);
		System.out.println(paar3.erstes());
		System.out.println(paar3.zweites());
		System.out.println(paar3.toString());
	}
}
