package de.org.bonn.algodat.blatt10.aufgabe2;

/**
 * 
 * @author dginte2s
 *
 */

public class PivotPickerMitte<T> implements PivotPicker<T> {
	
	@Override
	public int pivot(Feld<? extends T> feld, int l, int r) {
		return (l + r + 1) / 2;
	}

}
