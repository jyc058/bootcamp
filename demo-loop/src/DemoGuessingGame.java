import java.util.Scanner;

public class DemoGuessingGame {
  public static void main(String[] args) {
    // 1 - 100
    // Bomb = 67

    // User A: 93 (1-100)
    // User B: 49 (1-92)
    // User A: 66 (50-92)
    // User B: 68 (67-92)
    // User A: 67 (67-67) -> User B win.

    int bomb = 67; // random number
    // While loop
    // Scanner (Collect user input)
    // ! User A and B ?
    // Adjust the range of numbers
    // Prompt Question: "Please input a number:"
    // continue condition
    // Prompt Question
    // collect input
    //
    // Adjust the range of number

    Scanner scanner = new Scanner(System.in);
 
    int input = -1;
    int min = 1;
    int max = 100;
    int round = 0;
    char user = 'A';

    while (input != bomb) {
      
      if (round % 2 == 0) {
        user = 'A';
      } else {
        user = 'B';
      }
    
      System.out.println("User " + user + ",please input a number between" + min + "-" + max);
    input = scanner.nextInt();

      if (input < min || input > max) {
        continue;
      }


    if (input > bomb) {
      max = input - 1;
      } else {
      min = input + 1;
      }
      round++;
    
    
    }
    if (round % 2 == 1) {
      user = 'B';
    } else {
      user = 'A';
    }
    System.out.println("Game Over," + "User" + user + ",win.");
    scanner.close();
    
  }

}
