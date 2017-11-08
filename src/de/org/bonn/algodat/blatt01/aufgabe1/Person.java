package de.org.bonn.algodat.blatt01.aufgabe1;
/**
 * 
 * @author dginte2s
 *
 */

public abstract class Person {
	
	private static int anzahl = 0;
	
	Person(){
		anzahl++;
	}

	public abstract String name();
	
	public abstract String chromosomen();
	
	public abstract int alter();
	
	public static int volljaehrigkeitsAlter(){
		return 18;
	}
	
	public abstract boolean istVolljaehrig();
	
	public abstract int groesse();
	
	public abstract int gewicht();
	
	public abstract int preisHaarschnitt();
	
	public abstract String toString();
	
	public static int anzahl(){
		return anzahl;
	}
}
