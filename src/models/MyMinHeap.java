package models;

import models.interfaces.IMyHeap;

import java.util.Comparator;

public class MyMinHeap<T> implements IMyHeap<T> {

    private MyArrayList<T> list;
    private Comparator<T> cmp;


    public MyMinHeap(Comparator<T> cmp) {
        list = new MyArrayList<>();
        this.cmp = cmp;
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
    public T getExtremum() {
        return list.get(0);
    }

    @Override
    public T extractExtremum() {
        T extremum = getExtremum();
        list.set(0, list.getLast());
        list.removeLast();
        heapify(0);

        return extremum;
    }

    private void heapify(int index) {
        int size = list.size();

        if (size / 2 > index && index <= size - 1) {
            return;
        }

        int smallest = index;
        int leftChildIndex = leftChildOf(index);
        int rightChildIndex = rightChildOf(index);
        if (leftChildOf(index) < size && cmp.compare(list.get(leftChildIndex), list.get(smallest)) < 0) {
            smallest = leftChildIndex;
        }

        if (rightChildIndex < size && cmp.compare(list.get(rightChildIndex), list.get(smallest)) < 0) {
            smallest = rightChildIndex;
        }


        if (smallest != index) {
            swap(smallest, index);
            heapify(smallest);
        }
    }


    @Override
    public void insert(T element) {
        list.add(element);
        traverseUp(list.size() - 1);
    }

    private void traverseUp(int index) {

        if (cmp.compare(list.get(parentOf(index)), list.get(index)) < 0 || index == 0) {
            return;
        }

        swap(parentOf(index), index);
        traverseUp(parentOf(index));
    }

    private int leftChildOf(int index) {return 2 * index + 1; }

    private int rightChildOf(int index) {
        return 2 * index + 2;
    }

    private int parentOf(int index) {
        return (index - 1) / 2;
    }


    private void swap(int i1, int i2) {
        T temp = list.get(i1);
        list.set(i1, list.get(i2));
        list.set(i2, temp);
    }

}