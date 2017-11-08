package de.org.bonn.algodat.blatt11.aufgabe3;

public class TestSuite {

	public static void main(String[] args) {
		SchlangeAlsEVL<Integer> s = new SchlangeAlsEVL<Integer>();
		PrioSchlange<Integer> ps = s;
		BaumBinaer<Integer> b0 = new BaumBinaer<Integer>();
		b0.isEmpty();
		b0.hoehe();
		b0.total();
		b0.size();
		b0.toString();
		b0.linearisierePreOrder(ps);
		b0.linearisiereInOrder(ps);
		b0.linearisierePostOrder(ps);
		b0.linearisiereBreadthFirst(ps);
		BaumBinaer<Integer> b1 = new BaumBinaer<Integer>(2, b0, b0);
		b1.isEmpty();
		b1.hoehe();
		System.out.println(b1.total());
		b1.size();
		b1.toString();
		b1.linearisierePreOrder(ps);
		ps.remove();
		b1.linearisiereInOrder(ps);
		ps.remove();
		b1.linearisierePostOrder(ps);
		ps.remove();
		b1.linearisiereBreadthFirst(ps);

		SchlangeAlsEVL<Integer> s1 = new SchlangeAlsEVL<Integer>();
		PrioSchlange<Integer> ps1 = s1;
		BaumBinaer<Integer> b2 = new BaumBinaer<Integer>();
		b2.isEmpty();
		b2.hoehe();
		System.out.println(b2.total());
	}
}
