package exception_handling;

public class Test1 {

	public static void main(String[] args) {
		try {
			int[] data = { 10, 20, 30, 40, 50 };
			System.out.println(data[40]);// JVM - throw new AOBExc(....)
			System.out.println("int value - " + Integer.parseInt("1234"));
			String s = "abc";
			System.out.println("1st char " + s.charAt(0));
			int a = 100;
			int b = 0;
			System.out.println("div result - " + (a / b));
			System.out.println("end of try...");
		}
//		catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
//			System.out.println("1");
//		}
//		catch (NumberFormatException e) {
//			System.out.println("2");
//		}
		catch (Exception e) {
			System.out.println("in catch-all ");
			System.out.println(e.getMessage());
			System.out.println("-----------");
			System.out.println(e);// e.toString()
			System.out.println("-----------");
			e.printStackTrace();
		}
		System.out.println("main continued.....");
	}

}
