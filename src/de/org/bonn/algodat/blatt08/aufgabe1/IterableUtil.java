package de.org.bonn.algodat.blatt08.aufgabe1;

/**
 * 
 * @author dginte2s
 * 
 */

import java.util.Iterator;

public class IterableUtil<T> {

	public static <T> int sucheLinear(Iterable<T> iterable, T object){
		Iterator<T> iter = iterable.iterator();
		int position = 0;
		while(iter.hasNext()){
			if(object.equals(iter.next())){
				return position;
			}
			++position;
		}
		return -1;
	}
}
