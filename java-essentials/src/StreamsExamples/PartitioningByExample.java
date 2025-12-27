package StreamsExamples;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class PartitioningByExample {
    public static void main(String[] args){
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        Map<Boolean, List<Integer>> partitionElement= nums.stream().collect(Collectors.partitioningBy(n->n%2 !=0));
        System.out.println(partitionElement);
    }
}
