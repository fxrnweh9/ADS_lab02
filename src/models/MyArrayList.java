package models;

import models.interfaces.MyList;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class MyArrayList<T> implements MyList<T> {


    private T[] elements;
    private int length;


    public MyArrayList() {
        elements = (T[]) new Object[5];
        length = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < length;
            }

            @Override
            public T next() {
                return (T) elements[index++];
            }
        };
    }




    public void checkIndex(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index: " + index + " not found");
        }
    }

    private void increaseCapacity() {
        T[] newElements = (T[]) new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }


    @Override
    public void add(T element) {
        if (length == elements.length) {
            increaseCapacity();
        }
        elements[length++] = element;
    }


    @Override
    public void set (int index, T element) {
        checkIndex(index);
        elements[index] = element;
    }


    @Override
    public void add(int index, T element) {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        if (length == elements.length) {
            increaseCapacity();
        }
        for (int i = length; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        length++;
    }


    @Override
    public void addFirst(T element) {
        add(0, element);
    }


    @Override
    public void addLast(T element) {
        add(element);
    }


    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }


    @Override
    public T getFirst() {
        if (length == 0) {
            throw new NoSuchElementException("List is empty");
        }

        checkIndex(0);
        return (T) elements[0];
    }


    @Override
    public T getLast() {
        if (length == 0) {
            throw new NoSuchElementException("List is empty");
        }

        checkIndex(length - 1);
        return (T) elements[length - 1];
    }


    @Override
    public void remove (int index) {
        checkIndex(index);
        for (int i = index; i < length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[length - 1] = null;
        length--;
    }


    @Override
    public void removeFirst() {
        if (length == 0) {
            throw new NoSuchElementException("List is empty");
        }

        remove(0);
    }


    @Override
    public void removeLast() {
        if (length == 0) {
            throw new NoSuchElementException("List is empty");
        }

        remove(length - 1);
    }


    @Override
    public void sort(Comparator<T> cmp){
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                T a = elements[j];
                T b = elements[j + 1];
                if (cmp.compare(a, b) > 0) {
                    elements[j] = b;
                    elements[j + 1] = a;
                }
            }
        }
    }


    @Override
    public int indexOf(Object object) {

        for (int i = 0; i < length; i++) {
            if (elements[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public int lastIndexOf(Object object) {
        for (int i = length - 1; i >= 0; i--) {
            if (elements[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public boolean exists(Object object) {
        return indexOf(object) != -1;
    }


    @Override
    public Object[] toArray() {
        Object[] result = new Object[length];
        for (int i = 0; i < length; i++) {
            result[i] = elements[i];
        }
        return result;
    }


    @Override
    public void clear() {
        elements = (T[]) new Object[5];
        length = 0;
    }


    @Override
    public int size() {
        return length;
    }
}
