package bookstoread;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookShelfSpec {
     private BookShelf shelf;

     @BeforeEach
     void startWithThis() {shelf = new BookShelf ();}

    @Test
    void shelfEmptyWhenNoBookAdded ( ) {
        List<String> books = shelf.books ( );
        assertTrue ( books.isEmpty ( ), "BookShelf should be empty." );
    }

    @Test
    void bookshelfContainsTwoBooksWhenTwoBooksAdded() {
        shelf.add("Effective Java");
        shelf.add("Code Complete");
        List<String> books = shelf.books();
        assertEquals(2, books.size(), "BookShelf should have two books." );
    }
    @Test
    public void emptyBookShelfWhenAddIsCalledWithoutBooks() {
        shelf.add();
        List<String> books = shelf.books();
        assertTrue(books.isEmpty(), "BookShelf should be empty." );
    }
    @Test
    void booksReturnedFromBookShelfIsImmutableForClient() {
        shelf.add ( "Effective Java" );
        shelf.add ( "House On The Rock" );
        List<String> books = shelf.books ( );
        try {
            books.add ( "The Mythical Man-Month" );
            fail ( "Should not be able to add book to books" );
        } catch (Exception e) {
            assertTrue ( e instanceof UnsupportedOperationException, "Should throw UnsupportedOperationException." );
        }
    }

   @Test
        void bookshelfArrangedByBookTitle() {
            BookShelf shelf = new BookShelf();
            shelf.add("Effective Java");
       List<String> books = shelf.arrange ( );
            assertEquals( List.of ( "Effective Java" ), books,
                    "Books in a bookshelf should be arranged lexicographically by book title" );

 }}