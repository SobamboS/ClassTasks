package bookstoread;
    import java.util.Collections;
    import java.util.Comparator;
    import java.util.List;
    import java.util.ArrayList;

public class BookShelf {

        private final List<String> books = new ArrayList<>();

        public void add(String bookToAdd) {
            books.add(bookToAdd);
    }

   public void add ( ) {
   }
    public List<String> books() {
        return Collections.unmodifiableList(books);
    }

    public List<String> arrange ( ) {
        books.sort( Comparator.naturalOrder());
        return books;
    }
    }
