package de.org.bonn.algodat.blatt01.aufgabe2;

/**
 * 
 * @author dginte2s
 *
 */

public class RezWurzel implements Funktion{

	Reziprok reziprok = new Reziprok();
	Abs abs = new Abs();
	Wurzel wurzel = new Wurzel();
	
	Kettenfunktion funktion1 = new Kettenfunktion(wurzel, abs);
	Kettenfunktion funktion2 = new Kettenfunktion(reziprok, funktion1);
	
	@Override
	public boolean hatWertFuer(double x) {
		try{
			return abs.hatWertFuer(x) && wurzel.hatWertFuer(abs.wert(x)) && reziprok.hatWertFuer(wurzel.wert(abs.wert(x)));
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public double wert(double x) throws Exception {
		return reziprok.wert(wurzel.wert(abs.wert(x)));
	}
	
	public String toString(){
		return funktion2.toString();
	}
}
