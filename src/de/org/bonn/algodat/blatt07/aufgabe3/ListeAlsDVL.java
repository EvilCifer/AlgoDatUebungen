package de.org.bonn.algodat.blatt07.aufgabe3;

/**
 * 
 * @author dginte2s
 * 
 */

import java.util.Iterator;

public class ListeAlsDVL<T> implements Liste<T> {

	private DVL<T> dvl = new DVL<T>();
	
	@Override
	public void insertFirst(T v) {
		dvl.insertFirst(v);
	}

	@Override
	public void insertLast(T v) {
		dvl.insertLast(v);
	}

	@Override
	public T getFirst() {
		return dvl.getFirst();
	}

	@Override
	public T getLast() {
		return dvl.getLast();
	}

	@Override
	public T setFirst(T v) {
		return dvl.setFirst(v);
	}

	@Override
	public T setLast(T v) {
		return dvl.setLast(v);
	}

	@Override
	public T removeFirst() {
		return dvl.removeFirst();
	}

	@Override
	public T removeLast() {
		return dvl.removeLast();
	}

	@Override
	public int size() {
		return dvl.size();
	}

	@Override
	public T get(int p) {
		return dvl.get(p);
	}

	@Override
	public T set(int p, T v) {
		return dvl.set(p, v);
	}

	@Override
	public void swap(int p, int q) {
		dvl.swap(p, q);
	}

	@Override
	public Iterator<T> iterator(int p) {
		return dvl.iterator(p);
	}

	@Override
	public Iterator<T> iterator(int p, int e) {
		return dvl.iterator(p, e);
	}

	@Override
	public Iterator<T> iterator() {
		return dvl.iterator();
	}

	@Override
	public void insert(int p, T v) {
		dvl.insert(p, v);
	}

	@Override
	public T remove(int p) {
		return dvl.remove(p);
	}

	public int total() {
		return dvl.total();
	}

	public boolean isEmpty() {
		return dvl.isEmpty();
	}
}