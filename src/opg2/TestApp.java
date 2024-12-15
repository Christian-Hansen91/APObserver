package opg2;

import opg2.implementations.Book;
import opg2.implementations.Buyer;
import opg2.implementations.Customer;
import opg2.implementations.Salesman;

public class TestApp {

    public static void main(String[] args) {
        Salesman salesman = new Salesman("christian");
        Buyer buyer = new Buyer("også christian");

        Book donaldDuck = new Book("Donald Duck");
        donaldDuck.addObserver(salesman);
        donaldDuck.addObserver(buyer);

        buyer.buyBook(donaldDuck, 6);
        System.out.println();

        Book java = new Book("Java");
        java.addObserver(salesman);
        java.addObserver(buyer);

        buyer.buyBook(java, 8);
        System.out.println();

        Book designPatterns = new Book("Design Patterns");
        designPatterns.addObserver(buyer);
        designPatterns.addObserver(salesman);

        buyer.buyBook(designPatterns, 10);
        System.out.println();

        Customer bob = new Customer("Bob");
        Customer alice = new Customer("Alice");
        Customer harry = new Customer("Harry");

        //---------------------------------------------------------------------

        makeSale(donaldDuck, bob);
        System.out.println();
        makeSale(donaldDuck, alice);
        System.out.println();
        makeSale(donaldDuck, harry);
        System.out.println();

        makeSale(java, bob);
        System.out.println();
        makeSale(java, alice);
        System.out.println();
        makeSale(java, harry);
        System.out.println();

        makeSale(designPatterns, bob);
        System.out.println();
        for (Book book : bob.getBooks()) {
            System.out.println("bob's book: " + book);
        }
        for (Book book : alice.getBooks()) {
            System.out.println("alice's book: " + book);
        }
        for (Book book : harry.getBooks()) {
            System.out.println("harry's book: " + book);
        }
    }

    public static void makeSale(Book b, Customer c) {
        System.out.println("Sale: " + b + " sold to " + c.getName());
        b.addCustomer(c);
        c.addBook(b);
        b.decCount(1);
    }
}
