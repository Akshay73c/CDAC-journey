package p1;

public class MyFormula2 implements Formula{

	@Override
	public double calculate(double a) {
		System.out.println("2");
		return a+a;
	}
	/*
	 * Can imple class override inherited  def method ?YES !
	 */

	@Override
	public double sqrt(double a, double b) {
		// TODO Auto-generated method stub
		return  Math.sqrt(a - b);
	}
	

	
}
