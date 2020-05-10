import java.util.ArrayList;

public abstract class GeometricObject {
    public static void main(String[] args) {
        ArrayList<GeometricObject> geomobjs = new ArrayList<GeometricObject>();
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(2,6);

        geomobjs.add(c1);
        geomobjs.add(r1);

        double c1Area = c1.getArea();
        double r1Area = r1.getArea();
        double areaTotal = c1Area + r1Area;
        // System.out.println(c1Area);
        // System.out.println(r1Area);

        double c1Perim = c1.getPerimeter();
        double r1Perim = r1.getPerimeter();
        double perimTotal = c1Perim + r1Perim;
        // System.out.println(c1Perim);
        // System.out.println(r1Perim);

        System.out.println("Total Area: " + areaTotal);
        System.out.println("Total Perimeter " + perimTotal);
    }

    private int x;
    private int y;

    public GeometricObject() {
        this.x = 0;
        this.y = 0;
    }

    public GeometricObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
