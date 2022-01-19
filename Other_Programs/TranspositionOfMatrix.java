package Other_Programs;

import java.util.Scanner;


public class TranspositionOfMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A[][]=new int[3][3];
        System.out.println("Enter Elements: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++) {
                System.out.printf("[%d][%d] : ",i+1,j+1);
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your matrix");
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
        TransitionLogic(A);
    }

    static void TransitionLogic(int A[][])
    {
        int temp[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                temp[j][i]=A[i][j];
            }
        }

        System.out.println("Transform matrix:");
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(temp[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
