import java.util.*;

public class WAC {

	private static final String String = null;

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++)
		{	
			Scanner input = new Scanner(System.in);
			System.out.println("Enter letter: ");
			String iinput = input.nextLine();
		
			int num = 0;
			String found = "";
			String[] alphabet = {"A", "B","C", "D","E", "F","G", "H","I", "J","K", "L","M", "N","O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
			
			for (int j = 0; j < 26; j++ ){
				if(iinput.equals(alphabet[j])){
					found = alphabet[j];
					num = j + 1;
					break;
				}
			}
			
			if(found.equals("A") || found.equals("B") || found.equals("C") || found.equals("D")|| found.equals("E")){
				num *= 2;
				
			}
			if(found.equals("F") || found.equals("G") || found.equals("H") || found.equals("I") || found.equals("J")){
				num %= 3;
				num *= 5;
				
			}
			if(found.equals("K") || found.equals("L") || found.equals("M") || found.equals("N") || found.equals("O")){
				num /= 4;
				num *= 8;
				
			}
			//Multiply the sum of the digits of its numerical value by 10
			if(found.equals("P") || found.equals("Q") || found.equals("R") || found.equals("S") || found.equals("T")){
				
				
					if (num < 20) {
						num = num - 10;	
						num ++;
					} else {
						num = 2;
					}
					num *= 10;
					
				}
			
			//Find the largest integer factor of its numerical value less than the value itself. Multiply it by 12. 
			
		if(found.equals("U") || found.equals("V") || found.equals("W") || found.equals("X") || found.equals("Y") || found.equals("Z")){
			int factor = 0;	
			
			if (found == "W") {
				num = 1;
			}else {
			for (int n = 2; n <= 6; n++) {
				if (num % n == 0){
					factor = num/n;
					break;
				}
			}
			
			num *= 12;
			
		}
	}
		if (num <= 26) {
				int index = num - 1;
				System.out.println(alphabet[index]);
		}
		else{
			/*int factor1 = 0;
			for (int q = 21; q <= 26; q++) {
				if (num % q == 0){
					factor1 = num/(num/q);
					break;
					
			}
			}
			System.out.println(alphabet[factor1+1]);*/
			
			int mod = num % 26;
			
			System.out.println(alphabet[mod]);
			
		}		
	}
}	
}