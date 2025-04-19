package models.interfaces;

import java.util.Comparator;

public interface MyList<T> extends Iterable<T> {


    /**
     * implemented in MyArrayList
     * @param item
     */
    void add(T item);


    /**
     * implemented in MyArrayList
     * @param index
     * @param item
     */
    void set (int index, T item);


    /**
     * implemented in MyArrayList
     * @param index
     * @param item
     */
    void add(int index, T item);


    /**
     * implemented in MyArrayList
     * @param item
     */
    void addFirst(T item);


    /**
     * implemented in MyArrayList
     * @param item
     */
    void addLast(T item);


    /**
     * implemented in MyArrayList
     * @param index
     * @return
     */
    T get (int index);


    /**
     * implemented in MyArrayList
     * @return
     */
    T getFirst ();


    /**
     * implemented in MyArrayList
     * @return
     */
    T getLast ();


    /**
     * implemented in MyArrayList
     * @param index
     */
    void remove (int index);


    /**
     * implemented in MyArrayList
     */
    void removeFirst ();


    /**
     * implemented in MyArrayList
     */
    void removeLast ();



    void sort(Comparator<T> cmp);


    /**
     * implemented in MyArrayList
     * @param object
     * @return
     */
    int indexOf (Object object);


    /**
     * implemented in MyArrayList
     * @param object
     * @return
     */
    int lastIndexOf (Object object);


    /**
     * implemented in MyArrayList
     * @param object
     * @return
     */
    boolean exists (Object object);


    /**
     * implemented in MyArrayList
     * @return
     */
    public Object[] toArray();


    /**
     * implemented in MyArrayList
     */
    void clear ();



    /**
     * implemented in MyArrayList
     * @return
     */
    int size ();


}
