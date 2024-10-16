package com.cdac.core;

public class Faculty extends Person{
	//additional state
	private int yearsOfExperience;
	private String sme;
	public Faculty(String fn1,String ln1,int years,String sme) {		
		super(fn1,ln1);
		System.out.println("in faculty ctor");
		this.yearsOfExperience=years;
		this.sme=sme;
		
	}
	// modify existing behavior(method overriding)
		public String getDetails() {
			return "Faculty  " + super.getDetails() 			
			+ "exp in years "
			+this.yearsOfExperience+" Expert in "+this.sme;
		}

}
