/** Write a program which stores the list of strings in an ArrayList and then displays the contents of the list. After
 * that add another string list in the current list at 0th position.*/

package Collection_Frameworks.Lists;

import java.util.*;

public class _2_2_ExampleOfArrayList_CF_Lists {
    public static void main(String[] args) {
        ArrayList<String> strAL=new ArrayList<String>(5);
        strAL.add("Viren");
        strAL.add("Krushil");
        strAL.add("John");
        strAL.add("Klaus");

        System.out.println("list : "+strAL);

        // Create new Array list
        ArrayList<String> strAL2=new ArrayList<String>(2);
        strAL2.add("Maharshi");
        strAL2.add("Parag");

        strAL.addAll(0,strAL2);
        System.out.println("New list : " + strAL);

    }
}
