public abstract class Book implements Borrowable {
  private String title;
  private boolean isBorrowed;

  public Book(String title) {
    this.title = title;
    this.isBorrowed = false;
  }

  public String getTitle() {
    return this.title;
  }

  @Override
  public boolean isBorrowed() {
    return this.isBorrowed;
  }

  @Override
  public void borrow() {
    isBorrowed = true;
  }

  
}
