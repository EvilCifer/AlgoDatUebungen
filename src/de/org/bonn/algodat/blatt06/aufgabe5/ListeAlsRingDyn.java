package de.org.bonn.algodat.blatt06.aufgabe5;

/**
 * 
 * @author dginte2s
 *
 */

public class ListeAlsRingDyn<T> extends ListeAbstrakt<T> implements Kollektion<T> {

	private RingDyn<T> ring = new RingDyn<T>();
	
	@Override
	public int total(){
		return ring.total();
	}
	
	@Override
	public boolean isEmpty(){
		return ring.size() == 0;
	}
	
	@Override
	public void insert(int p, T v) {
        if(p >= size() / 2) {
            insertLast(v);
            for(int i = size() - 1; i > p; i--) {
                swap(i, i - 1);
            }
        } else {
            insertFirst(v);
            for(int i = 0; i < p; i++) {
                swap(i, i + 1);
            }
        }
	}

	@Override
	public T remove(int p) {
        for(; p + 1 < size(); p++) {
            swap(p, p + 1);
        }
        return removeLast();
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
	public T setFirst(T v) {
		return ring.set(0, v);
	}

	@Override
	public T removeFirst() {
		return ring.removeFirst();
	}

	@Override
	public T removeLast() {
		return ring.removeLast();
	}

	@Override
	public int size() {
		return ring.size();
	}

	@Override
	public T get(int p) {
		return ring.get(p);
	}

	@Override
	public T set(int p, T v) {
		return ring.set(p, v);
	}
}