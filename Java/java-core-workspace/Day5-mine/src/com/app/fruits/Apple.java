package com.app.fruits;

public class Apple extends Fruit {
	
	public Apple(String name, String color, double weight, boolean isFresh) {
		super(name, color, weight, isFresh);		
	}
	
	//overriding taste method
	@Override
	public String taste() {
		return this.toString() + " Taste - Sweet and sour";
	}
	
	//subclass specific fxnality
	public void jam() {
		System.out.println(this.getName() + " Weight " + this.getWeight() + "\n Making jam!");
	}

}
