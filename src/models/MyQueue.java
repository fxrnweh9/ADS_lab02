package models;

import models.interfaces.IMyQueue;
import models.interfaces.MyList;

import java.util.Queue;

public class MyQueue<T> implements IMyQueue<T> {

    private MyList<T> list;

    public MyQueue(MyList<T> list) {
        this.list = list;
    }


    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public T peek() {
        return list.getFirst();
    }

    @Override
    public T enqueue(T element) {
        list.addLast(element);
        return element;
    }

    @Override
    public T dequeue() {
        T temp = list.getFirst();
        list.removeFirst();
        return temp;
    }

}
