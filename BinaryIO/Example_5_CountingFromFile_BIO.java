/** Count the total no. of chars, words, lines, alphabets, digits, whitespaces in given file.*/

package BinaryIO;

import java.io.*;

public class Example_5_CountingFromFile_BIO {
    public static void main(String[] args) throws IOException{
        File file=new File("src\\BinaryIO\\text.txt");
        BufferedReader br=new BufferedReader(new FileReader(file));
        String Line;
        int Line_count=0;
        int Char_count=0;
        int Word_count=0;
        int Alphabet_count=0;
        int Digit_count=0;
        int Whitespace_count=0;

        while((Line=br.readLine())!=null){
            Line_count++;
            for(int j=0;j< Line.length();j++){
                if(Character.isDigit(Line.charAt(j)))   //Counting digits
                    Digit_count++;
                if(Character.isWhitespace(Line.charAt(j)))  //Counting whitespace
                    Whitespace_count++;
                if(Character.isLetter(Line.charAt(j)))  //Counting alphabets
                    Alphabet_count++;
            }

            String [] PieceOfLine= Line.split("\\s");
            for (int i=0;i<PieceOfLine.length;i++){
                Word_count++;
                Char_count += PieceOfLine[i].length();  // character in word = length of word
                System.out.println(PieceOfLine[i]);
            }
            System.out.println("L "+Line_count+"----------");
        }
        System.out.println("Line : "+ Line_count);
        System.out.println("Word : "+ Word_count);
        System.out.println("Digit : "+ Digit_count);
        System.out.println("Alphabetical : "+ Alphabet_count);
        System.out.println("Whitespaces : "+ Whitespace_count);
        System.out.println("Characters : "+ Char_count);
    }
}
