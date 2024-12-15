package opg2.implementations;

import opg2.interfaces.BookObserver;

public class Buyer implements BookObserver {
    private final String name; // not empty

    public Buyer(String name) {
        this.name = name;
    }

    public void buyBook(Book b, int amount) {
        b.incCount(amount);
        System.out.println("Buyer " + name + ": " + b + ", " + amount + " copies");
    }

    @Override
    public void update(Book book) {
        if(book.getCount() < 6) {
            buyBook(book, 10);
        }
    }
}
