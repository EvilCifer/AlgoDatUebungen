package de.org.bonn.algodat.blatt08.aufgabe1;

public class TestSuite {

	public static void main(String[] args) {
		MengeAlsListeAlsRingDynLin<Integer> menge = new MengeAlsListeAlsRingDynLin<Integer>();
		System.out.println("----------------TestSuite Menge----------------");
		System.out.println();
		System.out.println("----------------IsEmpty && Size Test----------------");
		System.out.println();
		System.out.println("\t\tSoll:\t\t\tIst:\n");
		System.out.println("isEmpty:\ttrue\t\t\t" + menge.isEmpty());
		System.out.println("size:\t\t0\t\t\t" + menge.size());
		System.out.println();
		System.out.println("----------------Insert Test----------------");
		System.out.println();
		System.out.println("\t\tSoll:\t\t\tIst:\n");
		System.out.println("insert(10):\ttrue\t\t\t" + menge.insert(10));
		System.out.println("insert(20):\ttrue\t\t\t" + menge.insert(20));
		System.out.println("insert(120):\ttrue\t\t\t" + menge.insert(120));
		System.out.println("insert(5000):\ttrue\t\t\t" + menge.insert(5000));
		System.out.println("insert(130):\ttrue\t\t\t" + menge.insert(130));
		System.out.println("insert(250):\ttrue\t\t\t" + menge.insert(250));
		System.out.println("insert(250):\tfalse\t\t\t" + menge.insert(250));
		System.out.println();
		System.out.println("----------------Remove Test----------------");
		System.out.println();
		System.out.println("\t\tSoll:\t\t\tIst:\n");
		System.out.println("remove(10):\ttrue\t\t\t" + menge.remove(10));
		System.out.println("remove(10):\tfalse\t\t\t" + menge.remove(10));
		System.out.println("remove(5000):\ttrue\t\t\t" + menge.remove(5000));
		System.out.println();
		System.out.println("----------------IsEmpty && Size Test----------------");
		System.out.println();
		System.out.println("\t\tSoll:\t\t\tIst:\n");
		System.out.println("isEmpty:\tfalse\t\t\t" + menge.isEmpty());
		System.out.println("size:\t\t4\t\t\t" + menge.size());
		System.out.println();
		System.out.println("----------------Get Test----------------");
		System.out.println("RandomElement: " + menge.element());
	}
}
