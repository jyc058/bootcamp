import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    //double + double
    System.out.println(0.1 + 0.2); // 0.33333333334
    
    // Solution
    BigDecimal bd1 = new BigDecimal("0.1"); // approach 1
    BigDecimal bd2 = BigDecimal.valueOf(0.2); // approach 2 (prefer)
    System.out.println(bd1);
    System.out.println(bd2);

    // bd1 + bd2 -> 0.3
    // ! add()
    BigDecimal bd3 = bd1.add(bd2);
    System.out.println(bd3); // 0.3
    System.out.println(bd1); // 0.1
    System.out.println(bd2); // 0.2

    // ! subtract()
    BigDecimal bd4 = bd1.subtract(bd2);
    System.out.println(bd4);

    // ! multiply()
    BigDecimal bd5 = bd1.multiply(bd2);
    System.out.println(bd5);

    // ! divide()
    BigDecimal bd6 = bd1.divide(bd2);
    System.out.println(bd6);

    // 10 / 3
    // rounding? 3.45 -> 3.4 (HALF_DOWN)? 3.45 -> 3.5 (HALF_UP)?
    
    //BigDecimal divide BigDecimal
    // BigDecimal three = BigDecimal.valueOf(3.0)

    //Non-terminating decimal expansion
    BigDecimal bd7 = BigDecimal.valueOf(10.0).divide(BigDecimal.valueOf(3.0), 2, RoundingMode.HALF_UP);
    System.out.println(bd7);

    // 8.5 / 2 -> 4.25 (half up) -> 4.3
    BigDecimal bd9 = BigDecimal.valueOf(8.5).divide(BigDecimal.valueOf(2.0), 1, RoundingMode.HALF_UP);
    System.out.println(bd9); // 4.3
    
    //8.5 / 2 -> 4.25 (half down) -> 4.2
    BigDecimal bd10 = BigDecimal.valueOf(8.5).divide(BigDecimal.valueOf(2.0), 1, RoundingMode.HALF_DOWN);
    System.out.println(bd10); // 4.2

    BigDecimal bd11 = new BigDecimal("5").divide(BigDecimal.valueOf(2));
    System.out.println(bd11); // 2.5

    System.out.println(BigDecimal.valueOf(-2).abs()); // 2
    System.out.println(BigDecimal.valueOf(2).pow(3)); // 8
    
    BigDecimal source = BigDecimal.valueOf(2);
    double result = source.doubleValue();
    long result2 = source.longValue();
    int result3 = source.intValue();
    float result4 = source.floatValue(); //float -> double
    
    System.out.println(source); // "2"
    
    BigDecimal bd8 = new BigDecimal("10").divide(BigDecimal.valueOf(3.0), 1, RoundingMode.HALF_EVEN);
    
  }
}
