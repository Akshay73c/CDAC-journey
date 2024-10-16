package sets;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestStringTreeSet2 {

	public static void main(String[] args) {
		// sort the strings in desc order.
		/*
		 * TreeSet(Comparator<E> comp)
		 */
		Set<String> stringSet = new TreeSet<>
		(new Comparator<String>() {
			@Override
			public int compare(String s1,String s2) {
				System.out.println("in ano inner - string");
				return s2.compareTo(s1);
			}
		}
		);
		System.out.println(stringSet);//TS - []
		String s1 = new String("one");
		String s2 = new String("two");
		String s3 = new String("three");
		String s4 = new String("four");
		String s5 = new String("five");
		String s6 = new String("six");
		String s7 = new String("four");
		// populate HS
		System.out.println("Added " + stringSet.add(s1));// t
		System.out.println("Added " + stringSet.add(s2));
		System.out.println("Added " + stringSet.add(s3));
		System.out.println("Added " + stringSet.add(s4));
		System.out.println("Added " + stringSet.add(s5));
		System.out.println("Added " + stringSet.add(s6));// t
		System.out.println("Added " + stringSet.add(s7));// false
		System.out.println("Display TS - toString" + stringSet);//desc order

	}

}
