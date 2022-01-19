package Other_Programs;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int sum=0;
        System.out.println("Enter how many number do you want to sum??:");
        int NFS=sc.nextInt(); //how many numbers for sum

        while(i<=NFS)
        {
            System.out.println("enter your number_"+i);
            int a=sc.nextInt();
            sum=sum+a;
            i++;
        }
        System.out.println("Your sum of numbers is:"+sum);

    }
}
