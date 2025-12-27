package StreamsExamples;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class MapExample {
    public static void main(String[] args){
        List<String> words = Arrays.asList("Vamsi", "Krishna", "Chitti", "Lokesh");
        words.stream().map(String::toUpperCase).forEach(System.out::println);      //map function using method reference
        //words.stream().map(word ->word.toLowerCase()).forEach(System.out::println);  //map function with lambda function
    }
}
