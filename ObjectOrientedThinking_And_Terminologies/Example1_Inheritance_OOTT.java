package ObjectOrientedThinking_And_Terminologies;

class Employee{
    String employee_name;
    int employee_id;
}

class salary extends Employee{
    String Designation;
    double monthly_salary;
    salary(){ }
    salary(String ename,int eid,String Designation,int monthly_salary){
        this.employee_name=ename;
        this.employee_id=eid;
        this.Designation=Designation;
        this.monthly_salary=monthly_salary;
    }

    void find(){
        if(monthly_salary>=20000) {
            System.out.println();
            System.out.println("------------------------------");
            System.out.println("Employee name:"+employee_name);
            System.out.println("Employee id:"+employee_id);
            System.out.println("Designation of Employee:"+Designation);
            System.out.println("Monthly Salary:"+monthly_salary);
            System.out.println("------------------------------");

        }
        return;
    }
}
public class Example1_Inheritance_OOTT {
    public static void main(String[] args) {
        salary []s=new salary[5];
        s[0]=new salary("Viren",1111,"CEO",200000);
        s[1]=new salary("Ajay",1112,"Worker",15000);
        s[2]=new salary("Nikunj",1113,"CA",150000);
        s[3]=new salary("Rahul",1114,"Employee",25000);
        s[4]=new salary("Umang",1115,"Professional Employee",100000);

        System.out.println("Employee details which has more than 20000 salary.");
        for(int i=0;i<s.length;i++){
            s[i].find();
        }
    }

}
