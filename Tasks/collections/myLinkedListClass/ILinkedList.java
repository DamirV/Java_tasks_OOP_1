package myLinkedListClass;

import java.util.Iterator;

public interface ILinkedList<T> extends Iterable<T>{

    @Override
    Iterator<T> iterator();

    void add(T element);
    void add(int index, T element);
    void clear();
    T get(int index);
    T remove(int index);
    T set(int index, T element);
    int size();
    Object[] toArray();
    String toString();
}
