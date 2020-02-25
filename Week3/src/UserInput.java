import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		// code for Scanner class
		String name;
		int age;
		float weight;
		
		System.out.print("Enter your name: ");
		name = data.next();
		System.out.print("Enter your age: ");
		age = data.nextInt();
		System.out.print("Enter your weight: ");
		weight = data.nextFloat();
		
		System.out.println("Name: " + name + ", Age: " + age + ", Weight: " + weight);
		
		
		String firstName, lastName;
		System.out.print("Enter your first name: ");
		firstName = data.next();
		System.out.print("Enter your last name: ");
		lastName = data.next();
		System.out.println("Your full name: " + firstName + " " + lastName);
		System.out.println("The length of my full name is : " + (firstName.length() + lastName.length()));
	
		//code for substring
		String sub = firstName.substring(0,3);
		String sub2 = firstName.substring(3);
		System.out.println("Hey, " + sub + " " + sub2);
		
		char initial = firstName.charAt(0);
		
		System.out.println("The initial of your first name is " + initial);
		
		/*double price = 12.21997;
		System.out.printf("%5.2f",price);*/
	}

}



