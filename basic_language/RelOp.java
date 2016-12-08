class RelOp
{
   public static void main(String[] args)
   {
      int x = 10;
      System.out.println(x > 10);  //false
      System.out.println(x >= 10); //true
      System.out.println(x < 10);  //false 
      System.out.println(x <= 10); //true
      
      /*
       * The final output line is interesting because 
       * it proves that a string literal (e.g., "A") is 
       * in fact a String object.
       */
      System.out.println("A" instanceof String); //true
   }
}