package iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestIterator5 {

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
		// attach Iterator n remove odd elements in the int list

		Iterator<Integer> itr = intList.iterator();
		while (itr.hasNext()) {
			int i = itr.next();// auto un boxing
			if (i % 2 != 0)
				itr.remove();
		}
		System.out.println("List again "+intList);

	}

}
