package Day4.Assignment3;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Length : ");
		double length = scan.nextDouble();
		System.out.println("Enter the Breadth : ");
		double breadth = scan.nextDouble();
		scan.close();

		Triangle objT = new Triangle(length, breadth);
		objT.displayArea();

		Rectangle objR = new Rectangle(length, breadth);
		objR.displayArea();

	}
}
