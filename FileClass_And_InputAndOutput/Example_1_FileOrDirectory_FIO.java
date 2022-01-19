/** Write a program to Find user entered path was File or Directory. If file then print size of file and if Directory
 *  then it should display the name of all files in it.*/

package FileClass_And_InputAndOutput;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Example_1_FileOrDirectory_FIO {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in );
        System.out.print("Enter Path: ");
        String path=sc.next();
        File f=new File(path);
        boolean IsFile=f.isFile();
        boolean IsDir=f.isDirectory();
        if(IsFile){
            System.out.println("Given path is file path...");
            System.out.println("---------------------------");
            System.out.println("Size of file:"+f.length()+" bytes");
        }
        else if (IsDir) {
            System.out.println("Given path is Directory path...");
            System.out.println("---------------------------");
            String[] List=f.list();
            for(int i=0;i<List.length;i++) {
                File f1=new File(f.getAbsolutePath()+"/"+List[i]);
                if(f1.isFile())
                    System.out.println(List[i]+"  [File]");
                if(f1.isDirectory())
                    System.out.println(List[i]+"  [Directory]");
            }
        }
        else
            System.out.println("Given path is not available!!");
    }
}
