/*
 * name: Robert Guzman
 * Data:3/7/19
 * week 6:Classwork
 * 1)using for loop prints enter number to the power of 2.
 * 2)using for loop prints average of entered numbers.
 * 3)using for loop prints the factorial of entered numbers.
 */
import java.util.Scanner;
public class ForLoop {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);

System.out.print("Enter a number: ");
int n = in.nextInt();
int power = 1;
for (int i = 1; i <= n; i++) {
System.out.println(power);
power = power*2;
}

System.out.println("Enter numbers for average: ");
int y = in.nextInt();
int average = 0;
for (int i = 1; i <= y; i++) 
	average += i;
int total = average/y;
System.out.println("The average equals " + average);
			

System.out.println("Enter numbers for factorial: ");
int b = in.nextInt();
int fact = 1;
for (int i = 1; i <= b; i++)
        fact *= i;
System.out.printf("The factorial of %d is %", n ,fact);
}
}


