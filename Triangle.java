package shape;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public double getPerimeter() {
        // Implement the logic to calculate the perimeter of a triangle
        // based on the given dimensions
        return 0;
    }
}
