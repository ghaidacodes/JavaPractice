import java.util.Scanner;

public class scientificCalculator extends Calculator{

    public double power(double base, double exponent){
        return Math.pow(base, exponent);
    }
    public double sqrt(double x){
        return Math.sqrt(x);
    }
    public double sine(double angle){
        return Math.sin(Math.toRadians(angle));
    }
    public double cosine(double angle){
        return Math.cos(Math.toRadians(angle));
    }
    public double tangent (double angle){
        return Math.tan(Math.toRadians(angle));
    }

}

