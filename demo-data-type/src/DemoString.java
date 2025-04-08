public class DemoString {
  public static void main(String[] args) {
    char c1 = 'H';
    // String is not a primitive
    String s1 = "Hello";
    String s2 = "100";

    // String + operation
    s2 = s2 + "100";
    System.out.println(s2); // "100100"
    s1 = s1 + "100";
    System.out.println(s1); // "Hello100"

    String s3 = "goodbye";
    double s4 = 1.2;
    char s5 = '#';
    int s6 = 321;
    int s7 = 123;
    String omg = s3 + s4 + s5 + s6 + s7;
    System.out.println(omg);


    
  }
  
}
