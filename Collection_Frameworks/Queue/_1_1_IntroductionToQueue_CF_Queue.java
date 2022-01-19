/**--> Java Queue interface orders the element in FIFO(First In First Out) manner.
 * --> FIFO - Which object is first inserted that object will first remove.
 * --> Interface declaration : public interface Queue<E> extends Collection<E>
 * --> Queue interface in collection has two implementation PriorityQueue but you can also create Queue LinkedList
 * Commonly used methods
 * 1. add()     2. remove()     3. roll()      4.peek()     5.size()      6.poll()
 **/

package Collection_Frameworks.Queue;

import java.util.*;

public class _1_1_IntroductionToQueue_CF_Queue {
    public static void main(String[] args) {
        Queue<Integer> qPQ=new PriorityQueue<>();
        Queue<Integer> qLL=new LinkedList<>();
        // We discuss further.
    }
}