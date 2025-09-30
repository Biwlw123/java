package pz1;

public class CircleCalculator {
    public double doWork(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Радиус не может быть отрицательным");
        }
        return Math.PI * radius * radius;
    }
}