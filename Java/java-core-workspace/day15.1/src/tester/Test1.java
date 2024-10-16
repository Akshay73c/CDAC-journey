package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import static utils.GenericUtils.*;

/*
 * Create GenericUtils class as a  non generic class
-Add a static method , to print all elements from any of the following
 Test cases : AL<String> , LL<Integer> , 
 Vector<LocalDate> , HS<Double> , LHS<Emp> ,TS<Fruit> 
 */
public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>(Arrays.asList("one", "two", "three"));
		// strings.add(0,"zero");
		LinkedList<Integer> ints = new LinkedList<>(Arrays.asList(10, 20, 30, 49));
		HashSet<Double> doubles = new HashSet<>(Arrays.asList(1.2, 3.45, 4.567));
		printElements(strings);
		printElements(ints);
		printElements(doubles);
		Object o = "hello";// up casting(String IS-A Object)
		o = LocalDate.now();// up casting
		o = 100;
		List<Object> list1;
		List<String> list2 = new ArrayList<>();
		// list1=list2;//Even though String IS-A Object , List<Object> IS NOT a super
		// type of List<String>
		// => inheritance in generics DOES NOT work as expected ! -
		// By default - generic collections - invariant in nature
		/*
		 * To achieve the flexibilty in generic syntax , use ? ? -un bounded wild card
		 * in generics Represents un - known type (which can be substituted by ANY type)
		 * 
		 */
		List<?> anyList;// represents super type
		anyList = list2;
		anyList = new Vector<Double>();
		printElements2(strings);
		printElements2(ints);
		printElements2(doubles);
		/*
		 * shuffle the elements of LinkedList<Integer>
		 */
		LinkedList<Integer> list3 = new LinkedList<>
		(Arrays.asList(10, 20, 30, 40, 50));
		System.out.println(list3);
		Collections.shuffle(list3);//List<?>
		System.out.println(list3);

	}

}
