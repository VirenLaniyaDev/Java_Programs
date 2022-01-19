/** Implement Double ended queue using link list.
 * --> Here we can perform insertion and deletion from both the sides.*/

package Collection_Frameworks.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class _2_2_DequeUsingLinkedList_CF_Queue {
    public static void main(String[] args) {
        Deque<Integer> dequeLL=new LinkedList<>();

        //Adding elements
        dequeLL.add(10);    //Add element in last
        dequeLL.addLast(20);//Add element in last
        dequeLL.addFirst(30);//Add element at first position
        dequeLL.offerFirst(40);//Add element in last
        dequeLL.offerLast(40);//Add element at first position
        System.out.println("Double ended queue : "+dequeLL);

        //Peeking element
        System.out.println("First element is : "+dequeLL.peekFirst());//Peek element at first position
        System.out.println("Last element is : "+dequeLL.peekLast()); //Peek element at last position

        //Removing element
        dequeLL.removeFirst();//Remove element at first position
        dequeLL.removeLast();//Remove element at last position
        System.out.println("Double ended queue : "+dequeLL);

        //It also support all methods of Queue.
    }
}
