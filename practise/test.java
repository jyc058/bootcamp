package practise;

import java.util.Arrays;

public class test {
  public static void main(String[] args) {
    
    String s11 = "kLKloOOu";
    String uppercase = s11.toUpperCase();
    int cou = 0;
    for (int i = 0; i < s11.length(); i++) {
      if (s11.charAt(i) == uppercase.charAt(i) ) {
        cou++;
      }
    }
    System.out.println(cou);



  }
  
}
