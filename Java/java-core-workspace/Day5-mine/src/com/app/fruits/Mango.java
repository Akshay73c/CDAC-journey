package com.app.fruits;

public class Mango extends Fruit {

	public Mango(String name, String color, double weight, boolean isFresh) {
		super(name, color, weight, isFresh);
		
	}
	
	//Override taste method
	@Override
	public String taste() {
		return this.toString() + " Taste Sweet";
	}
	
	//specific fxnality
	public void pulp() {
		System.out.println(this.getName() + " Weight " + this.getWeight() + "\n Creating pulp of Apple!");
	}

}
