import java.util.ArrayList;
import java.util.Collections;

public class Histogram {
    ArrayList<Double> numbers;
    public int totalSize;

    public static void main(String[] args) {
        Histogram hist = new Histogram(15);

        for (int i = 0; i < hist.totalSize; i++) {
            hist.add(i);
            i++;
        }

        hist.print(5);
    }

    public Histogram() {
        numbers = new ArrayList<Double>(10);
        totalSize = 10;
    }

    public Histogram(int valueCount) {
        numbers = new ArrayList<Double>(valueCount);
        totalSize = valueCount;
    }

    public void add(double value) {
        numbers.add(value);
    }

    public void print(int nBins) {
        double max = Collections.max(numbers);
        double min = Collections.min(numbers);
        double range = max - min;

        // Unsure how to create intervals
        int binSize = nBins;
        int binCount = (int) (totalSize / binSize);

        // Iterate over each bin
        for (int i = 0; i < binCount; i++) {
            int binMeasure = binSize;

            // Print data count within bin
            for (int j = 0; j < binMeasure; j++) {
                if (numbers.get(j) < binMeasure) {
                    System.out.print("=");
                }
                j++;
            }
            System.out.print("\n");
            binMeasure += binSize;
        }
    }
}
