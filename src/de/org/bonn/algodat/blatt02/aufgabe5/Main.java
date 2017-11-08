package de.org.bonn.algodat.blatt02.aufgabe5;

public class Main {

	public static void main(String[] args){
//		Feld<String> feld1 = new FeldFix<String>(3);
//		Feld<String> feld2 = new FeldFix<String>(3);
//		Feld<Paar<String, String>> fp = new FeldVonPaar<String, String>(feld1, feld2);
		FeldFix<String> f1_obj = new FeldFix<String>(3);
		f1_obj.set(0, "a");
		f1_obj.set(1, "b");
		f1_obj.set(2, "c");
		Feld<String> f1 = f1_obj;
		FeldFix<String> f2_obj = new FeldFix<String>(0);
//		f2_obj.set(0, "d");
//		f2_obj.set(1, "e");
		Feld<String> f2 = f2_obj;
		Feld<Paar<String,String>> fp = new FeldVonPaar<String, String>(f1, f2);
		System.out.println(fp.isEmpty());
//		Paar<String, String> p;
//		System.out.println(!fp.isEmpty());
//		System.out.println(fp.size());
//		p = fp.get(0);
//		System.out.println("0" + p.erstes());
//		System.out.println("0" + p.zweites());
//		System.out.println("0" + f1.get(0));
//		System.out.println("0" + f2.get(0));
//		p = fp.get(1);
//		System.out.println("1" + p.erstes());
//		System.out.println("1" + p.zweites());
//		System.out.println("1" + f1.get(1));
//		System.out.println("1" + f2.get(1));
//		p = fp.set(0, new Paar<String, String>("Greta", "Garbo"));
//		System.out.println(p.erstes());
	}
}

/*
FeldFix<String> f1_obj = new FeldFix<String>(f1_init.length);
f1_obj.set(i,f1_init[i]);
f1_obj.set(i,f1_init[i]);
f1_obj.set(i,f1_init[i]);
Feld<String> f1 = f1_obj;
FeldFix<String> f2_obj = new FeldFix<String>(f2_init.length);
f2_obj.set(i,f2_init[i]);
f2_obj.set(i,f2_init[i]);
Feld<String> f2 = f2_obj;
Feld<Paar<String,String>> fp = new FeldVonPaar<String,String>(f1,f2);
Paar<String,String> p;
!fp.isEmpty();
fp.size();
p = fp.get(0);
p.erstes();
p.zweites();
f1.get(0);
f2.get(0);
p = fp.get(1);
p.erstes();
p.zweites();
f1.get(1);
f2.get(1);
p = fp.set(0,new Paar<String,String>("Greta","Garbo"));
p.erstes();*/