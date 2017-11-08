package de.org.bonn.algodat.blatt09.aufgabe3;

/**
 * 
 * @author dginte2s
 *
 */

public class FeldUtil {

	public static <T> void sortMerge(Feld<T> feld, java.util.Comparator<? super T> comp){
		sortMerge(feld, comp, 0, feld.size());
	}
	
	private static <T> void sortMerge(Feld<T> feld, java.util.Comparator<? super T> comp, int l, int r){
		if(r - l <= 1){
			return;
		}
		int m = (l + r) / 2;
		
		sortMerge(feld, comp, l, m);
		sortMerge(feld, comp, m, r);
		
		FeldFix<T> ff = new FeldFix<T>(r-l);
		int i = 0;
		int jl = l;
		int jr = m;
		
		while(jl < m && jr < r){
			if(comp.compare(feld.get(jl), feld.get(jr)) <= 0){
				ff.set(i++, feld.get(jl++));
			}else{
				ff.set(i++, feld.get(jr++));
			}
		}
		
		while(jl < m){
			ff.set(i++, feld.get(jl++));
		}
		while(jr < r){
			ff.set(i++, feld.get(jr++));
		}
		
		for(int k = 0; k < ff.size(); ++k){
			feld.set(l + k, ff.get(k));
		}
	}
}
