import java.math.*;
import java.lang.*;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // use scanner to get inputs from user
        Scanner sc = new Scanner(System.in);
        String value1;
        String value2;
        System.out.print("Enter a number: ");
        value1 = sc.nextLine();
        System.out.print("Enter another number: ");
        value2 = sc.nextLine();
        // parse inputs
        BigDecimal bd1 = new BigDecimal(value1);
        BigDecimal bd2 = new BigDecimal(value2);
        // add inputs
        BigDecimal sum = bd1.add(bd2);
        // subtract inputs
        BigDecimal red = bd1.subtract(bd2);
        // multiply inputs
        BigDecimal mul = bd1.multiply(bd2);
        // divide inputs
        BigDecimal div = bd1.divide(bd2, 5, RoundingMode.CEILING);
        // return calculations
        System.out.println("The sum is: " + sum.toString());
        System.out.println("The difference is: " + red.toString());
        System.out.println("The product is: " + mul.toString());
        System.out.println("The quotient is: " + div.toString());
    }

}