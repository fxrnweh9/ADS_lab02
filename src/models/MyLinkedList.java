package models;


import models.interfaces.MyList;


import java.util.Comparator;
import java.util.Iterator;



public class MyLinkedList<T> implements MyList<T> {

    private MyNode<T> head;
    private MyNode<T> tail;
    private int length;


    public MyLinkedList() {
        head = null;
        tail = null;
        length = 0;
    }


    @Override
    public void add(T element) {
        MyNode<T> newNode = new MyNode<>(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }
        tail = newNode;
        length++;
    }

    @Override
    public void set(int index, T element) {
        checkIndex(index);
        MyNode<T> node = traverse(index);
        node.setElement(element);
    }


    @Override
    public void add(int index, T element) {
        checkIndex(index);
        if (index == 0){
            addFirst(element);
        }
        else if (index == length){
            addLast(element);
        }
        else {
            MyNode<T> newNode = new MyNode<>(element);
            MyNode<T> prevNode = traverse(index - 1);
            MyNode<T> nextNode = traverse(index);
            prevNode.setNext(newNode);
            newNode.setPrevious(prevNode);
            newNode.setNext(nextNode);
            nextNode.setPrevious(newNode);
            length++;
        }
    }


    @Override
    public void addFirst(T element) {
        MyNode<T> newNode = new MyNode<>(element);
        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        length++;
    }



    @Override
    public void addLast(T element) {
        add(element);

    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return traverse(index).getElement();
    }

    @Override
    public T getFirst() {
        if (head == null){
            throw new IndexOutOfBoundsException("List is empty");
        }
        return head.getElement();
    }

    @Override
    public T getLast() {
        if (tail == null){
            throw new IndexOutOfBoundsException("List is empty");
        }
        return tail.getElement();
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        if (index == 0){
            removeFirst();
        }
        else if (index == length - 1){
            removeLast();
        }
        else {
            MyNode<T> nodeToRemove = traverse(index);
            MyNode<T> prevNode = nodeToRemove.getPrevious();
            MyNode<T> nextNode = nodeToRemove.getNext();
            prevNode.setNext(nextNode);
            nextNode.setPrevious(prevNode);
            length--;
        }
    }

    @Override
    public void removeFirst() {
        head = head.getNext();
        length--;
    }

    @Override
    public void removeLast() {
        tail = tail.getPrevious();
        length--;
    }

    @Override
    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                MyNode<T> current = traverse(j);
                MyNode<T> afterCurrent = traverse(j+1);
                if (comparator.compare(current.getElement(), afterCurrent.getElement()) > 0) {
                    T temp = current.getElement();
                    current.setElement(afterCurrent.getElement());
                    afterCurrent.setElement(temp);
                }
            }
        }
    }



    @Override
    public int indexOf(Object object) {
        return findIndexOfElement(object);
    }

    @Override
    public int lastIndexOf(Object object) {
        return findIndexOfElement(object);
    }

    @Override
    public boolean exists(Object object) {
        return contains(object);
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[length];
        MyNode<T> current = head;
        int index = 0;
        while (current.hasNext()) {
            array[index++] = current.getElement();
            current = current.getNext();
        }

        return array;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        length = 0;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private MyNode<T> iterator = head;
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public T next() {
                T element = iterator.getElement();
                iterator = iterator.getNext();
                return element;
            }
        };
    }



    private void checkIndex(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }


    private MyNode<T> traverse(int index) {
        MyNode<T> next = head;
        for (int i = 0; i < index; i++) {
            next = next.getNext();
        }

        return next;
    }


    private int findIndexOfElement(Object element) {
        int index = 0;
        MyNode<T> current = head;
        while (current != null) {
            if (current.getElement().equals(element)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }


    private int findLastIndexOfElement(Object element) {
        int index = -1;
        int temp = 0;
        MyNode<T> current = head;
        while (current != null) {
            if (current.getElement().equals(element)) {
                index = temp;
            }
            current = current.getNext();
            temp++;
        }
        return index;
    }


    private boolean contains(Object element) {
        MyNode<T> current = head;
        while (current != null) {
            if (current.getElement().equals(element)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }


}
