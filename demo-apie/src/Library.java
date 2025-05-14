// Library, Book, Citizen
// extends. implements

// main: John, Mary (Citizen) -> want to borrow the same book
// for example, John borrow BookA -> success.
// Mary borrow BookA -> fail
public class Library {
  private BookShelf bookShelf;

  public Library() {
    bookShelf = new BookShelf();
  }

  public Library(Book book1, Book book2, Book book3) {
    BookShelf bookShelf = new BookShelf();
    bookShelf.add(book1);
    bookShelf.add(book2);
    bookShelf.add(book3);
    this.bookShelf = bookShelf;
  }

  public Book search(String bookName) {
    for (int i = 0; i < this.bookShelf.getBooks().length; i++) {
      if (this.bookShelf.getBooks()[i].getName().toLowerCase().contains(bookName.toLowerCase())) {
        return this.bookShelf.getBooks()[i];
      }
    }
    return null;
  }

  // ! equal()
  public boolean remove(Book book) {
    return this.bookShelf.remove(book);
  }

  public static void main(String[] args) {
    Book book1 = new Book(1, "ABC");
    Book book2 = new Book(2, "DEF");
    Book book3 = new Book(3, "IJK");
    Library library = new Library(book1, book2, book3);

    Citizen c1 = new Citizen("John");
    c1.setLibrary(library);
    Integer bookId = c1.search("IJ");
    if (bookId !=null) { // Found the book
      c1.borrow(new Book(bookId, "XXX"));
    }
  }
}
