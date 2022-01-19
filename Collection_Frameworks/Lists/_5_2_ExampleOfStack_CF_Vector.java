package Collection_Frameworks.Lists;

import java.util.Scanner;
import java.util.Stack;

public class _5_2_ExampleOfStack_CF_Vector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("********** Implement Stack **********");
        do {
            System.out.println("--------------------");
            System.out.println("1.Push\n2.Pop\n3.Display");
            System.out.println("--------------------");
            System.out.print("Enter your choice : ");
            switch (sc.nextInt()) {
                case 1:
                    do {
                        System.out.print("Enter element which you want to push : ");
                        st.push(sc.nextInt());
                        System.out.println("Element pushed successfully!");
                        System.out.print("Do you want to add more element?[y/n] :");
                    } while (sc.next().charAt(0) == 'y');
                    break;

                case 2:
                    System.out.println("Top element "+st.pop()+" Popped successfully!");
                    break;

                case 3:
                    System.out.println("Your current stack is : "+st);
                    break;

                default:
                    System.out.println("Invalid choice !!");
                    break;
            }
            System.out.print("Do you want to perform more operation?[y/n] : ");
        } while (sc.next().charAt(0) == 'y');
    }
}
