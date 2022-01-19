package FileClass_And_InputAndOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class _4_1_FileInputStreamClass_FIO {
    public static void main(String[] args) throws IOException{

        try{
            FileInputStream fin=new FileInputStream("src\\FileClass_And_InputAndOutput\\test.txt");

            int i=fin.read();   //Reads the next byte of data from the 'fin'.The value byte is returned as an int in the range 0 to 255.
                                /*Question: Why 'read()' does return int value and not byte value?
                                * Answer: */
            if(i==-1){
                System.out.println("File is Empty!!");
            }

            while(i!=-1){
                System.out.print((char)i);
                i=fin.read();
            }
        }
        catch(IOException e){
            System.out.println("Exception: File is not found!");
        }
    }
}
