import static java.lang.System.out;

public class Mod
{
   public static void main(String[] args)
   {
       double dollars1 = 5.00;
       double dollars2 = 1.67;
       double dollars3 = 2.09;

       change(dollars1);
       change(dollars2);
       change(dollars3);
   }

   public static void change(double d) {
       int cents = (int)(d*100);
       out.println(cents);
       out.println("Change for $" + d + ": ");
       out.print(cents/25 + " quarters, ");
       cents %= 25;
       out.print(cents/10 + " dimes, ");
       cents %= 10;
       out.print(cents/5 + " nickels, and ");
       out.println(cents%5 + " pennies.");
   }
}