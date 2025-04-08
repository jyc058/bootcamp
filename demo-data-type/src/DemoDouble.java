public class DemoDouble {
  public static void main(String[] args) {
    int x = 9;

    // Store a number with d.p.i
    // Type: double
    double y = 9.9;
    System.out.println(y);

    // ! We cannot store d.p. into an integer variable
    // x = 9.9;

    // Store 99.9 into variable price
    // Store 3 into variable quantity
    // calculate checkout amount
    double p = 99.9;
    int goods = 3;
    double amount = p * goods;
    System.out.println(amount);


    // ! problem for "double"
    double o1 = 0.1 + 0.2;
    System.out.println(o1);

    // ! int / int -> int
    // 10 -> int value
    // 3 -> int value
    // 1. 10 / 3 -> int / int -> (10 / 3 -> 3)
    // 2. assign result into w (3 -> 3.0)
    double w = 10 / 3;
    System.out.println(w);

    // ! double / int -> double
    int score1 = 71;
    int score2 = 82;
    // Calculate the average score
    // (int + int) / int -> int (71 +82) / 2 -> 76
    // Step 2: 76 -> 76.0
    double average = (score1 + score2) / 2;

    // ! understand why 76.0? but not 76.5
    System.out.println(average); 
    
    // ! divided by zero -> system error
    // double r3 = 10/ 0;
    // System.out.println(r3);

    double r4 = 0 / 10;
    System.out.println(r4); // 0.0

    



  }
}