import java.util.Scanner;
import java.util.Random;

public class RSP {
	public static void main(String[] args) {
		// Initialize variables and Scanner object
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		String userChoice = "";
		String userChoiceLowered = "";
		String userChoiceFull = "";
		String computerChoiceFull = "";
		boolean isValid = false;
		int userChoiceNum = 0;
		int computerChoiceNum = 0;

		// Print banner and user choices
		System.out.println("=========================================");
		System.out.println("Welcome to the Rock-Paper-Scissors game!");
		System.out.println("=========================================");

		System.out.println();

		System.out.println("Select your element:");
		System.out.println("	R/r - rock");
		System.out.println("	P/p - paper");
		System.out.println("	S/s - scissors:");

		// Force valid user input
		while (isValid == false) {
			System.out.print("> ");
			userChoice = s.next();
			userChoiceLowered = userChoice.toLowerCase();
			if (userChoiceLowered.equals("r") || userChoiceLowered.equals("p") || userChoiceLowered.equals("s")) {
				isValid = true;
			}
		}

		// Print user choice art and assign values for comparison
		if (userChoiceLowered.equals("r")) {
			userChoiceNum = 0;
			userChoiceFull = "rock";
			System.out.println(" __.--.--._");
			System.out.println("/  | _|  | `|");
			System.out.println("|  |` |  |  |");
			System.out.println("| /’--:--:__/");
			System.out.println("|/  /      |");
			System.out.println("(  ’ \\     |");
			System.out.println(" \\    `.  /");
			System.out.println("  |      |");
			System.out.println("  |      |");
		} 
		else if (userChoiceLowered.equals("p")) {
			userChoiceNum = 1;
			userChoiceFull = "paper";
			System.out.println("    --.--.");
			System.out.println("   |  |  |");
			System.out.println(".\"\"|  |  |_");
			System.out.println("|  |  |  | `|");
			System.out.println("|  | _|  |  |");
			System.out.println("|  |` )  |  |");
			System.out.println("| /’  /     /");
			System.out.println("|/   /      |");
			System.out.println("(   ’ \\     |");
			System.out.println("\\      `.  /");
			System.out.println(" |        |");
			System.out.println(" |        |");
		} 
		else if (userChoiceLowered.equals("s")) {
			userChoiceNum = 2;
			userChoiceFull = "scissors";
			System.out.println(".\"\".   .\"\",");
			System.out.println("|  |  /  /");
			System.out.println("|  | /  /");
			System.out.println("|  |/ .--._");
			System.out.println("|    _|  | `|");
			System.out.println("|  /` )  |  |");
			System.out.println("| /  /’--:__/");
			System.out.println("|/  /      |");
			System.out.println("(  ’ \\     |");
			System.out.println(" \\    `.  /");
			System.out.println("  |      |");
			System.out.println("  |      |");
		} 

		System.out.println("Player");
		System.out.println();

		// Generate computer choice and assign values for comparison
		computerChoiceNum = r.nextInt(3);

		if (computerChoiceNum == 0) {
			computerChoiceFull = "rock";
			System.out.println(" __.--.--._");
			System.out.println("/  | _|  | `|");
			System.out.println("|  |` |  |  |");
			System.out.println("| /’--:--:__/");
			System.out.println("|/  /      |");
			System.out.println("(  ’ \\     |");
			System.out.println(" \\    `.  /");
			System.out.println("  |      |");
			System.out.println("  |      |");
		}
		else if (computerChoiceNum == 1) {
			computerChoiceFull = "paper";
			System.out.println("    --.--.");
			System.out.println("   |  |  |");
			System.out.println(".\"\"|  |  |_");
			System.out.println("|  |  |  | `|");
			System.out.println("|  | _|  |  |");
			System.out.println("|  |` )  |  |");
			System.out.println("| /’  /     /");
			System.out.println("|/   /      |");
			System.out.println("(   ’ \\     |");
			System.out.println("\\      `.  /");
			System.out.println(" |        |");
			System.out.println(" |        |");
		}
		else if (computerChoiceNum == 2) {
			computerChoiceFull = "scissors";
			System.out.println(".\"\".   .\"\",");
			System.out.println("|  |  /  /");
			System.out.println("|  | /  /");
			System.out.println("|  |/ .--._");
			System.out.println("|    _|  | `|");
			System.out.println("|  /` )  |  |");
			System.out.println("| /  /’--:__/");
			System.out.println("|/  /      |");
			System.out.println("(  ’ \\     |");
			System.out.println(" \\    `.  /");
			System.out.println("  |      |");
			System.out.println("  |      |");
		}

		System.out.println("Computer");
		System.out.println();

		// Check if user won, computer won, or if tied
		if (userChoiceNum < computerChoiceNum) {
			System.out.println("Computer won! (" + computerChoiceFull + " beats " + userChoiceFull + ")");
		}
		else if (userChoiceNum > computerChoiceNum) {
			System.out.println("Player won! (" + userChoiceFull + " beats " + computerChoiceFull + ")");
		}
		else {
			System.out.println("It was a tie. Oh well.");
		}
	}
}