package StreamsExamples;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Collections;


public class FlatMapExample {
    public static void main(String[] args){
        List<List<Character>> letters = Arrays.asList(
                Arrays.asList('a', 'b'),
                Arrays.asList('c', 'd'),
                Arrays.asList('e', 'f'));
        letters.stream().flatMap(List::stream).map(Character::toUpperCase).forEach(System.out::println);  //Without peek
        System.out.println();
        Stream<Character> peekstream = letters.stream().flatMap(List::stream).map(Character::toUpperCase); //with peek
        peekstream.peek(System.out::println);
        System.out.println();

        List<Integer> nums = Arrays.asList(1,2,3,2,4,5,5,5,6);
        nums.stream().distinct().forEach(System.out::println);
        System.out.println();
        nums.stream().sorted().forEach(System.out::println);
        System.out.println();
        nums.stream().sorted(Comparator.reverseOrder()).distinct().forEach(System.out::println);


        System.out.println();

        List<String>  names = Arrays.asList("vamsi", "Krishna","Lokesh", "ganeshnarayan");
        List<String> lengthbasedlist = names.stream().
                sorted(Comparator.
                        comparingInt(str ->str.length())).toList(); //with lambda function
        lengthbasedlist.forEach(System.out::println);

        System.out.println();
        List<String> words = Arrays.asList("vamsi", "Krishna","Lokesh", "ganeshnarayan");
        List<String> lengthbasedwords = words.stream().
                sorted(Comparator.comparingInt(String::length).reversed()).toList();
        lengthbasedwords.forEach(System.out::println);

        System.out.println("-----");
        List<Double> values = Arrays.asList(2.1,3.56,4.5,6.5);
        values.stream().skip(2).forEach(System.out::println);
        System.out.println("-----");
        values.stream().limit(3).forEach(System.out::println);



    }
}
