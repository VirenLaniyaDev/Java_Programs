/**We know that LinkedList<E> implements Deque<E> and Deque<E> extends Queue<E>
 * When we create LinkedList as queue then only add, remove and peek operation will be performed.
 * This type of queue work as single ended queue.*/

package Collection_Frameworks.Queue;

import java.util.*;
public class _1_2_QueueUsingLinkedList_CF_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        //Add element at the last
        queue.add(10);
        queue.add(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println("Queue is : "+queue);

        //Peek element from head
        System.out.println("Head value : "+queue.peek());
        System.out.println("Head value : "+queue.element());

        //remove element at front
        System.out.println("Element removed : "+queue.remove());
        System.out.println("Element removed : "+queue.poll());
        System.out.println("Queue is : "+queue);
    }
}
