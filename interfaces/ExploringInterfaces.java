class ExploringInterfaces
{
   public static void main(String[] args) throws Exception
   {
       Book myBook1 = new Book("tale of two mice", "billy ballou", 193);
       Book myBook2 = new Book("of mice and other mice", "patricia potts", 253);
       Book myBook3 = new Book("if you give a mouse a cookie", "carl carlson", 193);
       Book myBook4 = new Book("one mouse two mice", "danny davinci", 95);

       System.out.println("myBook1.pages < myBook2.pages: " + myBook1.isLargerThan(myBook2));
       System.out.println("myBook1.pages = myBook3.pages: " + myBook1.isLargerThan(myBook3));
       System.out.println("myBook1.pages > myBook4.pages: " + myBook1.isLargerThan(myBook4));

       Spruce tree1 = new Spruce();
       Fir tree2 = new Fir();
       Fir tree3 = new Fir(150);

       System.out.println(tree1.About());
       tree1.AddMoreLights(2000);
       System.out.println(tree1.About());
       tree1.TurnLightsOn();
       System.out.println(tree1.About());

       System.out.println(tree2.About());
       System.out.println(tree3.About());
   }

}