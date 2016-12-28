public class IO
{
    public static void main(String[] args) throws java.io.IOException
    {
        String s = "";
        System.out.println("Enter some text: ");
        int i;
        while ((i = System.in.read()) != '\n')
        {
            s += (char) i;
        }
        System.out.println(s.toUpperCase());
    }
}