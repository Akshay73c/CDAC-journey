package iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator1 {

	public static void main(String[] args) {
		// create empty ArrayList to store integers
		List<Integer> intList = new ArrayList<>(1000);
		// for-each
		// size=0, init capa=1000
		int[] data = { 10, 12, 1, 3, -4, 10, 12, 13, 400, 56 };
		System.out.println("array contents - " + Arrays.toString(data));
		// populate array data in AL
		for (int i : data)// i=data[0].....
			intList.add(i);// auto boxing - intList.add(Integer.valueOf(i));
		//display list elems - using Iterator
		Iterator<Integer> intItr=intList.iterator();
		//intItr --> before the 1st elem
		System.out.println("List contents via Iterator -");
		while(intItr.hasNext())
			System.out.println(intItr.next());
		
		
		
	}

}
