package de.org.bonn.algodat.blatt01.aufgabe1;
/**
 * 
 * @author dginte2s
 *
 */

public class Frau extends Person{

	private final String name;
	private int alter;
	private int groesse;
	private int gewicht;
	private static int anzahl = 0;
	
	public Frau(String name, int alter, int groesse, int gewicht){
		this.name = name;
		this.alter = alter;
		this.groesse = groesse;
		this.gewicht = gewicht;
		anzahl++;
	}
	
	@Override
	public String name() {
		return this.name;
	}

	@Override
	public String chromosomen() {
		return "XX";
	}

	@Override
	public int alter() {
		return this.alter;
	}

	@Override
	public boolean istVolljaehrig() {
		return alter >= Person.volljaehrigkeitsAlter();
	}

	@Override
	public int groesse() {
		return this.groesse;
	}

	@Override
	public int gewicht() {
		return this.gewicht - 5;
	}

	@Override
	public int preisHaarschnitt() {
		return (int) Math.round(20 + (2 * alter) / 3.0);
	}

	@Override
	public String toString() {
		return name + " " + chromosomen() + " " + alter + " " + istVolljaehrig() + " " + groesse() + " " + gewicht() + " " + preisHaarschnitt();
	}
	
	public static int anzahl(){
		return anzahl;
	}
}
