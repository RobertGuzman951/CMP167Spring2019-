import java.util.Scanner;
	public class Game1 {
		public static void main(String[] args) {
			final int MAX_PLAYERS = 5;
			int[] jerseyNums = new int[MAX_PLAYERS];
			int[] playerRating = new int[MAX_PLAYERS];
			Scanner scnr = new Scanner(System.in);
			
 // read in the players uniform numbers and their ratings
			for (int i = 0; i < MAX_PLAYERS; i++) {
 
 // prompt and get player's jersey number
			System.out.print("Enter player " + (i+1) + "'s jersey number: ");
			int jersey = scnr.nextInt();
			jerseyNums[i] = jersey;
			System.out.println();
 
// prompt and get player's rating
 System.out.print("Enter player " + (i+1) + "'s rating: ");
 int rating = scnr.nextInt();
 playerRating[i] = rating;
 System.out.println();
 System.out.println();
 }
 boolean done = false;
 String command = scnr.nextLine();
 
 // loop until user quits
 while (!done) {
 
	 // display menu
 System.out.println("MENU");
 System.out.println("o - Output roster");
 System.out.println("u - Update player rating");
 System.out.println("a - Output players above a rating");
 System.out.println("q - Quit");
 System.out.println("");
 System.out.println("Choose an option: ");
 // get user selection
 command = scnr.nextLine();
 if (command.contains("q") || command.contains("Q")) {
 // user selected Quit
 done = true;
 } else if (command.contains("o") || command.contains("O")) {
 // user selected Output roster
 // display the roster
 System.out.println("ROSTER");
 for (int i = 0; i < MAX_PLAYERS; i++) {
 System.out.println("Player " + (i + 1) +
 " -- Jersey number: " + jerseyNums[i] +
 ", Rating: " + playerRating[i]);
 }
 System.out.println();
 } else if (command.contains("u") || command.contains("U")) {
 // user select Update player rating
 // ask for player jersey numbers

 System.out.print("Enter a jersey number: ");
 int jersey = scnr.nextInt();
 // find the player with specified jersey number
 int i;
 for (i = 0; i < MAX_PLAYERS; i++) {
 if (jerseyNums[i] == jersey) {
 break;
 }
 }
 // prompt for new rating
 System.out.print("Enter new rating for player: ");
 int rating = scnr.nextInt();
 // set the new rating
 playerRating[i] = rating;
 // clear any extra characters in the input stream
 command = scnr.nextLine();
 } else if (command.contains("a") || command.contains("A")) {
 // user selected Output players above a rating
 // prompt for the rating
 System.out.println("Enter a rating: ");
 int rating = scnr.nextInt();

 // display all players above specified rating
 System.out.println("ABOVE " + rating);
 for (int i = 0; i < MAX_PLAYERS; i++) {
 if (playerRating[i] > rating) {
 System.out.println("Player " + (i + 1) +
 " -- Jersey number: " + jerseyNums[i] +
 ", Rating: " + playerRating[i]);
 }
 }
 System.out.println();
 // clear any extra characters in the input stream
 command = scnr.nextLine();
 }
 }
 scnr.close();
 return;
 }
}
