import java.math.BigDecimal;

public class Circle {
  private double radius;

  // area (presentation)
  // radius * radius * pi
  public void setRadius(double radius) {
    this.radius = radius;
  }
  public double getRadius() {
    return this.radius;
  }
  public double Area() {
    return BigDecimal.valueOf(Math.pow(this.radius, 2.0))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }

  //
  public static void main(String[] args) {
     Circle bigcircle = new Circle();
     bigcircle.setRadius(10);
     System.out.println(bigcircle.getRadius());
     System.out.println(bigcircle.Area());
      
      
  }
}
