/** Definition : Recursion is a programming technique in which the method calls itself repeatedly.
 * --> Recursion based on stack.
 * --> Last in first Out (LIFO) : Which method is call at last that will execute first.
 * --> Memory utilization is more than Iterative approach. because it use stack. First last method will execute and others
 *     are stored(pending).*/

package Recursion;

public class _1_IntroductionToRecursion {
    public static void main(String[] args) {
        int n=10;
        R_method(n);
    }

    // Print 1 to n number using recursion.
    static void R_method(int n){
        if(n==0)
            return;
        R_method(n-1);      // calling same method R_method(); where n=n-1
        System.out.print(n+"\t");
    }
}
