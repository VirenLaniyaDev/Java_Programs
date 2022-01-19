/*Write Java program to create linked list(by user entered value), remove elements,  Insert element at any position, Display Linked list*/

package Collection_Frameworks.Lists;

import java.io.IOException;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

class ImplementLinkedList {
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> LL = new LinkedList<>();

    void CreateLinkedList() {
        do {
            System.out.print("Enter your element which you want to insert: ");
            Integer x = sc.nextInt();
            LL.add(x);
            System.out.print("Do you want to add more element?[y/n]:");
        } while (sc.next().charAt(0) == 'y');
    }

    void Display() {
        System.out.println("Your List is : "+LL);
    }

    void InsertFirst() {
        System.out.print("Enter element which you want to Insert :");
        Integer x = sc.nextInt();
        LL.addFirst(x);
        System.out.println("Element "+x+" successfully inserted at first position.");
    }

    void InsertLast() {
        System.out.print("Enter element which you want to Insert :");
        Integer x = sc.nextInt();
        LL.addLast(x);
        System.out.println("Element "+x+" successfully inserted at last position.");
    }

    void InsertAny() {
        System.out.print("Enter element which you want to Insert :");
        Integer x = sc.nextInt();
        System.out.print("Enter position");
        Integer pos = sc.nextInt();
        LL.add(pos, x);
        System.out.println("Element "+x+" successfully inserted at "+pos+" position.");
    }

    void RemoveFirst() {
        try {
            Integer x=LL.getFirst();
            LL.pollFirst();
            System.out.println("First element " + x + " removed successfully");
        }
        catch(NoSuchElementException e){
            System.out.println("Your list is empty !!");
        }
    }

    void RemoveLast() {
        try {
            Integer x=LL.getLast();
            LL.pollLast();
            System.out.println("Last element " + x + " removed successfully");
        }
        catch(NoSuchElementException e){
            System.out.println("Your list is empty !!");
        }
    }

    void RemoveAny() {
        try {
            System.out.print("Enter element position which you want to remove : ");
            Integer pos=sc.nextInt();
            Integer x=LL.get(pos);
            LL.remove(x);
            System.out.println("Element " + x + " removed successfully");
        }
        catch(NoSuchElementException e){
            System.out.println("Your list is empty !!");
        }
    }
}

public class _3_2_ExampleOfLinkedList_CF_Lists {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ImplementLinkedList ImLL = new ImplementLinkedList();
        System.out.println("********** Implementing Linked list **********");
        do {
            System.out.println("-----------------------------------------------");
            System.out.println("1.Create linked list\n2.Display\n3.Insert at first position\n4.Insert at last position\n5.Insert at any position");
            System.out.println("6.Remove First element\n7.Remove Last element\n8.Remove at any position\n9.Exit");
            System.out.println("-----------------------------------------------");
            System.out.print("Enter your choice : ");
            switch (sc.nextInt()) {
                case 1:
                    ImLL.CreateLinkedList();
                    break;
                case 2:
                    ImLL.Display();
                    break;
                case 3:
                    ImLL.InsertFirst();
                    break;
                case 4:
                    ImLL.InsertLast();
                    break;
                case 5:
                    ImLL.InsertAny();
                    break;
                case 6:
                    ImLL.RemoveFirst();
                    break;
                case 7:
                    ImLL.RemoveLast();
                    break;
                case 8:
                    ImLL.RemoveAny();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Invalid operation value!!");
            }
            System.out.print("Do you want to perform more operation?[y/n] : ");
        } while (sc.next().charAt(0) == 'y');
    }
}
