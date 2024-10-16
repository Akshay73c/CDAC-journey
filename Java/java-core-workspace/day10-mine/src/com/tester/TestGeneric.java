package com.tester;

import com.generics.Pair;

public class TestGeneric {

	public static void main(String[] args) {
		String str = new String("Abc");
		Pair<String, Integer> p1 = new Pair<>(str, str.length());

		System.out.println(p1.getRef1());
		System.out.println(p1.getRef2().getClass());
		

		
//	Pair<Integer, Double> p3 = new Pair<>(4, 3); //why err? -> coz javac prefers autoboxing first,
//																so it first converts int 3 to Integer
//																and then Interger->Double not possible. hence error
//				why doesn't it cast int to double here??
		Pair<Integer, Double> p2 = new Pair<>(4, 2.0);
		
		int a = 9;
		double b = 3; //here int 3 to double 3.0 impleicitely 
		Pair<Integer, Double> p4 = new Pair<>(a, b); //so here, double to Double. yep. matched.
//		Pair<Integer, Double> p5 = new Pair<>();
//		p5.setRef2(2);
		
//		p1 = p4;	//err here -> coz both refs are of diff generic types
	}

}
