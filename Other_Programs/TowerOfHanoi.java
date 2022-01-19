package Other_Programs;

import java.util.Scanner;

public class TowerOfHanoi
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int Disk;
        System.out.println("Enter number of Disks");
        Disk= sc.nextInt();
        TOH(Disk,'A','B','C');
    }

    static void TOH(int Disk,char FROM,char AUX,char TO)
    {
        if(Disk==1) {
            System.out.printf("Move Disk %d From %c to %c\n", Disk, FROM, TO);
            return;
        }
        else
            TOH(Disk-1, FROM, TO, AUX);
                System.out.printf("Move Disk %d From %c to %c\n",Disk,FROM,TO);
            TOH(Disk-1, AUX, FROM, TO);
    }
}
