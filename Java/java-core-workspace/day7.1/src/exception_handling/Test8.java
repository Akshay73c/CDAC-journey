package exception_handling;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
			System.out.println("Enter a number");
			System.out.println("You entered - "+sc.nextInt());
		}//JVM - sc.close();
		 catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("main over....");

	}

}
