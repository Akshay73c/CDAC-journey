package com.practise.core;
import java.lang.Enum;
//
public enum EnumPrac{	//extends Enum -> can't even write this here. It's DONE IMPLICITELY.
	XYZ(100), ABC;
	
	private int numProp;
	
//	Enum constrs are always private (or default?)
//	why?? - for security purpose. what purposes? -> wohi normal wale.
	EnumPrac(int numProp) {
//		super(name(), ordinal());
		System.out.println("Constr called 1");
		this.numProp = numProp;
	}
	
	EnumPrac() {
//		super(name(), ordinal());
		System.out.println("Constr called 2");
		this.numProp = 119;
	}
	
	
	public int getNumProp() {
		return numProp;
	}
	

}


//public enum EnumPrac implements Enum<EnumPrac> {
//    VALUE1, VALUE2, VALUE3;
//
//    // Custom methods and attributes can be added here
//    public void myCustomMethod() {
//        System.out.println("This is a custom method in MyCustomEnum");
//    }
//}