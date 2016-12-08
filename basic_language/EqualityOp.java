class EqualityOp
{
   public static void main(String[] args)
   {
      int x = 0;
      System.out.println("true: " + (x == 0));
      System.out.println("false: " + (x != 0));
      double d = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
      System.out.println("0.89: " + d);
      System.out.println("false: " + (d == 0.9));
      System.out.println("true: " + ("A" == "A"));
      System.out.println("false: " + ("A" == "B"));
      System.out.println("true: " + ("AB" == "A" + "B"));
      String s = "B";
      System.out.println("false: " + ("AB" == "A" + s));
   }
}