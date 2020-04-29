import java.util.Scanner;

public class avgNum {
	public static void main(String[] args) {
		// Initialize Scanner object
		Scanner input = new Scanner(System.in);

		// Intialize variables
		double sum = 0;
		
		// Ask user for iteration count
		System.out.print("How many numbers: \n> ");
		double iterations = input.nextInt();

		// User inputs numbers to be averaged
		System.out.println("Insert " + iterations + " numbers:");
		for(int i=0; i < iterations; i++) {
			System.out.print("> ");
			double tempNum = input.nextDouble();
			sum += tempNum;
		}

		// Calculate average
		double average = sum / iterations;

		// Print average
		System.out.println("Their average is " + average);
	}
}