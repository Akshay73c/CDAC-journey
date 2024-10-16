package sets;

import java.util.HashSet;
import java.util.Set;

import com.app.core.Employee;

public class TestEmpSet {

	public static void main(String[] args) {
		Set<Employee> emps=new HashSet<>();
		Employee e1=new Employee("rnd-001", "abc1", 10000);
		Employee e2=new Employee("rnd-002", "abc2", 20000);
		Employee e3=new Employee("rnd-001", "abc1", 10000);
		System.out.println("Added "+emps.add(e1));//t
		System.out.println("Added "+emps.add(e2));//t
		System.out.println("Added "+emps.add(e3));//t
		System.out.println("Emps -");
		for(Employee e : emps)
			System.out.println(e);//dups !
		System.out.println("size of the set "+emps.size());//3
		System.out.println("e1.equals(e3) "+e1.equals(e3));//t
		System.out.println(e1.hashCode()+" "+e3.hashCode());//same


	}

}
