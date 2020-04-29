import java.util.Scanner;

public class noDupes
{
	public static void main(String[] args)
	{
		// Initialize Scanner and variables
		String userInputStrings;
		String finalString;

		Scanner userInput = new Scanner(System.in);

		// Ask user for String input
		System.out.println("Numbers:");
		System.out.print("> ");

		String userInputString = userInput.nextLine(); 

		// Call method to remove duplicates and print
		finalString = removeDupes(userInputString);

		System.out.println("Without duplicates " + finalString);
	}

	public static String removeDupes(String stringInput)
	{
		String removed = "";

		// Iterate over user string
		for (int i = 0; i < stringInput.length(); i++)
		{
			char checker = stringInput.charAt(i);

			// Check if char is whitespace
			if (checker == (' '))
				continue;
			
			// Check if char is duplicate
			else
			{
				int index = stringInput.indexOf(checker, i + 1);

				if (index == -1)
				{
					removed += checker;
					removed += " ";
				}
			}
		}

		return removed;
	}
}