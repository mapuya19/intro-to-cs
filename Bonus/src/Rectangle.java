public class Rectangle extends GeometricObject {
    private int length;
    private int width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(int newLength) throws IllegalArgumentException {
        if (newLength >= 0)
            length = newLength;
        else
            throw new IllegalArgumentException("Length cannot be negative!");
    }

    public void setWidth(int newWidth) throws IllegalArgumentException {
        if (newWidth >= 0)
            width = newWidth;
        else
            throw new IllegalArgumentException("Width cannot be negative!");
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.length) + (this.width + this.width);
    }
}
