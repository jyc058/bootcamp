import java.util.Arrays;
import java.util.Random;

public class DemoMath {
  public static void main(String[] args) {
    // abs
    // pow

    // int -> double (safe -> auto-conversion)
    double result = Math.pow(2.0, 3.0);
    System.out.println(result); // 8.0

    // square root
    System.out.println(Math.sqrt(81)); // 9.0

    System.out.println(Math.abs(-3.0)); // 3.0

    // Round to integer
    System.out.println(Math.round(3.24)); // 3
    System.out.println(Math.round(3.7928392839283)); // 4

    // 0 - 1
    System.out.println(Math.random());

    // 0 - 100
    System.out.println(Math.random() * 100);

    System.out.println(new Random().nextInt(3)); // 0 - 2

    // 1 - 3
    System.out.println(new Random().nextInt(3) + 1); // 1 - 3

    // 0 - 48
    // 1 - 49
    System.out.println(new Random().nextInt(49) + 1); // 1 - 49

    // Generate 6 different numbers between 1-49
    int[] marksix = new int[6];
    int k = 0;
    while (k < 6) {
      marksix[k] = new Random().nextInt(49) + 1;
      k++;
    }

    // Generate 6 different numbers between 1 - 49
    int[] marksix2 = new int[6];
    int uniqueCount = 0;
    boolean isDuplicated = false;
    while (uniqueCount < 6) {
      int generatedValue = new Random().nextInt(49) + 1;
      isDuplicated = false;
      // Check if generated value is already in the array -> isDuplicated
      for (int i = 0; i < marksix2.length; i++)
        if (marksix[i] == generatedValue) {
          isDuplicated = true;
          break;
        }
      if (!isDuplicated) {
        marksix2[uniqueCount] = generatedValue;
        uniqueCount++;
      }
    }
    System.out.println(Arrays.toString(marksix2));
  
  }
}
