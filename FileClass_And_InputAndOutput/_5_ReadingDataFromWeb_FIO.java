package FileClass_And_InputAndOutput;

import java.io.InputStream;
import java.net.URL;
import java.io.IOException;
import java.net.URLConnection;

public class _5_ReadingDataFromWeb_FIO {
    public static void main(String[] args) throws IOException{

        /*System.out.println(url.getProtocol());
        System.out.println(url.getFile());
        System.out.println(url.getHost());*/

        ///////////////// Read content of web page /////////////////
        //URL url=new URL("https://www.google.com");
        URL url=new URL("file:///D:/html/datalist.html");
        URLConnection urlcon=url.openConnection();
        InputStream s=urlcon.getInputStream();

        int i;
        while((i=s.read())!=-1){
            System.out.print((char)i);
        }
    }
}
