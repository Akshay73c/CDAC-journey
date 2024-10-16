package com.cdac.core;

/*
 * Student --firstName,lastName,graduation year,
 * course,fees,marks

 */
public class Student extends Person {
	// additional state
	private int gradYear;
	private String courseName;
	private int fees;
	private double marks;

	// ctor - 6
	public Student(String fn, String ln, int year, String courseName, int fees, double marks) {
		// super();

		super(fn, ln);// invokes immediate super cls's MATCHING ctor
		System.out.println("in student's ctor");
		this.gradYear = year;
		this.courseName = courseName;
		this.fees = fees;
		this.marks = marks;
	}

	// modify existing behavior(method overriding)
//	@Override - not a must
	public String getDetails() {
		return "Student " + super.getDetails() 
		+ " grad year " + this.gradYear 
		+ " enrolled in " + courseName
				+ " fees :" + fees + " marks :" + this.marks;
	}
	
	

}
