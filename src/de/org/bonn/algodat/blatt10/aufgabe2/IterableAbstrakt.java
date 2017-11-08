package de.org.bonn.algodat.blatt10.aufgabe2;

import java.util.Iterator;

public abstract class IterableAbstrakt<T> implements Iterable<T> {

	public String toString(){
		String result = "(";
		Iterator<T> i = iterator();
		if(i.hasNext()){
			result += i.next();
		}
		while(i.hasNext()){
			result += "," + i.next();
		}
		return result + ")";
	}
	
	public boolean equals(Object o){
		if(this == o){
			return true;
		}
		Iterator<T> i1 = iterator();
		Iterator<T> i2 = iterator();
		while(i1.hasNext() && i2.hasNext()){
			if(!i1.next().equals(i2.next())){
				return false;
			}
		}
		return !(i1.hasNext() || i2.hasNext());
	}
}
