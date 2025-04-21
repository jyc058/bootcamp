import java.time.DayOfWeek;
import java.time.LocalDate;

public class DemoDate {
  public static void main(String[] args) {
    // 2025 4 17
    int year = 2025;
    int month = 4;
    int day = 17;

    // For date value, we should not use int variable for storage.
    // because it is hard to perform operation on "date", i.e. comparsion? add day?

    LocalDate today = LocalDate.of(2025, 4, 17);
    System.out.println(today); // "2025-04-17"

    LocalDate day2 = today.plusDays(14);
    System.out.println(day2); // "2025-05-01"

    LocalDate day3 = today.plusMonths(2);
    System.out.println(day3); // "2025-06-17"

    LocalDate day4 = today.plusWeeks(50);
    System.out.println(day4); // "2026-04-02"

    // minusDay
    LocalDate day5 = today.minusDays(90);
    System.out.println(day5);

    //isAfter
    if (today.isAfter(LocalDate.of(2025, 4, 16))) {
      System.out.println("today > 2025.4.16");
    }
    
    if (today.isBefore(LocalDate.of(2025, 5, 1))) {
      System.out.println("today < 2025.5.1");
    }

    if (today.isEqual(LocalDate.of(2025, 4, 17))) {
      System.out.println("today is 2025.4.17");
    }

    System.out.println(today.isLeapYear()); // false
    System.out.println(LocalDate.of(2100, 1, 1).isLeapYear()); // false
    System.out.println(LocalDate.of(2400, 1, 1).isLeapYear()); // true
    System.out.println(LocalDate.of(2000, 1, 1).isLeapYear()); // true
    System.out.println(LocalDate.of(2016, 1, 1).isLeapYear()); // true

    System.out.println(LocalDate.of(2016, 2, 28).plusDays(1)); // "2016-02-29"

    System.out.println(LocalDate.of(2020, 1, 1));

    System.out.println(LocalDate.of(2016, 1, 1).getDayOfYear());
    DayOfWeek dow = LocalDate.of(2016, 1, 1).getDayOfWeek();
    System.out.println(dow.toString());

    // Technically OK, not suitable
    String dayOfWeek = "Monday"; // "MONDAY" "monday" 

    DayOfWeek dow2 = DayOfWeek.of(3);
    System.out.println(dow2); // WEDNESDAY
    dow2.plus(10);

    System.out.println(LocalDate.now().plusDays(7));
}  
}
