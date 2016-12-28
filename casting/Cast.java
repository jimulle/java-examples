public class Cast {
    public static void main(String[] args) {
        int i = 5;
        double d = 5.0;

        // int + int
        System.out.println("int (5) + int (5) = " + (i + i));
        // double + double
        System.out.println("double (5.0) + double (5.0) = " + (d + d));
        // int + double
        System.out.println("int (5) + double (5.0) = " + (i + d));
        // (double)int + double
        System.out.println("(double)int (5) + double (5.0) = " + ((double)i + d));
        // int + (int)double
        System.out.println("int (5) + (int)double (5.0) = " + (i + (int)d));
    }
}