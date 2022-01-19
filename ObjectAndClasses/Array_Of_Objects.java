package ObjectAndClasses;

import java.util.Scanner;

class ArrDemo
{
    Scanner sc=new Scanner(System.in);
    int n;
    void setData()
    {
        System.out.println("Enter value:");
        n= sc.nextInt();
    }
    void getData()
    {
        System.out.println(n);
    }
}

public class Array_Of_Objects
{
    public static void main(String[] args) {

        ArrDemo []obj=new ArrDemo[3];   // Create Array of Object.and class name 'ArrDemo' is define for all Array Objects
        for(int i=0;i<3;i++)
        {
            obj[i]=new ArrDemo();       // There is no need to define class name(ArrDemo) before object name(obj[])
            obj[i].setData();
        }

        for(int i=0;i<3;i++)
        {
            obj[i].getData();
        }
    }
}
