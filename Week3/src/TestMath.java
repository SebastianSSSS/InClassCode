
public class MathTest {

	public static void main(String[] args) {
		double a = 5;
		double b = 10;
		double result;
		result = ( a + b ) / 2;
		result = result - 15;
		result = Math.abs(result);
		System.out.println("Result = " + result);
		// S.O.P
		System.out.println("Math.abs(-7) = 	" + Math.abs(-7));
		
		// counter
		int counter = 0;
		counter++;
		System.out.println("Counter = " + counter);
		
		// new
		double x3;
		double x = 10;
		x3 = Math.pow(x, 3);
		result = x3 + 2 * x + 3;
		System.out.println("Result = " + result);
		
		// another one
		double num1 = 100;
		double num2 = 200;
		result = Math.max(num1, num2);
		System.out.println("The largest number = " + result);
		
		
		// 4
		result = Math.pow(x, 2) + Math.pow(b, 2);
		result = Math.round( Math.sqrt(result));
		System.out.println("4th result = " + result);
		
		// 5
		double r = 5;
		result = Math.round( 4.0 / 3.0 * Math.PI * Math.pow(r, 3) );
		System.out.println("5th result = " + result);
		
		// %
		System.out.println(1729%10);
	}

}

