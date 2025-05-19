import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
  public static void main(String[] args) {
    List<String> names =
        new ArrayList<>(Arrays.asList("John", "Peter", "Jenny"));

    // for loop
    names.forEach(name -> {
      System.out.println(name);
    });

    // print those names starts with J
    names.forEach(n -> {
      if (n.startsWith("J")) {
        System.out.println(n);
      }
    });

    // Java 8 stream
    // ! filter()
    names.stream() //
        .filter(name -> name.startsWith("J") && name.endsWith("y")
            || name.length() == 5)
        .forEach(name -> System.out.println(name));

    // ! map()
    names.stream() //
        .filter(name -> name.startsWith("J") && name.endsWith("y")
            || name.length() == 5)
        .map(name -> new Child(name)).forEach(child -> {
          System.out.println(child.getName());
        });

    // ! collect()
    List<Child> childs = names.stream() //
        .filter(name -> name.startsWith("J") && name.endsWith("y")
            || name.length() == 5)
        .map(name -> new Child(name)).collect(Collectors.toList());

    List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 4, 7, -1, 100));
    // stream -> even and > 6
    // square of the value
    // collect as a list
    Stream<Integer> integers = numbers.stream();

    List<Integer> newNumbers = numbers.stream() //
        .filter(n -> n % 2 == 0 && n > 6) //
        .map(n -> n * n) //
        .collect(Collectors.toList());

    List<Integer> newNumbers2 = numbers.stream().map(n -> {
      if (n % 2 == 0) {
        return n * n;
      }
      return n;
    }).collect(Collectors.toList());

    // ! loop + if + break
    // findAny
    // ! Optional is a class, name is Optional object, which may stores null or non-null value
    Optional<String> name =
        names.stream().filter(n -> n.startsWith("J")).findAny();
    if (name.isPresent()) { // true if non-null
      System.out.println("There is a name starts with J: " + name.get());
    } else {
      System.out.println("There is no name starts with J.");
    }
    System.out.println(name); // Optional[John]

    // Ascending ordering
    Comparator<String> sortedByDescending =
        (s1, s2) -> s1.compareTo(s2) > 0 ? -1 : 1;
    names.stream() //
        .sorted(sortedByDescending) //
        .forEach(n -> System.out.println(n));

    // 8, 9, 2, -5, 100, 10000, -300, 11
    // filter odd number -> square -> value > 80 -> sorted -> print out
    List<Integer> integers2 =
        new ArrayList<>(Arrays.asList(8, 9, 2, -5, 100, 10000, -300, 11));
    integers2.stream() //
        .filter(integer -> integer % 2 == 1) //
        .map(odd -> odd * odd) //
        .filter(squared -> squared > 80) //
        .sorted() //
        .forEach(value -> System.out.println(value));

    // default RED color
    // List<Integer> -> 8, 9, 4, 1
    // Descending order
    // List<Ball>
    List<Integer> integers3 = new ArrayList<>(Arrays.asList(8, 9, 4, 1));
    Comparator<Integer> descending = (i1, i2) -> i1.compareTo(i2) > 0 ? -1 : 1;
    List<Ball> balls = integers3.stream() //
        .sorted(descending) //
        .map(num -> new Ball(Ball.Color.RED, num)) //
        .collect(Collectors.toList());
    System.out.println(balls);

    // List<Double>, radius = 3.5, 4.5, 1.5
    // BigDecimal
    // List<Double> circle area
    List<Double> radiusList = new ArrayList<>(Arrays.asList(3.5, 4.5, 1.5));
    List<Double> areaList = radiusList.stream()
        .map(radius -> BigDecimal.valueOf(radius)
            .multiply(BigDecimal.valueOf(radius))
            .multiply(BigDecimal.valueOf(Math.PI)).doubleValue())
        .collect(Collectors.toList());
    System.out.println(areaList);

  }
}