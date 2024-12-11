package interfaces;

import Implementations.BagObserver;

public interface SubjectBag {
    public void addObs(BagObserver bo);
    public void removeObs(BagObserver bo);
    public void update(String s);
}
