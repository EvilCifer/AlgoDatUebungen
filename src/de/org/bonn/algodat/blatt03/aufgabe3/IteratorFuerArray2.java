package de.org.bonn.algodat.blatt03.aufgabe3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 
 * @author dginte2s
 *
 */

public class IteratorFuerArray2<T> implements Iterator<T>{

	private T[][] array;
	private static int row = 0;
	private static int column = 0;
	private boolean istZeilenweise = true;
	private boolean istVorwaerts = true;
//	private int sStart;
//	private int zStart;
	private int counter = 0;
	private int anzahl = 0;
	
	public IteratorFuerArray2(T[][] array){
		this.array = array;
		anzahl = array[0].length * array.length;
	}
	
	public IteratorFuerArray2(T[][] array, boolean istZeilenweise){
		this.array = array;
		this.istZeilenweise = istZeilenweise;
		anzahl = array[0].length * array.length;
	}
	
	public IteratorFuerArray2(T[][] array, boolean istZeilenweise, boolean istVorwaerts){
		this.array = array;
		this.istZeilenweise = istZeilenweise;
		this.istVorwaerts = istVorwaerts;
		if(!istVorwaerts){
			row = array.length - 1;
			column = array[0].length - 1;
		}
		anzahl = array[0].length * array.length;
	}
	
	public IteratorFuerArray2(T[][] array, boolean istZeilenweise, boolean istVorwaerts, int zStart, int sStart){
		if(zStart >= array.length | sStart >= array[0].length){
			throw new IndexOutOfBoundsException();
		}
		this.array = array;
		this.istZeilenweise = istZeilenweise;
		this.istVorwaerts = istVorwaerts;
		row = zStart;
		column = sStart;
		anzahl = array[0].length * array.length;
	}
	
	@Override
	public boolean hasNext() {
		return (counter < anzahl) ? true : false;
	}

	@Override
	public T next(){
		try{
			if(hasNext()){
				counter++;
				T result = null;
				if(istZeilenweise){
					if(istVorwaerts){
						result = array[row][column];
						if(array[row].length > column + 1){
							column++;
						}else{
							if(row < array.length - 1){
								row++;
								column = 0;
							}else{
								row = 0;
								column = 0;
							}
						}
					}else{
						result = array[row][column];
						if(column == 0){
							if(row != 0){
								row--;
								column = array[row].length - 1;
							}else{
								row = array.length - 1;
								column = array[row].length - 1;
							}
						}else{
							column--;
						}
					}
				}else{
					if(istVorwaerts){
						result = array[row][column];
						if(row < array.length - 1){
							row++;
						}else{
							if(array[row].length > column + 1){
								column++;
								row = 0;
							}else{
								column = 0;
								row = 0;
							}
						}
					}else{
						result = array[row][column];
						if(row == 0){
							if(column != 0){
								row = array.length - 1;
								column--;
							}else{
								row = array.length - 1;
								column = array[row].length - 1;
							}
						}else{
							row--;
						}
					}
				}
				return result;
			}
		}catch(IndexOutOfBoundsException e){
		}
		throw new NoSuchElementException();
	}
}
