package de.org.bonn.algodat.blatt09.aufgabe2;

public class FeldComparator<T extends Comparable<T>> implements java.util.Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
		return o1.compareTo(o2);
	}

}
