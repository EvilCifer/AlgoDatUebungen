package de.org.bonn.algodat.blatt09.aufgabe3;

/**
 * 
 * @author dginte2s
 *
 */

public class SchlangeUtil {

	public static <T> void sortMerge(Schlange<T> s, java.util.Comparator<? super T> comp) {
		SchlangeAlsEVL<T> temp1 = new SchlangeAlsEVL<T>();
		SchlangeAlsEVL<T> temp2 = new SchlangeAlsEVL<T>();
		
		int x = 0;
		while (s.isEmpty() == false) {
			if ((x % 2) == 0) {
				temp1.insert(s.remove());
			}
			else {
				temp2.insert(s.remove());
			}
			
			x++;
		}
		
		if (x > 1) {
			sortMerge(temp1, comp);
			sortMerge(temp2, comp);
		}
				
		for (int i = 0; i < x; i++) {
			if (temp1.isEmpty() == true) {
				s.insert(temp2.remove());
				continue;
			}
			if (temp2.isEmpty() == true) {
				s.insert(temp1.remove());
				continue;
			}
			
			
			if (comp.compare(temp1.element(), temp2.element()) <= 0) {
				s.insert(temp1.remove());
			}
			else {
				s.insert(temp2.remove());
			}
		}
	}
}
