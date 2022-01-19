/**Dynamic method dispatch:- Dynamic method dispatch is the mechanism by which a call to an
                            overridden method is resolved at run time, rather than compile time.
 ->> Also known as a Run time Polymorphism.
 ->> which is achieve by the Overriding.
*/


package ObjectOrientedThinking_And_Terminologies;

class Phone{
    void call(){
        System.out.println(" Calling...");
    }
    void DisplayTime(){
        System.out.println(" 8:00 PM");
    }
}

class SmartPhone extends Phone{
    void call(){
        System.out.println(" Calling...");
        System.out.println(" Video Calling...");
    }
    void Socialapps(){
        System.out.println(" Whatsapp");
        System.out.println(" Twitter");
        System.out.println(" Instagram");
        System.out.println(" ...");
    }
}

public class _10_DynamicMethodDispatch_Polymorphism_OOTT {
    public static void main(String[] args) {

        Phone obj=new SmartPhone(); //Dynamic method dispatch
                                    /*Phone obj -> Obj is a Phone which is refer to Object of class SmartPhone.
                                      superclass object_name=new subclass -> allows ✔*/
        obj.call();     //here call() calls call() method of SmartPhone.
                        /*'obj.call()' -> class type of 'obj' is Phone,so first check in to Phone class in which
                                          'call()' method present or not.
                                       -> If there is not present any 'call()' method then compiler gives an error.
                                       -> And if there is present then goto referred class SmartPhone and if 'call()' is
                                          present in SmartPhone class then execute 'call()' method of SmartPhone Otherwise
                                          It calls 'call()' method of Phone.Because the It gives first priority to child
                                          class.*/

        //SmartPhone obj1=new Phone();  //subclass object_name=new superclass -> not allows ❌


    }
}
