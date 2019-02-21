/*
 * author:Robert Guzman
 * data:2/21/2019
 * desc:checking user age
 */
import java.util.Scanner;
public class Agetitle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userAge;
		Scanner scnr = new Scanner(System.in);
		userAge = scnr.nextInt();
		
		if (userAge > 25) {
			System.out.println("I'm an Adult");
		}
		else if (userAge >= 19   ) {
			System.out.println("I'm a Young Adult");
		}
		else  {
			System.out.println("I'm a Teen");
			
		}
	}

}
