package Other_Programs;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors_GameCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random ran=new Random();

        System.out.println("Welcome to Rock,Paper & Scissors Game");
        do
        {
            System.out.println("Enter your choice:\nRock->0\nPaper->1\nScissors->2");
            int RPS=sc.nextInt();
            int RV=ran.nextInt(3);

            if(RPS==1 && RV==0 || RPS==2 && RV==1 || RPS==0 && RV==3)
            {
                System.out.println("Congrats!You Win this game.");
            }
            else if(RPS==RV)
            {
                System.out.println("Tie!Both are have same objects.");
            }
            else
            {
                System.out.println("Oops!you lose,Better luck next time.");
            }

            System.out.println("Do you want continue:[y/n]:");
        }while (sc.next().charAt(0)=='y' || sc.next().charAt(0)=='Y');
    }
}
