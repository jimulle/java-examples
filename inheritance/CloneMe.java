class Employee implements Cloneable
{
   private String name;
   private int age;
   private Address address;

   Employee(String name, int age, Address address)
   {
      this.name = name;
      this.age = age;
      this.address = address;
   }

   @Override
   public Object clone() throws CloneNotSupportedException
   {
      Employee e = (Employee) super.clone();
      e.address = (Address) address.clone();
      return e;
   }

   Address getAddress()
   {
      return address;
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

class Address
{
   private String city;

   Address(String city)
   {
      this.city = city;
   }

   @Override
   public Object clone() {
       return new Address(new String(city));
   }

   String getCity()
   {
      return city;
   }

   void setCity(String city)
   {
      this.city = city;
   }
}

class City {
    private String name;
    City(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
    void setName(String name) {
        this.name = name;
    }
}

class CloneMe
{
   public static void main(String[] args) throws CloneNotSupportedException
   {
      Employee e = new Employee("John Doe", 49, new Address("Denver"));
      System.out.println(e.getName() + ": " + e.getAge() + ": " +
                         e.getAddress().getCity());
      Employee e2 = (Employee) e.clone();
      System.out.println(e2.getName() + ": " + e2.getAge() + ": " +
                         e2.getAddress().getCity());
      e.getAddress().setCity("Chicago");
      System.out.println(e.getName() + ": " + e.getAge() + ": " +
                         e.getAddress().getCity());
      System.out.println(e2.getName() + ": " + e2.getAge() + ": " +
                         e2.getAddress().getCity());
      
      System.out.println();
      System.out.println();

      double[] temps = { 98.6, 32.0, 100.0, 212.0, 53.5 };
      for (int i = 0; i < temps.length; i++)
         System.out.print(temps[i] + " ");
      System.out.println();
      double[] temps2 = temps.clone();
      for (int i = 0; i < temps2.length; i++)
         System.out.print(temps2[i] + " ");
      System.out.println();

      System.out.println();

      temps2[0] = 110.5;
      for (int i = 0; i < temps.length; i++)
         System.out.print(temps[i] + " ");
      System.out.println();
      for (int i = 0; i < temps2.length; i++)
         System.out.print(temps2[i] + " ");
      System.out.println();

      System.out.println();

      City[] cities = { new City("Denver"), new City("Chicago") };
      for (int i = 0; i < cities.length; i++)
         System.out.print(cities[i].getName() + " ");
      System.out.println();
      City[] cities2 = cities.clone();
      for (int i = 0; i < cities2.length; i++)
         System.out.print(cities2[i].getName() + " ");
      System.out.println();

      cities[0].setName("Dallas");
      for (int i = 0; i < cities.length; i++)
         System.out.print(cities[i].getName() + " ");
      System.out.println();
      for (int i = 0; i < cities2.length; i++)
         System.out.print(cities2[i].getName() + " ");
      System.out.println();
   }
}