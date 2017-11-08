package de.org.bonn.algodat.blatt11.aufgabe6;

public class TestSuite {

	public static void main(String[] args){
		BaumSuch<Integer> intBaum = new BaumSuch<Integer>();
		intBaum.insert(19);
		intBaum.insert(13);
		intBaum.insert(32);
		intBaum.insert(25);
		intBaum.insert(28);
		intBaum.insert(35);
		intBaum.remove(32);
		System.out.println(intBaum.toString());
	}
}
