package StreamsExamples;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.lang.Math.min;

public class ReduceExample {
    public static void main(String[] args){
       List<Integer> nums = Arrays.asList(1,2,3,4);
       final Integer sum = nums.stream().reduce(0, (a,b) -> (a+b));
       System.out.println(sum);
    }
}
