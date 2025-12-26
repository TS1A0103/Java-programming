package CollectionsExamples;
import java.util.ArrayList;
import java.util.Collections;
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

        //To check if the element exists or not
        ArrayList<String> names = new ArrayList<>();
        names.add("Vamsi");
        names.add("Krishna");
        names.add("Java");

        if (names.contains("Java")) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

        //To find the maximum number of a list
        ArrayList<Integer> list = new ArrayList<>(List.of(12, 45, 7, 89, 34));

        int max = Collections.max(list);

        System.out.println("Max value: " + max)

    }
}
