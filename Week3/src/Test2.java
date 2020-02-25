import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		 System.out.print("Enter your name ");
		   String name;
		   Scanner in = new Scanner(System.in);
		   name = in.next();
		   name += ", Good morning";
		   System.out.print(name);   
	}

}
