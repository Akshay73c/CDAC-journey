package com.user_reg.operations;

import com.user_reg.custom_exception.AgeLimitException;
import com.user_reg.custom_exception.UserRegistrationException;

//has methods for User regs
public interface UserOps {
	//since is an interface, has public abstract by default
	void registerUser(String username, String password, int age) throws UserRegistrationException, AgeLimitException;
	void dispalyAllUsers();
}
