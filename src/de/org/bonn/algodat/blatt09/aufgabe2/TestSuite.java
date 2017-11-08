package de.org.bonn.algodat.blatt09.aufgabe2;

import java.util.Comparator;

public class TestSuite {

	public static void main(String[] args){
		System.out.println("----------------------Initialize Test----------------------");
		System.out.println("----------------------Initialize Feld-Objects----------------------");
		Feld<Integer> feld = new FeldFix<Integer>(8);
		Feld<Integer> feldCount = new FeldCount<Integer>(feld);
		System.out.println(". . .");
		System.out.println("Initialize Feld-Objects: Done!");
		System.out.println("----------------------Fill Objects with Items----------------------");
		feldCount.set(0, 6);
		feldCount.set(1, 4);
		feldCount.set(2, 8);
		feldCount.set(3, 1);
		feldCount.set(4, 7);
		feldCount.set(5, 2);
		feldCount.set(6, 5);
		feldCount.set(7, 3);
		System.out.println("Fill Objects with Items: Done!");
		System.out.println("----------------------Initialize Comparator----------------------");
		Comparator<Integer> comp = new FeldComparator<Integer>();
		ComparatorCount<Integer> compCount = new ComparatorCount<Integer>(comp);
		System.out.println(". . .");
		System.out.println("Initialize Comparator: Done!");
		System.out.println("----------------------Use Sort----------------------");
		FeldUtil.sortBubble(feldCount, compCount);
		System.out.println("Use Sort: Done!");
		System.out.println("----------------------Dump Result----------------------");
		System.out.println("FeldCount: " + FeldCount.count());
		System.out.println("CompareCount: " + compCount.count());
		for(Integer element : feldCount){
			System.out.print(element);
		}
	}
}
