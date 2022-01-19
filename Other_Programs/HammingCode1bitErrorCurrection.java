package Other_Programs;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.pow;


class Encoding {
    int[] Code;

    // Add Parity to appropriate position in For Codeword
    void AddParity(int P, int[] Db) {
        Code = new int[(P + Db.length) + 1];      //Here we add 1 because we started at index 1.
        int n = 0;
        int index = 0;        //Index of Db[]
        for (int i = 1; i < Code.length; i++) {
            if (i == pow(2, n)) {
                n++;
                Code[i]=i;
            }
            else {
                Code[i] = Db[index];
                index++;
            }
        }
    }

    //Calculate Parity bit values
    int[] CalculateParityValue(){
        int Pposition=0;
        System.out.println("Parity bit values are...");
        for (int i = 1; i < Code.length; i = (int) pow(2, Pposition)) {
            int count = 0;
            int j = i;
            while (j < Code.length) {
                for (int k = j; k < j + i && k < Code.length; k++) {
                    if (i != k) {
                        if (Code[k] == 1)
                            count++;
                    }
                }
                j = j + 2 * i;
            }
            Code[i] = count % 2;
            System.out.println("P"+i+" = "+ Code[i]);
            Pposition++;
        }
        System.out.print("Generated code word is :\t");
        DisplayCode();
        return Code;
    }

    // Display Code bits
    void DisplayCode(){
        for (int i = 1; i < Code.length; i++) {
            System.out.print(Code[i] + " ");
        }
    }
}

class Decoding {
    int[] Code;
    int[] ReCode;
    int P;
    Decoding(int P,int[] Code) {
        ReCode = new int[Code.length];
        this.P=P;
        this.Code = Code;
        Scanner sc = new Scanner(System.in);
        // Take received code word as input
        System.out.print("Enter Received code : ");
        String RCode = sc.next();
        // Check length of entered code word
        if (Code.length != (RCode.length() + 1)) {
            System.out.println("Entered codeword length is Greater than Encoded codeword length !!");
            return;
        }
        // Create array of entered code word
        for (int i = 0; i < RCode.length(); i++) {
            if (RCode.charAt(i) == '0' || RCode.charAt(i) == '1')
                ReCode[i + 1] = Character.getNumericValue(RCode.charAt(i));
            else {
                System.out.println("Input is invalid !!");
                return;
            }
        }

        //Error count
        int ErrorCount = 0;
        int n = 0;
        for (int i = 1; i < ReCode.length; i++) {
            if (i == pow(2, n))
                n++;
            else if (Code[i] != ReCode[i])
                ErrorCount++;
        }
        if (ErrorCount > 1) {
            System.out.println("Error in received code is burst error ! That not correct by hamming code method.");
            return;
        }
        if(ErrorCount==0) {
            System.out.println("There is no error occurs.");
            DecodedData();
            return;
        }

        // Error Correction with hamming code method
        ErrorCorrection();
    }

    //////////////// Error Correction ////////////////
    void ErrorCorrection(){
        //1. Calculate parity bits in ReCode
        for (int i = 1; i < ReCode.length; i = (int) pow(2, i)) {
            int count = 0;
            int j = i;
            while (j < ReCode.length) {
                for (int k = j; k < j + i; k++) {
                    if (i != k)
                        if(ReCode[k]==1)
                            count++;
                }
                j = j + 2 * i;
            }
            ReCode[i] = count % 2;
        }
        //2. Sum of parity bits which are different from Encoded Code
        int sum=0;
        for(int i=1;i<ReCode.length;i=(int)pow(2,i)) {
            if (Code[i]!=ReCode[i])
                sum=sum+i;
        }
        if(ReCode[sum]==0)
            ReCode[sum]=1;
        else if(ReCode[sum]==1)
            ReCode[sum]=0;

        System.out.println("Single bit Error Corrected by Hamming Code.");
        System.out.print("Actual encoded codeword is :\t");

        //3. Calculate parity bits in ReCode ---- Note: It is note necessary calculate because after correction parity bits are might be change so..
        for (int i = 1; i < ReCode.length; i = (int) pow(2, i)) {
            int count = 0;
            int j = i;
            while (j < ReCode.length) {
                for (int k = j; k < j + i; k++) {
                    if (i != k)
                        if(ReCode[k]==1)
                            count++;
                }
                j = j + 2 * i;
            }
            ReCode[i] = count % 2;
        }
        DisplayReCode();
        System.out.println();
        DecodedData();
    }

    //Display Decoded data
    void DecodedData() {
        System.out.print("Decoded data is :");
        int n = 0;
        char []dec_dataword=new char[ReCode.length-P];
        int CharIndex=0;
        for (int i = 1; i < ReCode.length; i++) {
            if (i == pow(2, n))
                n++;
            else {
                System.out.print(ReCode[i] + " ");
                dec_dataword[CharIndex]=Character.forDigit(ReCode[i],10);   // Converting integer into character
                CharIndex++;
            }
        }
        System.out.print("\nReceived Data :\t");
        String ddataStr=new String(dec_dataword);   //Convert character array into string
        System.out.println(ddataStr);
    }

    // Display Code bits
    void DisplayReCode(){
        for (int i = 1; i < ReCode.length; i++) {
            System.out.print(ReCode[i] + " ");
        }
    }
}

public class HammingCode1bitErrorCurrection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------- Encoding -------------------\n");
        System.out.print("Enter Input data bits : ");
        String dataword = sc.next();
        int M = dataword.length();

        //Checking for validation and Converting dataword in to array
        int[] Dbits = new int[M];
        for (int i = 0; i < M; i++) {
            if (dataword.charAt(i) == '0' || dataword.charAt(i) == '1')
                Dbits[i] = Character.getNumericValue(dataword.charAt(i));
            else {
                System.out.println("Input is invalid !!");
                return;
            }
        }

        //////////////////// Actual Encoding starts here ////////////////////
        int Code[];
        // Calculate number of redundant redundant bits
        int P = 0;
        while (pow(2, P) < (M + P + 1))
            P++;
        System.out.println("Total Redundant(Parity) bits are : " + P);
        Encoding En = new Encoding();
        En.AddParity(P,Dbits);
        Code = En.CalculateParityValue();
        System.out.println("\n------------------------------------------------");

        System.out.println("------------------- Decoding -------------------\n");
        Decoding Dc = new Decoding(P,Code);
        System.out.println("\n------------------------------------------------");
    }
}

