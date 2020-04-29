import java.lang.Math;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    public QuadraticEquation() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b =  b;
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double getDiscriminant(int a, int b, int c) {
        int bSquared = b * b;
        int fourAC = 4 * a * c;
        int discriminant = bSquared - fourAC;

        return discriminant;
    }

    public boolean hasRealSolution(double discriminant) {
        boolean isPositive = false;

        if (discriminant > 0)
            isPositive = true;

        return isPositive;
    }

    public boolean isQuadratic (int a) {
        boolean isNonZero = false;

        if (a != 0)
            isNonZero = true;

        return isNonZero;
    }

    public boolean hasDuplicatedSolution(double discriminant) {
        boolean isZero = false;

        if (discriminant == 0)
            isZero = true;

        return isZero;
    }

    public double getSolution1(double discriminant, int a, int b) {
        double sqrt = Math.sqrt(discriminant);
        double twoA = (2 * a);
        double combined = -b + sqrt;
        double solution1 = combined / twoA;

        return solution1;
    }

    public double getSolution2(double discriminant, int a, int b) {
        double sqrt = Math.sqrt(discriminant);
        double twoA = (2 * a);
        double combined = -b - sqrt;
        double solution2 = combined / twoA;

        return solution2;
    }
}
