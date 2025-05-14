public enum WeekDay {
  MONDAY("Vincent"), TUESDAY("OSCAR"), WEDNESDAY("LUCAS"), THURSDAY(
      "JACKY"), FRIDAY("STEVEN");

  private String name;

  private WeekDay(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    // Loop enum value
    for (WeekDay day : WeekDay.values()) {
      System.out.println(day.getName());
    }

    System.out.println(WeekDay.WEDNESDAY.getName()); // Lucas
  }
}
