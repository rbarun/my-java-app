import java.lang.Math;

public class ForLoop {

	public static void main(String[] args) {
	
		int twoi;
		int pow; 
		
		for(int i = 0; i <= 10; i++) {
		twoi = 2*i;
		pow = (int) Math.pow(twoi, i);
	System.out.println("i = " + i);
	System.out.println("2 x i = " + twoi);
	System.out.println("(2 x i)^i = " + pow);
	System.out.println();
	}
  }
}