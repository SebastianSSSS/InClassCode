import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the d:");
		int d = in.nextInt();
		int r = d/2;
		double v = (double) 4 / 3 * Math.PI * Math.pow(r,3);
		System.out.print(v);
	}

}
