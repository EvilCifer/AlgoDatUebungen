package de.org.bonn.algodat.blatt07.aufgabe3;

public class TestSuite {

	public static void main(String[] args) {
		  DVL<Integer> dvl = new DVL<Integer> ();
		  dvl.insertFirst(1);
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.getLast();
		  dvl.setFirst(11);
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.getLast();
		  dvl.insertLast(2);
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.get(1);
		  dvl.getLast();
		  dvl.setLast(22);
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.get(1);
		  dvl.getLast();
		  dvl.insert(1,3);
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.get(1);
		  dvl.get(2);
		  dvl.getLast();
		  dvl.set(1, 33);
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.get(1);
		  dvl.get(2);
		  dvl.getLast();
		  dvl.remove(1);
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.get(1);
		  dvl.getLast();
		  dvl.removeLast();
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.getLast();
		  dvl.removeFirst();
		  dvl.isEmpty();
		  dvl.size();
		  try {
		    dvl.getFirst();
		  }
		  catch (java.util.NoSuchElementException x) {}
		  try {
		    dvl.get(0);
		  }
		  catch (IndexOutOfBoundsException x) {}
		  try {
		    dvl.getLast();
		  }
		  catch (java.util.NoSuchElementException x) {}
		  try {
		    dvl.set(0, 11);
		  }
		  catch (IndexOutOfBoundsException x) {}
		  try {
		    dvl.remove(0);
		  }
		  catch (IndexOutOfBoundsException x) {}
		  dvl.insertLast(1);
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.getLast();
		  dvl.setLast(11);
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.getLast();
		  dvl.insert(1,2);
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.get(1);
		  dvl.getLast();
		  dvl.set(1, 22);
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.get(1);
		  dvl.getLast();
		  dvl.insertFirst(3);
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.get(1);
		  dvl.get(2);
		  dvl.getLast();
		  dvl.setFirst(33);
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.get(1);
		  dvl.get(2);
		  dvl.getLast();
		  dvl.insert(2,4);
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.get(1);
		  dvl.get(2);
		  dvl.get(3);
		  dvl.getLast();
		  dvl.set(2, 44);
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.get(1);
		  dvl.get(2);
		  dvl.get(3);
		  dvl.getLast();
		  dvl.insertLast(5);
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.get(1);
		  dvl.get(2);
		  dvl.get(3);
		  dvl.get(4);
		  dvl.getLast();
		  dvl.setLast(55);
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.get(1);
		  dvl.get(2);
		  dvl.get(3);
		  dvl.get(4);
		  dvl.getLast();
		  java.util.Iterator<Integer> iter = dvl.iterator();
		  iter.hasNext();
		  iter.next();
		  iter.hasNext();
		  iter.next();
		  iter.hasNext();
		  iter.next();
		  dvl.remove(2);
		  iter.hasNext();
		  iter.next();
		  iter.hasNext();
		  iter.next();
		  System.out.println(!iter.hasNext());
		  try {
		    iter.next();
		  }
		  catch (java.util.NoSuchElementException x) {}
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.get(1);
		  dvl.get(2);
		  dvl.get(3);
		  dvl.getLast();
		  dvl.removeFirst();
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.get(1);
		  dvl.get(2);
		  dvl.getLast();
		  dvl.removeLast();
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.get(1);
		  dvl.getLast();
		  dvl.removeFirst();
		  System.out.println(!dvl.isEmpty());
		  dvl.size();
		  dvl.getFirst();
		  dvl.get(0);
		  dvl.getLast();
		  dvl.removeLast();
		  System.out.println(dvl.isEmpty());
	}
}
