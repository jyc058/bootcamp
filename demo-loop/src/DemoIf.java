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
    } else if (s.equals("goodbye")) {      // ! 相同，會進入
      System.out.println("this is bye");   // print out 
    }
  }
}

