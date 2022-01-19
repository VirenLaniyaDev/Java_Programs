package Recursion;

import java.util.Scanner;

class Example_2_FibonacciSeriesUsingRecursion {
    public static void main(String[] args) {
        System.out.println("***** Fibonacci Series *****");
        System.out.print("Enter Number : ");
        int n = (new Scanner(System.in)).nextInt();

        if (n < 0) {
            System.out.println("Invalid number!");
            return;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(Fibonacci(i)+"\t");
        }
    }

    static int Fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n==1)
            return 1;
        return Fibonacci(n - 2) + Fibonacci(n - 1);
    }
}
