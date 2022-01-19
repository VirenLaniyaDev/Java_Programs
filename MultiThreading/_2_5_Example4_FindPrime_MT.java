/** Write a multithreaded program to compute and print prime numbers up to n where n is given by user. Instantiate required
 * number of threads where each thread except the last, examines next 50 numbers and the last thread examines remaining
 * numbers to check whether a number is a prime or not.*/


package MultiThreading;

class FirstFifty extends Thread{
    public void run(){
        for(int i=1;i<=50;i++){
            int j;
            for(j=2;j<i;j++){
                if(i%j==0)
                    break;
            }
            if(i==j)
                System.out.println(i);
        }
    }
}

class AfterFifty extends Thread{
    int n;
    AfterFifty(int n){
        this.n=n;
    }
    public void run(){
        for(int i=51;i<=n;i++){
            int j;
            for(j=2;j<i;j++){
                if(i%j==0)
                    break;
            }
            if(i==j)
                System.out.println(i);
        }
    }
}

public class _2_5_Example4_FindPrime_MT {
    public static void main(String[] args) {
        System.out.print("Enter Value of n : ");
        int n=new java.util.Scanner(System.in).nextInt();
        if(n<50){
            System.out.println("Oops! n is less than 50!!");
            return;
        }

        FirstFifty ff=new FirstFifty();
        AfterFifty af=new AfterFifty(n);

        try {
            System.out.println("\nFirst 50 Prime numbers : ");
            ff.start();
            ff.join();
            System.out.println("\nAfter 50 Prime numbers : ");
            af.start();
            af.join();
        } catch(InterruptedException e){}
    }
}
