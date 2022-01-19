package Collection_Frameworks.Sets;
import java.sql.Time;
import java.util.*;

public class SetVsList_CF_Sets {
    public static final int N=100000;
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<N;i++)
            list.add(i+1);
        Collections.shuffle(list);

        Collection<Integer> set=new HashSet<>(list);
        System.out.println("Element remove time for set is :"+getRemoveTime(set)+" milliseconds");

        Collection<Integer> list2=new ArrayList<>(list);
        System.out.println("Element remove time for list is :"+getRemoveTime(list2)+" milliseconds");
    }

    static long getRemoveTime(Collection<Integer> c){
        long StartTime= System.currentTimeMillis();
        for(int i=0;i<N;i++)
            c.remove(i+1);
        long CurrentTime=System.currentTimeMillis();
        return CurrentTime-StartTime;
    }
}
