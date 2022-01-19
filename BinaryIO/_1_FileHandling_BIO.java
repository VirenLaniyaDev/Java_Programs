package BinaryIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class _1_FileHandling_BIO {
    public static void main(String[] args) throws IOException{

        ///////////////// File creation /////////////////
        File file=new File("src\\BinaryIO\\text.txt");
        file.createNewFile();   //If file already exits then there is no create any file
        System.out.println("File Created successfully.");

        ///////////////// Write on file /////////////////
        FileWriter fwriter=new FileWriter(file);
        Scanner input=new Scanner(System.in);
        System.out.println("Enter content of file: ");
        String str=input.nextLine();
        fwriter.write(str);
        fwriter.close();

        ///////////////// read a file /////////////////
//        Scanner fread=new Scanner(new File("src\\BinaryIO\\text.txt"));
        Scanner fread= new Scanner(file);
        System.out.println("----------------------------- Content of File ------------------------------------");
        while(fread.hasNextLine())
        {
            System.out.println(fread.nextLine());
        }
        System.out.println("----------------------------------------------------------------------------------");
        fread.close();

        file.delete();
        System.out.println("File was Deleted");
    }
}
