import java.util.Scanner;
public class GPA {

	public static void main(String[] args) {
		
		double gpa;
		char grade;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your final grade: ");
		grade = in.next().toUpperCase().charAt(0);
		
		
		/*if(grade == 'A') {
			gpa = 4.0;
		}else if(grade == 'B') {
			gpa = 3.0;
		}else if(grade == 'C') {
			gpa = 2.0;
		}else if(grade == 'D') {
			gpa = 1.0;
		}else {
			gpa = 0.0;
		}*/
		
		switch (grade) {
			case 'A':
				gpa = 4.0;
				break;
			case 'B':
				gpa = 3.0;
				break;
			case 'C':
				gpa = 2.0;
				break;
			case 'D':
				gpa = 1.0;
				break;
			default:
				gpa = 0.0;
		}
		
		System.out.println("GPA = "+gpa);
		
	}

}
