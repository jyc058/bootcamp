public class Child {
  private Candy[] candies; // Not an array object

  public Child() {
    this.candies = new Candy[0];
  }

  public Candy[] getCandies() {
    return this.candies;
  }

  public boolean receive(Candy newCandy) {
    if (newCandy == null) {
      return false;
    }
    Candy[] newCandies = new Candy[this.candies.length + 1];
    for (int i = 0; i < this.candies.length; i++) {
      newCandies[i] = this.candies[i];
    }
    newCandies[newCandies.length - 1] = newCandy;
    this.candies = newCandies;
    return true;
  }
  // 20 Candy
  // Candy has color (RED, PURPLE, YELLOW)
  // Teacher distributes candy to child (6 children)

  // Print out the color of candy per child

  // Child Candy[]
  // Bag Ball[]
  // Archer HP

  public static void main(String[] args) {
    int[] arr = new int[] {3, 2, 1};
    int[] arr2 = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      arr2[i] = arr[i];
    }

    Cat c1 = new Cat("Tommy", 12); //
    // c1 -> address
    c1.getName();

  }
}
