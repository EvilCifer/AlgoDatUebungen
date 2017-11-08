package de.org.bonn.algodat.blatt09.aufgabe2;

public class ArrayVonUtil1 {

	public static int sucheLinear(int[] a, int x){
		for(int i = 0; i < a.length; ++i){
			if(a[i] == x){
				return i;
			}
		}
		return -1;
	}
	
	public static int suchePosLinearSortiert(int[] a, int x){
		int i = 0;
		while (i < a.length && a[i] < x){
			++i;
		}
		return i;
	}
	
	public static int sucheLinearSortiert(int[] a, int x){
		int i = suchePosLinearSortiert(a, x);
		return i < a.length && x == a[i] ? i : -1; 	// gefunden?
	}
	
	public static int suchePosBinaer(int[] a, int x, int l, int r){
		while (l < r){				// min eine Position
			int m = (l + r) / 2;	// Mitte: l <= m < r
			if(x <= a[m]){
				r = m;
			}else{					// Wert liegt rechts
				l = m + l;
			}
		}
		return l;					// Wert liegt hier
	}								// oder laege hier
	
	public static int suchePosBinaerRek(int[] a, int x, int l, int r){
		if(l == r){				// genau eine Position
			return l;			// Position gefunden
		}
		int m = (l + r) / 2;	// Mitte: l <= m < r
		return x <= a[m] ? suchePosBinaerRek(a, x, l, m) : suchePosBinaerRek(a, x, m + l, r);
	}
	
	public static int sucheBinaer(int[] a, int x){
		int p = suchePosBinaer(a, x, 0, a.length);
		return p < a.length && x == a[p] ? p : -1;	// gefunden?
	}
}
