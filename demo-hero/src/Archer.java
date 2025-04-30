public class Archer extends Hero {
  
  public Archer() {
    setLevel(1);
    setHealthPoint(100);
    setManaPoint(80);
    setPhysicalAttack(100);
    setMagicalAttack(0);
    setPhysicalDefense(20);
    setMagicalDefense(10);
    setCriticalDamageChance(20);
    setCriticalDamage(100);
  }

  public void levelUp() {
    setLevel(getLevel() + 1); 
    setHealthPoint(getHealthPoint() + 10); 
    setManaPoint(getManaPoint() + 20); 

    setPhysicalAttack((int)(getPhysicalAttack() * 3) + 1); 
    setCriticalDamageChance((int)(getCriticalDamageChance() * 3)); 
    setCriticalDamage((int)(getCriticalDamage() * 3));
}


  public static void main(String[] args) {
    Archer arc = new Archer();
    System.out.println(arc.getLevel());

    arc.levelUp();
    System.out.println(arc.getLevel());
    System.out.println(arc.getCriticalDamageChance());
    arc.levelUp();
    System.out.println(arc.getLevel());
    System.out.println(arc.getCriticalDamageChance());
  }
}
