
public class TestingCircleClass {

	public static void main(String[] args) {
		Circle spot = new Circle(2);
		
		spot.setRadius(1);
		
		System.out.println("Circle Radius: " + (spot.getRadius()));
		System.out.println("Circle area: " + (spot.getArea()));
		
	}
}
