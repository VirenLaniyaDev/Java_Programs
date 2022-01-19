package Other_Programs;

import java.util.Scanner;

class Display
{
    int m,n;
    void MatrixDisplay(int M[][],int m,int n)
    {
        for (int i=0; i<m;i++)
        {
            for (int j=0; j<n; j++)
            {
                System.out.print(M[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

class Logic
{
    void MultiplicationLogic(int[][] A, int[][] B, int[][] C, int m1, int n1, int n2)
    {
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                C[i][j]=0;
                for(int k=0;k<n1;k++)
                {
                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
                }
            }
        }
    }
}
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m1,n1,m2,n2;
        System.out.println("Enter number of row and column for first matrix: ");
        m1=sc.nextInt();
        n1=sc.nextInt();
        int A[][]=new int[m1][n1];

        System.out.println("Enter number of row and column for second matrix: ");
        m2=sc.nextInt();
        n2=sc.nextInt();
        int B[][]=new int[m2][n2];

        if(n1!=m2)
        {
            System.out.println("Sorry ! Multiplication is not Possible.");
            return;
        }

        int C[][]=new int[m1][n2];

        ///////Matrix 1
        System.out.println("Enter Matrix 1:");
        for(int i=0;i<2;i++){
            for(int k=0;k<2;k++){
                System.out.printf("[%d][%d]:",i+1,k+1);
                A[i][k]=sc.nextInt();
            }
        }

        ///////Matrix 2
        System.out.println("Enter Matrix 2:");
        for(int k=0;k<2;k++){
            for(int j=0;j<2;j++){
                System.out.printf("[%d][%d]:",k+1,j+1);
                B[k][j]=sc.nextInt();
            }
        }

        Logic MMul=new Logic();
        MMul.MultiplicationLogic(A,B,C,m1,n1,n2);

        Display M1=new Display();
        System.out.println("Matrix 1:\t");
        M1.MatrixDisplay(A,m1,n1);
        Display M2=new Display();
        System.out.println("Matrix 2:\t");
        M2.MatrixDisplay(B,m2,n2);
        Display M3=new Display();
        System.out.println("Matrix 1 * Matrix 2:\t");
        M3.MatrixDisplay(C,m1,n2);
    }
}


