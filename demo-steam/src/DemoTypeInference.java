public class DemoTypeInference {
  // private var age;


  public static void main(String[] args) {
    // Java is Strong type
    String s = "hello";
    
    // Java 10
    var s2 = "Oscar";
    // ! During compile time (java file -> class file), var -> String
    // s2 = 13; 
    // Java is able to check s2 is with String Type during compile time.
    // so you cannot put a non-String value after Line 7
    
    // s2.charAt(0);
    var s3 = new Ball(Ball.Color.BLUE, 13);
    // s3 = "Oscar";
  }
}
