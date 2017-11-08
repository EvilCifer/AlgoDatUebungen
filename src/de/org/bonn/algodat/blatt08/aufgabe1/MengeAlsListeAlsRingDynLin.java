package de.org.bonn.algodat.blatt08.aufgabe1;

/**
 * 
 * @author dginte2s
 *
 */

public class MengeAlsListeAlsRingDynLin<T> implements Menge<T> {

	private ListeAlsRingDyn<T> liste = new ListeAlsRingDyn<T>();

	@Override
	public int total() {
		return liste.total();
	}

	@Override
	public boolean isEmpty() {
		return liste.isEmpty();
	}

	@Override
	public int size() {
		return liste.size();
	}

	@Override
	public T element() {
		if(isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		int pos = (int) Math.round(Math.random() * (size() - 1));
		return liste.get(pos);
	}

	@Override
	public boolean contains(T v) {
		if(IterableUtil.sucheLinear(liste, v) != -1){
			return true;
		}
		return false;
	}

	@Override
	public boolean insert(T v) {
		if(IterableUtil.sucheLinear(liste, v) != -1){
			return false;
		}
		liste.insertLast(v);
		return true;
	}

	@Override
	public boolean remove(T v) {
		int position = IterableUtil.sucheLinear(liste,  v);
		if(position != -1){
			liste.remove(position);
			return true;
		}
		return false;
	}
}
