package Recursion;

import java.util.Scanner;

public class Example_3_BinarySearchUsingRecursion {
    static int []A={1,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {
        System.out.println("***** Binary Search Using recursion *****");
        System.out.println("Enter Key element: ");
        int key=(new Scanner(System.in)).nextInt();
        BinarySearch(0,9,key);
    }

    static void BinarySearch(int low, int high, int key) {
        if(low>=high){
            System.out.println("Element not found!");
            return;
        }
        int mid=(low+high)/2;
        if (A[mid]==key)
            System.out.println("Key element at : "+(mid+1));
        else if (A[mid]>key)
            BinarySearch(0,mid-1,key);
        else
            BinarySearch(mid+1,high,key);
    }
}
