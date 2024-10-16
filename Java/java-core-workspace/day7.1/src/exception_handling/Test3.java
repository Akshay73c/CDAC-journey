package exception_handling;

public class Test3 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("Before sleep");
		/*
		 * Javac forces the handling of the checked excs upon prog
		 */
		
			Thread.sleep(5000);
		
		System.out.println("After sleep");

	}

}
