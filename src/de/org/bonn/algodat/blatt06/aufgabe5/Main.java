package de.org.bonn.algodat.blatt06.aufgabe5;

public class Main {

	public static void main(String[] args){
		  ListeAlsRingDyn<Integer> lr = new ListeAlsRingDyn<Integer> ();
		  Liste<Integer> l = lr;
		  ListeAbstrakt<Integer> la = lr;
//		  l.isEmpty();
		  l.size();
		  lr.total();
		  java.util.Iterator<Integer> i0 = l.iterator();
		  System.out.println(!i0.hasNext());
		  try {
		    i0.next();
		  }
		  catch (java.util.NoSuchElementException x) {}
		  java.util.Iterator<Integer> i1 = l.iterator(0);
		  System.out.println(!i1.hasNext());
		  try {
		    i1.next();
		  }
		  catch (java.util.NoSuchElementException x) {}
		  l.insert(0,1);
//		  System.out.println(!l.isEmpty());
		  l.size();
		  lr.total();
		  l.insertFirst(0);
//		  System.out.println(!l.isEmpty());
		  l.size();
		  lr.total();
		  l.insertLast(2);
//		  System.out.println(!l.isEmpty());
		  l.size();
		  lr.total();
		  l.getFirst();
		  l.getLast();
		  try {
		    l.get(-1);
		  }
		  catch (IndexOutOfBoundsException x) {}
		  l.get(0);
		  l.get(1);
		  l.get(2);
		  try {
		    l.get(3);
		  }
		  catch (IndexOutOfBoundsException x) {}
		  l.setFirst(2);
		  l.setLast(0);
		  try {
		    l.get(-1);
		  }
		  catch (IndexOutOfBoundsException x) {}
		  l.get(0);
		  l.get(1);
		  l.get(2);
		  try {
		    l.set(3,6);
		  }
		  catch (IndexOutOfBoundsException x) {}
		  l.set(2, 5);
		  l.set(1, 4);
		  l.set(0, 3);
		  try {
		    l.get(3);
		  }
		  catch (IndexOutOfBoundsException x) {}
		  l.get(2);
		  l.get(1);
		  l.get(0);
		  try {
		    l.get(-1);
		  }
		  catch (IndexOutOfBoundsException x) {}
//		  System.out.println(!l.isEmpty());
		  l.size();
		  lr.total();
		  l.insert(1,7);
		  try {
		    l.get(-1);
		  }
		  catch (IndexOutOfBoundsException x) {}
		  l.get(0);
		  l.get(1);
		  System.out.println(l.get(2));
	}
}
