import java.util.Scanner;
import java.util.Arrays;

public class Grade {
	
	static String userName() {
		Scanner in = new Scanner(System.in);
		String firstName;
		String lastName;
		
		System.out.println("Please enter your first name: ");
		firstName = in.next();
		System.out.println("Please enter your last name: ");
		lastName = in.next();
		
		return firstName+" "+lastName;
	}
	
	static double sum(Double num1,Double num2) {
		return num1+num2;
	}
	
	static double diff(Double num1,Double num2) {
		return num1-num2;
	}
	
	static double mult(Double num1,Double num2) {
		return num1*num2;
	}
	
	static double div(Double num1,Double num2) {
		return num1/num2;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double num1;
		double num2;
		
		// asking for data
		String fullName = userName();
		
		System.out.println("Your name is "+fullName);
		
		System.out.println("Please enter the first number: ");
		num1 = in.nextDouble();
		System.out.println("Please enter the second number: ");
		num2 = in.nextDouble();
		
		// result
		System.out.printf("The result of adding 2 nums = %f%n"
				+ "The result of sub 2 nums = %f%n"
				+ "The result of mult 2 nums = %f%n"
				+ "The result of div 2 nums = %f%n",
				sum(num1 , num2),
				diff(num1 , num2),
				mult(num1 , num2),
				div(num1 , num2));

	}

}
