/** HashMap
 * --> HashMap is very similar to Hashtable.
 * --> public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable
 * --> Differentiate from Hashtable : HashMap is non synchronized, not thread-safe and fast.
 */

package Maps;

import java.util.*;

public class _2_HashMap_Maps {
    public static void main(String[] args) {

        HashMap<Integer,String> hm=new HashMap<>();

        // Put(Add) values into the Map [Key->Value]
        hm.put(1,"AAA");
        hm.put(2,"BBB");
        hm.put(3,"CCC");
        hm.put(4,"DDD");
        System.out.println("Hash map is : "+hm);
        hm.put(4,"EEE");    //value of key 4 is updated
        System.out.println("Current hash map is : "+hm);

        // Ignore if key value is already contain
        hm.putIfAbsent(4,"FFF");    // Now it is ignore putting because 4 is already exits
        System.out.println("Current hash map is : "+hm);

        // Key present or not
        System.out.println("4 is present in hash map : "+hm.containsKey(4));   //return true

        // Value present or not
        System.out.println("'CCC' is present in hash map : "+hm.containsValue("CCC"));

        // Check whether hash map is empty or not
        System.out.println("Hash map is empty :"+hm.isEmpty());

        // Determine size of hash map
        System.out.println("Size of hash map is : "+hm.size());

        // Get Value at key
        System.out.println("Object at 4 : "+hm.get(2));

        // Display all value
        System.out.println("Values of hash map : "+hm.values());

        // Display all value
        System.out.println("Values of hash map : "+hm.keySet());

        // Display all entry(key and value)
        System.out.println("Values of hash map : "+hm.entrySet());

        // Replace specified value for a specified key
        hm.replace(1,"VVV");
        System.out.println("Replaced 'VVV' at key 1");

        // Iteration
        System.out.println("Current hash map : ");
        for(Map.Entry<Integer,String> e:hm.entrySet()){
            System.out.println(e);
        }

        // Determine hash code
        System.out.println("Hash code of hash map : "+hm.hashCode());

        // remove element
        System.out.println("Value '"+hm.remove(3)+"' removed!");

        // Clear hash map
        hm.clear();
        System.out.println("Hash map is clear : "+hm);

    }
}
