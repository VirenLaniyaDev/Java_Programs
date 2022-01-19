package ObjectOrientedThinking_And_Terminologies;

import java.util.ArrayList;

public class _13_ArrayListClass_OOTT {
    public static void main(String[] args) {
        ArrayList<Double> obj=new ArrayList<>();
        obj.add(Double.valueOf(10));
        obj.add(Double.valueOf(20));
        obj.add(Double.valueOf(30));
        obj.add(Double.valueOf(40));
        obj.add(Double.valueOf(50));
        obj.add(Double.valueOf(60));
         for (int i=0;i<obj.size();i++){
             System.out.println(obj.get(i));
         }
    }
}
