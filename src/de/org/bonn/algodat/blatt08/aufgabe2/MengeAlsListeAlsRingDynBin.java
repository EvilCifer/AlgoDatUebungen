package de.org.bonn.algodat.blatt08.aufgabe2;

/**
 * 
 * @author dginte2s
 *
 */

public class MengeAlsListeAlsRingDynBin<T extends Comparable<T>> implements Menge<T> {

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
		if(liste.isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		int pos = (int) Math.round(Math.random() * (size() - 1));
		return liste.get(pos);
	}

	@Override
	public boolean contains(T v) {
		if(FeldUtil.sucheBinaer(liste, v) != -1){
			return true;
		}
		return false;
	}

	@Override
	public boolean insert(T v) {
		if(contains(v)){
			return false;
		}
		liste.insert(FeldUtil.sucheBinaerPos(liste, v), v);
		return true;
	}

	@Override
	public boolean remove(T v) {
		if(contains(v)){
			liste.remove(FeldUtil.sucheBinaer(liste, v));
			return true;
		}
		return false;
	}
}
