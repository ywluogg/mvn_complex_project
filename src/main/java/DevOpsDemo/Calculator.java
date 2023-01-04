package DevOpsDemo;
import com.mycompany.app.SpecialCalculator;

public class Calculator {
	public double sum(double x, double y) {
		return x + y;
	}

	public double subtract(double x, double y) {
		return x - y;
	}

	public double multiply(double x, double y) {
		return x * y;
	}

	public int divide(int x, int y) throws ArithmeticException {
		SpecialCalculator sc = new SpecialCalculator();
		return sc.divide(x, y);
		// //This is a modified division method
		// if(y!=0) {
		// 	return x / y;
		// }
		// else {
		// 	throw new ArithmeticException("Divide By Zero");
		// }
	}
}
