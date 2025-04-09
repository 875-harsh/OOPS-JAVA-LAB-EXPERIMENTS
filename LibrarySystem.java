class LibraryItem {
  String title;
  int itemId;
  boolean checkedOut;

  LibraryItem(String title, int itemId) {
      this.title = title;
      this.itemId = itemId;
      this.checkedOut = false;
  }

  void checkOut() {
      if (checkedOut) {
          System.out.println(title + " is already checked out.");
      } else {
          checkedOut = true;
          System.out.println(title + " has been checked out.");
      }
  }

  void returnItem() {
      if (!checkedOut) {
          System.out.println(title + " was not checked out.");
      } else {
          checkedOut = false;
          System.out.println(title + " has been returned.");
      }
  }
}

class Book extends today10feb {
  Book(String title, int itemId) {
      super(title, itemId);
  }
}

class DVD extends LibraryItem {
  DVD(String title, int itemId) {
      super(title, itemId);
  }
}

class Journal extends LibraryItem {
  Journal(String title, int itemId) {
      super(title, itemId);
  }
}

public class LibrarySystem {
  public static void main(String[] args) {
      Book book = new Book("The Great Gatsby", 101);
      DVD dvd = new DVD("Inception", 202);
      Journal journal = new Journal("Nature", 303);

      book.checkOut();
      book.returnItem();
  }
}