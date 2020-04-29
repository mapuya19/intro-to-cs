import java.lang.Math;
import java.util.Arrays;

public class InfinitArray {
    // Declare variables
    public double[] storage;
    private double[] newStorage;
    private int storageLength;
    private int newLength = 0;
    private int index = 0;

    // Create object
    public InfinitArray(int storageLength)
    {
        storage = new double[storageLength];
        Arrays.fill(storage, -1.0);
        this.storageLength = storageLength;
    }

    // Add value to object
    public void add(double input)
    {
        if (index >= storageLength)
        {
            newLength = storage.length * 2;
            newStorage = new double[newLength];
            Arrays.fill(newStorage, -1.0);

            storageLength = newStorage.length;

            System.arraycopy(storage, 0 , newStorage, 0, storage.length);

            storage = newStorage;
        }

        storage[index] = input;
        index++;
    }

    // Calculate average of values
    public double average(double[] inNums)
    {
        double total = 0.0;
        double quotient = 0.0;
        int counter = 0;

        for (double inNum : inNums) {
            if (inNum != -1.0)
            {
                total += inNum;
                counter++;
            }
        }

        quotient = total / (double)counter;

        return quotient;
    }

    // Find minimum of values
    public double min(double[] inNums)
    {
        double lowest = inNums[0];

        for (double inNum : inNums) {
            if (inNum < lowest && inNum != -1.0)
                lowest = inNum;
        }

        return lowest;
    }

    // Find maximum of values
    public double max(double[] inNums)
    {
        double highest = 0.0;

        for (double inNum : inNums) {
            if (inNum > highest && inNum != -1.0)
                highest = inNum;
        }

        return highest;
    }

    // Find standard deviation of values
    public double std(double[] inNums)
    {
        double std = 0.0;
        int counter = 0;

        for (double inNum : inNums) {
            if (inNum != -1.0)
            {
                counter++;
            }
        }

        double userAvg = average(inNums);
        // System.out.println("=-=-=");
        // System.out.println(userAvg);
        // System.out.println("Counter is: " + counter);

        std = divideAndRoot(sumAndSquare(inNums, userAvg), counter);

        return std;
    }

    // Step in standard deviation calculation
    private static double sumAndSquare(double[] userList, double avgNum)
    {
        double tempSum = 0.0;
        double finalSum = 0.0;

        for (int i = 0; i < userList.length; i++)
        {
            if (userList[i] != -1.0)
            {
                tempSum = Math.pow(userList[i] - avgNum, 2);
                finalSum += tempSum;
                tempSum = 0.0;
            }
        }

        // System.out.println(finalSum);

        return finalSum;
    }

    // Step in standard deviation calculation
    private static double divideAndRoot(double sumSquared, int userCounted)
    {
        double finalDivide = 0.0;
        double finalRoot = 0.0;

        finalDivide = sumSquared / ((double)userCounted);
        finalRoot = Math.sqrt(finalDivide);

        return finalRoot;
    }

    // Find median
    public double median(double []inNums)
    {
        double[] medianArray;
        double total = 0.0;
        int posCounter = 0;
        double median;

        for (double inNum : inNums)
        {
            if (inNum != -1.0)
            {
                total += inNum;
                posCounter++;
            }
        }

        medianArray = new double[posCounter];

        for (int i = 0; i < medianArray.length; i++)
        {
            if (inNums[i] != -1)
                medianArray[i] = inNums[i];
        }

        Arrays.sort(medianArray);

        if (posCounter % 2 == 0)
        {
            double sumOfMiddleElements = (medianArray[posCounter / 2] + medianArray[posCounter / 2 - 1]);

            // calculate average of middle elements
            median = sumOfMiddleElements / 2.0;
        }

        else
            median = medianArray[posCounter / 2];

        return median;
    }

    // Print object values (for testing)
    public void printStorage(double []inNums)
    {
        for (double inNum : inNums)
        {
            System.out.println(inNum);
        }
    }

}
