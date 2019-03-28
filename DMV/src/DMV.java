/*
 * Robert Guzman
 * 3/28/2019
 * week 9
 * Dmv generater
 */
import java.util.Scanner;
public class DMV {

	public static void generateDL(int age,boolean testpass) {
		if (true && age>=17) {
			System.out.println("DL generated");
	}
		else
			System.out.println("DL cannot be generated");
	}
	public static int calulateExperationData(int yearsGenerated) {
		return yearsGenerated+10;
	}
	
	public static void main(String[] args) {
		generateDL(14, false); 
		System.out.println(calulateExperationData(2011));
		
		
		}
	}


