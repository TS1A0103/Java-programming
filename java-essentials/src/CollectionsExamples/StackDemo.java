package CollectionsExamples;
import java.util.Stack;
import java.util.List;
public class StackDemo {

    public static int add(int n){
        if(n<=0){
            return 0;
        }

        int sum = add(n-1);
        return(n+sum);
    }


    public static void main(String[] args){
        int n = 10;
        int sum = add(n);
        System.out.println(sum);  //55

        //Declaration
        Stack<Integer> stack1 = new Stack<>();
//
        //Inserion of elements into stack
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        stack1.push(50);

        System.out.println(stack1);  //[10,20,30,40,50]
        System.out.println("-----");
        System.out.println(stack1.pop());//50
        System.out.println("-----");
        System.out.println(stack1); //[10,20,30,40]
        System.out.println("-----");
        System.out.println(stack1.peek());//40
        System.out.println("-----");
        System.out.println(stack1);//[10,20,30,40]
        stack1.remove(1);
        System.out.println("-----");
        System.out.println(stack1); //[10,30,40]
        System.out.println("-----");
        stack1.push(20);
        System.out.println(stack1);//[10,30,40,20]
        System.out.println("-----");
        System.out.println(stack1.search(20));//1 because 20 exists in list if not it will print -1
        System.out.println("-----");
        System.out.println(stack1);//[10,30,40,20]
    }
}
