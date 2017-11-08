package de.org.bonn.algodat.blatt04.aufgabe3;

/**
 * 
 * @author dginte2s
 *
 */

public class FeldUtilA {

	public static <T, E, Z> void zipGeordnet(Feld<Paar<T, T>> ziel, Feld<? extends T> quelle1,
			Feld<? extends T> quelle2, java.util.Comparator<T> comp) {

		int i = 0;

		if (quelle1.size() < ziel.size() || quelle2.size() < ziel.size()) {
			throw new IndexOutOfBoundsException();
		}

		while (i < ziel.size()) {
			comp.compare(quelle1.get(i), quelle2.get(i));
			if (comp.compare(quelle1.get(i), quelle2.get(i)) < 0) {
				ziel.set(i, new Paar<T, T>(quelle1.get(i), quelle2.get(i)));
			} else if (comp.compare(quelle1.get(i), quelle2.get(i)) > 0) {
				ziel.set(i, new Paar<T, T>(quelle2.get(i), quelle1.get(i)));
			}
			i++;
		}
	}
}

/*
 * package de.org.bonn.algodat.blatt4.aufgabe3;

/**
 * 
 * @author dginte2s
 *
 *

FeldUtilB

public class FeldUtil {

	public static <T> void zipGeordnet(Feld<? super Paar<T,T>> ziel, Feld<? extends T> quelle1, Feld<? extends T> quelle2, java.util.Comparator<? super T> comp){
		
		int i = 0;
		
		if(quelle1.size() < ziel.size() || quelle2.size() < ziel.size()){
			throw new IndexOutOfBoundsException();
		}
		
		while(i < ziel.size()){
			comp.compare(quelle1.get(i), quelle2.get(i));
			if(comp.compare(quelle1.get(i), quelle2.get(i)) < 0){
				ziel.set(i, new Paar<T,T>(quelle1.get(i), quelle2.get(i)));
			}else if(comp.compare(quelle1.get(i), quelle2.get(i)) > 0){
				ziel.set(i, new Paar<T,T>(quelle2.get(i), quelle1.get(i)));
			}
			i++;
		}
	}
}
*/