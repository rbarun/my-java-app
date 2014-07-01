import java.util.Scanner;

public class Hacking {

	public static void main(String[] args) {
		String x = "hi";
		Scanner input = new Scanner(System.in);
		String words;
		do{	
			System.out.println("Type anything; it will be repeated: ");
			words = input.next();
			System.out.println(words);
			System.out.println();
		}
			while (!words.equals(x));
		System.out.println("Good job, you found the password!");
			
		}
	
	}


