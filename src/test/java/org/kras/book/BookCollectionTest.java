package org.kras.book;

import org.junit.jupiter.api.Test;

class BookCollectionTest {
    @Test
    void givenBoolCollection_whenCollectionFormed_thenUseComposite() {
        Book nonfictionBook = new NonfictionBook("A Brief History of Time");
        Book fictionBookOne = new FictionBook("Hamlet", true);
        Book fictionBookTwo = new FictionBook("The Great Gatsby", false);

        BookCollection bookCollection = new BookCollection();
        bookCollection.add(nonfictionBook);
        bookCollection.add(fictionBookOne);
        bookCollection.add(fictionBookTwo);

        nonfictionBook.checkout();
        fictionBookOne.checkout();
        bookCollection.checkout();

        bookCollection.returnBook();

    }

}