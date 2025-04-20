package Test;

import models.MyLinkedList;
import models.MyQueue;

public class TestMyQueue {

    public static void run() {

        MyQueue<Integer> queue = new MyQueue<>(new MyLinkedList<>());


        System.out.println(" ");
        System.out.println("//////////////////////////////////");
        System.out.println("MyQueue Test");
        System.out.println("//////////////////////////////////");
        System.out.println(" ");


        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Enqueueing 10, 20, 30");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);


        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Size: " + queue.size());


        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Dequeueing: " + queue.dequeue());


        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Peeking at the new element at the front of the queue " + queue.peek());


        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("New ize: " + queue.size());


        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Is it empty? " + queue.isEmpty());


        System.out.println(" ");
        System.out.println(" ");
        System.out.println("//////////////////////////////////");
        System.out.println(" ");
        System.out.println(" ");
    }
}
