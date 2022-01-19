/**--> What is Framework? : A framework is a set of classes and interfaces which provide a ready-made architecture.
 * --> The Collection interface (java.util.Collection) and Map interface (java.util.Map) is two major(root) interfaces
 *     of java collection classes. Which introduce in JDK 1.2
 * --> Interfaces which inherits Collection interface
 *      1) List -- List extends Collection
 *      2) Set -- Set extends Collection
 *      3) Queue -- Queue extends Collection
 */

package Collection_Frameworks;

import java.util.*;

public class _1_CollectionClassesAndInterfacesIntro_CF {
    public static void main(String[] args) {
        //Declaration of List
        List list= Arrays.asList(10,20,30,40,50);
        System.out.println("List : "+list);

        //Declaration of Set
        Set set=new HashSet(3); //HashSet is class which is implement Set
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println("Set : "+set);

        //Declaration of Queue
        Queue q=new ArrayDeque();   //ArrayDeque is class which is implement Queue
        q.add(10);
        q.add(20);
        q.add(30);
        q.poll();   //Remove element from the head
        System.out.println("Queue : "+q);

        /* -- We will discuss about Lists, Sets and Queue Further in detail.-- */
    }
}
