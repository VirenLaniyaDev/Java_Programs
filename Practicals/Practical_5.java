package Practicals;

import java.util.Scanner;

public class Practical_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Elements:");
        int number=sc.nextInt();

        int []a=new int[number];
        for(int i=0;i<number;i++){
            System.out.println("Enter element "+(i+1)+":");
            a[i]=sc.nextInt();
        }

        for (int j=0;j<a.length-1;j++){
            int i=0;
            while(i<a.length-1){
                if(a[i+1]>a[i]){
                    int b=a[i+1];
                    a[i+1]=a[i];
                    a[i]=b;
                }
                i=i+1;
            }
        }

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
