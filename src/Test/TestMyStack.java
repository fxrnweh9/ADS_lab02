package Test;

import models.MyArrayList;
import models.MyStack;

public class TestMyStack {

    public static void run(){

        MyStack<Integer> stack = new MyStack<>(new MyArrayList<>());

        System.out.println(" ");
        System.out.println("//////////////////////////////////");
        System.out.println("MyStack Test");
        System.out.println("//////////////////////////////////");
        System.out.println(" ");


        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Pushing 10, 20, 30");
        stack.push(10);
        stack.push(20);
        stack.push(30);


        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Size: " + stack.size());


        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Popping the stack: " + stack.pop());


        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Peeking at the new top: " + stack.peek());


        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("New size: " + stack.size());


        System.out.println(" ");
        System.out.println("_______________________________________________");
        System.out.println("Is it empty? " + stack.isEmpty());


        System.out.println(" ");
        System.out.println(" ");
        System.out.println("//////////////////////////////////");
        System.out.println(" ");
        System.out.println(" ");
    }
}
