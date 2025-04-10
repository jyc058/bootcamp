import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("please input a number");
    int input = scanner.nextInt();


    // System.out.println("input=" + input);

    // Determine if the input is odd or even number

    if (input % 2 == 1) {
      System.out.println("it is an odd number");
      } else {
        System.out.println("it is an an even number");
      }


    }
    // its odd number1
    // its even number
}
  
