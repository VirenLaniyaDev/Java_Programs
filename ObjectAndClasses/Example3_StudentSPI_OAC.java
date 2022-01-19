/*
It is required to compute SPI(Semester Performance Index) of n Students
of your college for their registered subjects in a semester.
->Declare a class called student having following data members:
id_no,no_of_subjects_registered,subject_code,subject_credits,grade_obtained and spi.
->Define constructor and calculate_spi methods.
->Define main to instantiate an array for objects of class student to process data.
*/

package ObjectAndClasses;

import java.util.Scanner;

class student
{
    Scanner sc=new Scanner(System.in);
    int id_no,no_of_subjects_registered;
    int subject_code[]=new int[5];
    int subject_credits[]=new int[5];
    String grade_Obtained[]=new String[5];
    int grade_point[]=new int[5];
    float spi;
    int sum=0,TotalCredit=0;

    student()
    {
        no_of_subjects_registered=5;
        subject_code[0]=000001;
        subject_credits[0]=3;
        subject_code[1]=000002;
        subject_credits[1]=5;
        subject_code[2]=000003;
        subject_credits[2]=5;
        subject_code[3]=000004;
        subject_credits[3]=4;
        subject_code[4]=000005;
        subject_credits[4]=2;
    }

    public void calculate_spi()
    {
        for (int i=0;i<no_of_subjects_registered;i++)
        {
            if (grade_Obtained[i]=="AA")
                grade_point[i]=10;
            else if (grade_Obtained[i]=="AB")
                grade_point[i]=9;
            else if (grade_Obtained[i]=="BB")
                grade_point[i]=8;
            else if (grade_Obtained[i]=="BC")
                grade_point[i]=7;
            else if (grade_Obtained[i]=="CC")
                grade_point[i]=6;
            else if (grade_Obtained[i]=="CD")
                grade_point[i]=5;
            else if (grade_Obtained[i]=="DD")
                grade_point[i]=4;
            else if (grade_Obtained[i]=="FF")
                grade_point[i]=0;

            sum=sum+grade_point[i]*subject_credits[i];
            TotalCredit=TotalCredit+subject_credits[i];
        }
        spi=sum/TotalCredit;
        System.out.println("Your Semester Performance Index (SPI) is : "+spi);
    }

}
public class Example3_StudentSPI_OAC {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String grade;
        student obj=new student();
        System.out.println("Enter number of Students::");
        int n= sc.nextInt();
        if (n<=0)
        {
            System.out.println("Error! Please Check your number..");
            return;
        }

        long id_no[]= new long[n];
        for (int i=0;i<n;i++)
        {

            System.out.println("Enter id number:");
            id_no[i]=sc.nextLong();
            System.out.println("Enter records of Student-"+(i+1)+":");
            for (int j=0;j<obj.no_of_subjects_registered;j++)
            {
                System.out.println("->Subject Code:"+obj.subject_code[j]);
                System.out.println("->Subject Credit:"+obj.subject_credits[j]);
                System.out.println("Enter Grade:");
                obj.grade_Obtained[i]= sc.next();
            }
            obj.calculate_spi();
            System.out.println("--------------------------------------------|");
        }
    }
}
