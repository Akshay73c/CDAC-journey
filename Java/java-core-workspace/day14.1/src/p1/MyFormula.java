package p1;

public class MyFormula implements Formula{
/*
 * Can imple class inherit def method ?YES !
 */
	@Override
	public double calculate(double a) {
		System.out.println("1");
		return a*a;
	}

}
