public class DemoIf {
  public static void main(String[] args) {
    // if, else if , else
    int x = 9;

    // 1. if + else if + else
    if (x < 10) {
      System.out.println("x < 10"); // ! print
    } else if (x < 15) {
      System.out.println("x < 15"); // not print
    } else if (x >= 20) {
      System.out.println("x >= 20"); // not print
    } else { // 10 - 19
      System.out.println("10 - 19"); // not print
    }
    // 2. if

    // 3. if + else

    // 4. if + else if
    String s = "goodbye";
    if (s.equals("hello")) {
      System.out.println("this is hello"); // ! 不會進入
    } else if (s.equals("goodbye")) { // ! 相同，會進入
      System.out.println("this is bye"); // print out
    }


    boolean isFemale = true;
    boolean isSmoker = true;
    int age = 80;
    int base = 120;
    double $ = 0.0;

    // base premium = 120

    // Female 40 or above, premium 8% more
    // Male 16 or above, premium 3% more
    // Smoker -> 7% more
    // age 70 or above -> 20% more

    // 1. Female 40 NS -> 8
    // 1. Female 40 S -> 8 + 7
    // 1. Male 16 NS -> 3
    // 1. Male 16 S -> 3 + 7
    // ...

    if (isFemale) {
      System.out.println("female");
    } else {
      System.out.println("male");
    }
    if (isSmoker) {
      System.out.println("Smoker");
    } else {
      System.out.println("nonSmoker");
    }
    if (isFemale && age >= 40) {
      $ = base *= 1.08;
    } else {
      $ = base;
    }
    if (isSmoker) {
      $ = base *= 1.07;
    } else {
      $ = base;
    }
    if (age >= 70) {
      $ = base *= 1.20;
    } else {
      $ = base;
    }

    System.out.println($);


    // ! Sir 寫法

    double premium = 120.0;
    double extraRate = 0.0;

    if (isFemale) {
      if(age >= 70) {
        extraRate += 0.2;
      } else if (age >= 40) {
        extraRate += 0.08;
      }
    } else { // male
      if (age >= 70) {
        extraRate += 0.2;
      } else if (age >= 16) {
        extraRate += 0.03;
      }
    }
    if (isSmoker) {
      extraRate += 0.07;
    }
    premium *= 1 + extraRate;
    System.out.println(extraRate); //0.27
    System.out.println(premium); // 152.4
  }
}

