package Practicals;

import java.util.Scanner;

class check{
    char c;
    check(char c){
        this.c=c;
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("Given character is vowel.");
        }
        else
            System.out.println("Given character is constant.");
    }
}

public class Practical_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character:");
        char c=sc.next().charAt(0);
        check ch=new check(c);
    }
}
