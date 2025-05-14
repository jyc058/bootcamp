// ! Advantage of BookShelf
public class BookShelf {
  private static final int MAX_SIZE = 3;
  private Book[] books;

  public BookShelf() {
    books = new Book[0];
  }

  public boolean isFull() {
    return this.books.length >= MAX_SIZE;
  }

  public Book[] getBooks() {
    return this.books;
  }

  public boolean remove(Book book) {
    for (int i = 0; i < this.books.length; i++) {
      if(this.books[i].equals(book)) {
        this.books[i] = null;
        return true;
    }
  }
  return false;
  }

  public boolean add(Book newBook) {
    if (newBook == null || isFull()) {
      return false;
    }
    Book[] newBooks = new Book[this.books.length + 1];
    for (int i = 0; i < this.books.length; i++) {
      newBooks[i] = this.books[i];
    }
    newBooks[newBooks.length - 1] = newBook;
    this.books = newBooks;
    return true;
  }
  public static void main(String[] args) {
    BookShelf bookShelf = (new BookShelf());
    bookShelf.add(new Book(1, "ABC"));
  }
}
