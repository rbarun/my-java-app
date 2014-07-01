
import java.util.Scanner;

public class GradeAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("First Grade: ");
		int x;
		x = input.nextInt();
		
		System.out.println("Second Grade: ");
		int y;
		y = input.nextInt();
		
		System.out.println("Third Grade: ");
		int z;
		z = input.nextInt();
		
		System.out.print("Your Grade is: ");
		System.out.print((int)(x+y+z)/3);
	}

}

