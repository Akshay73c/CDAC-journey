import java.util.Scanner;

class PrintAvg {
	public static void main(String[] ars) {
		//create instance of Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 doubles");
		double d1 = sc.nextDouble(), d2 = sc.nextDouble(), d3 = sc.nextDouble(), d4 = sc.nextDouble(), d5 = sc.nextDouble();
		System.out.println("Average = " + (d1+d2+d3+d4+d5) / 5);
		//close the scanner
		sc.close();

	}

}