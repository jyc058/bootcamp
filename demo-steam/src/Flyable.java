import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
public interface Flyable {
  // ! NO attribute in interface
  static final int SECOND_PER_MINUTE = 60; // implicitly "static final"
  
  // abdstract method
  void fly(); // implicitly "abstract"

  // After Java 8: default method -> instance method
  default String drink(String something) {
    return "I am drinking" + something;
  }

  // After Java 8: static method
  static int sum(int x, int y) {
    return x + y;
  }

  public static void main(String[] args) {
    Flyable.sum(1, 2);

    Cat c1 = new Cat();
    System.out.println(c1.drink("water"));
    c1.fly();

    // Lambda
    Flyable cat = () -> System.out.println("Cat is flying");
    cat.fly(); // Cat is flying
    System.out.println(cat.drink("water")); // i am drinking water

    // Map - lambda
    Map<String, Child> childMap = new HashMap<>();
    childMap.put("john",new Child("John"));
    childMap.put("peter",new Child("Peter"));

    Child result = childMap.computeIfAbsent("peter", name -> new Child(name));
    System.out.println(result);

    Child result2 = childMap.computeIfAbsent("sally", name -> new Child(name));
    System.out.println(result2);

    System.out.println(childMap.size()); // 3
  }
}
