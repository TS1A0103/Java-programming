package StreamsExamples;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class CollectExample {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        List<Integer> evenSquaredList = nums.stream().filter(n->n%2==0).map(n->n*n).collect(Collectors.toList());
        System.out.println(evenSquaredList);
    }
}
