package Other_Programs;

import java.util.Scanner;

public class Marks_Percentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your 5 subject mark for convert in percentage:");
        System.out.println("Physics:");
        int a=sc.nextInt();
        System.out.println("Chemistry:");
        int b= sc.nextInt();
        System.out.println("Maths or Biology:");
        int c=sc.nextInt();
        System.out.println("English:");
        int d= sc.nextInt();
        System.out.println("Computer:");
        int e=sc.nextInt();

        int sum=a+b+c+d+e;

        System.out.println("Your result is: "+sum*100/500f+"%");

        if(a<=33||b<=33||c<=33||d<=33||e<=33)
        {
            System.out.println("Sorry!you have not Passed this Exam.");
        }
        else{
            System.out.println("Congratulation!you have Passed this Exam.");
        }
    }
}
