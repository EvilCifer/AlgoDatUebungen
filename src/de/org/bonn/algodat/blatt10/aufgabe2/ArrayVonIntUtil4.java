package de.org.bonn.algodat.blatt10.aufgabe2;

public class ArrayVonIntUtil4{

	public static void sortQuick(int[] a){
		sortQuick(a, 0, a.length-1);
	}
	
	private static int pivot(int[] a, int l, int r){
		return (l + r + 1) / 2;	// oder alternative Wahl
	}
	
	/* Sortiere den Bereich des Feldes a von 'l' bis 'r'
	 * 'l' ist erste Position in dem zu sortiereden Bereich
	 * 'r' ist letzte Position in(!) dem Bereich
	 */
	private static void sortQuick(int[] a, int l, int r){
		if(l >= r){
			return;
		}
		int p = pivot(a, l, r);
		// bringe kleine Elemente nach links, grosse nach rechts
		//swap(a, p, r);
		int il = l;
		int ir = r - 1;
		do{
			while(il <= ir && a[il] < a[r]){
				++il;
			}
			while(il < ir && a[ir] >= a[r]){
				--ir;
			}
			if(il < ir){
				//swap(a, il++, ir);
			}
		}while(il <= --ir);
		p = il;
		//swap(a, p, r);
		
		sortQuick(a, l, p-1);
		sortQuick(a, p+1, r);
	}
}
