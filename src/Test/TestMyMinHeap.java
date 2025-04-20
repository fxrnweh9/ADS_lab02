package Test;

import models.MyMinHeap;

import java.util.Comparator;

public class TestMyMinHeap {

    public static void run(){

        MyMinHeap<Integer> minHeap = new MyMinHeap<>((Comparator<Integer>) Comparator.naturalOrder());

        System.out.println(" ");
        System.out.println("//////////////////////////////////");
        System.out.println("MyMinHeap Test");
        System.out.println("//////////////////////////////////");
        System.out.println(" ");


        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Added 20, 10, and 5 to the heap");
        minHeap.insert(20);
        minHeap.insert(10);
        minHeap.insert(5);


        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Heap size: " + minHeap.size());


        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("The min root element: " + minHeap.getExtremum());


        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Extracted the root from the heap");
        System.out.println("New min root element: " + minHeap.getExtremum());


        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("New heap size: " + minHeap.size());

        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Heap is empty? " + minHeap.isEmpty());

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("//////////////////////////////////");
        System.out.println(" ");
        System.out.println(" ");
    }
}
