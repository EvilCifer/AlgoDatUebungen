package de.org.bonn.algodat.blatt06.aufgabe3;

public class Main {

	public static void main(String[] args){
		RingDyn<Integer> dyn = new RingDyn<Integer>();
		System.out.println("------Check Size & Total after init------");
		System.out.println("total: " + dyn.total());
		System.out.println("size: " + dyn.size());
		System.out.println("----------------InsertFirst---------------------");
		dyn.insertFirst(1);
		dyn.insertFirst(2);
		dyn.insertFirst(3);
		dyn.insertFirst(4);
		dyn.insertFirst(5);
		dyn.insertFirst(6);
		dyn.insertFirst(7);
		dyn.insertFirst(8);
		/*
		 * ------Soll ergeben--------
		 * total: 8
		 * size: 8
		 * get(0): 8
		 * get(1): 7
		 * get(2): 6
		 * get(3): 5
		 * get(4): 4
		 * get(5): 3
		 * get(6): 2
		 * get(7): 1
		 */
		System.out.println("----------------RemoveFirst---------------------");
		dyn.removeFirst();
		dyn.removeFirst();
		dyn.removeFirst();
		dyn.removeFirst();
		dyn.removeFirst();
		dyn.removeFirst();
		/*
		 * ----------Soll ergeben---------
		 * total: 4
		 * size: 2
		 * get(0): 8
		 * get(1): 7
		 */
		dyn.removeFirst();
		/*
		 * ---------Soll ergeben----------
		 * total: 2
		 * size: 1
		 * get(0): 8
		 */
		dyn.removeFirst();
		/*
		 * ---------Soll ergeben----------
		 * total: 1
		 * size: 0
		 * get(0): liefert nichts
		 */
		/*
		 * removeLast() und insertLast() analog zu removeFirst() und insertFirst()
		 * nur in umgekehrter Reihenfolge
		 */
		for(int i = 0; i < dyn.size(); i++){
			if(i < 1){
				System.out.println("------Size & Total------");
				System.out.println("total: " + dyn.total());
				System.out.println("size: " + dyn.size());
				System.out.println("------Get------");
			}
			System.out.println("get(" + i + "): " + dyn.get(i));
		}
	}
}