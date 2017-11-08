package de.org.bonn.algodat.blatt05.aufgabe3;

public class Main {

	public static void main(String[] args){
		Schlange<Integer> q1 = new SchlangeAlsFeldFix<Integer>();
		  Schlange<Integer> q2 = new SchlangeAlsFeldFix<Integer>();
//		  Schlange<Object> qo = new SchlangeAlsFeldFix<Object>();
		  SchlangeUtil.append(q1,q2);
		  System.out.println(q1.isEmpty());
		  System.out.println(q2.isEmpty());
		  q1.insert(1);
		  q1.insert(2);
		  q1.insert(3);
		  SchlangeUtil.append(q1,q2);
		  System.out.println(q2.isEmpty());
		  System.out.println(q1.remove());
		  System.out.println(q1.remove());
		  System.out.println(q1.remove());
		  System.out.println(q1.isEmpty());
		  q2.insert(1);
		  q2.insert(2);
		  q2.insert(3);
		  q2.insert(4);
		  q2.insert(5);
		  SchlangeUtil.append(q1,q2);
		  System.out.println(q1.remove());
		  System.out.println(q1.remove());
		  System.out.println(q1.remove());
	}
}
