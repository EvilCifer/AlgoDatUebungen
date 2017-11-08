package de.org.bonn.algodat.blatt02.aufgabe1;

public class AbgeschlosseneAuswertung {

	public Double auswertung(Funktion f, double x){
		try{
			return f.wert(x);
		}catch(ValueOutOfRangeException e){
			return null;
		}
	}
}
