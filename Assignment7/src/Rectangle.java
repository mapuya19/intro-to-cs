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

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.length) + (this.width + this.width);
    }
}
