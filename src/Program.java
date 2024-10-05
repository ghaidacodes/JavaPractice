import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        scientificCalculator sciCalc = new scientificCalculator();
        Calculator calculator = new Calculator();

        System.out.println("Choose an operation");
        System.out.println("1(Add),2(Subtract) , 3(Multiply), 4(Divide), 5(Power), 6(Sqrt), 7(Sine), 8(Cosine), 9(Tangent)");
        int option = sc.nextInt();

        double x = 0, y = 0;
        if (option >= 1 && option <= 4 || option == 5) {
              x = getUserInput(sc, "Enter the first number: ");
              y = getUserInput(sc, "Enter the second number: ");
                if (option == 4 && y == 0){
                    System.err.println("Can not divide by zero");
                    return;
                }

        } else if (option >= 6) {
            x = getUserInput(sc, "Enter the number: ");
            if (option == 6 && x < 0){
                System.err.println("No square root of a negative number.");
                return;
            }
        }


        double result;
        result = switch (option) {
            case 1 -> calculator.add(x, y);
            case 2 -> calculator.subtract(x, y);
            case 3 -> calculator.multiply(x, y);
            case 4 -> calculator.divide(x, y);
            case 5 -> sciCalc.power(x,y);
            case 6 -> sciCalc.sqrt(x);
            case 7 -> sciCalc.sine(x);
            case 8 -> sciCalc.cosine(x);
            case 9 -> sciCalc.tangent(x);
            default -> throw new IllegalArgumentException("Error");
        };
        System.out.println(result);
    }
    private static double getUserInput (Scanner sc, String number){
        System.out.println(number);
        return sc.nextDouble();}
}


