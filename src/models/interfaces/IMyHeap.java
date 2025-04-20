package models.interfaces;

public interface IMyHeap<T> {

    boolean isEmpty();

    int size();

    T getExtremum();

    T extractExtremum();

    void insert(T element);

}
