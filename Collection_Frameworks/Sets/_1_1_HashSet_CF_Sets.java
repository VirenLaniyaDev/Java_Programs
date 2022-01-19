/** Introduction to Sets
 * --> public interface Set<T> extends Collection
 * --> The set is a collection having no duplicate elements.
 * --> The concrete classes of Set are HashSet, LinkedHashSet and TreeSet.*/

/** Introduction to HashSet
 * --> public class HashSet<E>
 *     extends AbstractSet<E>
 *     implements Set<E>, Cloneable, java.io.Serializable
 * --> It creates the hash table.
 * --> The hash table is a data structure in which the data is stored using hashing function. Hence the elements get stored
 * in the hash table based on the hash key returned by hash function.
 * --> Constructor : 1.Hashset()    2.HashSet(Collection collection)    3.HashSet(int c)    4.HashSet(int c,float fillRatio)*/


package Collection_Frameworks.Sets;

import java.util.HashSet;
import java.util.Set;

public class _1_1_HashSet_CF_Sets {
    public static void main(String[] args) {
        Set<Integer> hset=new HashSet<>();

        // Adding elements in Set
        hset.add(10);
        hset.add(20);
        hset.add(30);
        hset.add(40);
        hset.add(40);   //Ignore
        hset.add(40);   //Ignore
        hset.add(50);
        System.out.println("Set is : "+hset);   //Order will may changed because it short according to hash

        // Check that Set is empty or not
        System.out.println("Set empty is : "+hset.isEmpty());

        // Display hashcode
        System.out.println("Hash code is : "+hset.hashCode());

        // Element contains or not
        System.out.println("30 present in set is : "+hset.contains(30));

        // Remove element
        System.out.println("Element 20 removed successful ! : "+hset.remove(20));

        // Clear all elements
        hset.clear();
        System.out.println("Set is : "+hset);
    }
}
