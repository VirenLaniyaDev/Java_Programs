/** TreeSet
 * --> The TreeSet is basically used for creating the binary tree data structure.
 * --> public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, Serializable
 * --> Java TreeSet class doesn't allow null element. Java TreeSet class is non synchronized.
 * --> Constructors : 1.TreeSet()   2.TreeSet(Collection<? extends E> c)    3.TreeSet(Comparator<? super E> comparator)
 *                    4.TreeSet(SortedSet<E> s)*/

package Collection_Frameworks.Sets;

import java.util.TreeSet;

public class _3_1_TreeSet_CF_Sets {
    public static void main(String[] args) {

        TreeSet<Integer> ts=new TreeSet<>();

        //Adding elements
        ts.add(10);
        ts.add(63);
        ts.add(56);
        ts.add(42);
        ts.add(37);
        ts.add(30);
        System.out.println("Binary tree set is : "+ts);

        // closest least element of the specified element from the set
        System.out.println("Closest least element of 56 is : "+ts.lower(56));     //return null there is no such element.

        // equal or closest least element of the specified element from the set
        System.out.println("Equal or Closest least element of 31 is : "+ts.floor(31));   //return null there is no such element.

        // closest greatest element of the specified element from the set
        System.out.println("Closest greatest element of 56 is :  "+ts.higher(56));   //return null there is no such element.

        // equal or closest greatest element of the specified element from the set
        System.out.println("Equal or Closest greatest element of 31 is :  "+ts.ceiling(31));   //return null there is no such element.

        // Get first and last element
        System.out.println("First element is : "+ts.first());
        System.out.println("Last element is : "+ts.last());

        // get sub set in range of two element
        System.out.println("Sub set between 20 to 40 : "+ts.subSet(20,40));

        // get tail set -gives all greater values of given element in sorted form
        System.out.println("Tail set after 20 : "+ts.tailSet(20,true));

        // Cloning
        System.out.println("Clone of given tree set : "+ts.clone());

        // Retrieve(Remove) lowest(first) and highest(last) element
        System.out.println("Lowest element "+ts.pollFirst()+" is retrieved !"); //Remove lowest(First) element
        System.out.println("Highest element "+ts.pollLast()+" is retrieved !"); //Remove highest(Last) element
        System.out.println("Current Binary tree set is : "+ts);

        //////////// Other common methods ////////////
        // Check that Set is empty or not
        System.out.println("Set empty is : "+ts.isEmpty());

        // Display hashcode
        System.out.println("Hash code is : "+ts.hashCode());

        // Element contains or not
        System.out.println("30 present in set is : "+ts.contains(30));

        // Remove element
        System.out.println("Element 37 removed successful ! : "+ts.remove(37));

        // Clear all elements
        ts.clear();
        System.out.println("Set is : "+ts);

    }
}
