package AbstractClassesAndInterfaces;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>    /*The Comparable interface is basically used to sort the arrays and lists
                                                  of custom objects*/
{
    int rollno;
    String name;
     Student(int rollno,String name){
         this.rollno=rollno;
         this.name=name;
     }

     @Override
    public int compareTo(Student s) /*->compareTo(T obj) is only one method which is present in 'Comparable' class.
                                      ->In parameter 'Student s' is specified obj.*/
    {
        if (rollno==s.rollno)
            return 0;
        else if(rollno>s.rollno)
            return 1;       //if condition is true than return 1 that means exchange of rollno and rollno of specified object will perform.
        else
            return -1;
    }
}
public class _3_ComparableInterface_ACI {
    public static void main(String[] args) {
        /*Student ss=new Student(10,"****");
        System.out.println(ss.compareTo(ss));*/ //For understand
        ArrayList<Student> st=new ArrayList<Student>();
        st.add(new Student(2,"Manoj"));
        st.add(new Student(4,"Rakesh"));
        st.add(new Student(1,"Viren"));
        st.add(new Student(3,"Happy")); //this rollno is added at last so in Student class rollno=3.
        System.out.println("Sorted list of student is...");
        Collections.sort(st);       //Here compareTo() method will be execute. It can be sorted automatically by Collection.sort().
        for(Student s:st){
            System.out.println(s.rollno+"  "+s.name);
        }
    }
}