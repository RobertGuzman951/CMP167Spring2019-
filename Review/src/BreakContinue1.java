
public class BreakContinue1 {
 public static void main(String[] args) {
	 for (int i = 0; i <= 6; i += 2) {
		 int j = 6;
	 while (j >= 0) {
 
		 if (i == j) {
             break;
 } 
		 else if (i > j--) {
 continue;
 }
 System.out.println("i = " + i + " : " + "j = " + j);
 j--;
 }
 }
 }
}