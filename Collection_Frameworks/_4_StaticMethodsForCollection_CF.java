////////// Static Methods for Collection //////////

package Collection_Frameworks;

import java.util.*;

import static java.util.Collections.*;

// Comparator for sort according to last digit
class ComparatorClass implements Comparator<Integer> {
    public int compare(Integer val1, Integer val2) {
        if (val1 % 10 <= val2 % 10)  // val % 10 -> It gives last digit of Value.
            // Similarly for other val%100 gives last 2 digit, val%1000 gives last 3 digit and so on..
            return -1;
        return 1;
    }
}

public class _4_StaticMethodsForCollection_CF {
    public static void main(String[] args) {

        // Here we take list as collection
        List<Integer> ListCollection= Arrays.asList(11,34,42,26,60,59);

        // for finding Max and Min object
        System.out.println("Min element is : "+min(ListCollection));    // Return minimal object in collection
        System.out.println("Max element is : "+max(ListCollection));    // Return minimal object in collection

        // for finding Max and Min object using comparator
        System.out.println("Element which has least last digit is : "+min(ListCollection,new ComparatorClass()));    // Return element which has least last digit
        System.out.println("Element which has  : "+max(ListCollection,new ComparatorClass()));    // Return element which has greatest last digit

        // Disjoint or not
        List<Integer> ListCollection2= Arrays.asList(12,34,41,36,80,12);
        System.out.println("ListCollection and ListCollection2 is disjoint : "+disjoint(ListCollection,ListCollection2));   //here 34 is common in both so it will return false

        // Frequency
        System.out.println("Frequency of 12 in ListCollection2 : "+frequency(ListCollection2,12));  // In ListCollection2 12 comes two time so frequency is 2.

    }
}
