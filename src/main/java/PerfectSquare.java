import java.util.Scanner;
import java.lang.Math;

import java.text.NumberFormat;
public class PerfectSquare {

	public static void main(String[] args) {

		System.out.println("Perfect Square Progam");
		Scanner input = new Scanner(System.in);
		System.out.println("Is This Number A Perfect Square?: ");
		
		int number = input.nextInt();
		int sqrtnmbr = (int)(Math.sqrt(number)+0.5);
		
		if (Math.pow(sqrtnmbr,2) == number) {
	System.out.println("Yes, this is a perfect square!");
		}else{
		System.out.println("No, this is not a perfect square!");
		int roundednmbr = (int) (sqrtnmbr + 0.5);
		NumberFormat integer = NumberFormat.getIntegerInstance();
		System.out.println("But this is the closest there is: " + integer.format(Math.pow(roundednmbr,2)));
		}
	}

}
