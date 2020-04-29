import java.util.Scanner;

public class readNums
{
    public static void main(String[] args)
    {
        // Initialize variables and Scanner object
        Scanner input = new Scanner(System.in);
        double userInput = 0;
        InfinitArray infinitArray = new InfinitArray(10);
        int counter = 0;

        System.out.println("Insert numbers: (terminate with negative number)");

        // Ask user for input until negative number is entered
        while (true)
        {
            System.out.print("> ");
            userInput = input.nextDouble();
            if (userInput < 0)
                break;
            else
                infinitArray.add(userInput);

            counter++;
        }

        // Calculations
        double average = infinitArray.average(infinitArray.storage);
        double min = infinitArray.min(infinitArray.storage);
        double max = infinitArray.max(infinitArray.storage);
        double std = infinitArray.std(infinitArray.storage);
        double median = infinitArray.median(infinitArray.storage);

        // Printing
        System.out.println();

        System.out.print("Their average is ");
        System.out.println(average);

        System.out.print("Their min/max is: ");
        System.out.print(min);
        System.out.print("/");
        System.out.println(max);

        System.out.print("Their standard deviation is: ");
        System.out.println(std);

        System.out.print("Their median is ");
        System.out.println(median);
    }
}
