package opg1;

import opg1.Implementations.BagObserver;
import opg1.Implementations.ObservableBag;

public class App {
    public static void main(String[] args) {
        BagObserver bo = new BagObserver();
        ObservableBag bag = new ObservableBag();
        bag.addObs(bo);

        bag.add("hej");
        bag.add("hej");
        bag.remove("hej");
        bag.add("yo");
        bag.add("yo");
        bag.removeObs(bo);
        for (String s : bag) {
            System.out.println(s);
        }
    }
}
