package opg1.Implementations;

import opg1.interfaces.ObserverInterface;

public class BagObserver implements ObserverInterface {
    @Override
    public void update(String s, int i) {
        System.out.println("key: " + s + ", value: " + i);
    }
}
