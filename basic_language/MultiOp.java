class MultiOp
{
   public static void main(String[] args)
   {
      System.out.println("12: " + (4.0 * 3.0));
      System.out.println("4: " + (12 / 3));
      System.out.println("1: " + (10 % 3));
      System.out.println("Infinite: " + 10.0 / 0.0);
      System.out.println("- Infinite: " + -10.0 / 0.0);
      System.out.println("NaN: " + 0.0 / 0.0);
      // divide by zero exception
      // System.out.println(10 / 0);
   }
}