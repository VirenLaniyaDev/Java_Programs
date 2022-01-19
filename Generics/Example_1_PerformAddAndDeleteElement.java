/**
 * Using generic classes, write a program to perform the following operation on an array
 * 1) Add an element in the beginning/middle/end
 * 2) Delete an element from a given position
 */

package Generics;

import java.util.ArrayList;
import java.util.Scanner;

class Operation<T> {

    public ArrayList<T> aL;

    Operation(ArrayList obj) {
        aL = obj;
    }

    public void AddElement(int position, T value) {
        aL.add(position, value);
        System.out.println("Your new Array list :");
        for (int i = 0; i < aL.size(); i++)
            System.out.print(aL.get(i) + "\t");
        System.out.println();
    }

    public void DeleteElement(int position) {
        aL.remove(position);
        System.out.println("Your new Array list :");
        for (int i = 0; i < aL.size(); i++)
            System.out.print(aL.get(i) + "\t");
        System.out.println();
    }
}

public class Example_1_PerformAddAndDeleteElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> obj = new ArrayList<>();   //Here we provide Integer but similarly we can provide anything Double,String etc.
        for (int i = 0; i < 5; i++)
            obj.add((i + 1) * 10);      // Insert element into the Array list

        System.out.println("Your Array list is ");
        for (int i = 0; i < 5; i++)
            System.out.print(obj.get(i) + "\t");

        Operation op = new Operation(obj);

        System.out.println("\n\n*********** Insertion of Element ***********");
        System.out.print("Enter value which you want to insert: ");
        int val = sc.nextInt();
        System.out.print("Enter position where you want to insert element: ");
        int pos = sc.nextInt();
        op.AddElement(pos, val);

        System.out.println("\n*********** Deletion of Element ***********");
        System.out.print("From which position you want to remove element? : ");
        op.DeleteElement(sc.nextInt());
    }
}
