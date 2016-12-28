public class Print
{
   public static void main (String [] args)
   {
      boolean b = true;
      System.out.println (b);
      char c = 'A';
      System.out.println (c);
      char [] carray = { 'A', 'B', 'C' };
      System.out.println (carray);
      double d = 3.5;
      System.out.println (d);
      float f = -9.3f;
      System.out.println (f);
      int i = 'X';
      System.out.println (i);
      long l = 9000000;
      System.out.println (l);
      String s = "abc";
      System.out.println (s);
      System.out.println (new Print ());

      // run `java Print` to output to std.out
      // run `java Print >out.dat` to output to a file
   }
}