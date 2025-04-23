public class recap {
  private int age;
  private String name;
     

  //getter
  public int getage() {
    return this.age;
  }

  public String getname() {
    return this.name;
  }
  //setter
  public void setage(int age) {
    this.age = age;
  }

  public void setname(String name) {
    this.name = name;
  }
  
  // compareTo
    public int compareTo(recap recap) {
      if (this.age == recap.getage()) {
        return 0;
      } else if (this.age > recap.getage()) {
        return 1;
      } else {
        return -1;
      }
    }

    // method name -> presentation
    public boolean isElderly() {
      return this.age >= 65;
    }

  public static void main(String[] args) {
    
    recap w1 = new recap();
    w1.setage(12);

    recap w2 = new recap();
    w2.setage(14);

    System.out.println(w1 == w2);
    System.out.println(w1.compareTo(w2)); //-1

    if (w1.isElderly()) {

    }

    if (w1.getage() >= 65) {

    }

}
}