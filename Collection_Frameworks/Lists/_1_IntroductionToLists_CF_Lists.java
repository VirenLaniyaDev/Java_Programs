/**
 * --> List is basically the sequence of elements in which the elements can be inserted and accessed by their
 * position in the list.
 * --> List interface extends the Collection interface.(List<T> extends Collection<T>)
 * --> The duplicate elements are allowed in this interface.
 * --> Methods : void add(int i,Object obj), void add(int i, Collection collection), Object get(int i), Object set(int i,Object obj)
 * int indexOf(Object obj), int lastindexOf(Object obj), ListIterator listIterator(), ListIterator listIterator(int i)
 * Object remove(int i), List subList(int starting, int end).
 * --> Classes which are implements List interface
 * 1) ArrayList    2) LinkedList   3) Vector
 */


package Collection_Frameworks.Lists;

import java.util.*;

public class _1_IntroductionToLists_CF_Lists {
    public static void main(String[] args) {

        // ArrayList Declaration
        List aList=new ArrayList();
        aList.add(10);
        aList.add(20);
        aList.add(30);
        System.out.println(aList);

        // LinkedList Declaration
        List lList=new LinkedList();
        lList.add(10);
        lList.add(20);
        lList.add(30);
        System.out.println(lList);

        // Vector Declaration
        List vec=new Vector();
        vec.add(10);
        vec.add(20);
        vec.add(30);
        System.out.println(vec);

    }
}
