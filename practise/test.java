package practise;

import java.math.BigDecimal;
import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    
    String s19 = "40289";
    char maxDigit = '9';
    char minDigit = '0';
    for (int i = 0; i < s19.length(); i++) {
      char r = s19.charAt(i);
      if (r > maxDigit) {
        maxDigit = r;
      }
      if (r < minDigit) {
        minDigit = r;
      }
    }
    String swap = s19.replace(maxDigit, 'x')
    .replace(minDigit, maxDigit )
    .replace('x', minDigit);
    System.out.println(swap);
  }
  }
  

