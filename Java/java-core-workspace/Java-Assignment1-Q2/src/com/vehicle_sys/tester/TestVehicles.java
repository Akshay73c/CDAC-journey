package com.vehicle_sys.tester;

import java.util.Scanner;

import com.vehicle_sys.operations.VehicleOps;
import com.vehicle_sys.operations.VehicleOpsImple;

public class TestVehicles {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Interface Hierrarchy Demo");
			
			VehicleOps ops = new VehicleOpsImple();
			
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Buy a car\n" 
						+ "2.Buy a boat\n"
						+ "3.Display all vehciles\n"
						+ "4.Start the vehicle \n"
						+ "5.Stop the vehicle\n"
						+ "6.Navigate vehicle\n"
						+ "0.Exit");
				System.out.println("Enter choice");
				switch (sc.nextInt()) {
				case 1:
					ops.buyCar();
					break;
				case 2:
					ops.buyBoat();
					break;
				case 3:
					ops.displayAllVehicle();
					break;
				case 4:
					ops.startVehicle();
					break;
				case 5:
					ops.stopVehicle();;
					break;
				case 6:
					ops.navigate();
					break;

				case 0:
					exit = true;
					break;
				}
			}
		}

	}

}
