// ! "extends Exception" -> InvalidPasswordException become "check Exception"
public class InvalidPasswordException extends Exception {

  // Parent Class Exception by default contain "message" attribute
  public InvalidPasswordException() {

  }
  
  public InvalidPasswordException(String message) {
    super(message);
  }



  public static void main(String[] args) {
    // ! During compile time, we have to handle checked exception
    // One of the " exception handling" : try and catch
    try {
      int result = isValidPassword("Acd12!");
      System.out.println(result);
    } catch (InvalidPasswordException e) {
      System.out.println("this is InvalidPassword:" + e.getMessage());
    }
  }

  // ! method signature -> throws
  // potentially throw exception -> method caller has to handle the exception
  public static int isValidPassword(String password)
      throws InvalidPasswordException {
    // length > 8 -> 1
    // length > 8 and contains number and english characters -> 2
    // length > 8 and contains number and english characters and special char ($#!) -> 3
    // otherwise, throw InvalidPasswordException
    // loop + ascii code

    if (password != null || password != null && password.length() <= 8) {
      throw new InvalidPasswordException("Invalid. Password Length <= 8."); // force you to "handle"
    }
    boolean foundNumber = false;
    boolean foundEnglish = false;
    boolean foundSpecialChar = false;
    for (char ch : password.toCharArray()) {
      if (ch >= '0' && ch <= '9') { // 0 - 9
        foundNumber = true;
      } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') { // a - z or A - Z
        foundEnglish = true;
      } else if (ch == '$' || ch == '#' || ch == '!') {
        foundSpecialChar = true;
      }
    }
    if (!foundEnglish) {
      throw new InvalidPasswordException("Invalid. English Character is not found");
    } else if (foundNumber && foundSpecialChar) {
      return 3;
    } else {
      return 2;
    }
  }
}
