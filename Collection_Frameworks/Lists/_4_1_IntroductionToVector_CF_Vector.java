/**--> Vector is very similar to ArrayList class which implements the dynamic array.
 * --> public class Vector<E> extends Object<E> implements List<E>, Cloneable, Serializable
 * --> Vector is synchronized.
 * --> Java Vector contains many legacy methods that are not the part of a collections framework.
 * --> Some additional methods in this class is list below
 *      1.void addElement(Object obj)   2.void insertElementAt(Object obj,int pos)  3.boolean removeElement(Object obj)
 *      4.void removeAllElement()   5.int capacity()    6.int size()    7.boolean isEmpty()     8.object firstElement()
 *      9.int indexOf(Object obj)   10.void setSize(int size)
 */

package Collection_Frameworks.Lists;

import java.util.Vector;

public class _4_1_IntroductionToVector_CF_Vector {
    public static void main(String[] args) {

        Vector<Integer> vect=new Vector<>();

        //Add elements in vector
        vect.addElement(10);    //Add element using addElement()
        vect.addElement(20);
        vect.addElement(30);
        vect.add(40);   //Add element using add()
        vect.add(50);
        System.out.println("Vector : "+vect);

        //Insert element at particular position
        vect.insertElementAt(60,3);
        System.out.println("60 inserted at position 3. Vector : "+vect);

        //Check size and capacity
        System.out.println("Size of vector : "+vect.capacity());    //Find size of vector using capacity()
        System.out.println("Size of vector : "+vect.size());    //Find size of vector using size()

        //Check particular element contains or not
        System.out.println("30 present in list which is "+vect.contains(30));

        //Get first and last element
        System.out.println("First element is "+vect.firstElement());
        System.out.println("First element is "+vect.lastElement());

        //Get hash code
        System.out.println("Hash code : "+vect.hashCode());

        //Removing elements
        System.out.println("Remove 30 element is : "+vect.removeElement(30));   //Remove particular object
        vect.removeElementAt(2);    //remove at 2nd position
        vect.removeAllElements();
        System.out.println("Vector : "+vect);

    }
}
