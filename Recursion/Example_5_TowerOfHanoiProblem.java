/** About Tower of Hanoi Problem :
 * --> Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle is to
 *     move the entire stack to another rod, obeying the following simple rules:
 *      1.Only one disk can be moved at a time.
 *      2.Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack
 *        i.e. a disk can only be moved if it is the uppermost disk on a stack.
 *      3.No disk may be placed on top of a smaller disk.
 */



package Recursion;

import java.util.Scanner;

public class Example_5_TowerOfHanoiProblem {
    static int step=0;
    public static void main(String[] args) {
        System.out.println("***** Tower of Hanoi *****");
        System.out.print("Enter number of Disks : ");
        int n=(new Scanner(System.in)).nextInt();   // Number of disks
        char SRC='A';   // Disks Placed at peg SRC (Tower A)
        char AUX='B';   // Auxiliary Peg AUX (Tower B)
        char DEST='C';  // Destination Peg DEST (Tower C)
        TOH(SRC,AUX,DEST,n);
    }
    static void TOH(char SRC,char AUX,char DEST,int n){
        if (n==1){
            System.out.println("step "+(++step)+": Move disk "+n+" from rod "+SRC+ " --to--> rod "+DEST);
            return;
        }

        TOH(SRC,DEST,AUX,n-1);  //n-1 disks go to auxiliary(AUX)
        System.out.println("step "+(++step)+": Move disk "+n+" from rod "+SRC+ " --to--> rod "+DEST);   //Move n^th disk from source(SRC) to destination(DEST) peg
        TOH(AUX,SRC,DEST,n-1);  //Then move auxiliary(AUX) disks to Destination
    }
}
