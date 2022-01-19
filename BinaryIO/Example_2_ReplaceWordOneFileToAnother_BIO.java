package BinaryIO;

import java.io.*;
import java.util.Scanner;

public class Example_2_ReplaceWordOneFileToAnother_BIO {
    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        FileReader fr=new FileReader("src\\BinaryIO\\text.txt");
        BufferedReader br=new BufferedReader(fr);   //Create a buffer
        String FullStr="";
        String TempStr;
        while((TempStr=br.readLine())!=null)
            FullStr += TempStr + " ";        // Putting all file content in one string.
                                             // Here we add " " because whenever we need to split the String It helps.
        System.out.println("Original File Content -----------------------------------");
        System.out.println(FullStr);
        System.out.println("---------------------------------------------------------");

        System.out.print("Enter word which you have to replace (Old word) : ");
        String OldWord=sc.next();

        String []WordList = FullStr.split(" ");  //Split FullStr, whenever " "(space) come.

        int count=0;
        for(int i=0;i<WordList.length;i++)
        {
            if(WordList[i].equals(OldWord))
                count++;
        }
        System.out.println("The total number of exchange require is : "+count);

        //Replacing OldWord --to--> NewWord
        System.out.println("Enter new word which you want to replace with "+"'"+OldWord+"'");
        String NewWord=sc.next();
        String NewStr=FullStr.replace(OldWord,NewWord);

        //Display Modified Content
        System.out.println("Modified File Content -----------------------------------");
        System.out.println(NewStr);
        System.out.println("---------------------------------------------------------");

        br.close();
        fr.close();
    }
}
