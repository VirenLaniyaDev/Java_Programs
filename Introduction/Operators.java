package Introduction;

public class Operators {
    public static void main(String args[]) {
        int a = 20;
        int b = 9;

        /**Arithmetic Operators Introduction*/
        System.out.println("Arithmetic Operations::");
        /*1.*/
        int sum = a + b;    //'+' is a arithmetic operator there for 'a' and 'b' is be a Operand
        System.out.println("Summation=" + sum);
        /*2.*/
        int sub = a - b;    //'-' is a arithmetic operator there for 'a' and 'b' is be a Operand
        System.out.println("Subtraction=" + sub);
        /*3.*/
        int mul = a * b;    //'*' is a arithmetic operator there for 'a' and 'b' is be a Operand
        System.out.println("Multiplication=" + mul);
        /*4.*/
        int div = a / b;    //'/' is a arithmetic operator there for 'a' and 'b' is be a Operand
        System.out.println("Division=" + div);
        /*5.*/
        int mod = a % b;    //'%' is a arithmetic operator there for 'a' and 'b' is be a Operand
        System.out.println("Reminder is=" + mod);

        /**Assignment Operator Introduction*/
        System.out.println("\nAssignment Operation::");
        /*1.*/
        int c = 10; //'=' is a assignment operator which represent variable 'c' consider value '10
        System.out.println("present value : " + c);
        /*2.*/
        c += 2;     //'+=' is a assignment operator which represent value '2' added in assigned value of variable 'c'
        System.out.println("present value + 2: " + c);
        /*3.*/
        c -= 3;     //'-=' is a assignment operator which represent value '3' subtract in assigned value of variable 'c'
        System.out.println("present value - 3: " + c);
        /*4.*/
        c *= 2;     //'*=' is a assignment operator which represent value '2' multiplied in assigned value of variable 'c'
        System.out.println("present value * 2: " + c);
        /*5.*/
        c /= 5.0f;     //'/=' is a assignment operator which represent assigned value of variable 'c' divided by value '5'
        System.out.println("present value / 2: " + c);
        /*6.*/
        c %= 3;     /*'%=' is a assignment operator which represent assigned value of variable 'c' divided by value '3'
                       and gives only reminder */
        System.out.println("present value % 3: " + c);

        /**Comparison Operator Introduction*/
        System.out.println("\nComparison operation::");
        /*1.*/
        System.out.println(a > b);  //Here '>' is comparison operator If a is greater then b than print 'true' Otherwise 'false'
        /*2.*/
        if (a < b)                   //Here '<' is comparison operator If a is less then b than if statement was execute
            System.out.println("max value is :" + b);
        else if (a == b)                   //Here '==' is comparison operator If a and b both are same than else if execute
            System.out.println("Both value are same");
        else
            System.out.println("max value is :" + a);
        //Similarly '<=','>=','!=' are comparison operators

        /**Logical operator Introduction*/
        System.out.println("\nLogical operator::");
        /*1.*/
        if (a > b && a != b)       //Here '&&' is a logical operator It represent if both condition are true then 'if' statement are execute
            System.out.println(a);
            /*2.*/
        else if (a < b || a == b)  //Here '||' is a logical operator It represent if any one condition are true then 'else if' statement are execute
            System.out.println(b);

        /**Increment Decrement Operator Introduction*/
        System.out.println("\nIncrement Decrement Operator::");
        int x = a++;      //It means first value of a is saved in x and after it incremented by 1
        System.out.println("value of a++: " + x);
        int y = ++a;      //It means first value of a is incremented by 1 and then saved in y
        System.out.println("value of ++a: " + y);  /*Here you notice value of a is incremented by 2 because we do a++ operation
                                                   first value of a is saved in x but after value of a is incremented by 1
                                                   and then in ++a value of a is incremented by 1 and saved in y*/
        //Similarly also try it 'a--' and '--a' It know Decrement Operator
    }
}
