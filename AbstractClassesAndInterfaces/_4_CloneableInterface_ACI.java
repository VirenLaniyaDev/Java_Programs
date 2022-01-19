package AbstractClassesAndInterfaces;

class Employee implements Cloneable{
    int salary;
    String name;
    void setSalary(int salary){
        this.salary=salary;
    }
    int getSalary(){
        return salary;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }

    @Override
    public Object clone(){
        Employee obj=new Employee();
        obj.setSalary(this.salary);
        obj.setName(this.name);
        return obj;
    }
}
public class _4_CloneableInterface_ACI{
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setSalary(10000);
        e1.setName("Viren patel");
        Employee e2=(Employee)e1.clone();
        System.out.println("*****     Employee     *****");
        System.out.println("Name\t:\t"+e1.name);
        System.out.println("Salary\t:\t"+e1.salary);
        System.out.println("***** Employee [Clone] *****");
        System.out.println("Name\t:\t"+e2.name);
        System.out.println("Salary\t:\t"+e2.salary);
    }
}
