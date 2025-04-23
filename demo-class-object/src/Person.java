import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // height weight -> bmi
  private double height;
  private double weight;

  public Person() {

  }

  // !!!!!!!!!!!!!!!! all arguement constructor
  public Person(double height, double weight) {
  this.height = height;
  this.weight = weight;
  }

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

  public static void main(String[] args) {
    Person jacky = new Person();
    jacky.setHeight(1.76);
    jacky.setWeight(90);
    System.out.println(jacky.getBmi());
    System.out.println(jacky.getWeightStatus());

    Person kawachii = new Person (3.0, 999);
    System.out.println(kawachii.getBmi());
    System.out.println(kawachii.getWeightStatus());

  }
}


