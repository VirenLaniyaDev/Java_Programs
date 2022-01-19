/**--> File Input Stream :  It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc.
 * --> Java FileInputStream class obtains input bytes from a file.
 * --> You can also read character streams, but it is not recommended to use. instead of use FileReader class.*/


package BinaryIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _2_FileInputStream_BIO {
    public static void main(String[] args) throws IOException {
        try
        {
            int n;
            FileInputStream fin = new FileInputStream("src\\BinaryIO\\_2_FileInputStream_BIO.java");
            System.out.println("Available bytes :" +(n=fin.available()));
            System.out.println("----------------------------- Content of File ------------------------------------");
            for(int i=0;i<n;i++)
                System.out.print((char)fin.read());     //File contains data in byte format.
                                                        //We need to convert in to character. 1 character = 1 byte.
            System.out.println("----------------------------------------------------------------------------------");
            System.out.print("Skip some text:");
            System.out.println(fin.skip(n/2));      /*skip() method shows bytes of numbers according to the parameter values.
                                                       -->here display only half of Available bytes.*/
            fin.close();    //close() used to close the opened file.
                            //It is not necessary but for good practice you should do.

        }
        catch(FileNotFoundException fnotE)
        {
            System.out.println("File is not found.");
            fnotE.printStackTrace();
        }
    }
}
