package Collection_Frameworks.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class _2_3_DequeUsingArrayDeque_CF_Queue {
    public static void main(String[] args) {
        Deque<Integer> ADQ=new ArrayDeque<>();

        //Adding elements
        ADQ.add(10);    //Add element in last
        ADQ.addLast(20);//Add element in last
        ADQ.addFirst(30);//Add element at first position
        ADQ.offerFirst(40);//Add element in last
        ADQ.offerLast(40);//Add element at first position
        System.out.println("Double ended queue : "+ADQ);

        //Peeking element
        System.out.println("First element is : "+ADQ.peekFirst());//Peek element at first position
        System.out.println("Last element is : "+ADQ.peekLast()); //Peek element at last position

        //Removing element
        ADQ.removeFirst();//Remove element at first position
        ADQ.removeLast();//Remove element at last position
        System.out.println("Double ended queue : "+ADQ);
    }
}
