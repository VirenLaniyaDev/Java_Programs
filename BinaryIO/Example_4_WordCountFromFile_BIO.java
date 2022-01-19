/** Count number of the user entered word present in file.*/

package BinaryIO;

import java.io.*;
import java.util.Scanner;

public class Example_4_WordCountFromFile_BIO {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("******* Counting number of word from file *******");
        File file=new File("src\\BinaryIO\\text.txt");
        BufferedReader br=new BufferedReader(new FileReader(file));
        System.out.print("Enter word : ");
        String word=sc.next();
        // Method 1
        String Line;
        int count=0;
        while((Line=br.readLine())!=null){
            String[] data_word=Line.split(" ");
            for(int i=0;i< data_word.length;i++){
                if(data_word[i].equalsIgnoreCase(word))
                    count++;
            }
        }
        System.out.println("Number of Words : "+count);

        //Method 2
//        String fullstr="";
//        String TempLine;
//        int count=0;
//        while ((TempLine=br.readLine())!=null)
//            fullstr += TempLine + " ";  // we add " " so when line is end. it help in splitting.
//        String[] data_word=fullstr.split(" ");
//
//        for(int i=0;i< data_word.length;i++)
//        {
//            if (data_word[i].equalsIgnoreCase(word))
//                count++;
//        }
//        System.out.println("Number of Words : "+count);

    }
}
