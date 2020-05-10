public class Triangle {
    private int base;
    private int height;
    private int side1;
    private int side2;

    public Triangle() {
        base = 0;
        side1 = 0;
        side2 = 0;
        height = 0;
    }

    public Triangle(int base, int height) {
        this.base = base;
        this.side1 = base;
        this.side2 = base;
        this.height = height;
    }

    public Triangle(int base, int side1, int side2) throws IllegalTriangleException {
        if (base + side1 > side2)
            throw new IllegalTriangleException("Sum of any two sides must be greater than third side!");
        else if (base + side2 > side1)
            throw new IllegalTriangleException("Sum of any two sides must be greater than third side!");
        else if (side1 + side2 > base)
            throw new IllegalTriangleException("Sum of any two sides must be greater than third side!");
        else {
            this.base = base;
            this.side1 = side1;
            this.side2 = side2;
            this.height = 0;
        }
    }

    public Triangle(int base, int side1, int side2, int height) {
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    public void setBase(int newBase) throws IllegalArgumentException {
        if (newBase >= 0)
            base = newBase;
        else
            throw new IllegalArgumentException("Base cannot be negative!");
    }

    public void setSide1(int newSide1) throws IllegalArgumentException {
        if (newSide1 >= 0)
            side1 = newSide1;
        else
            throw new IllegalArgumentException("Base cannot be negative!");
    }

    public void setSide2(int newSide2) throws IllegalArgumentException {
        if (newSide2 >= 0)
            side1 = newSide2;
        else
            throw new IllegalArgumentException("Base cannot be negative!");
    }

    public void setHeight(int newHeight) throws IllegalArgumentException {
        if (newHeight >= 0)
            height = newHeight;
        else
            throw new IllegalArgumentException("Base cannot be negative!");
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public double getPerimeter() {
        return base + side1 + side2;
    }
}
