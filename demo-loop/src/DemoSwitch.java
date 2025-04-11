public class DemoSwitch {
  public static void main(String[] args) {
    // if -> control the range of value
    int x = 3;
    if (x > 1 && x < 5) {
      System.out.println(x);
    }
    if (x == 3) {
      System.out.println(x);
    }

    // Switch
    // ! 1. it can check one variable ONLY
    // ! 2. equals to (No range of value checking)
    // ! 3. you have to "break" the switch yourself

    x = 2;
    switch (x) {
      case 1:
        System.out.println("hello");
        break;
      case 2:
        System.out.println("goodbye");
        break;
      case 3:
        System.out.println("bootcamp");
        break;
      default:
        System.out.println("other cases...");
    }

    int value = 3;
    x = 1;
    // no break, 3^4
    switch (x) {
      case 1:
        value = value * 3;
      case 2:
        value = value * 3;
      case 3:
        value = value * 3;
      case 4:
        value = value * 3;
      default:
    }
    System.out.println(value);
  }

}
