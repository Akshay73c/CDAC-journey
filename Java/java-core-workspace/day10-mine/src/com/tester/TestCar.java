package com.tester;

import com.vehicles.Car;

public class TestCar {
	public static void main(String[] args) {
		Car car = new Car("HondaCar", 20000000);
		Car.Engine hondaEngine = car.new Engine(300, "Petrol");
		
		
		
//		to start car, just call engine's method using engine's instance
		hondaEngine.start();
		hondaEngine.start();

		hondaEngine.stop();
		hondaEngine.stop();
		
	}

}
