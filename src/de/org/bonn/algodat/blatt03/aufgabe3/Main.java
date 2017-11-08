package de.org.bonn.algodat.blatt03.aufgabe3;

public class Main {

	public static void main(String[] args){
		Integer[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
		Integer[][] b = {{},{}};
		IteratorFuerArray2<Integer> iter = new IteratorFuerArray2<Integer>(a);
		IteratorFuerArray2<Integer> iter2 = new IteratorFuerArray2<>(b);
		
		System.out.println(iter2.hasNext());
		
		for(int i = 0; i < 9; i++){
			System.out.println(iter.hasNext());
			System.out.println(iter.next());
		}
		System.out.println(iter.next());
		System.out.println(iter.hasNext());
	}
}
