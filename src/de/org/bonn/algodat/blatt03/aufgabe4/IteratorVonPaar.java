package de.org.bonn.algodat.blatt03.aufgabe4;

import java.util.Iterator;

/**
 * 
 * @author dginte2s
 *
 */

public class IteratorVonPaar<E, Z> implements Iterator<Paar<E, Z>> {

	private Iterator<E> iter1;
	private Iterator<Z> iter2;
	
	public IteratorVonPaar(Iterator<E> iter1, Iterator<Z> iter2){
		this.iter1 = iter1;
		this.iter2 = iter2;
	}
	
	@Override
	public boolean hasNext() {
		return (iter1.hasNext() && iter2.hasNext()) ? true : false;
	}

	@Override
	public Paar<E, Z> next() {
		return new Paar<E, Z>(iter1.next(), iter2.next());
	}
}
