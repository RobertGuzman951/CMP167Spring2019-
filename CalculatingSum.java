/*
 *Name:Robert Guzman 
 *Data:3/5/2019
 *Descr:Calculating the sum of a number 
 */
import java.util.Scanner;
public class CalculatingSum {

public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);
	int n;
	int sum = 0;
	int counter = 0;
	
	System.out.println("Enter a value of n: ");
    n =scnr.nextInt();
    
    while (counter < n ) {
       counter ++;
       sum += counter;
    }
   System.out.println("The sum is " + sum);
   }

}
