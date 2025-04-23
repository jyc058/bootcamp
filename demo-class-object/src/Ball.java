public class Ball {
  // attributes
  private String MonsterType;
  private String AttackValue;

  // constructor
  // ! by default, implicitly empty constructor exists
  // ! but once you define a new constructor, the empty constructor will disappear

  public Ball() {

  }

  // can be more than one constructor
  // All arguement constructor
  public Ball(String AttackValue) {
    this.AttackValue = AttackValue;
  }

  // setter
  public void setMonsterType(String MonsterType) {
    this.MonsterType = MonsterType;
  }

  public void setAttackValue(String AttackValue) {
    this.AttackValue = AttackValue;
  }

  // getter
  public String getMonsterType() {
    return this.MonsterType;
  }

  public String getAttackValue() {
    return this.AttackValue;
  }

  // main (create object, set, get)
  public static void main(String[] args) {
    // "new" associate with 
    Ball chiikawa = new Ball();
    chiikawa.setMonsterType("Stupid");
    chiikawa.setAttackValue("-10000");

    Ball Usagi = new Ball();
    Usagi.setMonsterType("brave");
    Usagi.setAttackValue("10000");

    String MonsterType = chiikawa.getMonsterType();
    String AttackValue = chiikawa.getAttackValue();
    System.out.println(MonsterType);
    System.out.println(AttackValue);

    System.out.println(Usagi.getMonsterType());
    System.out.println(Usagi.getAttackValue());


  }
}
