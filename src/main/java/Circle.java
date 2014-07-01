/**
 * Circle class
 */

public class Circle {
	private static final double PI = 3.14;
//Now PI is a class variable.
	public static  double PI1 = 3.14;
//Now PI1 is an instance variable.
	private double radius;
//Now radius is a class variable.
	public double radius1;
//Now radius1 is an instance variable.

/**
 * constructor
 * pre: none
 * post: A Circle object created. Radius initialized to 1.
 */
	public Circle() {
		radius = 1;          //default radius
	}

/**
 * constructor
 * pre: none
 * post: A Circle object created. Radius initialized to 1.
 * When a class contains more than one constructor,
 * the compiler uses the number and types of parameters to determine which constructor to execute.
 */
	public Circle(double r){
		radius = r;
	}
	
/**
 * Changes the radius of the circle.
 * pre: none
 * post: Radius has been changed.
 */
	public void setRadius(double newRadius) {
		radius = newRadius;
	}

/**
 * Calculates the area of the circle.
 * pre: none
 * post: The area of the circle has been returned. 
 */
	public double getArea() {
		double circleArea;
		
		circleArea = PI*radius*radius;
		return(circleArea);
		
	}
	
/**
 * Returns the radius of the circle.
 * pre: none
 * post: The radius of the circle has been returned.
 */
	
	public double getRadius() {
		return(radius);
		
	}
	
	public String toString(){
		//String fromSuper = super.toString();
		//System.out.println(fromSuper);
		return "called FromToSting";
		
	}
}