public enum Weapon {
  SWORD1(10, 0, 5, "Doran", 1, "Warrior"),
  SWORD2(20, 0, 10, "Doran", 2, "Warrior"),
  SWORD3(30, 0, 15, "Doran", 3, "Warrior");
private int PA;
private int MA;
private int CC;
private String weaponName;
public int level;
private String compatibleClass;

Weapon(int PA, int MA, int CC, String weaponName, int level) {
  this.PA = PA;
  this.MA = MA;
  this.CC = CC;
  this.weaponName = weaponName;
  this.level = level;
  this.compatibleClass = compatibleClass;
}

public int getPA() {
  return this.PA;
}

public int getMA() {
  return this.MA;
}

public int getCC() {
  return this.CC;
}

public String getWeaponName() {
  return this.weaponName;
}

public int getLevel() {
  return this.level;
}

public String getCompatibleClass() {
  return this.compatibleClass;
}

public boolean canEquip(String characterClass) {
  return this.compatibleClass.equalsIgnoreCase(characterClass);
}
}