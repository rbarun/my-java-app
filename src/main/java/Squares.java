import java.util.Scanner;

public class Squares {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("To how many indexes (starting from 0) would you like to square?");
		int num = input.nextInt();
		
		int[] squares = new int [num];
		
		for (int x = 0; x< num; x++){
			squares[x] = x*x;
		}
		System.out.println();
		System.out.println("Here are the squares of the indexes from 0 to " + num + " :");
		for (int element : squares){
			System.out.println(element);
		}
		
	}

}
