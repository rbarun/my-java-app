import java.util.Scanner;

public class MetricConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What would you like to convert?");
		System.out.println("Select the option with the corresponding number.");
		System.out.println("1. Inches to Centimeters");
		System.out.println("2. Feet to Centimeters");;
		System.out.println("3. Yards to Meters");
		System.out.println("4. Miles to Kilometers");
		System.out.println("5. Centimeters to Inches");
		System.out.println("6. Centimeters to feet");
		System.out.println("7. Meters to Yards");
		System.out.println("8. Kilometers to Miles");
		
		int choice = input.nextInt();
				
		if (choice == 1) {
			inchesToCentimeters();
			
		} else if (choice == 2) {
			feetToCentimeters();
		
		} else if (choice == 3) {
			yardsToMeters();
		
		} else if (choice == 4) {
			milesToKilometers();
		
		} else if (choice == 5) {
			centimetersToInches();
		
		} else if (choice == 6) {
			centimetersToFeet();
		
		} else if (choice == 7) {
			metersToYards();
		
		} else if (choice == 8) {
			kilometersToMiles();}
		
		
		}
		

		public static void inchesToCentimeters() {
			Scanner input = new Scanner(System.in);
			System.out.println("How many inches?");
			double inches = input.nextDouble();
			double centimeters = inches*2.54;
			System.out.println(inches + " inches " + " = " + centimeters + " centimeters " );
		
	}


		public static void feetToCentimeters() {
			Scanner input = new Scanner(System.in);
			System.out.println("How many feet?");
			double feet = input.nextDouble();
			double centimeters = feet*30;
			System.out.println(feet + " feet " + " = " + centimeters + " centimeters " );

}


		public static void yardsToMeters() {
			Scanner input = new Scanner(System.in);
			System.out.println("How many yards?");
			double yards = input.nextDouble();
			double meters = yards*0.91;
			System.out.println(yards + " yards " + " = " + meters + " meters " );

}

		public static void milesToKilometers() {
			Scanner input = new Scanner(System.in);
			System.out.println("How many miles?");
			double miles = input.nextDouble();
			double kilometers = miles*1.6;
			System.out.println(miles + " miles " + " = " + kilometers + " kilometers " );

}


		public static void centimetersToInches() {
			Scanner input = new Scanner(System.in);
			System.out.println("How many centimeters?");
			double centimeters = input.nextDouble();
			double inches = centimeters/2.54;
			System.out.println(centimeters + " centimeters " + " = " + inches + " inches " );

}
		public static void centimetersToFeet() {
			Scanner input = new Scanner(System.in);
			System.out.println("How many centimeters?");
			double centimeters = input.nextDouble();
			double feet = centimeters/30;
			System.out.println(centimeters + " centimeters " + " = " + feet + " feet " );
}


		public static void metersToYards() {
			Scanner input = new Scanner(System.in);
			System.out.println("How many meters?");
			double meters = input.nextDouble();
			double yards = meters/0.91;
			System.out.println(meters + " meters " + " = " + yards + " yards " );


}

		public static void kilometersToMiles() {
			Scanner input = new Scanner(System.in);
			System.out.println("How many kilometers?");
			double kilometers = input.nextDouble();
			double miles = kilometers/1.6;
			System.out.println(kilometers + " kilometers " + " = " + miles + " miles " );

}
}