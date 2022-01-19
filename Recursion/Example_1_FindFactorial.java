package Recursion;

import java.util.Scanner;

public class Example_1_FindFactorial {
    public static void main(String[] args) {
        System.out.println("***** Factorial *****");
        System.out.print("Enter Number : ");
        int n=(new Scanner(System.in)).nextInt();

        if (n<0){
            System.out.println("Invalid number!");
            return;
        }

        int fact=Factorial(n);
        System.out.println(fact);
    }
    static int Factorial(int n){
        if (n==0)
            return 1;
        return n*Factorial(n-1);    //Recursive Factorial
    }
}
