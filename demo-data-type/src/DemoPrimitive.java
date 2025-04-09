public class DemoPrimitive {
  public static void main(String[] args) {
    // ! Primitives (int, double, long, short, byte, float, boolean, char)
    // 8 primitives in total for Java

    // Primitives for integer()
    int x = 10;

    // Range from -128 to 127
    byte b1 = 10;
    byte b2 = -128;
    byte b3 = 127;
    // byte b4 = 128;
    System.out.println(b1);

    //-32768 to 32xxx
    short s1 = 10;
    // short s2 = -32768; -> cannot
    System.out.println(s1);
    // System.out.println(s2);

    // int (2.1 b)
    // _ equal to ,
    int x1 = 2_100_000_000;
    int x2 = -2147483648;
    System.out.println(x1);
    System.out.println(x2);
    int x3 = 2147483647;

    // long
    // 10 is an int value
    // Assign int vaule to long value (NOT OK)
    // ! -2147483649 --> illegal int value
    // ! -2147483649L --> Long value
    long l1 = 10;
    long l2 = -2147483649L;
    System.out.println(l2);

    // long + int -> long
    l1 = l1 + 100;
    System.out.println(l1);

    x3 = x3 + 1;
    System.out.println(x3); // ! -2147483648 (overflow)
    x2 = x2 -1;
    System.out.println(x2); // ! 2147483647 (overflow)

    // b3 + 1
    // 1.byte + int -> int
    // 2.assign int to byte variable
    int i9 = 1;
    b3 = (byte) (b3 + i9); // force assignment
    System.out.println(b3); // -128 (overflow)

    int i10 = 1;
    byte b4 = 1;
    // byte + int -> int
    // assign int to byte (Java: unsafe -> not allow for assignment)
    b4 = (byte) (b4 + i10);
    System.out.println(b4); // 2

    // double, float
    // ! 9.5 is a double value
    // ! 9.5d is a float value
    // ! 9.5f is a float value
    double d1 = 9.5;
    double d2 = 9.5d;
    float f1 = 9.5f;

    // ! the type double is more precise than float.
    // float f2 = 9.5

    float f2 = 0.3f - 0.1f;
    System.out.println(f2); // 0.2000002 (same problem with double)

    // boolean
    boolean b10 = true;
    b10 = false;
    System.out.println(b10); // false

    int age = 66;
    // "age > 65" -> comparsion
    boolean isElderly = age > 65;
    System.out.println(isElderly); // true


    // char
    // store single character
    // 'a' -> char value
    // c1 -> char variable
    char c1 = 'a';
    char c2 = '#';
    char c3 = '2';
    char c4 = 'A';
    System.out.println(c3); // 2







  }
  
}
