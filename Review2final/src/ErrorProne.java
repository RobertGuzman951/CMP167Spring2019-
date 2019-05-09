import java.util.Scanner;
	
public class ErrorProne{
 public static void main(String[] args) {
 Scanner scnr = new Scanner(System.in);
 int gradeSum = 0;
 int gradeCount = 0;
 int grade = scnr.nextInt();
 
 while (grade >= 0) {
 gradeSum += grade;
 gradeCount++;
 grade = scnr.nextInt();
 }

 double gradeAverage = gradeSum/gradeCount;
 
 System.out.println("Number of Grades = " + gradeCount);
 System.out.println("Average of Grades = " + gradeAverage);
}
}