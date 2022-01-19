/*->Practical 2:
Write a program that solves the following equation and displays the value x and y:
        1) 3.4x+50.2y=44.5
        2) 2.1x+.55y=5.9
        (Assume Cramer’s rule to solve equation ax+by=e x=ed-bf/ad-bc
        cx+dy=f y=af-ec/ad-bc)
*/


package Practicals;

public class Practical_2
{
    public static void main(String[] args)
    {
        float a=3.4f,b=50.2f,e=44.5f;
        float c=2.1f,d=0.55f,f=5.9f;

        System.out.printf("Your Equation 1 is::  %.1fx+%.1fy=%.1f\n",a,b,e);
        System.out.printf("Your Equation 2 is::  %.1fx+%.1fy=%.1f\n",c,d,f);

        float x=(e*d-b*f)/(a*d-b*c);
        float y=(a*f-e*c)/(a*d-b*c);

        System.out.printf("Value of x : %.1f\n",x);
        System.out.printf("Value of y : %.1f\n",y);
    }
}
