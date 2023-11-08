package classes;

public class MathFinal {
    private final double pi = 3.14159;
    private final int goldenRatio = 1618;

    // Обчислення площі кола

    public double circleArea(double radius) {
        return pi * radius * radius;
    }

    // Обчислення площі прямокутника

    public double areaOfRectangle(double length, double width) {
        return goldenRatio * length * width;
    }

    // Розрахунок площі квадрата

    public double areaOfSquare(final double side) {
        return side * side;
    }
}
