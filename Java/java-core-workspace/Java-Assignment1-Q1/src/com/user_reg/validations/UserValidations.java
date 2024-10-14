package com.user_reg.validations;

import com.user_reg.custom_exception.AgeLimitException;
import com.user_reg.custom_exception.UserRegistrationException;

public class UserValidations {
	
	public static final int MIN_AGE = 18;

	public static void validateUser(String username, String password) throws UserRegistrationException{
		if (username.length() <= 6) {
			throw new UserRegistrationException("Username should be > 6 char length!!");
		}
		if (password.length() <= 6) {
			throw new UserRegistrationException("Passoword should be > 6 char length!!");
		}
		
	}
	
	public static void validateAge(int age) throws AgeLimitException{
		if (age < MIN_AGE)
			throw new AgeLimitException("Not eligible for reg! User must be older than 18 years ;(");
	}

}
