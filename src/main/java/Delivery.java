import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
		
		System.out.println("Delivery Program");
		System.out.println("Please give dimensions for package with 100 units cubed ...");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Length: ");
		int length = input.nextInt();
		
		System.out.println("Width: ");
		int width = input.nextInt();
		
		System.out.println("Height: ");
		int height = input.nextInt();
		
		int volume = length*width*height;
		
		if (volume <= 100){
		System.out.println("It fits!");
		}else{
			System.out.println("No, its too large!");
		}
	}

}
