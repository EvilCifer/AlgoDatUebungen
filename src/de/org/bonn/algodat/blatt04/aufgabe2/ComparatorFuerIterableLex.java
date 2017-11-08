package de.org.bonn.algodat.blatt04.aufgabe2;
/**
 * 
 * @author dginte2s
 * 
 */

import java.util.Comparator;
import java.util.Iterator;

public class ComparatorFuerIterableLex<T extends Comparable<T>> implements Comparator<Iterable<? extends T>>{

	@Override
	public int compare(Iterable<? extends T> o1, Iterable<? extends T> o2) {
		Iterator<? extends T> iteratorA = o1.iterator();
		Iterator<? extends T> iteratorB = o2.iterator();
		
		while(iteratorA.hasNext() && iteratorB.hasNext()){
			T a = iteratorA.next();
			T b = iteratorB.next();
			
			if(a.compareTo(b) < 0){
				return -1;
			}
			if(a.compareTo(b) > 0){
				return 1;
			}
		}
		
		if(iteratorA.hasNext() && !iteratorB.hasNext()){
			return 1;
		}
		if(!iteratorA.hasNext() && iteratorB.hasNext()){
			return -1;
		}
		return 0;
	}
}