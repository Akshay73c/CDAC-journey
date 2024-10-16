package utils;

import custom_exceptions.PUC_Exception;
import custom_exceptions.SpeedOutOfRangeException;

public class VehicleValidations {
	//declare a constant
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	public static final int MAX_POLLUTION ;
	static {
		MIN_SPEED=40;
		MAX_SPEED=80;
		MAX_POLLUTION = 20;
	}
//add static method to validate speed
	public static void validateSpeed(int speed)
			throws SpeedOutOfRangeException
	{
		if(speed < MIN_SPEED) {
			SpeedOutOfRangeException ex1 = new SpeedOutOfRangeException("Speed slow");// ? why err here?
			throw ex1;    //Yep, could do this.
//			throw new SpeedOutOfRangeException("Speed too Slow !!!!!");
			
		}
		if(speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("Speed too fast ! FATAL !!!!");
		System.out.println("Speed within range");
	}
	
	//PUC validation
	public static void validatePUC(int pollutionLevel) throws PUC_Exception{
		if(pollutionLevel > 100 || pollutionLevel < 0) {
			System.out.println("Invalid input");
			return;
		}
		if(pollutionLevel > MAX_POLLUTION) 
			throw new PUC_Exception("Pollution level exceeded!!");
		System.out.println("Within range :)");
	}
}
