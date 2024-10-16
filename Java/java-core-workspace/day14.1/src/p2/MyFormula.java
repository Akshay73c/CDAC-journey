package p2;

public class MyFormula implements Formula,Formula2{

	@Override
	public double calculate(double a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double sqrt(double a, double b) {
		System.out.println(Formula2.super.sqrt(14, 12));
		return Formula.super.sqrt(a, b);
	}
	

}
