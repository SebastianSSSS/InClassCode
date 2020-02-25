import java.util.Scanner;

public class InputAndOutput {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int bottles = in.nextInt();
		double price = in.nextDouble();
		System.out.print("Please enter:");
		bottles = in.nextInt();
	}

}
