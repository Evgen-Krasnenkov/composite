package org.kras.book;

import java.util.ArrayList;
import java.util.List;

public class BookCollection implements Book {

    private List<Book> books = new ArrayList();

    public void add(Book book) {
        books.add(book);
    }

    public void checkout() {
        books.forEach(Book::checkout);
    }

    public void returnBook() {
        books.forEach(Book::returnBook);
    }

}
