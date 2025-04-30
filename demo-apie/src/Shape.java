public abstract class Shape { 
  // Parent class
  // 1. Concrete class - can be "new"
  // 2. Abstract class - cannot be "new"

  // Abstract Class:
  // 1. May contain abstract method

  private String color;
  // Child inherit attributes, instance methods
  // But cannot inherit constructor

  // constructor
  // super("Red")
  public Shape() {

  }

  public Shape(String color) {
    this.color = color;
  }

  // Getter Setter
  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color; 
  }

  public abstract double area();
  
  public static void main(String[] args) {
    //Shape shape = new Shape();
    Circle circle = new Circle(3.0, "RED");
    System.out.println(circle.getColor());
    System.out.println(circle.getRadius());
  }
}
