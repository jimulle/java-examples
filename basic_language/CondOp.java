class CondOp
{
   public static void main(String[] args)
   {
      // conditional operators
      System.out.println("conditional operators:");
      boolean sold_more_than_100_units = true;
      int bonus_dollars = (sold_more_than_100_units) ? 50 : 0;
      System.out.println("50: " + bonus_dollars);
      System.out.println("true: " + (true && true));
      System.out.println("false: " + (true && false));
      System.out.println("false: " + (false && true));
      System.out.println("false: " + (false && false));
      System.out.println("true: " + (true || true));
      System.out.println("true: " + (true || false));
      System.out.println("true: " + (false || true));
      System.out.println("false: " + (false || false));
      int x = 0;
      boolean status = true && ++x == 0;
      System.out.println("1: " + x);
      status = false && ++x == 0;
      System.out.println("1: " + x);
      status = true || ++x == 0;
      System.out.println("1: " + x);
      status = false || ++x == 0;
      System.out.println("2: " + x);

      System.out.println();

      // logical operators
      System.out.println("logical operators:");
      int y = 0;
      System.out.println("false: " + (false & ++y == 0));
      System.out.println("1: " + y);
      System.out.println("true: " + !false);
      System.out.println("false: " + (true ^ true));
      System.out.println("true: " + (true ^ false));
      System.out.println("true: " + (true | ++y == 0));
      System.out.println("2: " + y);
   }
}