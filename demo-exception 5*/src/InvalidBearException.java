import java.util.Scanner;
public class InvalidBearException extends Exception {
  
  public InvalidBearException(){

  }

  public InvalidBearException(String message) {
    super(message);
}

public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);
  System.out.println("Please enter the bear's name:");
    String name = scanner.nextLine();
System.out.println("Please enter the bear's age:");
      int age = scanner.nextInt();
  
  try {
    int uselessRubbish8237498091847 = isBabyBear(name, age);
  System.out.println("this is a baby bear");
   } catch (InvalidBearException e) {
    System.out.println("This is an fake baby bear " + e.getMessage());
   } 
   scanner.close();
}

public static int isBabyBear(String name, int age) throws InvalidBearException{
  if (name == null) {
    throw new InvalidBearException("babyBear need a name");
  }

  if (age >3) {
    throw new InvalidBearException("babyBear must be a baby, age younger than 3");
  }

  return 1;
}
}


