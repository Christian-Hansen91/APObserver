package opg2.implementations;

import opg2.interfaces.BookObserver;

import java.util.*;

public class Book {
    private final String title; // not empty
    private int count;
    private List<Customer> customers;
    private Set<BookObserver> observers;

    public Book(String title) {
        this.title = title;
        this.count = 0;
        this.customers = new ArrayList<>();
        this.observers = new HashSet<>();
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
        notifyObservers();
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

    public void addObserver(BookObserver obs) {
        observers.add(obs);
    }

    private void notifyObservers() {
        for (BookObserver observer : observers) {
            observer.update(this);
        }
    }

    public List<Customer> getCustomers() {
        return new ArrayList<>(customers);
    }
}
