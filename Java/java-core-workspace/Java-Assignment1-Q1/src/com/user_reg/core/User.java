package com.user_reg.core;

//Core class
public class User {
	private int userId, age;
	private String username, password;
	private static int userIdGenerator;
	
	static {
		userIdGenerator = 100;
	}
	
	//constr
	public User(String username, String password, int age) {
		this.username = username;
		this.password = password;
		this.age = age;
		this.userId = ++userIdGenerator;
	}
	
	//override toString()
	@Override
	public String toString() {
		return "UserId " + this.userId + " Username " + this.username;
	}
	
	//getters n setters
}
