/*
Syntax:

Data_type Name_Of_Method(Object_Name)
        {
            //Body Of Method
        }
*/

package ObjectAndClasses;

class Demo
{
    int num1;

    public Demo(int num1) {
        this.num1 = num1;
    }

    void DisplaySum(Demo D)     //Class Demo is an Argument for 'DisplaySum()'
    {
        int sum=num1+D.num1;    //sum of 'num1' and 'num1 of Argument Demo D'
        System.out.println("Sum of Number: "+sum);
    }
}

public class Passing_Objects_To_Methods
{
    public static void main(String[] args)
    {

        Demo obj1=new Demo(12); //obj1.num1=12
        Demo obj2=new Demo(15); //obj2.num1=15
        obj1.DisplaySum(obj2);  //'obj2' is parameter(as Argument) for 'DisplaySum()' which is invoked by obj1

        /*logic:
        obj1.DisplaySum(obj2) -> obj2 is passed as argument in obj1.DisplaySum()
                              ->Therefor obj1.Display(obj2 D)
                              ->D=obj2

        Now in DisplaySum()->sum = num1 of obj1 (obj1.num1) + num2 of obj2 (obj2.num1)
                           ->sum = 12 + 15 */
    }
}
