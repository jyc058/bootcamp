public class Ball {
  private String MonsterType;
  private String AttackValue;

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
