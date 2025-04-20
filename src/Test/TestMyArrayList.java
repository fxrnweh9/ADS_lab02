package Test;

import models.MyArrayList;
import java.util.Comparator;

public class TestMyArrayList {


    public static void run(){

        MyArrayList<Integer> list = new MyArrayList<>();

        System.out.println(" ");
        System.out.println("//////////////////////////////////");
        System.out.println("MyArrayList Test");
        System.out.println("//////////////////////////////////");
        System.out.println(" ");


        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Array integers: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        list.add(1, 40);
        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("After adding 40 at index 1");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }



        list.remove(2);
        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("After removing 2 at index 2");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.add(10);
        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("First index of 10: " + list.indexOf(10));
        System.out.println("Last index of 10: " + list.lastIndexOf(10));


        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Does 1947 exist? " + list.exists(1947));



        list.sort(Comparator.naturalOrder());
        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("After sort: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        list.clear();
        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("After clearing the integers size is: " + list.size());

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("//////////////////////////////////");
        System.out.println(" ");
        System.out.println(" ");
    }

}
