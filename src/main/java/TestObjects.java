
public class TestObjects {

	public static void main(String[] args) {
		System.out.println("Test");
		Circle c1 = new Circle(5);
		double value = c1.radius1;
		System.out.println("value = " + value);
		
		Circle c2 = new Circle(15);
		System.out.println("PI1 : " + c1.PI1);
		System.out.println("PI1 : " + c2.PI1);
		
		c1.PI1 = 4.12;
		
		System.out.println("PI1 : " + c1.PI1);
		System.out.println("PI1 : " + c2.PI1);
		
		System.out.println("PI1 : " + c1.getRadius());
		System.out.println("PI1 : " + c2.getRadius());
		
		
		Circle c3 = c1;
		
		System.out.println("Circle 1 : " + c1);
		System.out.println("Circle 2 : " + c2);
		System.out.println("Circle 3 : " + c3);
		
		for (int i = 0; i <= 10; i++) {
			Circle c4 = new Circle();
			// System.out.println("Circle 4 : " + c4);
			
		}
		System.out.println("PI1 : " + c1.PI1);
		
		

	}
	


}
