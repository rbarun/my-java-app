import java.util.Scanner;
import java.text.NumberFormat;

public class Exponentiation {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 System.out.println("Enter a base number to raise it to the nth power: ");
		 double base = input.nextDouble();
		 
		 System.out.println("Enter a power to raise this base to: ");
		 double power = input.nextDouble();
		
		 NumberFormat number = NumberFormat.getIntegerInstance();
		int answer = (int)(powerOf(base,power));
		
		System.out.println((int)base + " raised to the " + (int)power + " power = " + answer);
	}
	
	
	 public static double powerOf(double base, double power) {
		 		 
		 double sumOfValues = 1;
//System.out.println("sumOfValues: " + sumOfValues);
//System.out.println("base: " + base);
//System.out.println("***********************");
		 
		 for (int x = 1; x <= (int) power ; x++) {
			 sumOfValues *= base;
//System.out.println("sumOfValues: " + sumOfValues);
//System.out.println("base: " + base);
		 }
		 return (sumOfValues);
	 }
}
