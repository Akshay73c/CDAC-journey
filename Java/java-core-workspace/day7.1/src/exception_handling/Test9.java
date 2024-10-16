package exception_handling;

import static utils.VehicleValidations.validateSpeed;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)
				) {	//try with resources - the Autocloseable objs will be closed by jvm
			System.out.println("Enter speed");
			validateSpeed(sc.nextInt());
			System.out.println("end of try...");
		}//JVM - sc.close()
		catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
