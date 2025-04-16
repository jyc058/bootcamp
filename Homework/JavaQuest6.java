public class JavaQuest6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ... 
   * 
   */
  public static void main(String[] args) {
    int first = 0, second = 1;
    // for loop to print first 15 numbers in Fibonacci Sequence
    for (int i = 2; i < 15; i++) {
      int nextNumber = first + second;
      System.out.println(" " + nextNumber);
      first = second;
      second = nextNumber;
      
    }
  }
}
