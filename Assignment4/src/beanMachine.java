import java.util.Scanner;
import java.util.Random;

public class beanMachine 
{
	public static void main(String[] args)
	{
		// Initalize Scanner and variables
		int ballCount;
		int slotCount;
		String fullPathArray[][];

		Scanner userInput = new Scanner(System.in);

		// Ask user for number of balls to drop
		System.out.println("Number of balls to drop: ");
		System.out.print("> ");
		ballCount = userInput.nextInt();

		// Ask user for number of slots available
		System.out.println("Number of slots: ");
		System.out.print("> ");
		slotCount = userInput.nextInt();
		System.out.println();

		// Print path of each ball
		System.out.println("Paths:");
		fullPathArray = displayPaths(ballCount, slotCount);

		// Print disposition (frequency of # of times 'R' occurs per ball) as horizontal histogram
		System.out.println("Disposition:");
		displayDisposition(fullPathArray, ballCount, slotCount);
	}


	// Print out path of each ball and store values in two dimensional array
	public static String[][] displayPaths(int ballCounted, int slotCounted)
	{	
		// Initalize Scanner, Random, and variables
		String fullPaths = "";
		Random r = new Random();
		String[][] pathArray = new String[ballCounted][slotCounted];

		// Iterate through each ball
		for (int i = 0; i < ballCounted; ++i)
		{
			String tempSlot = "";

			// Randomly assign L or R to simulate ball turns and store values in two dimensional arrray
			for (int j = 0; j < slotCounted; ++j)
			{
				int probability = r.nextInt(2);

				if (probability == 0)
				{
					tempSlot += "L";
					pathArray[i][j] = "L";
				}

				else if (probability == 1)
				{
					tempSlot += "R";
					pathArray[i][j] = "R";
				}
			}

			fullPaths += tempSlot;
			fullPaths += "\n";
		}

		// Print out full paths and return array
		System.out.println(fullPaths);

		return pathArray;
	}

	// Display disposition (frequency of # of times 'R' occurs per ball) as horizontal histogram
	public static void displayDisposition(String[][] thePathArray, int ballCounted, int slotCounted)
	{
		// Create array to store frequency values
		int[] frequencyArray = new int[slotCounted + 1];

		// Iterate through each ball, check how many times R occurs, and store value in array
		for (int i = 0; i < ballCounted; i++)
		{
			int rightCount = 0;
			String disposTemp = "";

			for (int j = 0; j < slotCounted; j++)
			{
				if (thePathArray[i][j].equals("R"))
					rightCount++;
					
			}

			for (int k = 0; k < frequencyArray.length; k++)
			{
				if (rightCount == k)
					frequencyArray[rightCount]++;
			}

			//System.out.println(rightCount);
		}

		// Iterate through each slot and print histogram 
		for (int i = 0; i < frequencyArray.length; i++)
		{
			
			int counter = 0;

			// Print out "o" based on frequency value in array
			while (counter < frequencyArray[i])
			{
				System.out.print("o");
				counter++;
			}

			System.out.println();
		}
	}
}