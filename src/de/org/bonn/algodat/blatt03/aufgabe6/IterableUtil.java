package de.org.bonn.algodat.blatt03.aufgabe6;

import java.util.Comparator;
import java.util.Iterator;

/**
 * 
 * @author dginte2s
 *
 */

public class IterableUtil{

	public static <T> T max2(Iterable<T> iterable, Comparator<T> comp){
		Iterator<T> iterator = iterable.iterator();
		T max = null;
		T max2 = null;
		T akt = null;
		if(iterator.hasNext()){
			max = iterator.next();
		}
		if(iterator.hasNext()){
			max2 = iterator.next();
		}else{
			throw new IllegalArgumentException();
		}
		if(comp.compare(max, max2) <= 0){
			akt = max;
			max = max2;
			max2 = max;
		}
		while(iterator.hasNext()){
			akt = iterator.next();
			if(comp.compare(akt, max) > 0){
				max2 = max;
				max = akt;
			}else if(comp.compare(akt, max) == 0){
				max2 = akt;
			}else{
				if(comp.compare(akt, max2) >= 0){
					max2 = akt;
				}
			}
		}
		return max2;
	}
}
