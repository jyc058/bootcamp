import java.math.BigDecimal;

public class Customer { // blueprint 藍圖
  // ! class content 

  // Attributes
  // private -> by default, this object is not readable
  private String name;
  private String email;
  // ...
  private Order[] orders; // one customer has many orders, one order has many item

  // VIP, if the amount of all orders -> >= 10000 (boolean method isVIP())
  // customer1.isVIP() -> true / false

  public Customer() {
    this.orders = new Order[0];
  }

  public void add(Order order) {
    Order[] newOrders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = this.orders[i];
    }
    newOrders[newOrders.length -1] = order;
    this.orders = newOrders;
  } 

  // 1 second -> 1000ms
  // 0 - 1 ms
  // human being -> 0.1 s 0.2 s

  public boolean isVIP() {
   BigDecimal totalAmount = BigDecimal.valueOf(0.0);
   for (int i = 0; i < this.orders.length; i++) {
    totalAmount = totalAmount.add(BigDecimal.valueOf(this.orders[i].amount()));
   }
   return totalAmount.doubleValue() >= 10000;
  }
  
  // Setter
  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  // Getter
  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }


  // main method is NOT a must for a class file
  public static void main(String[] args) {
    String s = "hello";
    // ! create object (new ...)
    Customer john = new Customer();
    john.setName("John Chan");
    john.setEmail("john@gmail.com");

    Customer mary = new Customer();
    mary.setName("Mary Wong");
    mary.setEmail("mary@gmail.com");

    String name = john.getName();
    String email = john.getEmail();
    System.out.println(name);
    System.out.println(email);

    System.out.println(mary.getName());
    System.out.println(mary.getEmail());

    Order order1 = new Order();
    order1.add(new Item(15.3, 9));
    order1.add(new Item(2.5, 3));
    john.add(order1);
    
    Order order2 = new Order();
    order2.add(new Item(1000.3, 9));
    mary.add(order2);
    System.out.println(mary.isVIP()); // false
    
    Order order3 = new Order();
    order3.add(new Item(200.5, 10));
    mary.add(order3);
    System.out.println(mary.isVIP()); // true
    
  }
}
