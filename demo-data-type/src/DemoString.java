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

    String s8 = "goodbye";
    double s9 = 1.2;
    char s10 = '#';
    int s6 = 321;
    int s7 = 123;
    String omg = s8 + s9 + s10 + s6 + s7;
    System.out.println(omg);

    // String + int -> String (step 1)
    // Assign String value to String variable (step 2)
    String s3 = "hello" + 13;
    System.out.println(s3);

    // String + boolean -> String
    s3 = s3 + true;
    System.out.println(s3);

    // equals() -> tools
    // ! primitive has no tools (value storage ONLY)
    // String is not a primitive.
    String s4 = "hello";
    s4.equals("hello");// asking if s4 equals to "hello"
    System.out.println(s4.equals("hello"));// true, asking if s4 equals to "hello"
    System.out.println(s4.equals("male"));// false, asking if s4 equals to "male"


    boolean result = s4.equals("hello");
    System.out.println(result); // true
    System.out.println(s4.equals("Hello"));//false

    // ! mine
    String s99 = "byebye";
    s99.equals("byebye");
    System.out.println(s99.equals("byebye"));

    // ! String method 2: length()
    //參數 = parameter
    // length() has no parameters
    System.out.println(s4.length());//5
    int s4Length = s4.length();
    System.out.println(s4Length);

    double d1 = s4.length(); // ! Why OK?
    // short s1 = s4.length(); // ! why NOT OK?

    // ! String method 3 : CharAt()
    // 1 = index, which always start with 0, 
    System.out.println(s4.charAt(1)); //e
    System.out.println(s4.charAt(0)); //h


    
  }
  
}
