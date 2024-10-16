package utils;

import java.util.Collection;
import java.util.List;

import com.app.core.Emp;
import com.app.core.SalesMgr;
import com.app.core.TempWorker;

import fruits.Fruit;

public class GenericUtils {
	/*
	 * Add a static method , to print all elements from any of the following Test
	 * cases : AL<String> , LL<Integer> , Vector<LocalDate> , HS<Double> , LHS<Emp>
	 * ,TS<Fruit>
	 * 
	 */
	public static void printElements(Collection<?> elements) {
		for (Object e : elements)
			System.out.println(e);
	}

	/*
	 * Re write above method using -generic method syntax
	 */
	public static <T> void printElements2(Collection<T> elements) {
		for (T e : elements)
			System.out.println(e);
	}

	/*
	 * write a static method in the GenericUtils class - to return sum of salaries
	 * of all emps from the specified list.
	 */
	public static double computeSumOfSalary(List<? extends Emp> emps) {
		double sum = 0;
		for (Emp o : emps)
			sum += o.computeSalary();
		return sum;
	}

	public static <T extends Emp & Comparable<T>> double computeSumOfSalary2(List<T> emps) {
		double sum = 0;
		for (Emp o : emps)
			sum += o.computeSalary();
		return sum;
	}

	/*
	 * Write a method to print taste() of Collection of any fruit Test Cases -
	 * ArrayList<Apple> , HashSet<Orange> , TreeSet<Mango> ...
	 * 
	 */
//	public static void printTaste(Collection<? extends Fruit> fruits) {
//		for(Fruit f : fruits)
//			f.taste();		
//	}
	public static <T extends Fruit> void printTaste(Collection<T> fruits) {
		for (Fruit f : fruits)
			f.taste();
//		fruits.add(new Mango());
//		fruits.add(new Orange());
//		fruits.add(new Apple());
//		fruits.add(new Fruit());
//		fruits.add(new Object());
		fruits.add(null);
	}

	/*
	 * Write a method to Find max element from List of any type (integer / float /
	 * double /string / LocalDate ) n return it to the caller.
	 * 
	 */
	public static <T extends Comparable<T>> T findMaxElement(List<T> anyList) {
		T maxElement = anyList.get(0);
		for (int i = 1; i < anyList.size(); i++)
			if (maxElement.compareTo(anyList.get(i)) < 0)
				maxElement = anyList.get(i);
		return maxElement;
	}

	
	public static void addEmp(List<? super Emp> list, Emp emp) {

		list.add(emp);
		// What all will you be able to add to such a list ?
//		list.add(new Object())
//		list.add(new Emp(100))
//		list.add(new Mgr(200))
//		list.add(new SalesMgr(300))
//		list.add(new TempWorker(100))
	}
	
	public static void addFruit(List<? super Fruit> list, Fruit fruit) {
		list.add(fruit);
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
