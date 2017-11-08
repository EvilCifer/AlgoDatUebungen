package de.org.bonn.algodat.blatt07.aufgabe2;

public class Main {

	public static void main(String[] args) {
		// EVL<Integer> evl = new EVL<Integer>();
		// evl.isEmpty();
		// evl.insertFirst(1);
		// System.out.println(!evl.isEmpty());
		// evl.getFirst();
		// evl.getLast();
		EVL<Integer> evl = new EVL<Integer>();
		evl.isEmpty();
		System.out.println(evl.total());
		evl.insertLast(1);
		System.out.println(!evl.isEmpty());
		evl.getFirst();
		evl.getLast();
		evl.insertFirst(2);
		System.out.println(!evl.isEmpty());
		evl.getFirst();
		evl.getLast();
		evl.insertLast(3);
		System.out.println(!evl.isEmpty());
		System.out.println(evl.total());
	}
}
