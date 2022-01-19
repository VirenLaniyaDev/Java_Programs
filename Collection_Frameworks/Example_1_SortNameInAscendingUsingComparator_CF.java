/** Question :
 * -> Write a Java Program to sort the name of the person in ascending order. Make use of comparator interface.*/

package Collection_Frameworks;
import java.util.*;

class Person{
    String name;
    Person(String name){
        this.name=name;
    }
}

class ComparatorProg implements Comparator{
    public int compare(Object o1,Object o2){
        Person p1=(Person)o1;
        Person p2=(Person)o2;
        return p1.name.compareTo(p2.name);  //compareTo is a method of String class.
        // If return value is 1 than it will swap p1.name and p2.name
    }
}

public class Example_1_SortNameInAscendingUsingComparator_CF {
    public static void main(String[] args) {

        // List creation
        List list=new ArrayList();
        list.add(new Person("Viren"));  //Provided object type is Person
        list.add(new Person("Arvind"));
        list.add(new Person("Pankaj"));
        list.add(new Person("Ramesh"));

        Iterator it=list.iterator();

        System.out.println("Your list is : ");
        while(it.hasNext()){
            Person p=(Person)it.next();
            System.out.println(" "+p.name);
        }

        Collections.sort(list,new ComparatorProg());    //At the first argument we provide list and Second we provide Comparator which return positive value, 0 or negative value.
        // This sort() time complexity is O(nlogn) because it use merge sort technique to sort.

        it=list.iterator();
        System.out.println("Your reverse list is : ");
        while(it.hasNext()){
            Person p=(Person)it.next();
            System.out.println(" "+p.name);
        }
    }
}
