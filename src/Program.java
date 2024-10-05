import java.util.Scanner;

public class Program {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            scientificCalculator sciCalc = new scientificCalculator();
            System.out.println("1(Add),2(Subtract) , 3(Multiply), 4(Divide), 5(Power), 6(Sqrt), 7(Sine), 8(Cosine), 9(Tangent)");
            int option = sc.nextInt();
            System.out.println("Enter first number: ");
            double x = sc.nextDouble();
            System.out.println("Enter Second number: ");
            double y = sc.nextDouble();
            double result;
            Calculator calculator = new Calculator();
            if ( option >= 1 && option <=4){
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
