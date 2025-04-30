public class Hero {
  private String ID;
  private int Level;
  private int HealthPoint;
  private int ManaPoint;
  private int PhysicalAttack;
  private int MagicalAttack;
  private int PhysicalDefense;
  private int MagicalDefense;
  private int Agility;
  private int CriticalDamageChance;
  private int CriticalDamage;

  
public Hero() {

}

public Hero (String ID, int Level, int HealthPoint, int ManaPoint, int PhysicalAttack,
    int MagicalAttack, int PhysicalDefense, int MagicalDefense, int Agility,
    int CriticalDamageChance, int CriticalDamage) {
  this.ID = ID;
  this.Level = Level;
  this.HealthPoint = HealthPoint;
  this.ManaPoint = ManaPoint;
  this.PhysicalAttack = PhysicalAttack;
  this.MagicalAttack = MagicalAttack;
  this.PhysicalDefense = PhysicalDefense;
  this.MagicalDefense = MagicalDefense;
  this.Agility = Agility;
  this.CriticalDamageChance = CriticalDamageChance;
  this.CriticalDamage = CriticalDamage;
}

public String getID() {
  return ID;
}
public void setID(String ID) {
  this.ID = ID;
}
public int getLevel() {
  return Level;
}
public void setLevel(int Level) {
  this.Level = Level;
}
public int getHealthPoint() {
  return HealthPoint;
}
public void setHealthPoint(int HealthPoint) {
  this.HealthPoint = HealthPoint;
}
public int getManaPoint() {
  return ManaPoint;
}
public void setManaPoint(int ManaPoint) {
  this.ManaPoint = ManaPoint;
}
public int getPhysicalAttack() {
  return PhysicalAttack;
}
public void setPhysicalAttack(int PhysicalAttack) {
  this.PhysicalAttack = PhysicalAttack;
}
public int getMagicalAttack() {
  return MagicalAttack;
}
public void setMagicalAttack(int MagicalAttack) {
  this.MagicalAttack = MagicalAttack;
}
public int getPhysicalDefense() {
  return PhysicalDefense;
}
public void setPhysicalDefense(int PhysicalDefense) {
  this.PhysicalDefense = PhysicalDefense;
}
public int getMagicalDefense() {
  return MagicalDefense;
}
public void setMagicalDefense(int MagicalDefense) {
  this.MagicalDefense = MagicalDefense;
}
public int getAgility() {
  return Agility;
}
public void setAgility(int Agility) {
  this.Agility = Agility;
}
public int getCriticalDamageChance() {
  return CriticalDamageChance;
}
public void setCriticalDamageChance(int CriticalDamageChance) {
  this.CriticalDamageChance = CriticalDamageChance;
}
public int getCriticalDamage() {
  return CriticalDamage;
}
public void setCriticalDamage(int CriticalDamage) {
  this.CriticalDamage = CriticalDamage;
}

public static void main(String[] args) {
  
}
}