package Part3;

public class Circle implements Figure {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void printArea() {
        System.out.println("Площадь круга: " + (String.format("%.2f", area())));
    }
}
