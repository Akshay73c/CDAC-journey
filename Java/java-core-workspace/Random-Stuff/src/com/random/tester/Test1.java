package com.random.tester;

public class Test1 {

	public static void main(String[] args) {
//		Integer x = 15;
//		System.out.println(x.hashCode());
//		
////		(The hash value of the empty string is zero.)
//		System.out.println(new String("as") == (new String("as"))); //refs are diff. Cool!
		System.out.println("_____________________________________");
		
		
		String s = new String("Akshay");
		System.out.println(s.hashCode());
		
		String s2 = new String("Akshay");
//		System.out.println(s2);
		System.out.println(s2.hashCode());
		System.out.println(s2 == s); //ofc false.
		System.out.println(s2.equals(s));
		//Q. Why is the hashCode same?? Does it mean its the same obj? yeah? coz equals is returning true. same hashcode. 
		//No baby.
		//Then how's the mem diagram?
		//how to check if at the same loc in mem?
		//i.e if hashcode same does that mean @ same loc in mem??
		//NO. Even if two objects have the same hash code and are equal based on their content, 
		//it doesn't necessarily mean they are the same object.
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(2));
		//why is this giving diff results?
		
		//Q. s1 and s2 are two strings. Both's sysout print "Akshay". equals() rets true. hashcode() rets same hashCode.
		//s1==s2 gives false.
		//MEANS OFC one is literal and one is non-literal? idk. no idiot. ITS NOT LIKE THIS.
	}

}
