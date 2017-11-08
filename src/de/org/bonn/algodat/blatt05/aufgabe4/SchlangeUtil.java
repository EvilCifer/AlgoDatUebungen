package de.org.bonn.algodat.blatt05.aufgabe4;

/**
 * 
 * @author dginte2s
 *
 */

public class SchlangeUtil{

	public static <T> void zipGeordnet(Schlange<? super Paar<T,T>> ziel, Schlange<? extends T> quelle1, Schlange<? extends T> quelle2, java.util.Comparator<? super T> comp){
		while(!quelle1.isEmpty() && !quelle2.isEmpty()){
			T object1 = quelle1.remove();
			T object2 = quelle2.remove();
			if(comp.compare(object1, object2) <= 0){
				ziel.insert(new Paar<T,T>(object1, object2));
			}else{
				ziel.insert(new Paar<T,T>(object2, object1));
			}
		}
	}
}
