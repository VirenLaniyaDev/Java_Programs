/** Write a Java application program for generating four threads to perform the following operations:
 * 1) Getting N numbers as input
 * 2) Printing the numbers divided by five
 * 3) Printing prime numbers
 * 4) Computing the average*/

package MultiThreading;

import java.util.Scanner;

// Generating N numbers
class FirstThread extends Thread{
    int N;
    FirstThread(int N){
        this.N=N;
    }
    public void run(){
        System.out.println("Getting "+N+" numbers");
        for(int i=1;i<=N;i++)
            System.out.println(i);
    }
}

// Divisible by five numbers
class SecondThread extends Thread{
    int N;
    SecondThread(int N){
        this.N=N;
    }
    public void run(){
        System.out.println("Numbers which are Divisible by 5 :");
        for (int i=1;i<=N;i++){
            if(i%5==0)
                System.out.println(i);
        }
    }
}

// Prime numbers    -Numbers which are only divisible by itself
class ThirdThread extends Thread{
    int i,j;
    int N;
    ThirdThread(int N){
        this.N=N;
    }
    public void run(){
        System.out.println("Prime numbers :");
        for(i=1;i<=N;i++){
            for (j=2;j<i;j++){
                if (i%j==0)
                    break;
            }
            if(i==j)
                System.out.println(i);
        }
    }
}

// Average
class FourthThread extends Thread{
    int N;
    FourthThread(int N){
        this.N=N;
    }
    public void run(){
        System.out.print("Average of "+N+" numbers : ");
        int sum=0;
        for(int i=1;i<=N;i++)
            sum=sum+i;
        System.out.println((double)sum/N);
    }
}

public class _2_2_Example1_PerformGivenOperation_MT {
    public static void main(String[] args) {

        System.out.println("Enter number value of N :");
        int N=new Scanner(System.in).nextInt();

        FirstThread ft=new FirstThread(N);
        SecondThread st=new SecondThread(N);
        ThirdThread tt=new ThirdThread(N);
        FourthThread fourt=new FourthThread(N);

        ft.start();
        st.start();
        tt.start();
        fourt.start();
    }
}
