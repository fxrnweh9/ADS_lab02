package models.interfaces;

public interface IMyQueue<T> {

    boolean isEmpty();

    int size();

    T peek();


    T enqueue(T element);

    T dequeue();


}
