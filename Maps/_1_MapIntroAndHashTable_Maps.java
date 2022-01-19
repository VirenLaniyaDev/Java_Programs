/** Map
 * --> Map is a kind of data structure which associates the keys to the values.
 * --> If there is unique value present for each unique key then the mapping is called one to one mapping.
 * --> If for a unique key there are multiple values associated with it then it is called many to one mapping.
 * --> Maps vs Sets : The Maps contains keys and values whereas the Sets contain only values.
 * --> public interface Map<key,value>
 * --> There are three classes which implement Maps : Hashtable , HashMap and TreeMap*/

/** Hashtable
 * --> The instance of Hashtable is created using which the methods keys() and elements() are invoked in order to get the keys
 * and corresponding values.
 * --> Then using Enumerator we can access every key and corresponding value of the Map.
 * --> It is array of list. Each list is called as bucket.
 * --> The hash table contains values based on the key.
 * --> It contains only unique elements. There can be null key or can have value.
 * --> public class Hashtable<K,V> extends Dictionary<K,V> implements Map<K,V>
 * --> Constructor : Hashtable(),   Hashtable(int size),    Hashtable(int size,float fillRatio)
 * --> Hashtable is synchronized, thread-safe and slow.*/

package Maps;

import java.util.*;

public class _1_MapIntroAndHashTable_Maps {
    public static void main(String[] args) {
        Map<Integer,String> ht=new Hashtable<>();

        // Put(Add) values into the Table [Key->Value]
        ht.put(1,"AAA");
        ht.put(2,"BBB");
        ht.put(3,"CCC");
        ht.put(4,"DDD");
        System.out.println("Hash table is : "+ht);
        ht.put(4,"EEE");    //value of key 4 is updated
        System.out.println("Current hash table is : "+ht);

        // Ignore if key value is already contain
        ht.putIfAbsent(4,"FFF");    // Now it is ignore putting because 4 is already exits
        System.out.println("Current hash table is : "+ht);

        // Key present or not
        System.out.println("4 is present in table : "+ht.containsKey(4));   //return true

        // Value present or not
        System.out.println("'CCC' is present in hash table : "+ht.containsValue("CCC"));

        // Check whether hash table is empty or not
        System.out.println("Hash table is empty :"+ht.isEmpty());

        // Determine size of hash table
        System.out.println("Size of hash table is : "+ht.size());

        // Get Value at key
        System.out.println("Object at 4 : "+ht.get(2));

        // Display all value
        System.out.println("Values of hash table : "+ht.values());

        // Display all value
        System.out.println("Values of hash table : "+ht.keySet());

        // Display all entry(key and value)
        System.out.println("Values of hash table : "+ht.entrySet());

        // Replace specified value for a specified key
        ht.replace(1,"VVV");
        System.out.println("Replaced 'VVV' at key 1");

        // Iteration
        System.out.println("Current hash table : ");
        for(Map.Entry<Integer,String> e:ht.entrySet()){
            System.out.println(e);
        }

        // Determine hash code
        System.out.println("Hash code of hash table : "+ht.hashCode());

        // remove element
        System.out.println("Value '"+ht.remove(3)+"' removed!");

        // Clear hash table
        ht.clear();
        System.out.println("Hash table is clear : "+ht);

    }
}
