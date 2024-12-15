package opg1.Implementations;

import opg1.interfaces.Bag;
import opg1.interfaces.SubjectBag;

import java.util.*;

public class ObservableBag implements Bag, SubjectBag, Iterable<String> {
    private Map<String, Integer> bag;
    private List<BagObserver> observers;

    public ObservableBag() {
        this.bag = new HashMap<>();
        this.observers = new ArrayList<>();
    }

    @Override
    public void add(String s) {
        if (bag.get(s) == null) bag.put(s, 1);
        else bag.put(s, bag.get(s) + 1);
        notify(s);
    }

    @Override
    public void remove(String s) {
        if (bag.get(s) != null) {
            bag.put(s, bag.get(s) - 1);
            notify(s);
        }
    }

    @Override
    public int getCount(String s) {
        return bag.get(s);
    }

    @Override
    public Iterator iterator() {
        return bag.keySet().iterator();
    }

    @Override
    public void addObs(BagObserver bo) {
        if (!observers.contains(bo)) observers.add(bo);
    }

    @Override
    public void removeObs(BagObserver bo) {
        observers.remove(bo);
    }

    @Override
    public void notify(String s) {
        int i = bag.get(s);
        for (BagObserver observer : observers) {
            observer.update(s, i);
        }
    }
}
