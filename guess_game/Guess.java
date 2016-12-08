class Guess
{
   public static void main(String[] args) throws Exception
   {
       outer:
       while (true) {
           System.out.println("I'm thinking of a number between 0 and 9");
           int num = (int) (Math.random() * 10);
           
           inner:
           while (true) {
               int guessNum;
               while (true) {
                   System.out.println("Enter you guess: ");
                   guessNum = System.in.read();
                   while (System.in.read() != '\n'); // System.getProperty("line.seperator")
                   if (guessNum >= '0' && guessNum <= '9') {
                       guessNum -= '0';
                       break;
                   }
               }
               if (guessNum < num) {
                   System.out.println("Your guess is too low");
               }
               else
               if (guessNum > num) {
                   System.out.println("Your guess is too high");
               }
               else {
                   System.out.println("Congratulations, you guessed correctly");
                   while (true) {
                       System.out.println("Press n for new game or q to quit");
                       int ch = System.in.read();
                       while (System.in.read() != '\n');
                       if (ch == 'n') {
                           continue outer;
                       }
                       else 
                       if (ch == 'q') {
                           break outer;
                       }
                   }
               }
           }
       }
   }
}