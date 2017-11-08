package de.org.bonn.algodat.blatt01.aufgabe1;
/**
 * 
 * @author dginte2s
 *
 */

public class Mann extends Person{

	private final String name;
	private int alter;
	private int groesse;
	private int gewicht;
	private static int anzahl = 0;
	
	public Mann(String name, int alter, int groesse, int gewicht){
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
		return "XY";
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
		return this.groesse + 5;
	}

	@Override
	public int gewicht() {
		return this.gewicht;
	}

	@Override
	public int preisHaarschnitt() {
		return (int) Math.round(10 + (1 * this.alter) / 4.0);
	}
	@Override
	public String toString() {
		return name + " " + chromosomen() + " " + alter + " " + istVolljaehrig() + " " + groesse() + " " + gewicht() + " " + preisHaarschnitt();
	}
	
	public static int anzahl(){
		return anzahl;
	}
}
