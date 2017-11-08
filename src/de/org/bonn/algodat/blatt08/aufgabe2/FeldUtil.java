package de.org.bonn.algodat.blatt08.aufgabe2;

/**
 * 
 * @author dginte2s
 *
 */

public class FeldUtil<T> {

	public static <T extends Comparable<T>> int sucheBinaerPos(Feld<T> feld, T object){
		int start = 0;
		int ende = feld.size();
		while(start < ende){
			int center = (start + ende) / 2;
			if(object.compareTo(feld.get(center)) <= 0){
				ende = center;
			}else{
				start = center + 1;
			}
		}
		return start;
	}
	
	public static <T extends Comparable<T>> int sucheBinaer(Feld<T> feld, T object){
		int position = sucheBinaerPos(feld, object);
		return position < feld.size() && object.compareTo(feld.get(position)) == 0 ? position : -1;
	}
}
