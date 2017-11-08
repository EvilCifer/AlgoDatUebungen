package de.org.bonn.algodat.blatt08.aufgabe2;

/**
 * 
 * @author dginte2s
 *
 */

public class RingDyn<T> extends FeldAbstrakt<T>{

	private int maxSize = 1;
	private Feld<T> f = new FeldFix<T>(maxSize);
	private int size;
	private int a;
	
	public int total(){
		return f.size();
	}
	
	@Override
	public int size(){
		return size;
	}
	
	@Override
	public T get(int p){
		checkIndex(p);
		return f.get((a+p) % f.size());
	}
	
	@Override
	public T set(int p, T v){
		checkIndex(p);
		return f.set((a+p) % f.size(), v);
	}
	
	public void insertFirst(T v){
//		if(size == f.size()){
//			throw new IllegalStateException();
//		}
		adjustInsert();
		a = (a - 1 + f.size()) % f.size();
		/*
		 * 1. Run: 0 - 1 + 1 = 0 % 1 = 0 erhöhe f.size() auf 2 size++ = 1
		 * 2. Run: 0 - 1 + 2 = 1 % 2 = 1 erhöhe f.size() auf 4 size++ = 2
		 * 3. Run: 1 - 1 + 4 = 4 % 4 = 0 do nothing size++ = 3
		 * 4. Run: 0 - 1 + 4 = 3 % 4 = 3 erhöhe f.size() auf 8 size++ = 4
		 * 5. Run: 3 - 1 + 8 = 10 % 8 = 2 do nothing size++ = 5
		 * 6. Run: 2 - 1 + 8 = 9 % 8 = 1 do nothing size++ = 6
		 * 7. Run: 1 - 1 + 8 = 8 % 8 = 0 do nothing size++ = 7
		 * 8. Run: 0 - 1 + 8 = 7 % 8 = 7 erhöhe f.size() auf 16 size++ = 8
		 */
		/*
		 * ----------------Wie ich es mir denke!!!---------------
		 * 			[0][1][2][3][4][5][6][7]...[n]
		 * 1.Run 	[x]
		 * 2.Run	[x][x]
		 * 3.Run	[ü][x][ ][ ] -> [x][x][x][ ] <- aber aus [ ][x][x][ ] 
		 * 4.Run	[ü][x][ ][x] -> [x][x][x][x] <- aber aus [x][x][x][ ]
		 * 5.Run	[ü][x][x][x][ ][ ][ ][ ] -> [x][x][x][x][x][ ][ ][ ] <- aber aus [P][P][x][x][x][x][P][P]
		 * 6.Run	[ü][ü][x][x][ ][ ][ ][ ] -> [x][x][x][x][x][x][ ][ ] <- aber aus [P][x][x][x][x][x][P][P]
		 * 7.Run	[Ü][ü][x][x][ ][ ][ ][ ] -> [x][x][x][x][x][x][x][ ] <- aber aus [x][x][x][x][x][x][P][P]
		 * 8.Run	[Ü][ü][x][x][ ][ ][ ][x] -> [x][x][x][x][x][x][x][x] <- aber aus [x][x][x][x][x][x][P][x]
		 * 
		 * ---------------Wie es wirklich ist!!!----------------
		 * 1.Run	[x]
		 * 2.Run	[x][x]
		 * 3.Run	[ ][x][x][x]
		 * 4.Run	[x][x][x][x]
		 * 5.Run	[ ][ ][ ][x][x][x][x][x]
		 * 6.Run	[ ][ ][x][x][x][x][x][x]
		 * 7.Run	[ ][x][x][x][x][x][x][x]
		 * 8.Run	[x][x][x][x][x][x][x][x]
		 * 
		 * ....... und so weiter .........
		 * 
		 * Legende:
		 * 	[x] - geschrieben
		 * 	[ ] - leer
		 * 	[ü] - überschrieben
		 *  [Ü] - nochmal Überschrieben
		 *  [P] - Pufferfeld
		 */
		++size;
		set(0, v);
	}
	
	public void insertLast(T v){
//		if(size == f.size()){
//			throw new IllegalStateException();
//		}
		/*
		 * -----------Funktionsweise-------------
		 * 			[0][1][2][3][4][5][6][7]...[n]
		 * 1.Run	[x1]
		 * 2.Run	[x][x1]
		 * 3.Run	[x][ ][x1][x]
		 * 4.Run	[x][x][x1][x]
		 * 5.Run	[x][ ][ ][ ][x1][x][x][x] von x1 aus in -> Richtung lesen
		 * 6.Run	[x][x][ ][ ][x1][x][x][x]
		 * 7.Run	[x][x][x][ ][x1][x][x][x]
		 * 8.Run	[x][x][x][x][x1][x][x][x]
		 * 
		 * ..... und so weiter ...........
		 */
		adjustInsert();
		++size;
		set(size - 1, v);
	}
	
	public T removeFirst(){
		if(size == 0){
			throw new java.util.NoSuchElementException();
		}
		T v = get(0);
		a = (a + 1) % f.size();		
		--size;
		adjustRemove();
		return v;
	}
	
	public T removeLast(){
		if(size == 0){
			throw new java.util.NoSuchElementException();
		}
		T v = get(size - 1);
		--size;
		adjustRemove();
		return v;
	}
	
	private void adjust(int s){
		Feld<T> ff = new FeldFix<T>(s);
		for(int i = 0; i < size(); i++){
			ff.set(i, get(i)); // <--- holt die Elemente an der Zeigerposition i
		}
		f = new FeldFix<T>(s);
		for(int j = 0; j < size; j++){
			set(j, ff.get(j)); // <--- setzt die Elemente an der Zeigerposition j
		}
	}
	
	private void adjustInsert(){
		if(size == f.size()){
			adjust(f.size() * 2);
		}
	}
	
	private void adjustRemove(){
		if(size == (f.size() / 4) && f.size() > 1){
			adjust(f.size() / 2);
		}
	}
}
