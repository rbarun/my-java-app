import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//Does this actually work?: int sumOfValues, counter = 1;
		int sumOfValues = 1;
		int counter = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to calculate its factorial");
		int number = input.nextInt();
		input.close();
		
		sumOfValues = number;
		counter = number;
		
		if (number < 0 ) {
		System.out.println("Cannot Calculate \"Negative\" Factorials");	
		}else{
		
			for (int x = 1; x < counter ; x++) {
				number--;
				sumOfValues *= number;
				System.out.println("Value Each Iteration of number: " + number);
				System.out.println("Value Each Iteration of sumOfValues: " + sumOfValues);
				System.out.println();
			}
	}
		System.out.println();
		System.out.println("The Factorial of " + counter + " is " + sumOfValues + ".");
}
}


