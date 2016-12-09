class Employee {
   private String name;
   private int age;

   Employee(String name, int age)
   {
      this.name = name;
      this.age = age;
   }

   @Override
   public boolean equals(Object o) {
       if (!(o instanceof Employee))
        return false;
       Employee e = (Employee) o;
       return e.getName().equals(name) && e.getAge() == age;
   }

   String getName()
   {
      return name;
   }

   int getAge()
   {
      return age;
   }
}

class EqualityDemo {
    public static void main(String[] args) {
      Employee e1 = new Employee("John Doe", 29);
      Employee e2 = new Employee("Jane Doe", 33);
      Employee e3 = new Employee("John Doe", 29);
      Employee e4 = new Employee("John Doe", 27 + 2);
      // Demonstrate reflexivity.
      System.out.println("Demonstrating reflexivity...");
      System.out.println();
      System.out.println("e1.equals(e1): " + e1.equals(e1));
      System.out.println();
      // Demonstrate symmetry.
      System.out.println("Demonstrating symmetry...");
      System.out.println();
      System.out.println("e1.equals(e2): " + e1.equals(e2));
      System.out.println("e2.equals(e1): " + e2.equals(e1));
      System.out.println("e1.equals(e3): " + e1.equals(e3));
      System.out.println("e3.equals(e1): " + e3.equals(e1));
      System.out.println("e2.equals(e3): " + e2.equals(e3));
      System.out.println("e3.equals(e2): " + e3.equals(e2));
      System.out.println();
      // Demonstrate transitivity.
      System.out.println("Demonstrating transitivity...");
      System.out.println();
      System.out.println("e1.equals(e3): " + e1.equals(e3));
      System.out.println("e3.equals(e4): " + e3.equals(e4));
      System.out.println("e1.equals(e4): " + e1.equals(e4));
      System.out.println();
      // Demonstrate consistency.
      System.out.println("Demonstrating consistency...");
      System.out.println();
      for (int i = 0; i < 5; i++)
      {
         System.out.println("e1.equals(e2): " + e1.equals(e2));
         System.out.println("e1.equals(e3): " + e1.equals(e3));
      }
      System.out.println();
      // Demonstrate the null check.
      System.out.println("Demonstrating null check...");
      System.out.println();
      System.out.println("e1.equals(null): " + e1.equals(null));
      System.out.println();
      // Demonstrate the first checking for equivalent type.
      System.out.println("Demonstrating equivalent type check...");
      System.out.println();
      System.out.println("e1.equals(new Object()): " + e1.equals(new Object()));

      System.out.println();
      System.out.println();
      int x[] = { 1, 2, 3 };
      int y[] = { 1, 2, 3 };

      System.out.println("x.equals(x): " + x.equals(x));
      System.out.println("x.equals(y): " + x.equals(y));
    }
}