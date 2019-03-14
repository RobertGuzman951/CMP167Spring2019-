package week7;
/*
 *name: Robert Guzman
 * Area.java 
 * data:3/14/19
 * implements area functions
 */
import java.util.Scanner;
public class Area{
	static Scanner keyboard = new Scanner(System.in);
    public static int getrectArea(int width, int length) {
	return width * length;
		}
//circle area
/*
 * inputs: radius
 * process: area =pi*r*r
 * output: area
 */
public static double Area() {
	Scanner keyboard = new Scanner(System.in);
	public static int getcircleArea(int radius, int  Math.PI){
		return Math.PI * radius * radius;
	}
//triangle area
	/*
	 * input:height and base
	 * process: area= height * base / 2
	 */
	public static void triArea(){
		Scanner keyboard = new Scanner(System.in);
		public static int gettriArea(int height, int base, int 2) {
			return height * base / 2;
		}
	}
}
	public static void main(String[] args) {
		rectArea();
		circleArea();
		System.out.println("Enter width and length: ");
		int width = keyboard.nextInt();
		int length = keyboard.nextInt();
		
		int area = getrectArea(width, length);
		System.out.println("Area:" + area);
	}
}

	

