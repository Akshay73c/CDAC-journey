package sets;

import java.util.HashSet;
import java.util.Set;

public class TestStringHashSet {

	public static void main(String[] args) {
		/*
		 * Create empty HashSet to store strings
		 */
		Set<String> stringSet=new HashSet<>();
		String s1=new String("one");
		String s2=new String("two");
		String s3=new String("three");
		String s4=new String("four");
		String s5=new String("five");
		String s6=new String("six");
		String s7=new String("four");
		//populate HS
		System.out.println("Added "+stringSet.add(s1));//t
		System.out.println("Added "+stringSet.add(s2));
		System.out.println("Added "+stringSet.add(s3));
		System.out.println("Added "+stringSet.add(s4));
		System.out.println("Added "+stringSet.add(s5));
		System.out.println("Added "+stringSet.add(s6));//t
		System.out.println("Added "+stringSet.add(s7));//false
		System.out.println("Display HS - toString"+stringSet);
		//for each
		System.out.println("Display HS - for-each");
		for(String s : stringSet)
			System.out.print(s+" ");
		System.out.println();
		//contains
		System.out.println(stringSet.contains("One"));//f
		System.out.println("Removed "+stringSet.remove("one"));
		System.out.println("Display HS after remove "+stringSet);
		



	}

}
