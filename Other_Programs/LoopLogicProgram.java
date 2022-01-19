/**
        *	1	*	2	*	3	*	4
        *	5	*	6	*	7	*
        *	8	*	9	*	10
        *	11	*	12	*
        *	13	*	14
        *	15	*
        *	16
        *
 * write a program to print above type of pattern for 'n' value.
 */

package Other_Programs;

import java.util.Scanner;

public class LoopLogicProgram {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++)
        {
            int j=n;
            while(j>=i){
                if (j % 2 == 0) {
                    System.out.print((num++)+"\t");
                    j--;
                }
                else{
                    System.out.print("*\t");
                    j--;
                }
            }
            System.out.println();
        }
    }
}
