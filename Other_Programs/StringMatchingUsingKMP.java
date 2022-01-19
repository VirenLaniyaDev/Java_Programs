package Other_Programs;

public class StringMatchingUsingKMP {
    public static void main(String[] args) {
        String haystack = "aabaaabaaac";
        String needle = "aabaaac";
        System.out.println("haystack(String) is : "+haystack);
        System.out.println("needle(Pattern) is : "+needle);

        int ans=strStr(haystack, needle);
        System.out.println(ans);
    }

    static int strStr(String haystack, String needle) {

        if (needle.isEmpty())
            return 0;

        //////////////// Implementation of Prefix(PI) table ////////////////
        int[] Pre_table = new int[needle.length()];
        Pre_table[0] = 0;
        int j = 0;
        int i=1;
        while(i<Pre_table.length){
            if (needle.charAt(i) == needle.charAt(j))
                Pre_table[i++] = ++j;
            else {
                if(j==0)
                    Pre_table[i++]=0;
                else
                    j=Pre_table[j-1];   //Here Note that we haven't increment value of i.
            }
        }

        //Display PI table
        System.out.println("Prefix table (PI) table for '"+needle+"'");
        System.out.println("---------------------------------------------------------");
        for (i = 0; i < Pre_table.length; i++)
            System.out.print(needle.charAt(i)+"\t");
        System.out.println();
        for (i = 0; i < Pre_table.length; i++)
            System.out.print(Pre_table[i]+"\t");
        System.out.println("\n---------------------------------------------------------");

        //////////////// String matching ////////////////
        System.out.print("String matched at position : ");
        for(i=0,j=0;i<haystack.length();i++) {

            if (haystack.charAt(i)==needle.charAt(j) && j==Pre_table.length-1)
                return i-j;

            else if(haystack.charAt(i)==needle.charAt(j))
                j++;

            else if(j!=0){
                j=Pre_table[j-1];
                i--;
            }
        }
        return -1;
    }
}
