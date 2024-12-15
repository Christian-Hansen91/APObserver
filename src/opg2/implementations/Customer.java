package opg2.implementations;

import java.util.*;

public class Customer {
    private final String name; // not empty
    private List<Book> books;

    public Customer(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            book.addCustomer(this);
        }
    }
    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }
}