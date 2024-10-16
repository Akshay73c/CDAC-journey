package p1;

public class Test1 {
	public static void main(String[] args) {
		Formula f1=new MyFormula();
		System.out.println(f1.calculate(10));
		System.out.println(f1.sqrt(15, 10));
		f1=new MyFormula2();
		System.out.println(f1.calculate(10));
		System.out.println(f1.sqrt(15, 10));
		
	}
}
