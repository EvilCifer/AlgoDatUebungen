package de.org.bonn.algodat.blatt06.aufgabe4;

/**
 * 
 * @author dginte2s
 *
 */

public class DequeAlsRingDyn<T> implements Deque<T>, Kollektion<T> {

	private RingDyn<T> ring = new RingDyn<T>();
	
	@Override
	public int total(){
		return ring.total();
	}
	
	@Override
	public void insertFirst(T v) {
		ring.insertFirst(v);
	}

	@Override
	public void insertLast(T v) {
		ring.insertLast(v);
	}

	@Override
	public T getFirst() {
		if(isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		return ring.get(0);
	}

	@Override
	public T getLast() {
		if(isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		return ring.get(ring.size() - 1);
	}

	@Override
	public T setFirst(T v) {
		if(isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		return ring.set(0, v);
	}

	@Override
	public T setLast(T v) {
		if(isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		return ring.set(ring.size() - 1, v);
	}

	@Override
	public T removeFirst() {
		if(isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		return ring.removeFirst();
	}

	@Override
	public T removeLast() {
		if(isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		return ring.removeLast();
	}

	@Override
	public boolean isEmpty() {
		return ring.size() == 0;
	}
}
