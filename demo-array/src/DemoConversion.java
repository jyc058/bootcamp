public class DemoConversion {
  public static void main(String[] args) {
    int x = 3;
    // because it is safe conversion, so java helps auto-convert
    long l = x;
    System.out.println(l); // 3

    // because it is safe conversion, so java helps auto-convert
    double d1 = 0.3f;
    System.out.println(d1); // 0.3 (floating point ...)
    
    // ! Not OK, x is variable of int, unsafe conversion, java reject auto-conversion
    //byte b1 = x;
    byte b1 = (byte) x; // may cause overflow

    // ! Implicit conversion
    // ! byte -> short -> int -> long -> float -> double
    // ! char -> int
    double d2 = 3L;
    System.out.println(d2); // 3.0

    float f2 = 4L;
    System.out.println(f2); // 4.0

    int ascii = 'a';
    System.out.println(ascii); // 97
    // 0, A, a
    int assciiofA = 'A';
    System.out.println(assciiofA); // 65
    int assciiof0 = '0';
    System.out.println(assciiof0); // 48

    // ! 2. Explicit conversion
    int x2 = 8;
    short s2 = (short) x2;

    // ! 3. autobox, unbox
    int x3 = Integer.valueOf(9); // unbox
    Integer x4 = x3;


  }
}
