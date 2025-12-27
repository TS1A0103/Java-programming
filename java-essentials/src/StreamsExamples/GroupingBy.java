package StreamsExamples;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    String name;
    String dept;
    Employee(String name, String dept){
        this.name = name;
        this.dept = dept;

    }

    public String getDept() {
        return dept;
    }
    public String toString(){
        return name;
    }
}
public class GroupingBy {
    public static void main(){
        List<Employee> emps = Arrays.asList(
                new Employee("Vamsi", "IT"),
                new Employee("Lokesh", "HR"),
                new Employee("ganesh", "IT"));
        Map<String, List<Employee>> empByDept = emps.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(empByDept);




        List<Integer>  nums = Arrays.asList(1,2,3,4,5,6);

        Map<String, List<Integer>> result = nums.stream().collect(Collectors.groupingBy(n->n%2==0? "even":"odd"));
        System.out.println(result);

    }

}
