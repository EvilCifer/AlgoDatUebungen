package de.org.bonn.algodat.blatt06.aufgabe4;

/**
 * 
 * @author dginte2s
 *
 */

public class SchlangeAlsRingDyn<T> implements Schlange<T>, Kollektion<T> {

	private RingDyn<T> ring = new RingDyn<T>();
	
	@Override
	public int total(){
		return ring.total();
	}
	
	@Override
	public void insert(T v) {
		ring.insertLast(v);
	}

	@Override
	public T element() {
		if(isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		return ring.get(0);
	}

	@Override
	public T remove() {
		if(isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		return ring.removeFirst();
	}

	@Override
	public boolean isEmpty() {
		return ring.size() == 0;
	}
}
