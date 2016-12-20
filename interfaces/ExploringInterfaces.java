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
   }

}