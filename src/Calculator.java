import java.util.Scanner;

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
 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1(Add),2(Subtract) , 3(Multiply), 4(Divide)");
        int option = sc.nextInt();
        System.out.println("Enter first number: ");
        double x = sc.nextDouble();
        System.out.println("Enter Second number: ");
        double y = sc.nextDouble();
        double result;
        Calculator calculator = new Calculator();
        result = switch (option) {
            case 1 -> calculator.add(x, y);
            case 2 -> calculator.subtract(x, y);
            case 3 -> calculator.multiply(x, y);
            case 4 -> calculator.divide(x, y);
            default -> throw new IllegalArgumentException("Error");
        };
        System.out.println(result);
    }
}
