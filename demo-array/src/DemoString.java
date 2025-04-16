public class DemoString {
  public static void main(String[] args) {
    // Week 1: equals(), length(). charAt()
    // Week 2: other String methods
    // 1. replace()
    System.out.println("bootcamp".replace('o', 'x')); // bxxtcamp
    System.out.println("bootcamoop".replace("oo", "lll")); // bllltcamlllp

    // 2. indexOf()
    System.out.println("hello".indexOf('o')); // 4
    System.out.println("hello".indexOf('a')); // -1
    System.out.println("hello".indexOf(' ')); // -1

    // 3. concat()
    String s1 = "hello" + "world";
    System.out.println(s1);

    // "+" -> slow performance (runtime)
    String s2 = "hello".concat("world");
    System.out.println(s2);

    // 4. lastIndexOf() 搵最後出現
    System.out.println("hello".indexOf('l')); // 2

    System.out.println("hello".lastIndexOf('l')); // 3
    System.out.println("hello world".lastIndexOf('l')); // 9

    // 5. isEmpty()
    boolean result = "".isEmpty();
    System.out.println(result); // true
    System.out.println("hello".isEmpty()); // false

    // 6. trim()
    System.out.println(" hello world !!! ".trim()); // "hello world"
    System.out.println(" hello world !!! ".trim().length()); // 15

    // coding syle: chain methods
    System.out.println(" hello ".replace('e', 'a').trim().charAt(1)); // a
    System.out.println("hello".replace('L', 'X')); // hello
    // String methods return different types

    // 7. substring
    // ! end index -1:
    // 'e' -> index 1, 'l' -> index 2
    //
    System.out.println("hello".substring(1, 3)); // el
    System.out.println("hello".substring(0)); // from index 0, to the end of string

    String unknown = "hello world";
    // extract the second and third characters
    // if the string not long enough, extract as much as possible

    //"h" -> "" (group 1)
    // "he" -> e (group 2)
    // "hell" -> el (group 3 - normal case)
    // "hello world" -> el (group 3 - normal case)
    int startIndex = 1;
    int endIndex = 2;
    if (unknown.length() < 2) {
      startIndex = 1;
      endIndex = 0;
    } else if (unknown.length() == 2) {
      endIndex = 1;
    }
      System.out.println(unknown.substring(startIndex, endIndex + 1));

      // 8. toLowercase()
      System.out.println("HELLO!!!".toLowerCase()); // hello!!!
      System.out.println("hello!!!".toLowerCase()); // hello!!!
      System.out.println("hello!!!".toUpperCase()); // HELLO!!!
      System.out.println("heLLo!!!".toUpperCase()); // HELLO!!!

      // 9. contains()
      System.out.println("hello".contains("ll")); // true
      System.out.println("hello".contains("lll")); // false
      String name = "Steven";
      if (name.contains("t")) {
        System.out.println("Your name contains t charcater");
      }
      System.out.println("陳大明".contains("陳")); // true
      System.out.println("陳大明".contains("小")); // false

      // 10. startsWith(), endsWith()
      System.out.println("hello".startsWith("he")); // true
      System.out.println("hello".startsWith("helll")); // false
      System.out.println("hello".endsWith("lo")); // true
      System.out.println("hello".endsWith("oo")); // false
  }
}
