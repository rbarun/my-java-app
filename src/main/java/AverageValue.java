import java.util.Scanner;

public class AverageValue {

	public static void main(String[] args) {
		final int SENTINEL = -100;
		int newValue;
		int numValues = 0;
		int sumOfValues = 0;
		double avg;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculate Average Program");
		System.out.println("Enter a Value [Press SENTINEL to Quit]: ");
		newValue = input.nextInt();
		
		
		while (newValue != SENTINEL) {
			numValues ++;
			sumOfValues += newValue;
			System.out.println("Enter a Value [Press SENTINEL to Quit]: ");
			newValue = input.nextInt();
			
			}
		input.close();
		avg = (double) sumOfValues/(double)numValues;
		System.out.println("Average of Values is: " + avg);
	}
}

