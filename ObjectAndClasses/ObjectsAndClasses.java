package ObjectAndClasses;

import java.util.Scanner;   //Define a Scanner Class

public class ObjectsAndClasses //There is only one 'public' class in program
{
    public static void main(String[] args)  // Define main method
    {
        Scanner sc=new Scanner(System.in);  //'sc' Object of Scanner Class.

        /*1*/Employee Viren=new Employee();     /*Instantiating a new Object.Creating Object 'Viren' of 'Employee' Class.In short
                                                'Viren' is refer class 'Employee'*/
                Viren.Eid=1;                //
                Viren.Ename="Viren Patel";  //  Store information in Object 'Viren'
                Viren.Esalary=50000;        //

        /*2*/Employee Umang=new Employee();     /*Instantiating a new Object.Creating Object 'Umang' of 'Employee' Class.In short
                                                  'Umang' is refer class 'Employee'*/
                Umang.Eid=2;                //
                Umang.Ename="Umang Parmar"; //  Store information in Object 'Umang'
                Umang.Esalary=45000;        //

        /*3*/Employee Nikunj=new Employee();    /*Instantiating a new Object.Creating Object 'Nikunj' of 'Employee' Class.In short
                                                  'Nikunj' is refer class 'Employee'*/
                Nikunj.Eid=3;                //
                Nikunj.Ename="Nikunj Parmar";//  Store information in Object 'Nikunj'
                Nikunj.Esalary=45000;        //

                Viren.display();    //
                Umang.display();    //  Method use from particular Objects
                Nikunj.display();   //

    }
}

class Employee      //Create Class Employee
{
    int Eid;        //
    String Ename;   //Data Field
    int Esalary;    //

    void display()  //create 'display' Method
    {
        System.out.println( Eid +"  "+ Ename +"  "+ Esalary );
    }
}
