/**--> Java LinkedList class uses a doubly linked list to store the elements.
 * --> Every node of Doubly linked list contains 3 fields...
 * First field is point to the previous node(Store the address of previous node).
 * Second field is store the data.
 * Third field is point to the next node(Store the address of next node).
 * --> public class LinkedList<E>
 *     extends AbstractSequentialList<E>
 *     implements List<E>, Deque<E>, Cloneable, java.io.Serializable
 * --> Constructor : LinkedList(), LinkedList(Collection<? extends E> c)
 * --> Generally used Methods : All methods of Array list are supported in linked list, E getFirst(), E getLast(),
 * boolean offer(E e), boolean offerFirst(E e), boolean offerLast(E e)[all offer methods are similar to get methods]
 * E peek(), E peekFirst(), E peekLast(), E poll(), E pollFirst(), E pollLast(), E removeFirst(), E removeLast() etc.
 * */


package Collection_Frameworks.Lists;

import java.util.LinkedList;

public class _3_1_IntroductionToLinkedList_CF_Lists {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList<Integer>();

        // Adding element to the linked list
        linkedList.add(10);
        linkedList.addFirst(50);
        linkedList.addLast(60);
        linkedList.offer(20);   //Add element using offer()
        linkedList.offerFirst(30);  //Add element at first position using offerFirst()
        linkedList.offerLast(40);   //Add element at last position using offerLast()
        // Difference between offer methods and add methods : offer() return false if it fails while add() throws exception.
        System.out.println("Linked list is : "+linkedList);

        // peek methods
        System.out.println("First element is : "+linkedList.peek());    //Gives first positioned element
        System.out.println("First element is : "+linkedList.peekFirst());//Gives first positioned element. return null if list is empty.
        System.out.println("Last element is : "+linkedList.peekLast());    //Gives last positioned element. return null if list is empty.
        System.out.println("Linked list is : "+linkedList);

        // poll methods -used for remove element
        System.out.println("Removed first element is : "+linkedList.poll());   //Remove first positioned element
        System.out.println("Removed first element is : "+linkedList.pollFirst());   //Remove first positioned element. return null if list is empty.
        System.out.println("Removed last element is : "+linkedList.pollLast());   //Remove first positioned element. return null if list is empty.
        System.out.println("Linked list is : "+linkedList);

        // Common methods array list and linked list
        System.out.println("Size of linked list : "+linkedList.size()); // Determining size of linked list
        System.out.println("2nd element is : "+linkedList.get(1)); //Get element from giving position
        linkedList.set(2,100);
        System.out.println("New Array list : "+linkedList);
        System.out.println("50 contains by Array list : "+linkedList.contains(50));
        linkedList.remove(1);
        System.out.println("Linked list after removing 2nd positioned element : "+linkedList);
        linkedList.remove(Integer.valueOf(100));
        System.out.println("Linked list after removing 100 : "+linkedList);
        linkedList.clear();
        System.out.println("Remove all elements from the list : "+linkedList);

    }
}
