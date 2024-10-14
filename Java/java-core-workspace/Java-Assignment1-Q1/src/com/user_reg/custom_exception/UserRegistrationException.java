package com.user_reg.custom_exception;

public class UserRegistrationException extends Exception {

	public UserRegistrationException(String message) {
		 //calls Exception's constr -> which calls Throwable's constr which sets the mesg 
		super(message);
		
	}

}
