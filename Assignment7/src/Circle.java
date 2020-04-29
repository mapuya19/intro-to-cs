public class Circle extends GeometricObject{
    private int r;

    public Circle() {
        this.r = 0;
    }

    public Circle(int r) {
        this.r = r;
    }

    public double getArea() {
        return (double) (Math.PI * (Math.pow(this.r, 2)));
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.r;
    }
}
