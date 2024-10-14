package com.user_registration.tester;

import java.util.Scanner;

import com.user_reg.operations.UserOps;
import com.user_reg.operations.UserOpsImple;

//Tester class for User regs
public class TestUserReg {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			
			UserOps ops = new UserOpsImple(); //create instance of operations
			
			boolean exit  = false;
			while (!exit) {
				System.out.println("User Registrations");
				System.out.println("1. Register user\n"
				+ "2. Display all users\n"
				+ "0. Exit\n");
				System.out.println("Enter choice:");
				
				try {
					switch (sc.nextInt()) {
					case 1:
						//Reg User
						System.out.println("Enter user details as username, password, age");
						ops.registerUser(sc.next(), sc.next(), sc.nextInt());
						break;
					case 2: 
						ops.dispalyAllUsers();
						break;

					case 0:
						exit = true; //exit the loop
						break;
					}
				} catch (Exception e) {
					//catches all exceps
					System.out.println(e);
					sc.nextLine();
				}
			}
		}
		
		
	}

}
