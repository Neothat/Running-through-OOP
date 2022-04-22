package Part3;

public class Square implements Figure {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }

    @Override
    public void printArea() {
        System.out.println("Площадь квадрата: " + (String.format("%.2f", area())));
    }
}
