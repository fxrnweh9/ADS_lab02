import Test.TestMyArrayList;
import Test.TestMyLinkedList;
import Test.TestMyQueue;
import Test.TestMyStack;
import models.MyArrayList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        run(new Scanner(System.in));
    }

    public static void run(Scanner in) {

        while (true) {
            System.out.println("[1] - Run MyArrayList");
            System.out.println("[2] - Run MyLinkedList");
            System.out.println("[3] - Run MyStack");
            System.out.println("[4] - Run MyHashMap");
            System.out.println("[5] - Run MyTreeMap");
            System.out.println("[0] - Exit");

            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    TestMyArrayList.run();
                    System.out.println();
                    break;
                case 2:
                    TestMyLinkedList.run();
                    System.out.println();
                    break;
                case 3:
                    TestMyStack.run();
                    System.out.println();
                    break;
                case 4:
                    TestMyQueue.run();
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("invalid input");
            }
        }
    }
}
