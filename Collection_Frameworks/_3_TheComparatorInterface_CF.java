/**
 * --> The Comparator interface is used to compare two objects of two different classes.
 * --> Package route: java.util.Comparator
 * --> This interface defines two methods -
 * 1) int Compare(Object obj1,Object obj2) - This method compares obj1 and obj2.
 * - If obj1=obj2 return 0. | obj1>obj2 return positive value(1). | obj1<obj2 return negative value(-1).
 * - If return value is 1 than it will swap obj1 and obj2 otherwise no swapping.
 * 2) boolean equals(Object obj) - If invoking object and obj are same it will return true otherwise return false.
 * --> The Collection class provides static methods for sorting the elements of collection.
 * public void sort(List list, Comparator c)
 * - List sort according to given comparator.
 */

package Collection_Frameworks;

import java.util.*;

// Comparator
class ComparatorLogic1 implements Comparator<Integer> {
    public int compare(Integer val1, Integer val2) {
        if (val1 <= val2)
            return -1;
        return 1;
    }
}

// Comparator for reverse sort
class ComparatorLogic2 implements Comparator<Integer> {
    public int compare(Integer val1, Integer val2) {
        if (val1 > val2)
            return -1;
        return 1;
    }
}

// Comparator for sort according to last digit
class ComparatorLogic3 implements Comparator<Integer> {
    public int compare(Integer val1, Integer val2) {
        if (val1 % 10 <= val2 % 10)  // val % 10 -> It gives last digit of Value.
            // Similarly for other val%100 gives last 2 digit, val%1000 gives last 3 digit and so on..
            return -1;
        return 1;
    }
}

public class _3_TheComparatorInterface_CF {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 15, 40, 30, 35, 25);

        Iterator<Integer> it = list.iterator();

        System.out.print("Your list is : ");
        while (it.hasNext()) {
            Integer val = it.next();
            System.out.print("\t" + val);
        }

        ////////// Sort list using sort(List [ListName]) //////////
        Collections.sort(list);        // This sort() time complexity is O(nlogn) because it use merge sort technique to sort.
        // Collection.reverse(list); // This method gives sorted list in reverse order.

        it = list.iterator();
        System.out.print("\nYour shorted list is : ");
        while (it.hasNext()) {
            Integer val = it.next();
            System.out.print("\t" + val);
        }

        ////////// Sort list using sort(List [ListName],Comparator c) //////////
        Collections.sort(list, new ComparatorLogic1());
        it = list.iterator();
        System.out.print("\nYour shorted list is : ");
        while (it.hasNext()) {
            Integer val = it.next();
            System.out.print("\t" + val);
        }

        ////////// Sort list in reverse order using sort(List [ListName],Comparator c) //////////
        Collections.sort(list, new ComparatorLogic2());
        it = list.iterator();
        System.out.print("\nYour reverse shorted list is : ");
        while (it.hasNext()) {
            Integer val = it.next();
            System.out.print("\t" + val);
        }

        ////////// Sort number according to last digit using sort(List [ListName],Comparator c) //////////
        Collections.sort(list, new ComparatorLogic3());
        it = list.iterator();
        System.out.print("\nSort according to last digit is : ");
        while (it.hasNext()) {
            Integer val = it.next();
            System.out.print("\t" + val);
        }
    }
}
