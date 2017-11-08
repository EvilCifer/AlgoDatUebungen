package de.org.bonn.algodat.blatt02.aufgabe5;

/**
 * 
 * @author dginte2s
 *
 */

public class Paar<E,Z> {

	private E erstes;
	private Z zweites;
	
	public Paar(E erstes, Z zweites){
		this.erstes = erstes;
		this.zweites = zweites;
	}
	
	public E erstes(){
		return erstes;
	}
	
	public Z zweites(){
		return zweites;
	}
	
	public void setErstes(E e){
		this.erstes = e;
	}
	
	public void setZweites(Z z){
		this.zweites = z;
	}
	
	public boolean equals(Paar<E,Z> paar){
		return erstes().equals(paar.erstes()) && zweites().equals(paar.zweites());
	}
	
	public String toString(){
		return "(" + erstes + "," + zweites + ")";
	}
}
