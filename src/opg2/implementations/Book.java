package opg2.implementations;

import java.util.*;
import opg2.interfaces.*;
public class Book implements BookObserver {
    private final String title; // not empty
    private int count;
    private List<Customer> customers;

    public Book(String title) {
        this.title = title;
        this.count = 0;
        this.customers = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public int getCount() {
        return count;
    }

    public void incCount(int amount) {
        count += amount;
    }

    public void decCount(int amount) {
        count -= amount;
    }

    @Override
    public String toString() {
        return title + "(" + count + ")";
    }

    public void addCustomer(Customer customer) {
        if (!customers.contains(customer)) {
            customers.add(customer);
            customer.addBook(this);
        }
    }
}
