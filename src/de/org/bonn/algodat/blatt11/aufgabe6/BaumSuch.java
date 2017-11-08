package de.org.bonn.algodat.blatt11.aufgabe6;

public class BaumSuch<T extends Comparable<T>> extends BaumBinaer<T> {

	public T element(){
		// diese Methode ist unvollstaendig und daher so nicht funktionsfaehig
		return w.v;
	}
	
	public boolean contains(T v){
		Knoten k = w;
		while(k != null){
			int c = k.v.compareTo(v);
			if(c == 0){			// Element gefunden
				return true;
			}
			else if(c > 0){		// k.v > v,
				k = k.l;		// => v im linken TB
			}else{				// k.v < v,
				k = k.r;		// => v im rechten TB
			}
		}
		return false;			// nicht gefunden
	}
	
	public boolean insert(T v){
		Knoten k = w;
		Knoten m = null;		// Mutter von k
		int c = 0;
		while(k != null){
			m = k;
			c = k.v.compareTo(v);
			if(c == 0){			// v schon vorhanden
				return false;
			}else if(c > 0){
				k = k.l;
			}else{
				k = k.r;
			}
		}
		// neuen Knoten anlegen und initialisieren
		k = new Knoten(v);
		if(m == null){			// Raum war leer
			w = k;				// k wird Wurzel
		}else{					// k wird Teilbaum von m
			if(c > 0){			// m.v > v => linker TB
				m.l = k;
			}else{				// m.v < v => rechter TB
				m.r = k;
			}
		}
		return true;
	}
	
	public void remove(T v){
		// diese Methode ist unvollstaendig und daher so nicht funktionsfaehig
		Knoten k = w;
		Knoten m = null;
		
		// Bestimme 'k' als den Knoten des zu loeschenden Wertes und 'm' als seine Mutter.
		// Falls der Wert nicht vorhanden ist, wird die Methode beendet.
		// <hier entsprechenden Code einfuegen>
		
		if(!contains(v)){
			return;
		}
		
		// Knoten 'm' ist immer darüber, außer wenn der Knoten 'k' gleich Knoten 'w' ist.
		// Knoten 'w' hat keine Mutter??? Oder ist Knoten 'w' gleich Knoten 'k' gleich 'm'.
		
		while(k != null){
			int c = k.v.compareTo(v);
			if(c == 0){
				break;
			}else if(c > 0){
				m = k;
				k = k.l;
			}else{
				m = k;
				k = k.r;
			}
		}
		
		if(k.l == null || k.r == null){		// Fall (a), (b1) oder (b2)
			loescheKnotenFallAundB(m,k);
		}else{								// Fall (c)
			m = k;							// starte bei dem gefundenen Knoten
			Knoten blatt = k.l;				// gehe zum linken Kind
			// hier Code einfuegen			// und ab dort so weit nach rechts wie moeglich
			while(blatt.r != null){
				blatt = blatt.r;
			}
			k.v = blatt.v;					// Wert von 'k' nach 'k' kopieren
			loescheKnotenFallAundB(m, k);	// Knoten 'k' mit Mutter 'm' loeschen
		}
	}
	
	private void loescheKnotenFallAundB(Knoten m, Knoten k){
		Knoten kind = null;						// Kind von k, das 'k' ersetzt

		System.out.println("k.v: " + k.v);
		System.out.println("m.v: " + m.v);
		// bestimme 'kind'
		// <hier entsprechenden Code einfuegen>
		// 1. Fall - kind ist Blatt:
		if(k.r == null && k.l == null){
			System.out.println("Fall a");
			kind = k;
			m.r = null;
			m.l = null;
		}else if(k.l == null && k.r != null){ // 2. Fall b1 - ein TeilBaum (linker)
			System.out.println("Fall b1");
			kind = k.r;
			m.l = kind;
		}else if(k.l != null && k.r == null){ // 2. Fall b2 - ein TeilBaum (rechter)
			System.out.println("Fall b2");
			kind = k.l;
			m.r = kind;
		}else if(k.l != null && k.r != null){ // 3. Fall - zwei TeilBäume
			System.out.println("Fall c");
			kind = k.l;
			while(k.r != null){
				kind = kind.r;
			}
			
		}
		// mache 'kind' zu Kind von 'm', anstelle von 'k'
		// beachte Spezialfall 'k' ist 'w'
		// <hier entsprechenden Code einfuegen>
//		int c = kind.v.compareTo(m.v);
//		if(c > 0){
//			m.r = kind;
//		}
//		if(c < 0){
//			m.l = kind;
//		}
	}
}
