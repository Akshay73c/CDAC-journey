package com.vehicle_sys.vehiclesImple;

import com.vehicle_sys.vehicles.LandVehicle;

public class Car implements LandVehicle {
	//no data members added since learning interface hierrachy for now.
	
	public Car() {
		System.out.println("Car created!");
	}

	@Override
	public void start() {
		System.out.println("Car started!");

	}

	@Override
	public void stop() {
		System.out.println("Car stopped!");

	}

	@Override
	public void drive() {
		System.out.println("Driving the car with super speed!");
	}
	
	@Override
	public String toString() {
		return " Car ";
	}

}
