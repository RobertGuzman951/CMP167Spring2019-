/*
 * Robert Guzman
 * 3/19/19
 * Name greeting
 * Review
 */
import java.util.Scanner;
public class Name {
static Scanner kb = new Scanner(System.in);
	public static void greet() {
		System.out.print("Hello");
	}
	public static void title() {
		greet();
		System.out.println("Enter your name:");
		String name = kb.next();
		if(name.endswith("e") || name.endsWith(a)) {
			System.out.println("Miss "+ name);
		}
			else {
				System.out.println("Mister "+ name);
			}
	}
		public static void greetpeople(int numofPeople) {
			for(int i=0; i<numofPeople;i++) {
				title();
			}
			public static void main(String[] args) {
				System.out.println("Enter number of Peopple");
				int num = kb.nextInt();
				greetpeople(num);
			}
		

	}
}
