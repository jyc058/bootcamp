public class DemoASCII {
  public static void main(String [] args) {
    char x = 'a';
    System.out.println(x); // a

    // char: 0 - 6xxxx
    // int: 2.1b
    int ascii = x;
    System.out.println(ascii); // 97

    //b
    //z

    char k = '我';
    int tutor = k;
    System.out.println(tutor); // 25105

    char u = '。';
    int q = u;
    System.out.println(q); // 12290

    
    
    // char (Math operation)
    // char - char -> int - int
    System.out.println('b' - 'a'); // 1
    
    
    
    // given a-z, convert to 1-26
    char v = 'a';
    int converted = v - 'a' + 1;  // ! Formula 背 唔洗郁
    System.out.println(converted); // 26
    
    








  }
}
