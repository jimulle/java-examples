public class Type
{
    public static void main(String[] args) throws java.io.IOException
    {
        int i;
        while ((i = System.in.read()) != -1) // the -1 is the end-of-file marker
        {
            System.out.print((char) i);
        }

        // run `java Type` to input text from keyboard (`ctrl + c` to quit)
        // run `java Type <type.txt` to redirect System.in to a file
    }
}