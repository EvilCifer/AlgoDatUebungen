package de.org.bonn.algodat.blatt10.aufgabe2;

/**
 * 
 * @author dginte2s
 *
 */

public interface PivotPicker<T> {

	public int pivot(Feld<? extends T> feld, int l, int r);
}
