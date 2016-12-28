public class Convert {
    public static void main (String[] args) throws java.io.IOException {
        System.out.print("Please enter a number: ");
        int num = 0;
        int ch;
        while ((ch = System.in.read()) != '\n')
        {
            if (ch >= '0' && ch <= '9')
            {
                // num *= 10; // moves the value out the tens place
                // num += ch - '0';
                num = (num*10) + (ch - '0');
                // num = Integer.parseInt( Integer.toString(num) + (char) ch );
            }
            else
            {
                break;
            }
        }
        System.out.println ("num = " + num);
        System.out.println ("num squared = " + num * num);
    }
}