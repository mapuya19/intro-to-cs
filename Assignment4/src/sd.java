import java.util.Scanner;

public class sd 
{

	public static void main(String[] args)
	{
		// Initialize Scanner and variables
		int userCountNums;
		double userArray[];
		double userAvg;
		double finalSD;

		Scanner userInput = new Scanner(System.in);

		// Ask user for how many numbers
		System.out.println("How many numbers:");
		System.out.print("> ");

		userCountNums = userInput.nextInt();

		// Store variables and calculate average
		userArray = userNums(userCountNums, userInput);
		userAvg = calcAvg(userArray, userCountNums);

		// Use methods to calcualte final standard deviation
		finalSD = divideAndRoot(sumAndSquare(userArray, userAvg), userCountNums);

		// Print standard deviation
		System.out.println("Their std is " + finalSD);
		
	}

	// Store user input in array
	public static double[] userNums(int userCounted, Scanner input)
	{
		double[] userArray = new double[userCounted];

		System.out.println("Insert " + userCounted + " numbers");

		for (int i = 0; i < userCounted; ++i)
		{
			System.out.print("> ");
			userArray[i] = input.nextDouble();
		}

		return userArray;

	}

	// Calculate average of array values
	public static Double calcAvg(double[] userList, int userCounted)
	{
		double total = 0.0;
		double avg = 0.0;
		
		for (int i = 0; i < userList.length; i++)
		{
			total += userList[i];
		}

		avg = total / (double)userCounted;

		return avg;
	}


	// Calculate summation (a step in the standard deviation equation)
	public static Double sumAndSquare(double[] userList, double avgNum)
	{
		double tempSum = 0.0;
		double finalSum = 0.0;

		for (int i = 0; i < userList.length; i++)
		{
			tempSum = Math.pow(userList[i] - avgNum, 2);
			finalSum += tempSum;
			tempSum = 0.0;
		}

		return finalSum;
	}

	// Divide summation by N and take square root (assuming values are of population, not sample)
	public static Double divideAndRoot(double sumSquared, int userCounted)
	{
		double finalDivide = 0.0;
		double finalRoot = 0.0;

		finalDivide = sumSquared / ((double)userCounted);
		finalRoot = Math.sqrt(finalDivide);

		return finalRoot;
	}

}