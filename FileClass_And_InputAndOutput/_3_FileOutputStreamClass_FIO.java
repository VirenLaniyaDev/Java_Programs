package FileClass_And_InputAndOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class _3_FileOutputStreamClass_FIO {
    public static void main(String[] args) throws IOException
    {
        FileOutputStream fout=new FileOutputStream("src\\FileClass_And_InputAndOutput\\test.txt",true); /*'true' shows when we write
                                                                                      in File it will be start apparently.
                                                                                      But in default case it is 'false' so
                                                                                      first clear file and start new write.*/
        String str="Hello!";
        char[] a=str.toCharArray(); //change string to character array.
        for(int i=0;i<a.length;i++){
            fout.write(a[i]);   //write one by one character. As for loop execute as character will print.
        }
        System.out.println("Written successful !");
        fout.close();   //So far Above all changes performed in RAM, 'close()' method help to save permanently in hard disk.
    }
}
