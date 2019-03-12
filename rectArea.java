package Area;
/*
 *name: Robert Guzman
 * Area.java 
 * data:3/12/19
 * implements area functions
 */
import java.util.Scanner;
public class rectArea{

public static void rectArea() {
	
		int width, length, area;
		System.out.println("Let's calculate rect area");
		System.out.println("Enter length: ");
		length = keyboard.nextInt();
		System.out.println("Enter width: ");
		width= keyboard.nextInt();
		area = length * width;
		System.out.println("The rect area is: "+area);
		}
//circle area
/*
 * inputs: radius
 * process: area =pi*r*r
 * output: area
 */
public static void circleArea(){
	double radius, area;
	System.out.println("Area of the circle");
	System.out.println("Enter radius:");
	radius = keyboard.nextDouble();
	area = Math.PI * radius * radius;
	System.out.println("Area of the circle is: "+area);
}
//triangle area
	/*
	 * input:height and base
	 * process: area= height * base / 2
	 */
	public static void triArea(){
		double height, base, area;
		System.out.println("Area of the triangle");
		System.out.println("Enter height:");
		Scanner keyboard;
		height = keyboard.nextDouble();
		System.out.println("Enter base:");
		base = keyboard.nextDouble();
		area = (height * base) / 2;
		System.out.println("Area of the triangle is: "+area);
}
}

