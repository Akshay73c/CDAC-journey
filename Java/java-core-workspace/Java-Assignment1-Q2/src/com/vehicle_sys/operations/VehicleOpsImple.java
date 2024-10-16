package com.vehicle_sys.operations;

import java.util.ArrayList;
import java.util.List;

import com.vehicle_sys.vehicles.Vehicle;
import com.vehicle_sys.vehiclesImple.Boat;
import com.vehicle_sys.vehiclesImple.Car;

public class VehicleOpsImple implements VehicleOps{
	List<Vehicle> vehicles;
	
	public VehicleOpsImple() {
		vehicles = new ArrayList<Vehicle>();
	}
	
	@Override
	public void buyCar() {
		vehicles.add(new Car());
	}
	
	@Override
	public void buyBoat() {
		vehicles.add(new Boat());
	}
	
	@Override
	public void displayAllVehicle() {
		if (vehicles.isEmpty()) {
			System.out.println("No vehicles bought yet!");
			return;
		}
		System.out.println(vehicles);
		
	}
	
	@Override
	public void startVehicle() {
		if (vehicles.isEmpty()) {
			System.out.println("No vehicles bought yet!");
			return;
		}
		for(Vehicle v : vehicles) {
			if (v != null) {
				v.start(); //common method
			}
		}
		
	}

	@Override
	public void stopVehicle() {
		if (vehicles.isEmpty()) {
			System.out.println("No vehicles bought yet!");
			return;
		}
		for(Vehicle v : vehicles) {
			if (v != null) {
				v.stop(); //common methid
			}
		}
	}

	@Override
	public void navigate() {
		if (vehicles.isEmpty()) {
			System.out.println("No vehicles bought yet!");
			return;
		}
		for(Vehicle v : vehicles) {
			if (v != null) {
				//downcast 
				if (v instanceof Car) {
					((Car) v).drive();
				}
				if (v instanceof Boat) {
					((Boat) v).sail();;
				}
			}
		}
		
	}
	
	

}
