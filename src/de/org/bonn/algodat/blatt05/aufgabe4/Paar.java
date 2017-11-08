package de.org.bonn.algodat.blatt05.aufgabe4;

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
	
	public E setErstes(E e){
		E oldErstes = erstes;
		this.erstes = e;
		return oldErstes;
	}
	
	public Z setZweites(Z z){
		Z oldZweites = zweites;
		this.zweites = z;
		return oldZweites;
	}
	
	public boolean equals(Paar<E,Z> paar){
		return erstes().equals(paar.erstes()) && zweites().equals(paar.zweites());
	}
	
	public String toString(){
		return "(" + erstes + "," + zweites + ")";
	}
}
