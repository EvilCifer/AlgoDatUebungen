package de.org.bonn.algodat.blatt04.aufgabe1;

/**
 * 
 * @author dginte2s
 * 
 */

import java.util.Comparator;

public class ComparatorVonComparable<T extends Comparable<T>> implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
		return o1.compareTo(o2);
	}

}
