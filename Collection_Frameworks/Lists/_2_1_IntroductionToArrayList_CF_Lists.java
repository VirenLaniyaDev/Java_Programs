/**--> ArrayList used to implement dynamic array.
 * --> What is Dynamic array? : The size of array can be created as per requirement Hence ArrayList is a variable length
 *     array of object references.
 * --> public class ArrayList<E> extends AbstractList<E>
 *                               implements List<E>, RandomAccess, Cloneable, java.io.Serializable
 * --> Initially ArrayList created with some initial size(n) then as per requirement it will extends size of array according
 *     this formula : n+(n/2)-1. And also when objects are removed then size will automatically reduced.
 * --> Constructor :
 *     ArrayList() -> creates an empty list
 *     ArrayList(Collection collection) -> Creates a list in which the collection elements are added
 *     ArrayList(int c) -> c represent capacity of array.
 * */


package Collection_Frameworks.Lists;

import java.util.*;

public class _2_1_IntroductionToArrayList_CF_Lists {
    public static void main(String[] args) {

        /////////// Non-Generic ///////////
        ArrayList arrList=new ArrayList();

        // Add elements
        arrList.add(10);
        arrList.add(20);
        arrList.add(40);
        arrList.add(30);

        // Add object at particular index
        arrList.add(1,50);

        // Add entire another list at the end of current Array list
        List arrList2 =Arrays.asList(50,45,60);
        arrList.addAll(arrList2);   // You can also specify the position. For that - void addAll(int position, Collection c)

        // Determine size
        System.out.println("Size of Array list : "+arrList.size());

        // Print ArrayList
        System.out.println("Array list is : "+arrList);

        // Access(Get) particular object from Array List
        System.out.println("2nd element is : "+arrList.get(1));

        // Change or Set a value at particular index
        arrList.set(2,100);
        System.out.println("New Array list : "+arrList);

        // Check whether given object is Array list contains or not
        System.out.println("50 contains by Array list : "+arrList.contains(50));

        // remove particular object at particular position
        arrList.remove(4);
        System.out.println("Array list after removing 4th positioned element : "+arrList);

        // remove particular object
        arrList.remove(Integer.valueOf(100));
        System.out.println("Array list after removing 100 : "+arrList);

        // remove all objects
        arrList.clear();
        System.out.println("Remove all elements from the list : "+arrList);

        /////////// Generic ///////////
        ArrayList<Integer> arrListG=new ArrayList<Integer>();
        /*All method are same as above; The difference is here we can only take action on Integer*/


    }
}
