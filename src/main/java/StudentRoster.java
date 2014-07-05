import java.util.Scanner;

public class StudentRoster {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many students?");
		int numStudents = input.nextInt();
		System.out.println();
		
		
		String[] studentArray = new String [numStudents];
		
		for (int x = 0; x < numStudents; x++) {
			System.out.println("Enter each Student Name: ");
			studentArray[x] = input.next();
			System.out.println();
			
		}
		System.out.println("Student Roster");
		for (String element : studentArray)
		System.out.println(element);

	}

}
