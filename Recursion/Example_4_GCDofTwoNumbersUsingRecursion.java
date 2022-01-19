package Recursion;

import java.util.Scanner;

public class Example_4_GCDofTwoNumbersUsingRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("***** Greatest common divisor(GCD) of two number *****");
        System.out.print("Enter number 1 : ");
        int a=sc.nextInt();
        System.out.print("Enter number 2 : ");
        int b=sc.nextInt();
        int ans = gcd(a,b);
        System.out.format("GCD(%d,%d) = %d",a,b,ans);
    }

    // This Method based on Euclidean algorithm
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);   //recursive call
    }
}
