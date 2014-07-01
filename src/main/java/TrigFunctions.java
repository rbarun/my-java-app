import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

public abstract class TrigFunctions {

	public static void main(String[] args) {
	System.out.println("TrigFunction Program");
	System.out.println("Enter an Angle in Degrees: ");
	
	Scanner input = new Scanner(System.in);
	double degrees = input.nextDouble();
	degrees = Math.toRadians(degrees);
	
	NumberFormat decimal = NumberFormat.getNumberInstance();
	
	System.out.println("Sin: " + decimal.format(Math.sin(degrees)));
	System.out.println("Cos: " + decimal.format(Math.cos(degrees)));
	System.out.println("Tan: " + decimal.format(Math.tan(degrees)));

	}

}
