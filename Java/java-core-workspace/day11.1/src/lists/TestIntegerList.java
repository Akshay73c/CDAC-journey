package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestIntegerList {

	public static void main(String[] args) {
		// create empty ArrayList to store integers
		List<Integer> intList = new ArrayList<>();
		// for-each
		// size=0, init capa=10
		int[] data = { 10, 12, 1, 3, -4, 10, 12, 13, 400, 56 };
		System.out.println("array contents - " + Arrays.toString(data));
		// populate array data in AL
		for (int i : data)// i=data[0].....
			intList.add(i);// auto boxing - intList.add(Integer.valueOf(i));
		System.out.println("List contents via toString - " + intList);
		System.out.println("List contents via for loop");
		for (int i = 0; i < intList.size(); i++)
			System.out.print(intList.get(i) + " ");
		System.out.println();
		intList.add(1, 9999);
		System.out.println("List contents after  insert " + intList);
		System.out.println(intList.contains(12));// true
		System.out.println(intList.set(0, intList.get(0) * 2));
		System.out.println("List contents after  set " + intList);
		System.out.println("Removed " + intList.remove(intList.size() - 1));
		System.out.println("List contents after  remove " + intList);
		Integer[] newArray = intList.toArray(new Integer[intList.size()]);
		System.out.println("Converted array contents - " + Arrays.toString(newArray));
		//Can you create a new arraylist from this intList ? YES
		//How - addAll | using AL(Collection c)
		ArrayList<Integer> newList=new ArrayList<>(intList);
		System.out.println("unsorted list "+newList);
		//Sort the elements in the List
		Collections.sort(newList);
		System.out.println("sorted list "+newList);
		
		
	}

}
