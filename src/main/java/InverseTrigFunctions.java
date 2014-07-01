import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

public class InverseTrigFunctions {

	public static void main(String[] args) {
		
		System.out.println("InverseTrigFunctions Program");
		System.out.println("Enter the Angle in Degrees: ");
		
		Scanner input = new Scanner(System.in);
		double degrees = input.nextDouble();
	
		NumberFormat decimal = NumberFormat.getNumberInstance();
		
		System.out.println("Arcsin: " + decimal.format(Math.asin(degrees)));
		System.out.println("Arccos: " + decimal.format(Math.acos(degrees)));
		System.out.println("Arctan: " + decimal.format(Math.atan(degrees))) ;
	}

}
