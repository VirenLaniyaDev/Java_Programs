/**--> LinkedSet extends HashSet.
 * --> The difference is LinkedSet maintain insertion order.
 * --> public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, Serializable
 * --> Java LinkedHashSet class is non synchronized.*/

package Collection_Frameworks.Sets;

import java.util.*;

class Student2{
    String name;
    int rollno;
    Student2(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    /********* Generating HashCode according to rollno *********/
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student2 student = (Student2) o;
//        return rollno == student.rollno;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(rollno);
//    }
}

public class _2_1_LinkedSet_CF_Sets {
    public static void main(String[] args) {
        LinkedHashSet<Integer> Lhset=new LinkedHashSet<>();

        // Adding elements in Set
        Lhset.add(10);
        Lhset.add(20);
        Lhset.add(30);
        Lhset.add(40);
        Lhset.add(40);   //Ignore
        Lhset.add(40);   //Ignore
        Lhset.add(50);
        System.out.println("Set is : "+Lhset);   //Order will may changed because it short according to hash

        // Check that Set is empty or not
        System.out.println("Set empty is : "+Lhset.isEmpty());

        // Display hashcode
        System.out.println("Hash code is : "+Lhset.hashCode());

        // Element contains or not
        System.out.println("30 present in set is : "+Lhset.contains(30));

        // Remove element
        System.out.println("Element 20 removed successful ! : "+Lhset.remove(20));

        // Clear all elements
        Lhset.clear();
        System.out.println("Set is : "+Lhset);

    }
}
