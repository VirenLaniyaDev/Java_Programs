/** Write a program to create interface method named customer. In this keep the methods called information(), show() and
 *  also maintain the tax rate. Implement this interface in employee class and calculate the tax of the employee based
 *  on their income.
 *              Income      Tax percentage
 *                          Male  |  Female
 *                         ----------------
 *            >=1,90,000     Nil      Nil
 *            >=2,00,000     10%      Nil
 *            >=5,00,000     20%      10%
 *            <10,00,000      25%      20%
 */

package AbstractClassesAndInterfaces;
import java.util.Scanner;

interface customer
{
    double TaxRate1=0.1;
    double TaxRate2=0.2;
    double TaxRate3=0.25;
    void information();
    void show();
}

public class Example_3_MaintainTaxRateUsingInterfaces_ACI implements customer {

    double tax=0;
    double income;
    char sex;

    @Override
    public void information() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income:");
        income = sc.nextDouble();
        System.out.println("Enter Sex (M or F)");
        sex = sc.next().charAt(0);
        if (sex == 'M'){
            if(income>=190000 && income<200000)
                this.tax=tax;
            else if(income>=200000 && income<500000)
                this.tax=income*TaxRate1;
            else if(income>=500000 && income<1000000)
                this.tax=income*TaxRate2;
            else if(income>=1000000)
                this.tax=income*TaxRate3;
        }

        else if (sex == 'F'){
            if(income>=190000 && income<200000)
                this.tax=tax;
            else if(income>=200000 && income<500000)
                this.tax=tax;
            else if(income>=500000 && income<1000000)
                this.tax=income*TaxRate1;
            else if(income>=1000000)
                this.tax=income*TaxRate2;
        }

        else{
            System.out.println("Invalid Sex...");
            System.exit(0);
        }
    }

    @Override
    public void show(){
        System.out.println("--------------------------------------------");
        System.out.println("               Income Details               ");
        System.out.println("--------------------------------------------");
        System.out.println("Sex : "+(sex=='M'?"Male":"Female"));
        System.out.println("Your Income is : "+income);
        System.out.println("Applied Tax [According to Income] : "+tax);
        System.out.println("Your Net Income [Income-Applied tax] : "+(income-tax));
    }

    public static void main(String[] args) {
        Example_3_MaintainTaxRateUsingInterfaces_ACI Ex3=new Example_3_MaintainTaxRateUsingInterfaces_ACI();
        Ex3.information();
        Ex3.show();
    }
}
