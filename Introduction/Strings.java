package Introduction;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Way 1:with out input from user
        String name="Ragnar";
        //String name=new String("Ragnar");
        System.out.println("Name is: "+name);

        /*//Way 2:with input from user
             //String name2= sc.next();   //for only one line
             String name2=sc.nextLine();  //multiple line
             System.out.println(name2);*/

        //String Methods:

        /*1.*/int Length_of_String=name.length();   //'name.length()'->find the length of 'name'
        System.out.println("1.Length of String: "+Length_of_String);

        /*2.*/String All_in_Lower=name.toLowerCase();   //'name.toLowerCase()'->all letters are lower case which are present in string
        System.out.println("2.All letters in lower case: "+All_in_Lower);

        /*3.*/String All_in_Upper=name.toUpperCase();   //'name.toUpperCase()'->all letters are Upper case which are present in string
        System.out.println("3.All letters in Upper case: "+All_in_Upper);

        String NfTR="R a g n a r"; //'NfTR'=name for trim operation
        /*4.*/String Trimmed=NfTR.trim();   //'name.trim()'->all Spaces are Ignored which are present in string
        System.out.println("4.All Spaces are ignored(Trim operation): "+Trimmed);

        /*5.*/String Substring=name.substring(2);   //'name.substring'->Return substring from chosen start index number to end
        System.out.println("5(1).Substring Operation: "+Substring);
        Substring=name.substring(2,4);  //'substring(2,4)'->range of string means index 2 to 4 so print char. of index no.2,3
        System.out.println("5(2).Substring Operation(by selecting range): "+Substring);

        /*6.*/String Replace=name.replace('R','J');   //'name.Replace('R','J')'->In string When 'R' is present it was replaced by 'J'
        System.out.println("6(1).Replace one char to another char: "+Replace);
        String Replace2=NfTR.replace(' ','_');   //'name.Replace(' ','_')'->In string When ' ' is present it was replaced by '_'
        System.out.println("6(2).Replace space in to the underscore: "+Replace2);
        Replace=Replace.replace("nar","uar");   //'name.Replace("nar","uar")'->In string When "nar" is present it was replaced by "uar"
        System.out.println("6(3).Replace more then one chars to another chars: "+Replace);

        /*7.*/char posOfchar=name.charAt(4);    //'name.charAt(4)'->It will be give 4th position character into the string.
        System.out.println("7.Char position is:"+posOfchar);

        /*8.*/System.out.println("8."+name.startsWith("Ra"));    //'name.startwith("Ra")'->Is return 'true' if string was started with 'Ra'.

        /*9.*/System.out.println("9."+name.endsWith("ar"));    //'name.endswith("Ra")'->Is return 'true' if string was ended with 'ar'.

        /*10(1).*/int index=name.indexOf("r");  //It will be return index of 'r'.
        System.out.println("10(1).index of the string is:"+index);

        /*10(1).*/int index2=name.indexOf("R",1);   //It will be return -1 because after index 1 no 'R' is present.
        System.out.println("10(2).index of the string is:"+index2);// In the string only one 'R' is present which is located at 0th index.

        /*11(1).*/int Lindex=name.lastIndexOf("r"); //It will be return index of 'r'.
        System.out.println("11(1).index of the string is:"+Lindex);

        /*11(1).*/int Lindex2=name.indexOf("R",1);   //It will be return -1 because after index 1 no 'R' is present.
        System.out.println("11(2).index of the string is:"+index2);// In the string only one 'R' is present which is located at 0th inde

        /*12.*/System.out.println("12.Equal or not:"+name.equals("Ragnar"));    //If given string is equals to the name then it will return true.

    }
}
