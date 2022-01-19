package ObjectAndClasses;

import java.util.Scanner;

class Student_ArrDemo
{
    Scanner sc=new Scanner(System.in);
    int student,rollno;
    long phno;
    String name;
    Student_ArrDemo(int val)
    {
            student=val;
    }

    void Record()
    {
        System.out.println("Fill information for Student "+student);
        System.out.println("Name:");
        name= sc.nextLine();
        System.out.println("Roll Number:");
        rollno= sc.nextInt();
        System.out.println("Phone Number:");
        phno= sc.nextLong();
    }
    void DisplayRecords()
    {
        System.out.println("Student "+student+"\t"+name+"\t"+rollno+"\t"+phno);
    }

}

public class Example5_StudentRecord_ArrayOfObjects_OAC
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Student: ");
        int n=sc.nextInt();
        Student_ArrDemo ArrayObj[]=new Student_ArrDemo[n];
        for (int i=0;i<ArrayObj.length;i++)
        {
            ArrayObj[i]=new Student_ArrDemo(i+1);
            ArrayObj[i].Record();
        }
        for (int i=0;i<ArrayObj.length;i++)
        {
            ArrayObj[i].DisplayRecords();
        }
    }
}
