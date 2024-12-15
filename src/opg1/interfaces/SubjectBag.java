package opg1.interfaces;

import opg1.Implementations.BagObserver;

public interface SubjectBag {
    public void addObs(BagObserver bo);
    public void removeObs(BagObserver bo);
    public void notify(String s);
}
