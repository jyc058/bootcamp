public class DemoEncapsulation {
  public static void main(String[] args) {
    // Encapsulation

    // Role of writing program
    // ! 1. Author
    // ! 2. User

  // ! Author
    // Customer. Oder, Item
    // Customer has Orders (Order[])
    // Order has Item (Item[])
    // Customer.class -> add(order order)
    // Order.class -> add(Item item)
    // Order.class ->remove(Item item)

  // Encapsulation (done by Author)
    // 1. Author use array to present One to Many (In future, Author can use Arraylist instead of array)
    // And
    // 2. provide add() and remove(), but NO setter & getter
  
  // ! from Author perspective
    // Access Control for attbributes (read and write)
    // The ways to store data (data structure)

  // ! from user perspective
  // Readablility (Convenient for calling method, easy to understand)
    // customerA.add(order)
    // orderA.add(itemA)
  }
}
