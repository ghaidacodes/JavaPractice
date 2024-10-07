import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ccnum,sum, evenSum=0 , oddSum=0 ;
        String sccnum = "";
        while (true){
            System.out.println("Enter a credit card number: ");
            if (sc.hasNextLong()){
                ccnum=sc.nextLong();
                break;
            }
            else {
                System.err.println("Invalid credit card number");
                sc.nextLine();
            }
        }

        sccnum= Long.toString(ccnum);

        if (sccnum.length()<13 || sccnum.length()>16 ){
            System.err.println("Invalid credit card number length");
            System.exit(-1);
        }
        if(!(sccnum.startsWith("4")||
                sccnum.startsWith("5") ||
                sccnum.startsWith("6") ||
                sccnum.startsWith("37")))
        {
            System.err.println("Invalid cc prefix");
            System.exit(-2);
        }

        for (int i = sccnum.length() - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                long evenNum = (sccnum.charAt(i) - '0') * 2;
                long afterDbl = (evenNum / 10) + (evenNum % 10);
                evenSum += afterDbl;
            } else {
                long oddNum = (sccnum.charAt(i) - '0');
                oddSum += oddNum;
            }
        }

        sum = evenSum + oddSum;
        if( sum %10 ==0 ){
            System.out.print("This is a valid credit card number");
        }
        else {
            System.out.print("This is an invalid credit card number");
        }

    }
}