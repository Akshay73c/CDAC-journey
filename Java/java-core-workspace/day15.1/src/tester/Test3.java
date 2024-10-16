package tester;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import fruits.Apple;
import fruits.Mango;

import static utils.GenericUtils.*;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * ArrayList<Apple> , HashSet<Orange> , TreeSet<Mango> 
		 */
		List<Apple> apples=new ArrayList<>(
				List.of(new Apple(),
				new Apple(),new Apple()));
		printTaste(apples);
		HashSet<Mango> mangoes=new HashSet<>
		(Arrays.asList(new Mango(),new Mango()));
		printTaste(mangoes);
		List<String> strings=new LinkedList<>(
				Arrays.asList("one","two","three"));
	//	printTaste(strings);
		String maxString = findMaxElement(strings);
		System.out.println(maxString);
		List<Double> doubles=Arrays.asList(1.2,3.56,0.67,-4.67,12.34,6.78);
		System.out.println(findMaxElement(doubles));
			
		

	}

}
