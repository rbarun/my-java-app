
public class transversingArrays {

	public static void main(String[] args) {
		
		String[] authors = {"Michi Kaku", "George Orwell", "Dr.Suess"};
		int[] randomNumbers = {5, 10, 4};
		randomNumbers[0] = 33;
		randomNumbers[1] = 44;
		randomNumbers[2] = 55;
		
		boolean[] conditions1 = new boolean [5];
		
		
		boolean conditions2[] = {true, false, true, true, false};
	
		//System.out.println(randomNumbers.length);
		
		for (int x = 0; x < randomNumbers.length; x++) {
			System.out.println(randomNumbers[x]);
		}
		System.out.println();
		for (String element : authors){
			System.out.println(element);
		}
		System.out.println();
		for (boolean element : conditions1){
			System.out.println(element);
		}
		System.out.println();
		for (boolean element : conditions2){
			System.out.println(element);
		}
	}

}
