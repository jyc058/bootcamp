import java.math.BigDecimal;

public class Item {
  private double price;
  private int quantity;

  public Item(double price, int quantity) {
    this.price = price;
    this.quantity = quantity; 
  }

  public void setPrice (double price) {
    this.price = price;
  }

  public void setPrice (int quantity) {
    this.quantity = quantity;
  }

  // item.getPrice()
  public double getPrice() {
    return this.price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public double amount() {
    return BigDecimal.valueOf(this.price)
    .multiply(BigDecimal.valueOf(this.quantity))
    .doubleValue();
  }
  public static void main(String[] args) {
    Item item1 = new Item();

  }
}
