package Day4.Assignment3;

public class Triangle extends Shape {

	private double Area;

	public Triangle(double length, double breadth) {
		super(length, breadth);
		// TODO Auto-generated constructor stub
	}

	public void displayArea() {
		Area = 0.5 * getLength() * getBreadth();
		System.out.println("Area of the Triangle : " + Area);
	}
}