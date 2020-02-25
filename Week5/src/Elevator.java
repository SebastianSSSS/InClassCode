import java.util.Scanner;

public class Elevator {

	public static void main(String[] args) {
		// declaring variables
		int floor;
		int actualFloor;
		
		Scanner in = new Scanner(System.in);
		// asking for data
		System.out.println("Please enter the floor: ");
		floor = in.nextInt();
		
		/*if (floor > 13) {
			actualFloor = floor - 1;
		}else {
			actualFloor = floor;
		}*/
		
		actualFloor = floor > 13 ? floor - 1 :floor;
		
		// print
		System.out.printf("Thanks. The actual floor is %d", actualFloor);
	}

}
