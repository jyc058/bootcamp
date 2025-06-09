public class DemoSwitchExpression {


  // Java 14
  public static void main(String[] args) {
    // ! switch cannotdo :
      // ! 1. range checking
      // ! 2. AND OR

    // ! Switch cannot do range checking
    int score = 95;
    char grade = ' ';
    switch (score) {
      case 90:
      grade = 'A';
      break;
      case 91:
      grade = 'A';
      break;
      // ....
      default:
      break;
    }

    // But for enum, it is better to use switch, because the number of enum values is finite
    // ! still cannot use OR
    // ! still 
    WEEKDAY weekday = WEEKDAY.WED;
    switch (weekday) {
      case MON:
      System.out.println("Learn Java");
      break;
      case TUE:
      System.out.println("Learn Java");
      break;
      // ! forgot to write the code for wednesday
      case THU:
      System.out.println("sleep");
      break;
      case FRI:
      System.out.println("Take a rest");
      break;
      default:
      System.out.println("i dont know");
      break;
    }
    WEEKDAY weekday2 = WEEKDAY.WED;
    //Java 14: Switch Expression
    switch (weekday2) {
      case MON, TUE -> {
        System.out.println("I am learning Java");
        System.out.println("I am learning Math");
      }
      case WED -> System.out.println("I am learning Python");
      case THU -> System.out.println("Sleep...");
      // case THU -> System.out.println("Sleep..."); // ! check if duplicated
      // case FRI -> System.out.println("I am taking rest"); // ! After Java 21, cannot check missing value
      default -> System.out.println("i do nothing...");
    }
  }

  public static enum WEEKDAY {
    MON, TUE, WED, THU, FRI,;
  }
}
