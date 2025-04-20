package Test;

import models.MyLinkedList;

import java.util.Comparator;


public class TestMyLinkedList {

    public static void run() {

        MyLinkedList<Integer> linked = new MyLinkedList<>();

        System.out.println(" ");
        System.out.println("//////////////////////////////////");
        System.out.println("MyLinkedList Test");
        System.out.println("//////////////////////////////////");
        System.out.println(" ");


        linked.add(10);
        linked.add(20);
        linked.add(30);

        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("MyLinkedList integers: ");
        for (int i = 0; i < linked.size(); i++) {
            System.out.println(linked.get(i));
        }


        linked.add(1, 40);
        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("After adding 40 at index 1:");
        for (int i = 0; i < linked.size(); i++) {
            System.out.println(linked.get(i));
        }


        linked.remove(2);
        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("After removing element at index 2: ");
        for (int i = 0; i < linked.size(); i++) {
            System.out.println(linked.get(i));
        }

        linked.addFirst(1);
        linked.addLast(50);
        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("After adding 1 to start and 50 to end:");
        for (int i = 0; i < linked.size(); i++) {
            System.out.println(linked.get(i));
        }

        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("First: " + linked.getFirst());
        System.out.println("Last: " + linked.getLast());

        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Does 1947 exist? " + linked.exists(1947));

        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Index of 10: " + linked.indexOf(10));
        System.out.println("Last index of 10: " + linked.lastIndexOf(10));



        linked.sort(Comparator.naturalOrder());
        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("After sort: ");
        for (int i = 0; i < linked.size(); i++) {
            System.out.println(linked.get(i));
        }

        System.out.println(" ");
        System.out.println("_______________________________________________");        linked.clear();
        System.out.println("After clearing the linked list, size is: " + linked.size());

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("//////////////////////////////////");
        System.out.println(" ");
        System.out.println(" ");
    }

}
