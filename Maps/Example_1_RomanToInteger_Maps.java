/**
 * Convert roman number to integer.
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * --> For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply
 * X + II. The number 27 is written as XXVII, which is XX + V + II.
 * --> Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle
 * applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * --> Rules for subtraction:
 * 1.I can be placed before V (5) and X (10) to make 4 and 9.
 * 2.X can be placed before L (50) and C (100) to make 40 and 90.
 * 3.C can be placed before D (500) and M (1000) to make 400 and 900.
 * --> Examples : 1. "IV" -> 4    2. "LVIII" -> 58    3. "IX" -> 9    4. "MCMXCIV" -> 1994
 */


package Maps;

import java.util.HashMap;
import java.util.Scanner;

public class Example_1_RomanToInteger_Maps {
    public static void main(String[] args) {
        HashMap<Character, Integer> rTi = new HashMap<>();
        rTi.put('I', 1);
        rTi.put('V', 5);
        rTi.put('X', 10);
        rTi.put('L', 50);
        rTi.put('C', 100);
        rTi.put('D', 500);
        rTi.put('M', 1000);

        System.out.print("Enter Roman value :");
        String roman = new Scanner(System.in).next();

        // 1. Method 1
        int prev = 0;
        int sum = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int val = rTi.get(roman.charAt(i));
            if (val < prev)
                sum -= val;
            else
                sum += val;
            prev = val;
        }
        System.out.println("Integer value of given roman number : " + sum);

        // 2. Method 2
        Integer ans = rTi.get(roman.charAt(0));
        for (int i = 1; i < roman.length(); i++) {
            int temp;
            if ((roman.charAt(i) == 'V' || roman.charAt(i) == 'X') && roman.charAt(i - 1) == 'I') {
                ans = ans - rTi.get(roman.charAt(i - 1));
                temp = rTi.get(roman.charAt(i)) - rTi.get(roman.charAt(i - 1));
            } else if ((roman.charAt(i) == 'L' || roman.charAt(i) == 'C') && roman.charAt(i - 1) == 'X') {
                ans = ans - rTi.get(roman.charAt(i - 1));
                temp = rTi.get(roman.charAt(i)) - rTi.get(roman.charAt(i - 1));
            } else if ((roman.charAt(i) == 'D' || roman.charAt(i) == 'M') && roman.charAt(i - 1) == 'C') {
                ans = ans - rTi.get(roman.charAt(i - 1));
                temp = rTi.get(roman.charAt(i)) - rTi.get(roman.charAt(i - 1));
            } else
                temp = rTi.get(roman.charAt(i));

            ans += temp;
        }
        System.out.println("Integer value of given roman number : " + ans);
    }
}
