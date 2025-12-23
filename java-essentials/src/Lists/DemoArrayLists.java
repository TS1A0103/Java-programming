package Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayLists {
    public static void main (String[] args){
        List<Integer> marks = new ArrayList<>();
        marks.add(90);
        marks.add(92);
        marks.add(70);
        marks.add(80);
        System.out.println(marks);

        Iterator<Integer> it = marks.iterator();

        int sum = 0;

        while(it.hasNext()){
            sum = sum + it.next();
        }
        System.out.println(sum);
        float avg = (sum/4) ;
        System.out.println(avg);

    }
}
