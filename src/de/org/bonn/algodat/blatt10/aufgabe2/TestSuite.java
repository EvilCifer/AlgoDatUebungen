package de.org.bonn.algodat.blatt10.aufgabe2;

import java.util.Comparator;

public class TestSuite {

	public static void main(String[] args){
		System.out.println("----------------------Initialize Test----------------------");
		System.out.println("----------------------Initialize Feld-Objects----------------------");
//		Feld<Integer> feld = new FeldFix<Integer>(8);
		Feld<Integer> feld = new FeldFix<Integer>(2);
		Feld<Integer> feldCount = new FeldCount<Integer>(feld);
		System.out.println(". . .");
		System.out.println("Initialize Feld-Objects: Done!");
		System.out.println("----------------------Fill Objects with Items----------------------");
//		feld.set(0, 7);
//		feld.set(1, 5);
//		feld.set(2, 8);
//		feld.set(3, 4);
//		feld.set(4, 6);
//		feld.set(5, 2);
//		feld.set(6, 3);
//		feld.set(7, 1);
		
		feld.set(0, 13);
		feld.set(1, 12);
//		feld.set(2, 11);
		FeldCount.resetCount();
		System.out.println("Fill Objects with Items: Done!");
		System.out.println("----------------------Initialize Comparator----------------------");
		Comparator<Integer> comp = new FeldComparator<Integer>();
		ComparatorCount<Integer> compCount = new ComparatorCount<Integer>(comp);
//		PivotPicker<Integer> pivot = new PivotPickerMitte<Integer>();
		PivotPicker<Integer> pivot = new PivotPickerMedian<Integer>(compCount);
		System.out.println(("CompCount: " + compCount.count()));
		System.out.println(". . .");
		System.out.println("Initialize Comparator: Done!");
		System.out.println("----------------------Use Sort----------------------");
		FeldUtil.sortQuick(feldCount, compCount, pivot);
		System.out.println("Use Sort: Done!");
		System.out.println("----------------------Dump Result----------------------");
		System.out.println("FeldCount: " + FeldCount.count());
		System.out.println("CompareCount: " + compCount.count());
		System.out.println("pivot: " + pivot.pivot(feld, 0, feld.size() - 1));
		for(Integer element : feldCount){
			System.out.print(element + " ");
		}
	}
}
