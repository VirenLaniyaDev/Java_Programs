package Practicals;

/**Body Mass Index (BMI) is a measure of health on weight. It can be calculated by
   taking your weight in kilograms and dividing by the square of your height in meters.
   Write a program that prompts the user to enter a weight in pounds and height in
   inches and displays the BMI.
   Note:- 1 pound=0.45359237 Kg and 1 inch=0.0254 meters.*/

import java.util.Scanner;
class BMI{
    double weight,height;
    BMI(double w,double h){
        this.weight=w*0.45359237;
        this.height=h*0.0254;
    }
    double getWeight(){
        return weight;
    }
    double getHeight(){
        return height;
    }
    double converter() {
        return weight / (height * height);
    }
}
public class Practical_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Weight in Pound:");
        double a=sc.nextDouble();
        System.out.println("Enter Height in inch:");
        double b=sc.nextDouble();
        BMI bmi=new BMI(a, b);
        System.out.println("Weight in kilogram: "+bmi.getWeight());
        System.out.println("Height in meters: "+bmi.getHeight());
        System.out.println("Body mass function: "+bmi.converter());
    }
}
