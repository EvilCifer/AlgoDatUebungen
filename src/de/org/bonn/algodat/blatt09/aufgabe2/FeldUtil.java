package de.org.bonn.algodat.blatt09.aufgabe2;

/**
 * 
 * @author dginte2s
 *
 */

public class FeldUtil {

	public static <T> void sortBubble(Feld<T> feld, java.util.Comparator<? super T> comp){
		// sortiert das Feld mit dem Bubble-Sort-Algorithmus (unter Berücksichtigung der
		// Position des letzten vorherigen Swaps bei der Bestimmung der Lauflaenge jeder Iteration).
		int p = feld.size() - 1;
		while(p > 0){
			int r = p;
			p = 0;
			for(int i = 0; i < r; ++i){
				if(comp.compare(feld.get(i), feld.get(i + 1)) > 0){
					feld.swap(i, i + 1);
					p = i;
				}
			}
		}
	}
	
	public static <T> void sortInsert(Feld<T> feld, java.util.Comparator<? super T> comp){
		// sortiert das Feld mit dem Insertion-Sort-Algorithmus
		for(int i = 1; i < feld.size(); ++i){
			if(i == 8){
				System.out.println("i == 8: " + (i < feld.size()));
			}
			for(int j = i; j > 0 && comp.compare(feld.get(j - 1), feld.get(j)) > 0; --j){
				feld.swap((j - 1), j);
			}
		}
	}
	
	public static <T> void sortSelect(Feld<T> feld, java.util.Comparator<? super T> comp){
		// sortiert das Feld mit dem Selection-Sort-Algorithmus
		for(int i = 0; i < feld.size() - 1; ++i){
			int p = i;
			for(int j = i + 1; j < feld.size(); ++j){
				if(comp.compare(feld.get(p), feld.get(j)) > 0){
					p = j;
				}
			}
			feld.swap(i, p);
		}
	}
}
