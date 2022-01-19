/** TreeMap
 * --> TreeMap is similar to the HashMap.
 * --> It stores key-value pairs in sorted manner.
 * --> It contains only unique elements.
 * --> It does not contains null key but can have multiple null values.
 * --> public class HashMap<K,V> extends AbstractMap<K,V> implements NavigableMap<K,V>*/

package Maps;

import java.util.Map;
import java.util.TreeMap;

public class _3_TreeMap_Maps {
    public static void main(String[] args) {

        TreeMap<Integer,String> tm=new TreeMap<>();

        // Put(Add) values into the Map [Key->Value]
        tm.put(1,"AAA");
        tm.put(2,"BBB");
        tm.put(4,"DDD");
        tm.put(3,"CCC");
        System.out.println("Tree map is : "+tm);
        tm.put(4,"EEE");    //value of key 4 is updated
        System.out.println("Current hash map is : "+tm);

        // Ignore if key value is already contain
        tm.putIfAbsent(4,"FFF");    // Now it is ignore putting because 4 is already exits
        System.out.println("Current tree map is : "+tm);

        // Key present or not
        System.out.println("4 is present in tree map : "+tm.containsKey(4));   //return true

        // Value present or not
        System.out.println("'CCC' is present in tree map : "+tm.containsValue("CCC"));

        // Check whether tree map is empty or not
        System.out.println("Tree map is empty :"+tm.isEmpty());

        // Determine size of tree map
        System.out.println("Size of tree map is : "+tm.size());

        // Get Value at key
        System.out.println("Object at 4 : "+tm.get(2));

        // Display all value
        System.out.println("Values of tree map : "+tm.values());

        // Display all value
        System.out.println("Values of tree map : "+tm.keySet());

        // Display all entry(key and value)
        System.out.println("Values of tree map : "+tm.entrySet());

        // Replace specified value for a specified key
        tm.replace(1,"VVV");
        System.out.println("Replaced 'VVV' at key 1");

        // Iteration
        System.out.println("Current tree map : ");
        for(Map.Entry<Integer,String> e:tm.entrySet()){
            System.out.println(e);
        }

        // Determine hash code
        System.out.println("Hash code of tree map : "+tm.hashCode());

        // remove element
        System.out.println("Value '"+tm.remove(3)+"' removed!");

        // Clear tree map
        tm.clear();
        System.out.println("Tree map is clear : "+tm);

    }
}
