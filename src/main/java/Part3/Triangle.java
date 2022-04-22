package Part3;

public class Triangle implements Figure {

    double firstSide;
    double secondSide;
    double thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double perimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    @Override
    public double area() {
        double p = perimeter(firstSide, secondSide, thirdSide);
        return Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }

    @Override
    public void printArea() {
        System.out.println("Площадь треугольника: " + (String.format("%.2f", area())));
    }
}
