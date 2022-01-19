/** Write a multi-threaded program to meet following requirements :
 * -> Read matrix [A] m x n
 * -> Create m number of threads
 * -> Each thread computes summation of elements of one row, i.e. i^th row of the matrix is processed by i^th thread, where 0 <= i < m
 * -> Print the results*/

package MultiThreading;

import java.util.Scanner;

public class _2_3_Example2_SumOfRowOfMatrix_MT extends Thread {
    static int [][] A;
    static int m,n;
    int row;
    static int sum[];

    _2_3_Example2_SumOfRowOfMatrix_MT(int i){
        row=i;
        System.out.println("Thread#"+(i+1)+" is executing...");
        this.start();   // Run() invoked in this class
    }

    // Compute summation of particular row
    public void run(){
        sum[row]=0;
        for (int j=0;j<n;j++)
            sum[row]=sum[row]+A[row][j];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Read Matrix [A] m x n
        System.out.print("Enter number of Row (m): ");
        m=sc.nextInt();
        System.out.print("Enter number of Column (n): ");
        n=sc.nextInt();
        A=new int[m][n];
        sum=new int[m];
        System.out.println("Enter Matrix elements : ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.format("  Enter element [%d,%d] :",i+1,j+1);
                A[i][j]=sc.nextInt();
            }
        }

        // Creating m number of threads
        _2_3_Example2_SumOfRowOfMatrix_MT [] Threads=new _2_3_Example2_SumOfRowOfMatrix_MT[m];
        for (int j=0;j<m;j++)
            Threads[j]=new _2_3_Example2_SumOfRowOfMatrix_MT(j);

        try{
            for(int i=0;i<m;i++)
                Threads[i].join();  //Wait until i^th Thread complete
        }catch (Exception e){}

        // Printing the result
        for (int i=0;i<m;i++)
            System.out.println("Sum of "+(i+1)+" row elements : "+sum[i]);
    }
}
