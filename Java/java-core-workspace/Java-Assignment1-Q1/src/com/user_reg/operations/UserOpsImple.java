package com.user_reg.operations;

import java.util.ArrayList;
import java.util.List;

import com.user_reg.core.User;
import com.user_reg.custom_exception.AgeLimitException;
import com.user_reg.custom_exception.UserRegistrationException;

import static com.user_reg.validations.UserValidations.*;

public class UserOpsImple implements UserOps {
	
	//Ref arrayList to store all users
	List<User> users;
	
	public UserOpsImple() {
		users = new ArrayList<User>();
	}

	@Override
	public void registerUser(String username, String password, int age) throws UserRegistrationException, AgeLimitException {
		//check if username already exists first and if user and age valid
		validateUser(username, password);
		//check if age is valid
		validateAge(age);
		//if all well create user
		users.add(new User(username, password, age));
		System.out.println("User " + username + " registered successfully!");
	}

	@Override
	public void dispalyAllUsers() {
		if (users.isEmpty()) {
			System.out.println("No users registered yet!");
			return;
		}
		for (User u : users) {
			if (u != null) {
				System.out.println(u);
			}
		}
	}
}