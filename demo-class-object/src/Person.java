import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // height weight -> bmi
  // ! Attributes (Instance Varibale)
  // Instance means Object
  private double height;
  private double weight;
  private Name name;
  
  public Person() {

  }

  // !!!!!!!!!!!!!!!! all arguement constructor
  public Person(double height, double weight) {
  this.height = height;
  this.weight = weight;
  }

  // ! Instance Method 
  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  public double getBmi() {
    return BigDecimal.valueOf(this.weight)
        .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2,
            RoundingMode.HALF_UP)
        .doubleValue();
  }

  //static getBMI
  public static void getBMI(double height, double weight) {
    double bmi = BigDecimal.valueOf(weight)
        .divide(BigDecimal.valueOf(Math.pow(height, 2.0)), 2,
            RoundingMode.HALF_UP)
        .doubleValue();
    System.out.println(bmi);
  }

  // getWeightStatus (presentation)
  public String getWeightStatus() {
    double bmi = this.getBmi();
    if (bmi < 18.5) {
      return "Underweight"; // "return" -> exit method
    } else if (bmi >= 18.5 && bmi < 25.0) {
      return "Normal";
    } else if (bmi >= 25.0 && bmi < 30.0) {
      return "Overweight";
    }
    return "Obese";
  }

  public static String getWeightStatus(double height, double weight) {
    double bmi = BigDecimal.valueOf(weight)
    .divide(BigDecimal.valueOf(Math.pow(height, 2.0)), 2,
    RoundingMode.HALF_UP)
    .doubleValue();
    if (bmi < 18.5) {
      return "Underweight"; // "return" -> exit method
    } else if (bmi >= 18.5 && bmi < 25.0) {
      return "Normal";
    } else if (bmi >= 25.0 && bmi < 30.0) {
      return "Overweight";
    }
    return "Obese";
  }

  public static void main(String[] args) {
    Person jacky = new Person();
    jacky.setHeight(1.76);
    jacky.setWeight(90);
    System.out.println(jacky.getBmi());
    System.out.println(jacky.getWeightStatus());

    Person kawachii = new Person (3.0, 999);
    System.out.println(kawachii.getBmi());
    System.out.println(kawachii.getWeightStatus());

    Person.getBMI(3.0, 999);

    Person.getWeightStatus(1.8, 999);

  }
}


