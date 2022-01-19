package BinaryIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example_6_FindStartAtAE_BIO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 100;
        String[] str = new String[n];
        int A_line = 0;
        int E_line = 0;

        System.out.println("Enter Lines of text ::");
        System.out.println("NOTE: For the stop entering write 'quit' or 'QUIT'");
        System.out.println("------------------------------------------");
        for (int i = 0; i < n; i++) {
            str[i]= br.readLine();
            if(str[i].equalsIgnoreCase("quit"))
                break;
            if(str[i].charAt(0)=='A')
                A_line++;
            if(str[i].charAt(0)=='E')
                E_line++;
        }
        System.out.println("Entered Content --------------------------");
        for (int i=0;i<n;i++){
            if(str[i].equalsIgnoreCase("quit"))
                break;
            System.out.println(str[i]);
        }
        System.out.println("------------------------------------------");
        System.out.println("Number of line which starts with 'A' : "+A_line);
        System.out.println("Number of line which starts with 'E' : "+E_line);
    }
}
