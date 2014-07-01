/*
 * Adharsh Babu
 * Quardatic Formula Solver
 * 6/23/14
 */

import java.lang.Math;
import java.util.Scanner;
import java.text.NumberFormat;

public class QuadraticFormula {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Quadratic Formula Solver:");
		
		System.out.println("a: ");
		double a = input.nextDouble();
		
		System.out.println("b: ");
		double b = input.nextDouble();
		
		System.out.println("c: ");
		double c = input.nextDouble();
		
		NumberFormat number = NumberFormat.getIntegerInstance();
		
// (-b +/- Square root(b^2 - 4ac)/2a)
		System.out.println("x = " + number.format((-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/2*a ));
		System.out.println("x = " + number.format((-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/2*a ));
	}

}

