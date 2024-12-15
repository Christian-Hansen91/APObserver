package opg2.implementations;

import opg2.interfaces.BookObserver;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class Salesman implements BookObserver {
    private final String name; // not empty

    public Salesman(String name) {
        this.name = name;
    }

    @Override
    public void update(Book book) {
        Set<Book> uniqueBooks = new HashSet<>();
        for (Customer customer : book.getCustomers()) {
            for (Book customerBook : customer.getBooks()) {
                if (!customerBook.equals(book)) uniqueBooks.add(customerBook);
            }
        }
        if (uniqueBooks.size() == 0) System.out.println("this was their first purchase");
        else {
            System.out.println("they also bought: ");
            for (Book uniqueBook : uniqueBooks) {
                System.out.println(uniqueBook);
            }
        }
    }
}