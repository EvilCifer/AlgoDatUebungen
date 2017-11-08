package de.org.bonn.algodat.blatt06.aufgabe4;

public class FeldFix<T> extends FeldAbstrakt<T> {

	private T[] a;
	
	public FeldFix(int size){
		@SuppressWarnings("unchecked")
		T[] tmp = (T[]) new Object[size];
		a = tmp;
	}
	
	public int total(){
		return a.length;
	}
	
	public int size(){
		return a.length;
	}
	
	public T get(int p){
		return a[p];
	}
	
	public T set(int p, T v){
		T result = a[p];
		a[p] = v;
		return result;
	}
}
