public class Man {
  private static final int FIXED_TURN_DEGREE = 10;
  private int degree;

  public Man() {
    this.degree = 0;
  }
  
  // 1 -> EAST
  // 2 -> SOUTH
  // 3 -> WEST
  // 4 -> NORTH
  public String getDirection() { // EAST, SOUTH, NORTH, WEST
    // 280 / 90 -> 3
    // 280 % 90 -> 10
    // x < 45 -> 0
    // x > 45 -> + 1
    // switch case 1 ->
    int extra = this.degree % 90 < 45 ? 0 : 1;
    System.out.println(extra);
    int result = this.degree / 90 + extra;
    // 359 / 90 + 1 -> 4
    System.out.println(result);
    switch (result) {
        case 0:
            return "EAST";
        case 1:
            return "SOUTH";
        case 2:
            return "WEST";
        case 3:
            return "NORTH";
        case 4:
            return "NORTH";
        default:
            return "Null";
    }
  }

  // 0 - 10 -> 350
  // 360 / 350
  public void turnLeft() {
    this.degree = (this.degree - FIXED_TURN_DEGREE + 360) % 360;
  }

  public void trunRight() {
    this.degree = (this.degree + FIXED_TURN_DEGREE + 360) % 360;
  }

  public void setDirection(String direction) {
    this.degree += 10;  
  }
  public static void main(String[] args) {
    Man man = new Man();
    man.turnLeft();
    man.trunRight();
    

  }
}
