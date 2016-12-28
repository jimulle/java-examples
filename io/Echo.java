public class Echo
{
    public static void main(String[] args) throws java.io.IOException
    {
        int ch;
        System.out.println("Enter some text: ");
        while ((ch = System.in.read()) != '\n') // '\n' is the end of line marker
            System.out.print((char) ch);

        // run `java Echo` to input text from keyboard
        // run `java Echo <echo.txt` to redirect System.in to a file
    }
}