import Implementations.BagObserver;
import Implementations.ObservableBag;
import interfaces.Bag;
import interfaces.ObserverInterface;

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

    }
}
