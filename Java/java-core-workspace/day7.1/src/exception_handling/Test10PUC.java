package exception_handling;

import utils.VehicleValidations;

import java.util.Scanner;

import custom_exceptions.PUC_Exception;

public class Test10PUC {

	public static void main(String[] args) throws PUC_Exception{
//		final int x = 9;
//		NOTE : LOCAL VARS CANT BE PUBLIC OR STATIC. CAN ONLY BE FINAL. 
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter PUC level: ");
			VehicleValidations.validatePUC(sc.nextInt());
		} //JVM - sc.clode();
//		catch (Exception e) {
//			e.printStackTrace();
//			
//		}

	}

}
