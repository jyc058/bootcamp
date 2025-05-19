import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {

  public static class SortedByNameDesc implements Comparator<String>{
    @Override
    public int compare(String s1, String s2) {
      return s1.compareTo(s2) > 0 ? -1 : 1;
    }
  }

  // formula -> Person age dec
  public static class SortByAgeDesc implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
      return Integer.compare(p2.getAge(), p1.getAge());
    }
  }

  
  public static void main(String[] args) {
    Queue<String> q1 = new PriorityQueue<>(new SortedByNameDesc()); // Underlying data structure -> ArrayList -> array
    q1.add("Vincent");
    q1.add("Lucas");
    q1.add("Sally");

    for (String s : q1) {
      System.out.println(s);
    }
    // Lucas
    // Vincent
    // Sally

    // consume the queue
    while (!q1.isEmpty()) {
      System.out.println(q1.poll()); // ordering -> pick up (slow)
    }

    // method: poll()
    // - ordering -> String compareTo()
    // - remove the object

    // 3 Person -> PQ
    Queue<Person> q2 = new PriorityQueue<>(new SortByAgeDesc());
    q2.add(new Person("aBear", 3));
    q2.add(new Person("bBear", 2));
    System.out.println(q2.poll());
    q2.add(new Person("cBear", 100));
    System.out.println(q2.poll());
    System.out.println(q2.poll());
  
  }
}
