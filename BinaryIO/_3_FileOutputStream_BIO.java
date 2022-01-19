package BinaryIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class _3_FileOutputStream_BIO {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            FileOutputStream fout=new FileOutputStream("src\\BinaryIO\\text.txt");
            String str="This is inserted text.";
            byte b[]=str.getBytes();        //We can't write as a characters directly, so that we need to convert in to Bytes.
            for(int i=0; i<b.length;i++)
                fout.write(b[i]);       //Write one by one byte in to the file.
            System.out.println("The Content is written successfully to the file.");
            fout.close();
        }

        catch(IOException IOE)
        {
            System.out.println("File not found.");
        }
    }
}
