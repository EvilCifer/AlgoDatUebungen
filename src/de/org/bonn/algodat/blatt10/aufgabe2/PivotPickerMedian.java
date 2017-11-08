package de.org.bonn.algodat.blatt10.aufgabe2;

/**
 * 
 * @author dginte2s
 *
 */

public class PivotPickerMedian<T> implements PivotPicker<T> {

	private ComparatorCount<T> comp;
	
	PivotPickerMedian(ComparatorCount<T> comp){
		this.comp = comp;
	}
	
	@Override
	public int pivot(Feld<? extends T> feld, int l, int r) {
		PivotPicker<T> p = new PivotPickerMitte<T>();
		T links = feld.get(l);
		T mitte = feld.get(p.pivot(feld, l, r));
		T rechts = feld.get(r);
		
		if(mitte == rechts){
			return r;
		}
		
		if(comp.compare(links, mitte) <= 0){
			if(comp.compare(mitte, rechts) <= 0){
				if(comp.compare(links, rechts) <= 0){
					return p.pivot(feld, l, r);
				}
			}
			if(comp.compare(links, rechts) <= 0){
				return r;
			}
			return l;
		}
		if(comp.compare(links, rechts) <= 0){
			if(comp.compare(mitte, rechts) <= 0){
				return l;
			}
		}
		if(comp.compare(mitte, rechts) <= 0){
			return r;
		}
		
		return p.pivot(feld, l, r);
	}
}
