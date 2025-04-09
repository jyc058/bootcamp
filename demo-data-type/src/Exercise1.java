public class Exercise1 {
  public static void main(String[] args) {
    // equals()

    // length()

    // charAt()

    // ! my work
    String s1 = "jacky";
    s1.equals("jacky");
    System.out.println(s1.equals("jacky"));
    System.out.println(s1.equals("Jacky"));
    boolean result = s1.equals("jacky");
    System.out.println(result);

    System.out.println(s1.length());
    int s1Length = s1.length();
    System.out.println(s1Length);

    System.out.println(s1.charAt(0));
    System.out.println(s1.charAt(1));
    System.out.println(s1.charAt(2));
    System.out.println(s1.charAt(3));
    System.out.println(s1.charAt(4));
    char firstChar = s1.charAt(4);
    System.out.println(firstChar);

    // System.out.println(s1.charAt(10)); // Exception (System Error)

    // Name convention - Java
    // Camel case
    String studentName = "John";
    System.out.println(studentName);





  }
  
}
