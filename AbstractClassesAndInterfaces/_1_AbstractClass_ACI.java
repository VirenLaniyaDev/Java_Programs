package AbstractClassesAndInterfaces;

abstract class Animal          /*If abstract method is present then necessary its class must should be abstract.
                                 But if class is abstract then not necessary its method should be abstract.  */
{
    abstract void name();
    abstract void sound();
    void leg(){
        System.out.println("Number of leg : 4");
    }
}   /*An abstract method must be present in an abstract class only. It should not be present in a non-abstract class.*/

class Dog extends Animal
{
    @Override       //In abstract classes 'Overriding concept' is used.
    void name(){
        System.out.println("Name of Animal : Dog");
    }   /*It is compulsory to make body of abstract method, Otherwise it will throws Error. */
    @Override
    void sound(){
        System.out.println("Sound : Bark");
    }
}

class Donkey extends Animal
{
    @Override
    void name(){
        System.out.println("Name of Animal : Donkey");
    }
    @Override
    void sound(){
        System.out.println("Sound : Bray");
    }
}

public class _1_AbstractClass_ACI {
    public static void main(String[] args) {

        //Animal ani=new Animal();   //--> We can not create Object of abstract class. Because there is no body of abstract method.
        System.out.println("***********************|");
        Dog dog=new Dog();
        dog.name();
        dog.sound();
        dog.leg();
        System.out.println("***********************|");
        Donkey donkey=new Donkey();
        donkey.name();
        donkey.sound();
        donkey.leg();
        System.out.println("***********************|");
    }
}
