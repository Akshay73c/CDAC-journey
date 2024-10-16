package com.vehicles;

public class Car {
	private String model;
	private double price;
	private boolean started;
	
	public Car(String model, double price) {
		this.model = model;
		this.price = price;
		this.started = false;
	}
	
	public boolean isStarted() {
		return started;		
	}
	
	
	//Inner class Engine
	public class Engine { 	//why kept public? - 
		private int power;	
		private String type;
		
		public Engine(int power, String type) {
			this.power = power;
			this.type = type;
		}
		
		//methods
		public void start() {
			if (started) { //javac impliciteluy adds Car.this.started
				System.out.println("Car " + model + " is already started!!");
				return;
			} 
			System.out.println("Starting the car now!");
			started =  true;
			return;
		}
		
		public void stop() {
			if (!started) { //javac impliciteluy adds Car.this.started
				System.out.println("Car " + model + " is already stopped!!");
				return;
			} 
			System.out.println("Stopping the car now!");
			started =  false;
			return;
		}
	}

}
