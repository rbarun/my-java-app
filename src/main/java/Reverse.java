import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to count down from: ");
		int num = input.nextInt();
		
		int[] countdown = new int [num];
	
		for (int x = 0; x < num; x++){
			countdown[x] = num - x;
		}
		
		System.out.println();
		System.out.println("Prepare for lift off in...");
		for (int element : countdown) {
			System.out.println(element);
		}
		System.out.println("0");
	}
}