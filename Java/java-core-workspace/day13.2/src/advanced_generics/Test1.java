package advanced_generics;

import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// Generic methods
		List<Integer> list1=Arrays.asList(10,2,3,4,5,10,11,34);
		System.out.println(list1);
	//	list1.add(0,1234);
	//	list1.remove(0);
		list1.set(0, 999);
		System.out.println(list1);
		List<Double> list2=Arrays.asList(1.0,2.6,3.89,4.456);
	//	Double d1=123;
		System.out.println(list2);
		List<String> list3=Arrays.asList("one","two","three");

	}

}
