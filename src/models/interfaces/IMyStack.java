package models.interfaces;

public interface IMyStack<T> {

    boolean isEmpty();

    int size();

    T push(T element);

    T peek();

    T pop();


}
