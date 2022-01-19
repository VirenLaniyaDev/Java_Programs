package Other_Programs;

import java.util.Scanner;

public class ValueFindByExpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Expression: (b^2-4ac)/2a");
        System.out.println("Enter value of 'a':");
        int a= sc.nextInt();
        System.out.println("Enter value of 'b':");
        int b= sc.nextInt();
        System.out.println("Enter value of 'c':");
        int c= sc.nextInt();

        float ex_val=(float)(b*b-4*a*c)/(2*a);
        System.out.println("Result: "+ex_val);
    }
}
