package com.app.fruits;

public class Fruit {
	private String name, color;
	private double weight;
	private boolean isFresh;
	
	public Fruit(String name, String color, double weight, boolean isFresh) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh = isFresh;
	}
	
	@Override
	public String toString() {
		return "Name " + name + " Color " + color + " weight " + weight;
	}
	
	//taste method
	public String taste() {
		return this.toString() + "\nNo specific taste";
	}
	

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

}
