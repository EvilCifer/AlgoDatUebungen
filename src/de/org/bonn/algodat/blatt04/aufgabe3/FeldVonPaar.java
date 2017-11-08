package de.org.bonn.algodat.blatt04.aufgabe3;

/**
 * 
 * @author dginte2s
 *
 */

public class FeldVonPaar<E,Z> implements Feld<Paar<E,Z>>{

	private Feld<E> feld1;
	private Feld<Z> feld2;
	
	public FeldVonPaar(Feld<E> feld1, Feld<Z> feld2){
		this.feld1 = feld1;
		this.feld2 = feld2;
	}
	
	@Override
	public boolean isEmpty() {
		return feld1.isEmpty() || feld2.isEmpty();
	}

	@Override
	public int size() {
		if(feld1.size() != feld2.size()){
			return (feld1.size() < feld2.size()) ? feld1.size() : feld2.size();
		}
		return feld1.size();
	}

	@Override
	public Paar<E, Z> get(int p) throws IndexOutOfBoundsException {
		return new Paar<E,Z>(feld1.get(p), feld2.get(p));
	}

	@Override
	public Paar<E, Z> set(int p, Paar<E, Z> e) throws IndexOutOfBoundsException{
		E old1 = feld1.get(p);
		Z old2 = feld2.get(p);
		feld1.set(p, e.erstes());
		feld2.set(p, e.zweites());
		return new Paar<E,Z>(old1, old2);
	}

	@Override
	public void swap(int p, int q) throws IndexOutOfBoundsException{
		feld1.swap(p, q);
		feld2.swap(p, q);
	}
}
