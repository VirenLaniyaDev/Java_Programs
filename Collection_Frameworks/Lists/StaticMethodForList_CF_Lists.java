/////////// Static methods for Lists ///////////

package Collection_Frameworks.Lists;

import java.util.*;

import static java.util.Collections.*;

public class StaticMethodForList_CF_Lists {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(40,35,9,23,34,17,51,20);

        // for sort the list
        sort(list); //We can also sort with comparator for that use void sort(List list,Comparator c)
        System.out.println("Sorted list : "+ list);

        // Binary search
        System.out.println("35 is positioned at "+binarySearch(list,35));

        // Reversing the given list
        reverse(list);
        System.out.println("Reversed list : "+list);

        // Shuffling the specified list randomly
        shuffle(list);
        System.out.println("Shuffled list : "+list);

        // Coping the source list to destination list
        List<Integer> list2=Arrays.asList(10,20,30,40,50,60,70,80);
        copy(list2,list);
        System.out.println("Content of list2 : "+list2);

        // filling the list with object
        fill(list,10);
        System.out.println("Filled list : "+list);

    }
}
