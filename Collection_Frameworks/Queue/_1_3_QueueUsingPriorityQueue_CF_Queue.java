/**--> The priority queue is kind of data structure in which the elements can be inserted in any fashion but while removing
 * the elements, the high priority elements get deleted first and then the lower priority elements get removed.
 * --> When we add elements priority queue maintains min heap.
 * --> min heap - Minimal element of list is root element that is always at first position.*/


package Collection_Frameworks.Queue;

import java.util.*;

public class _1_3_QueueUsingPriorityQueue_CF_Queue {
    public static void main(String[] args) {
        ///////////// Small elements first priority /////////////
        Queue<Integer> queue=new PriorityQueue<>();
        //or    PriorityQueue<Integer> queue=new PriorityQueue<>();

        // Adding element
        queue.offer(50);
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println("Queue will be [According min heap] : "+queue);  //If you print this queue order will be changed because Priority queue maintains Min heap

        // Remove element -when we remove element it simply remove first element and again maintains Min heap
        System.out.println("Removed element : "+queue.remove());
        System.out.println("Queue will be [According min heap] : "+queue);
        System.out.println("Removed element : "+queue.remove());
        System.out.println("Queue will be [According min heap] : "+queue);

        System.out.println("-------------------------------------------------");

        ///////////// Big element first priority /////////////
        //-> In Big element first priority Priority queue maintain Max heap.

        Queue<Integer> queue2=new PriorityQueue<>(Comparator.reverseOrder());   //We can also add our custom comparator

        // Adding element
        queue.offer(50);
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println("Queue will be [According max heap] : "+queue);  //If you print this queue order will be changed because Priority queue maintains Max heap

        // Remove element -when we remove element it simply remove first element and again maintains Max heap
        System.out.println("Removed element : "+queue.remove());
        System.out.println("Queue will be [According max heap] : "+queue);
        System.out.println("Removed element : "+queue.remove());
        System.out.println("Queue will be [According max heap] : "+queue);

    }
}
