import java.math.BigDecimal;
import java.util.Arrays;

public class LoopExecrise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    String word = "hello";
    for (int i = 0; i < 6; i++) {
      System.out.println(word);
    }

    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }
    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    for (int i = 0; i < 21; i++) {
      if (i % 2 == 0) {
        if (i > 1) {
          if (i < 21) {
            System.out.println(i);
          }
        }
      }
    }

    // 4. Print the numbers 1 - 100, which can be divided by 3 or 5
    // Use: for loop + if
    for (int i = 1; i < 101; i++) {
      if (i % 3 == 0) {
        if (i % 5 == 0) {
          System.out.println(i);
        }
      }
    }

    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    int box = 0;
    for (int i = 0; i < 16; i++) {
      box += i;
    }
    System.out.println(box);
    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if
    int evenSum = 0;
    int oddSum = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 != 0) {
        oddSum += i;
      } else {
        evenSum += i;
      }
    }
    System.out.println(oddSum + "and " + evenSum);
    System.out.println("Product=" + oddSum * evenSum);


    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi";
    if (str7.contains("d")) {
      System.out.println("d is found");
    } else {
      System.out.println("d is not found");
    }

    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    String s8a = "abcba";
    String s8b = "cba";
    boolean IsSubstring = false;
    int lengthA = s8a.length();
    int lengthB = s8b.length();
    for (int i = 0; i <= lengthA - lengthB; i++) {
      if (s8a.substring(i, i + lengthB).equals(s8b)) {
        IsSubstring = true;
        break;
      }
    }
    if (IsSubstring) {
      System.out.println("s8b is a substring");
    } else {
      System.out.println("s8b is not a substring");
    }

    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';
    int count = 0;
    for (int i = 0; i < s9.length(); i++) {
      if (s9.charAt(i) == c9) {
        count++;
      }
    }
    System.out.println("count=" + count);

    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    for (int i = 0; i < arr10.length; i++) {
      arr10[i] = arr10[i].replace('x', 'k');
    }
    System.out.println(Arrays.toString(arr10));

    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";
    String uppercase = s11.toUpperCase();
    int cou = 0;
    for (int i = 0; i < s11.length(); i++) {
      if (s11.charAt(i) == uppercase.charAt(i)) {
        cou++;
      }
    }
    System.out.println(cou);

    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****

    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    String s13 = "lrlaudbucp";
    int totalScore = 0;
    for (int i = 0; i < s13.length(); i++) {
      char word1 = s13.charAt(i);
      switch (word1) {
        case 'l':
          totalScore += 1;
          break;
        case 'r':
        totalScore += 3;
        break;
        case'd':
        totalScore += 2;
        break;
        case'u':
        totalScore += 4;
        break;
        default:
        totalScore -= 1;
          break;
      }
    }
    System.out.println(totalScore);

    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[4];
    arr14[0] = 1L;
    arr14[1] = 4L;
    arr14[2] = 9L;
    arr14[3] = -4L;
      System.out.println(Arrays.toString(arr14));


    // 15. Find the max value and min value in arr14
    // Use One Loop + if
    //long[] arr14 = {1L, 4L, 9L, -4L};
    long maxValue = Long.MIN_VALUE;
    long minValue = Long.MAX_VALUE;
    for (int i = 0; i < arr14.length; i++) {
      if (arr14[i] > maxValue) {
        maxValue = arr14[i];
      }
        if (arr14[i] < minValue) {
          minValue = arr14[i];
        }
      }
    System.out.println("max value=" + maxValue);
    System.out.println("min value=" + minValue);


    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6
    float[] arr16 = {0.2f, 0.3f, 0.6f};
    System.out.println(Arrays.toString(arr16));

    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.7]
    // Use: BigDecimal
    
    BigDecimal[] bd1 = new BigDecimal[arr16.length];
    BigDecimal bd2 = BigDecimal.valueOf(0.1);
    for (int i = 0; i < arr16.length; i++) {
    BigDecimal bd3 = BigDecimal.valueOf(arr16[i]);
    bd1[i] = bd3.add(bd2);
    }
    float[] bd4 = new float[bd1.length];
    for (int i = 0; i < bd1.length; i++) {
      bd4[i] = bd1[i].floatValue(); 
    }
    System.out.println(Arrays.toString(bd1));


    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    // Print "count name=2"
    int coun = 0;
    for (int i = 0; i < arr18.length; i++) {
      if (arr18[i].equals(target)) {
        coun++;
      }
    }
    System.out.println("count name=" + coun);

    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
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



    // 20. Find the longest String in the String array
    // Print "longest=programming"
    String[] arr20 =
        new String[] {"python", "array", "programming", "java", "bootcamp"};
        String longest ="";
        for (int i = 0; i < arr20.length; i++) {
          if (arr20[i].length() > longest.length()) {
            longest = arr20[i];
          }
        }
        System.out.println("longest=" + longest);
  }
}
