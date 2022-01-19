package ObjectAndClasses;

import java.util.Scanner;

class fibonacci
{
    int a=0,b=1,num;
    fibonacci(int n)
    {
        num=n;
    }
    void logic()
    {
        for(int i=0;i<num;i++)
        {
            System.out.print(b+"  ");
            int result=a+b;
            a=b;
            b=result;
        }
    }
}
public class Example4_FibonacciNumber_OAC
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char ans;
        do{
            System.out.println("Enter number of Fibonacci number::");
            int n = sc.nextInt();
            fibonacci obj = new fibonacci(n);
            obj.logic();
            System.out.println("\nDo you print fibonacci number again?(y/n):");
            ans=sc.next().charAt(0);
            }while(ans=='y'||ans=='Y');
    }
}
