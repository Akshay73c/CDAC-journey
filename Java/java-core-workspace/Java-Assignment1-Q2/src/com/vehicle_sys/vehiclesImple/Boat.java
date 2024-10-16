package com.vehicle_sys.vehiclesImple;

import com.vehicle_sys.vehicles.WaterVehicle;

public class Boat implements WaterVehicle {
	
	public Boat() {
		System.out.println("Boat created!");
	}

	@Override
	public void start() {
		System.out.println("Boat started!");

	}

	@Override
	public void stop() {
		System.out.println("Stopped the boat!");

	}

	@Override
	public void sail() {
		System.out.println("Sailing the boat!!");

	}
	
	@Override
	public String toString() {
		return " Boat ";
	}

}
