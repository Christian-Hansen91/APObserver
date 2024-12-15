package opg2.interfaces;

import opg2.implementations.Book;

public interface BookObserver {
    public void update(Book book);

}