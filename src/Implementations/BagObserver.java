package Implementations;

import interfaces.ObserverInterface;
import interfaces.SubjectBag;

public class BagObserver implements ObserverInterface {
    @Override
    public void update(String s, int i) {
        System.out.println("key: " + s + ", value: " + i);
    }

    @Override
    public void display() {

    }
}
