/**--> All the element of the Collection can be traversed through the Iterator.
 * --> The Iterator allows us to cycle through the collection element.
 * --> The iterator has two interfaces
 *      1) Iterator
 *          Methods : Boolean hasNext(),Object next() and void remove().
 *      2) ListIterator
 *          Methods : Boolean hasNext(),Object next(), void remove(), void add(Object obj), Boolean hasPrevious(),
 *                    int nextIndex(), Object Previous(), int previousIndex(), void set(Object obj).
 */


package Collection_Frameworks;

import java.util.*;

public class _2_Iterators_CF {
    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(10,30,20,50,40);

        ////// Iterator interface
        Iterator obj=list.iterator();
        while(obj.hasNext()) {     //While in obj has next element than return true otherwise return false.
            Object x=obj.next();
            System.out.print(x + "\t");
            //or
//            System.out.println(obj.next()+"\t");
        }

        ////// List interface
        ListIterator lobj=list.listIterator();
        //Display in reverse order
        while(lobj.hasNext())   //We add this while loop because first we need to reach last element
            lobj.next();

        System.out.print("\nReverse order of list : ");
        while(lobj.hasPrevious()){      //if lobj has previous element then it condition becomes true.
            Object e=lobj.previous();
            System.out.print(e+"\t");
        }
        //So ListIterator provides more utilities rather than Iterator.
    }
}
