package Collection_Frameworks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private double gpa;

    // Constructor
    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    public double getGpa() {
        return this.gpa;
    }
}

public class _3_2_TheComparatorInterfaceExample_CF {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Viren", 4.1));
        students.add(new Student("Vaishvi", 4.0));
        students.add(new Student("Pallavi", 4.2));
        students.add(new Student("Nimit", 3.9));
        students.add(new Student("Ashu", 3.9));

        // Using Lamda expression
        System.out.println("Using Lamda Expression :");
        System.out.println("------------------------");
         students.sort((s1, s2) -> {
             if (s2.getGpa() - s1.getGpa() > 0) {
                 return 1;
             } else if (s2.getGpa() - s1.getGpa() < 0){
                 return -1;
             } else {
                 return s1.getName().compareTo(s2.getName());
             }
         });

        for(Student student: students){
            System.out.println(student.getName() + " " + student.getGpa());
        }

        // [Java 8 or Higher] Using comparing() and Reference method
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing((s1, s2) -> s1.getName().compareTo(s2.getName()));
        // Student::getGpa :- this is called reference method which compares object by running getGpa().
        // reversed() :- return reversed sorting
        // thenComparing() :- additional comparator which will be call after comparing() and reversed()

        students.sort(comparator);

        System.out.println("\nUsing comparing() and Reference method :");
        System.out.println("----------------------------------------");
        for(Student student: students){
            System.out.println(student.getName() + " " + student.getGpa());
        }
    }
}
