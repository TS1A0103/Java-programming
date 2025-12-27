package StreamsExamples;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] args){
        List<Integer> nums  = Arrays.asList(1,2,3,4,5);
        Stream<Integer> strm = nums.stream().filter(n->n%2==0);
        strm.forEach(System.out::println);
        //or
        nums.stream().filter(n->n%2==0).forEach(System.out::println);

    }
}
