import java.util.Scanner;

public class negTerm {
	public static void main(String[] args){
		// Initialize Scanner object
		Scanner input = new Scanner(System.in);

		// Intialize variables
		boolean isNegative = false;
		double max = 0;

		// Loop until user inputs negative number
		while(!isNegative) {
			System.out.print("> ");
			double tempNum = input.nextDouble();

			// Check if input is negative
			if(tempNum < 0) {
				isNegative = true;
			}

			// Check if number is greater than current stored maximum
			else if (tempNum > max) {
				max = tempNum;
			}
		}

		// Print maximum
		System.out.println("Their maximum is " + max);
	}
}