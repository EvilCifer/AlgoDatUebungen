package de.org.bonn.algodat.blatt03.aufgabe4;

import java.util.Iterator;

/**
 * 
 * @author dginte2s
 *
 */

public class FeldIterableVonPaar<E, Z> implements FeldIterable<Paar<E, Z>>{

	private FeldIterable<E> feld1;
	private FeldIterable<Z> feld2;
	
	public FeldIterableVonPaar(FeldIterable<E> feld1, FeldIterable<Z> feld2){
		this.feld1 = feld1;
		this.feld2 = feld2;
	}
	
	@Override
	public Iterator<Paar<E, Z>> iterator() {
		return new IteratorVonPaar<E, Z>(feld1.iterator(), feld2.iterator());
	}

	@Override
	public boolean isEmpty() {
		return (feld1.isEmpty() && feld2.isEmpty()) ? true : false;
	}

	@Override
	public int size() {
		return Math.min(feld1.size(), feld2.size());
	}

	@Override
	public Paar<E, Z> get(int p) {
		return new Paar<E, Z>(feld1.get(p), feld2.get(p));
	}

	@Override
	public Paar<E, Z> set(int p, Paar<E, Z> e) {
		E old1 = get(p).erstes();
		Z old2 = get(p).zweites();
		feld1.set(p, e.erstes());
		feld2.set(p, e.zweites());
		return new Paar<E, Z>(old1, old2);
	}

	@Override
	public void swap(int p, int q) {
		feld1.swap(p, q);
		feld2.swap(p, q);
	}
}
