package de.org.bonn.algodat.blatt06.aufgabe1;

public class Main {

	public static void main(String[] args) {
		// FeldDyn<Integer> fd = new FeldDyn<Integer>();
		// FeldDyn<Integer> f = fd;
		// f.insert(5);
		// f.size();
		// fd.total();
		// f.get(0);
		// f.insert(6);
		// f.size();
		// fd.total();
		// f.get(1);
		// f.insert(7);
		// f.size();
		// fd.total();
		// f.get(2);
		// f.insert(8);
		// f.size();
		// fd.total();
		// f.get(3);
		// f.insert(9);
		// f.size();
		// fd.total();
		// f.get(4);
		// f.set(0, 15);
		// f.set(1, 16);
		// f.set(2, 17);
		// f.set(3, 18);
		// f.set(4, 19);
		// f.remove();
		// f.size();
		// fd.total();
		// f.get(3);
		// f.remove();
		// f.size();
		// fd.total();
		// f.get(2);
		// f.remove();
		// f.size();
		// System.out.println(fd.total());
		FeldDyn<Integer> fd = new FeldDyn<Integer>();
		FeldDyn<Integer> f = fd;
		f.size();
		fd.total();
		f.insert(11);
		f.size();
		fd.total();
		f.get(0);
		f.insert(12);
		f.size();
		fd.total();
		f.get(0);
		f.get(1);
		f.insert(13);
		f.size();
		fd.total();
		f.get(0);
		f.get(1);
		f.get(2);
		f.remove();
		f.size();
		fd.total();
		f.get(0);
		f.get(1);
		try {
			f.get(2);
		} catch (IndexOutOfBoundsException x) {
		}
		System.out.println(f.remove());
	}
}
