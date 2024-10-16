package utils;

import java.util.Collection;
import java.util.List;

import com.app.core.Emp;

public class GenericUtils {
	/*
	 * Add a static method , to print all elements from any of the following Test
	 * cases : AL<String> , LL<Integer> , Vector<LocalDate> , HS<Double> , LHS<Emp>
	 * ,TS<Fruit>
	 * 
	 */
	public static void printElements(Collection<?> elements)
	{
		for(Object e : elements)
			System.out.println(e);
	}
	/*
	 * Re write above method using -generic method syntax
	 */
	public static <T> void printElements2
	(Collection<T> elements)
	{
		for(T e : elements)
			System.out.println(e);
	}
	/*
	 * write a static method in the GenericUtils class -
      to return sum of salaries of all emps from the specified list.
	 */
	public static double computeSumOfSalary(List<? extends Emp> emps) 
	{
		double sum=0;
		for(Emp o : emps)
			sum += o.computeSalary();
		return sum;
	}
	public static <T extends Emp & Comparable<T>>double computeSumOfSalary2(List<T> emps) 
	{
		double sum=0;
		for(Emp o : emps)
			sum += o.computeSalary();
		return sum;
	}
}
