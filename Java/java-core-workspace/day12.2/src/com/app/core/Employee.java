package com.app.core;

public class Employee {
	private String id;
	private String name;
	private double salary;
	public Employee(String id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	//override equals method - to replace ref equality by content equality (PK)
	@Override
	public boolean equals(Object anotherObject)
	{
		System.out.println("in emp's equals");
		if(anotherObject instanceof Employee )
		{
			Employee anotherEmp=(Employee)anotherObject;
			return this.id.equals(anotherEmp.id);//content eq.
		}
		return false;
	}
	@Override
	public int hashCode() {
		System.out.println("in emp's hashCode");
		return 100;
	}
}
