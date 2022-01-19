/**--> The stack is a linear data structure that is used to store the collection of objects. It is based on Last-In-First-Out (LIFO).
 * --> Stack class provides different operations such as push, pop, search, etc.
 * --> The stack data structure has the two most important operations that are push and pop.
 * --> The push operation inserts an element into the stack and pop operation removes an element from the top of the stack.
 * --> public class stack<T> extends Vector<T>
 * --> Methods provided by stack class : boolean empty(), object peek(), Object push(Object obj), Object pop(), int search(Object obj)*/

package Collection_Frameworks.Lists;

import java.util.Stack;

public class _5_1_Stack_CF_Vector {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();

        // Pushing elements into the stack
        st.push("Viren");
        st.push("Arvind");
        st.push("Elena");
        st.push("Stefan");
        System.out.println("Stack is : "+st);

        // Peek element from top
        System.out.println("Object at top is : "+st.peek());

        // Searching element from the stack
        System.out.println("Position of searched object : "+st.search("Elena"));

        // Check stack is empty or not
        System.out.println("Stack empty is : "+st.empty());

        // Pop the elements from the stack
        System.out.println("Popped Object is : "+st.pop());
        System.out.println("Popped Object is : "+st.pop());
        System.out.println("Stack is : "+st);
    }
}
