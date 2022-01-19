/** Write a program that counts the no. of words in a text file.NOTE:The file name and word take from the user.*/

package BinaryIO;

import java.io.*;
import java.util.Scanner;

public class Example_3_SearchWordFromFile_BIO {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter File name: ");
        String file = sc.next();
        File file_obj = new File("D:\\Programs\\Java_Programs\\src\\BinaryIO\\"+file);
        if (!file_obj.exists()) {
            System.out.println("File does not exists!!");
            return;
        }
        System.out.println("File available.");
        System.out.print("Enter word : ");
        String word = sc.next();
        String Line;
        int count = 0;
        boolean WordPresent = false;

        BufferedReader br = new BufferedReader(new FileReader(file_obj));
        while ((Line = br.readLine()) != null) {
            String[] data = Line.split(" ");    //Split the Line when " "(space) come.
            count++;
            for (int i = 0; i < data.length; i++) {
                if (data[i].equalsIgnoreCase(word)) {
                    System.out.println("At line " + count + " : " + Line);
                    WordPresent = true;
                }
            }
        }

        if (!WordPresent)
            System.out.println("Word is not available!");
    }
}
