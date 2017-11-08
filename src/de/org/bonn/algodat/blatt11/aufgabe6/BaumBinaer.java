package de.org.bonn.algodat.blatt11.aufgabe6;

/**
 * 
 * @author dginte2s
 *
 */

public class BaumBinaer<T> {

	protected class Knoten{
		protected Knoten l;	// linker Teilbaum
		protected Knoten r; // rechter Teilbaum
		protected T v;		// Wert am Knoten
		
		public Knoten(T v){
			this.v = v;
		}
	}
	
	protected Knoten w;		// Wurzelknoten
	
	public BaumBinaer(){
		
	}
	
	public BaumBinaer(T v, BaumBinaer<T> bL, BaumBinaer<T> bR){
		w = new Knoten(v);
		w.l = bL.w;
		w.r = bR.w;
	}
	
	public boolean isEmpty(){
		return w == null;
	}
	
	private int hoehe(Knoten k){
		return (k == null) ? 0 : (1 + Math.max(hoehe(k.l), hoehe(k.r)));
	}
	
	public int hoehe(){
		return hoehe(w);
	}
	// zu ergaenzen
	
	public int size(){
		// liefert die Anzahl der Knoten des Baums
		BaumBinaer<T> bl = new BaumBinaer<T>();
		BaumBinaer<T> br = new BaumBinaer<T>();
		if(!isEmpty()){
			if(w.l != null){
				bl.w = w.l;
			}
			if(w.r != null){
				br.w = w.r;
			}
			return 1 + br.size() + bl.size();
		}
		return 0;
	}
	
	public int total(){
		// liefert die Anzahl der intern verwendeten Speicherplätze (Referenzen).
		if(!isEmpty()){
			BaumBinaer<T> bl = new BaumBinaer<T>();
			BaumBinaer<T> br = new BaumBinaer<T>();
			if(w.l != null){
				bl.w = w.l;
			}
			if(w.r != null){
				br.w = w.r;
			}
			return 1 + bl.total() + br.total();
		}
		return 1;
	}
	
	public String toString(){
		// liefert eine Darstellung des Baums als Zeichenkette der Form (<Tl><w><Tr>)
		if(isEmpty()){
			return "";
		}
		BaumBinaer<T> bl = new BaumBinaer<T>();
		BaumBinaer<T> br = new BaumBinaer<T>();
		if(w.l != null){
			bl.w = w.l;
		}
		if(w.r != null){
			br.w = w.r;
		}
		return "(" + bl.toString() + w.v + br.toString() + ")";
	}
	
	public void linearisierePreOrder(PrioSchlange<T> ps){
		ps.insert(w.v);
		BaumBinaer<T> bl = new BaumBinaer<T>();
		BaumBinaer<T> br = new BaumBinaer<T>();
		if(w.l != null){
			bl.w = w.l;
			bl.linearisierePreOrder(ps);
		}
		if(w.r != null){
			br.w = w.r;
			br.linearisierePreOrder(ps);
		}
	}
	
	public void linearisiereInOrder(PrioSchlange<T> ps){
		if(w.l != null){
			BaumBinaer<T> bl = new BaumBinaer<T>();
			bl.w = w.l;
			bl.linearisiereInOrder(ps);
		}
		ps.insert(w.v);
		if(w.r != null){
			BaumBinaer<T> br = new BaumBinaer<T>();
			br.w = w.r;
			br.linearisiereInOrder(ps);
		}
	}
	
	public void linearisierePostOrder(PrioSchlange<T> ps){
		if(w.l != null){
			BaumBinaer<T> bl = new BaumBinaer<T>();
			bl.w = w.l;
			bl.linearisierePostOrder(ps);
		}
		if(w.r != null){
			BaumBinaer<T> br = new BaumBinaer<T>();
			br.w = w.r;
			br.linearisierePostOrder(ps);
		}
		ps.insert(w.v);
	}
	
	public void linearisiereBreadthFirst(PrioSchlange<T> ps){
		// SchlangeAlsEVL<T> benutzen
		SchlangeAlsEVL<Knoten> queue = new SchlangeAlsEVL<Knoten>();
		ps.insert(w.v);
		if(w.l != null){
			queue.insert(w.l);
		}
		if(w.r != null){
			queue.insert(w.r);
		}
		linearisiereBreadthFirst(ps, queue);
	}
	
	private void linearisiereBreadthFirst(PrioSchlange<T> ps, PrioSchlange<Knoten> queue){
		Knoten k = queue.remove();
		ps.insert(k.v);
		if(k.l != null){
			queue.insert(k.l);
		}
		if(k.r != null){
			queue.insert(k.r);
		}
		if(!queue.isEmpty()){
			linearisiereBreadthFirst(ps, queue);
		}
	}
}
