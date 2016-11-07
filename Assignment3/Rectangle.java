package Day4.Assignment3;

public class Rectangle extends Shape {

	private double Area;

	public Rectangle(double length, double breadth) {
		super(length, breadth);
	}

	public void displayArea() {
		Area = getLength() * getBreadth();
		System.out.println("Area of the Rectangle : " + Area);
	}

}
