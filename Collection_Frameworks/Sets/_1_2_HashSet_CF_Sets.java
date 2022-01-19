/** Create hashset with custom class objects.*/


package Collection_Frameworks.Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Student{
    String name;
    int rollno;
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                '}';
    }

    /********* Generating HashCode according to rollno *********/
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return rollno == student.rollno;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(rollno);
//    }
}

public class _1_2_HashSet_CF_Sets {
    public static void main(String[] args) {
        Set<Student> Shset=new HashSet<>();

        // Adding Student objects
        Shset.add(new Student("Viren",1));
        Shset.add(new Student("Demon",2));
        Shset.add(new Student("Stefan",3));
        Shset.add(new Student("Elena",1));  // Not Ignored because this is different object
        //When you uncomment 'Generating HashCode according to rollno' then it will ignored
        Shset.add(new Student("Demon",2));  //Not Ignored because this is different object
        //When you uncomment 'Generating HashCode according to rollno' then it will ignored
        System.out.println("Set -------------------------");
        Iterator<Student> it_s= Shset.iterator();
        while(it_s.hasNext())
            System.out.println(it_s.next());
        System.out.println("-----------------------------");
    }
}
