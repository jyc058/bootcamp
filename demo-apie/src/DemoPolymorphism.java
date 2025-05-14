public class DemoPolymorphism {
  public static void main(String[] args) {
    // I -> Inheritence (extends)
    // A -> Abstraction (implements)
    // P -> Polymorphism (Parent Class / Interface)
    // E -> Encapsulation (Getter/Setter for private varibale)

    Animal a1 = new Dog("Peter");
   // Dog d1 = a1; // Why error? type unsafe
   // ! how to elimate the risk? we can use instanceof to check the actual type of object
   if(a1 instanceof Dog) {
   Dog d1 = (Dog) a1; // force conversion (downcast) - risky
  } else if (a1 instanceof Cat) {
    Cat c1 = (Cat) a1; // force conversion (downcast) - risky
    
  }
  // 2. interfaces
  Flyable superman = new Superman("John");
  superman.fly();
  // superman.eat(); not ok
  // superman.drink(); not ok
  // superman.sleep(); not ok

  // Example (Account)
  // Use Polymorphism to create objects
  Account acc1 = new PersonalAccount();
  Account acc2 = new CommericalAccount();

  // Parent Class (Amount)
  acc1.getSavingAccount().credit(300);
  System.out.println(acc1.getSavingAccount().getBalance());
  acc2.getSavingAccount().credit(400);
  System.out.println(acc2.getSavingAccount().getBalance());

  SubAccount subAcc1 = new SavingAccount();
  SubAccount subAcc2 = new CurrentAccount();
  subAcc1.credit(900.0);
  subAcc2.credit(100.0);

  // Example (Shape)
  int x = 100;
  Shape shape;
  if (x > 50) {
    shape = new Circle(3.5, "White");
    // } else if() { ?? ! A new Shape comes
  } else {
    shape = new Rectangular("BLUE", 4.5, 7.8);
  }
  
  // ! area() is common method for Circle and Rectangular
  double area = shape.area();
  if (area > 10) {
    System.out.println("Area=" + area);
  } else {
    System.out.println("it is small shape");
  }  

  // get radius
  // get Length/Width
  // shape.getLength(); // ! unsafe type, so we have to use "instanceOf" an downcasting


  // Number
  Number number = Long.valueOf(3);
  number = Integer.valueOf(10);
  number = Byte.valueOf("7");
  number = Short.valueOf("8");
  number = Double.valueOf(3.9);
  number = Float.valueOf("8.4");
  
  long value = number.longValue(); // 8.4 -> 8
  System.out.println(value); // 8
  double value2 = number.doubleValue();
  System.out.println(value2);

  // floating point issue
  double d1 = 8.4f;
  System.out.println(d1);

  // Real world: Use int for integer and double for decimal place
  int y = 3;
  double h = 3.3;

}
}
