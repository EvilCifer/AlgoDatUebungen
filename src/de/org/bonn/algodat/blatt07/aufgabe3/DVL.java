package de.org.bonn.algodat.blatt07.aufgabe3;

/**
 * 
 * @author dginte2s
 *
 */

public class DVL<T> implements Iterable<T> {

	private class Item {
		private Item prev;
		private Item next;
		private T v;
		
		public Item(T v) { this.v = v; }
	}
	
	private class Iterator implements java.util.Iterator<T> {
		private Item current = first;
		
		public boolean hasNext(){
			return current != null;
		}
		
		public T next(){
			if(!hasNext()){
				throw new java.util.NoSuchElementException();
			}
			T v = current.v;
			current = current.next;
			return v;
		}
	}
	
	private Item first;
	private Item last;
	
	public int total(){
		return 2 + 3 * size();
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public int size(){
		int counter = 0;
		if(!isEmpty()){
			Item item = first;
			while(item != null){
				++counter;
				item = item.next;
			}
		}
		return counter;
	}
	
	public T getFirst(){
		if(isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		return first.v;
	}
	
	public T getLast(){
		if(isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		return last.v;
	}
	// eigene Methode, da an mehreren Stellen verwendet
	
	private Item getItem(int p){
		if(p < 0){
			throw new IndexOutOfBoundsException();
		}
		Item current = first;
		for(int i = 0; i < p; ++i){
			if(current == null){
				throw new IndexOutOfBoundsException();
			}
			current = current.next;
		}
		return current; // null, falls p == size()
	}
	
	public T get(int p){
		Item item = getItem(p);
		if(item == null){ // falls p == size()
			throw new IndexOutOfBoundsException();
		}
		return item.v;
	}
	
	public T setFirst(T v){
		if(isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		T element = first.v;
		first.v = v;
		return element;
	}
	
	public T setLast(T v){
		if(isEmpty()){
			throw new java.util.NoSuchElementException();
		}
		T element = last.v;
		last.v = v;
		return element;
	}
	
	public T set(int p, T v){
		Item item = getItem(p);
		if(item == null){
			throw new IndexOutOfBoundsException();
		}
		T element = item.v;
		item.v = v;
		return element;
	}
	
	public void insertFirst(T v){
		Item item = first;
		first = new Item(v);
		if(item != null){
			item.prev = first;
		}
		first.next = item;
		last = (item == null) ? first : last;
	}
	
	public void insertLast(T v){
		Item item = last;
		last = new Item(v);
		if(item != null){
			item.next = last;
		}
		last.prev = item;
		first = (item == null) ? last : first;
	}
	
	public void insert(int p, T v){
		Item item = new Item(v);
		item.next = getItem(p);			// p-Item wird Nachfolger
		
		if(item.next == null){			// Einfuegen am Ende
			item.prev = last;			// last wir Vorgaenger
			last = item;				// neues wird letztes
		}else{							// min. 1 Element folgt
			item.prev = item.next.prev; // uebernehme Vorgaenger
			item.next.prev = item;		// Vorgaenger von Nachfolger
		}
		if(item.prev == null){			// Einfuegen am Anfang
			first = item;				// neues wird erstes
		}else{							// min. 1 Element davor
			item.prev.next = item;
		}
	}
	
	public T removeFirst(){
		T v = getFirst();
		Item item = first;
		first = item.next;
		if(first != null){
			first.prev = null;
			first.next = item.next.next;
		}else{
			last = null;
		}
		return v;
	}
	
	public T removeLast(){
		T v = getLast();
		Item item = last;
		last = item.prev;
		if(last != null){
			last.next = null;
			last.prev = item.prev.prev;
		}else{
			last = first = null;
		}
		/*
		 * ----------Funktionsweise-----------
		 * getLast() - holt den Wert des letzten Items
		 * 
		 * 1. Insert: 		[n]			size = 1
		 * 2. Insert:		[x][n]		size = 2
		 * 3. Insert:		[x][x][n]	size = 3
		 * 4. Remove:		[x][x]		size = 2
		 * 
		 * Legende:
		 * 
		 * 	[x] - oldItem
		 * 	[n] - newItem
		 * 
		 * Was passiert bei remove?
		 * 
		 * 	Die Referenzen des alten letzten Items werden auf, das vorherige, nun neue, Item gesetzt.
		 * 	Das bedeutet das last.prev neues letztes Item ist, und last.prev.prev nun neues vorletztes Item ist.
		 * 	Die Referenz auf das last.next muss noch auf null gesetzt werden, da das neue letzte Item noch
		 *  auf das alte letzte Item zeigt.
		 */
		return v;
	}
	// eigene Methode, da von remove() von DVL und Iterator verwendet
	
	public T removeItem(Item item){
		Item prev = item.prev;	// Vorgaenger
		Item next = item.next;	// Nachfolger
		if(prev == null){		// erstes wird geloescht
			first = next;
		}else{
			prev.next = next; 	// Vorgaenger verw. auf Nachfolger
		}
		if(next == null){		// letztes Element wird geloescht
			last = prev;
		}else{
			next.prev = prev;	// Nachfolger verw. auf Vorgaenger
		}
		return item.v;
	}
	
	public T remove(int p){
		Item item = getItem(p);
		if(item == null){	// falls p == size()
			throw new IndexOutOfBoundsException();
		}
		return removeItem(item);
	}
	
	public void swap(int p, int q){
		Item itemP = getItem(p);
		Item itemQ = getItem(q);
		T tmp = itemP.v;
		itemP.v = itemQ.v;
		itemQ.v = tmp;
	}
	
	public java.util.Iterator<T> iterator(){
		return new Iterator();
	}
	
	public java.util.Iterator<T> iterator(int p){
		return new IteratorMitPosition<T>(this, p);
	}
	
	public java.util.Iterator<T> iterator(int p, int e){
		return new IteratorMitPosition<T>(this, p, e);
	}
}
