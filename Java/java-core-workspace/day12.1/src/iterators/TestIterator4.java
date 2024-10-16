package iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator4 {

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
		//attach Iterator
		Iterator<Integer> itr=intList.iterator();
	//	intList.add(0,100);//structural modification implies change in the size of list
	//	intList.add(12345);
	//	intList.remove(0);
		intList.set(0, 45678);
		while(itr.hasNext())
			System.out.println(itr.next());//ConcurrentModificationExc
		
	
	}

}
