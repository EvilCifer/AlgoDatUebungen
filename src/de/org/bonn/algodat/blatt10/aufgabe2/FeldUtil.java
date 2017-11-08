package de.org.bonn.algodat.blatt10.aufgabe2;

/**
 * 
 * @author dginte2s
 *
 */

public class FeldUtil {

	public static <T> void sortQuick(Feld<T> feld, java.util.Comparator<? super T> comp, PivotPicker<T> p){
		sortQuick(feld, comp, p, 0, feld.size() - 1);
	}
	
	private static <T> void sortQuick(Feld<T> feld, java.util.Comparator<? super T> comp, PivotPicker<T> p, int l, int r){
		if(l >= r){
			return;
		}
		int pivot = p.pivot(feld, l, r);
		
		feld.swap(pivot, r);
		int il = l;
		int ir = r - 1;
		
		do{
			while(il <= ir && comp.compare(feld.get(il), feld.get(r)) < 0){
				++il;
			}
			while(il < ir && comp.compare(feld.get(r), feld.get(ir)) <= 0){
				--ir;
			}
			if(il < ir){
				feld.swap(il++, ir);
			}
		}while(il <= --ir);
		pivot = il;
		feld.swap(pivot, r);
		
		sortQuick(feld, comp, p, l, pivot - 1);
		sortQuick(feld, comp, p, pivot + 1, r);
	}
}
