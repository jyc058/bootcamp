import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
  private String name;
  private int age;

  public static class SortedByAge implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
      return p1.getAge() > p2.getAge() ? -1 : 1;
    }
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  @Override
  public String toString() {
    return "Person(name=" + this.name + ", age=" + this.age + ")";
  }

  // A -> B -> C
  // Collection.sort(persons) -> loop perons -> each person.compareTo()
  // You prepare program C

  public static void main(String[] args) {
    // sorted by age, descending order
    // if same age, and then sorted by name, ascending order
    List<Person> bear = new ArrayList<>();
    bear.add(new Person("Bear", 1));
    bear.add(new Person("tBear", 2));
    bear.add(new Person("qBear", 3));
    bear.add(new Person("jjBear", 3));

    Collections.sort(bear, new Person.SortedByAge());

    for (Person person : bear) {
      System.out.println(person);
    }
  }
}
