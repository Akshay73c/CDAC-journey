package exception_handling;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("Before sleep");
		/*
		 * Javac forces the handling of the checked excs upon prog
		 */
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println("in catch");
		}
		System.out.println("After sleep");

	}

}
