

public class Calculator {
    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Division by 0 is illegal");
        }
        return x / y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }
}
