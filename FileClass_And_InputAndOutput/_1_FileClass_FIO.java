/**-->File class: The File class is an abstract representation of file and directory pathname.
 * -->A pathname can be either absolute or relative.
 */

package FileClass_And_InputAndOutput;

import java.io.File;
import java.io.IOException;

public class _1_FileClass_FIO {
    public static void main(String[] args) throws IOException {
        String path="src\\FileClass_And_InputAndOutput\\test.txt";
        File f=new File(path);
        System.out.println("|--------------------------------|");
        System.out.println("|    File Properties(Methods)    |");
        System.out.println("|--------------------------------|");
        f.createNewFile();  //If file already exists then there is no create any file.Otherwise creates file.
        System.out.println("This file is exists : " + f.exists());
        System.out.println("Size of file : " + f.length() + " bytes");
        System.out.println("Name of file : "+f.getName());
        System.out.println("This file "+(f.canRead()?"is Readable":"is not readable"));
        System.out.println("This file "+(f.canWrite()?"is writeable":"is not writeable"));
        System.out.println("This is "+(f.isDirectory()?"":"not ")+"Directory");
        System.out.println("This file is "+(f.canExecute()?"Executable":"not Executable"));
        System.out.println("File Path : "+f.getPath()); //whatever you wrote in file path 'getPath()' return as path..
        System.out.println("File AbsolutePath : "+f.getAbsolutePath()); //'getAbsolutePath()' return actual path..
        System.out.println("Parent : "+f.getParent());  //return path of parent's file
        System.out.println("Last Modified at "+new java.util.Date(f.lastModified()));
        System.out.println("This file is "+(f.isFile()?"a Normal file":"not a Normal file"));
        System.out.println("This file is "+(f.isAbsolute()?"a Absolute file":"not a Absolute file"));
        f.delete(); //file is delete here
    }
}
