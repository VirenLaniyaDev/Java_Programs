package Generics;

import java.util.ArrayList;

class stackStructure<Type>{
    private int size;
    ArrayList<Type> obj;
    stackStructure(int size){
        this.size=size;
        obj=new ArrayList<Type>(size);
    }

    void push(Type item){
        obj.add(item);
    }

    Type pop(){
        if (obj.isEmpty()){
            System.out.println("Stack is empty!!");
            return null;
        }
        return obj.remove(obj.size()-1);
    }
}
public class Example_2_CreationOfStackUsingGeneric {

    public static void main(String[] args) {
        stackStructure<Integer> stack=new stackStructure<>(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.pop();
        stack.pop();

        System.out.println(stack.obj.get(3));
    }
}
