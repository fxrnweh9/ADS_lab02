package models;

import models.interfaces.IMyStack;
import models.interfaces.MyList;

import java.util.Stack;

public class MyStack<T> implements IMyStack<T> {

    private MyList<T> list;


    public MyStack(MyList<T> list) {
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
    public T push(T element) {
        list.add(element);
        return element;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.getLast();
    }

    @Override
    public T pop() {
        T temp = list.getLast();
        list.removeLast();
        return temp;
    }
}
