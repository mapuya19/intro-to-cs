import java.util.Scanner;

public class intMonth {
	public static void main(String[] args) {
		// Intialize Scanner object
		Scanner input = new Scanner(System.in);

		// Get user input of integer
		int userInput = input.nextInt();

		// Check if number is valid and print out corresponding month
		if (userInput <= 0 || userInput > 12) {
			System.out.println("That number is invalid!");
		}
		else if (userInput == 1) {
			System.out.println("January");
		}
		else if (userInput == 2) {
			System.out.println("February");
		}
		else if (userInput == 3) {
			System.out.println("March");
		}
		else if (userInput == 4) {
			System.out.println("April");
		}
		else if (userInput == 5) {
			System.out.println("May");
		}
		else if (userInput == 6) {
			System.out.println("June");
		}
		else if (userInput == 7) {
			System.out.println("July");
		}
		else if (userInput == 8) {
			System.out.println("August");
		}
		else if (userInput == 9) {
			System.out.println("September");
		}
		else if (userInput == 10) {
			System.out.println("October");
		}
		else if (userInput == 11){
			System.out.println("November");
		}
		else if (userInput == 12) {
			System.out.println("December");
		}
	}
}