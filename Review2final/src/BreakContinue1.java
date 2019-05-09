
public class BreakContinue1 {

	public static void main(String[] args) {
		for ( int i = 0 ; i <= 20 ; i += 5 ) {
			 for ( int j = 5; j <= 25 ; j += 5 ) {
			 if ( i < j) {
			 break;
			 } else if ( i == j) {
			 continue;
			 }
			 System.out.println("i = " + i + " : " + "j = " + j);
			 }
			 }
			 }
			}
