package Coreconcepts;

// Functional interface with --anonymous class--

//@FunctionalInterface
//interface A{
//    void show();
//}
//public class FunctionalInterfaceExample {
//    public static void main(String[] args){
//        A obj = new A() {
//            public void show() {
//                System.out.println("in show");
//            }
//        };
//        obj.show();
//    }
//}

// Functional interface with -- lambda expression with no arguments --
//@FunctionalInterface
//interface B{
//    void show();
//}
//public class FunctionalInterfaceExample {
//    public static void main(String[] args){
//        B obj = () -> System.out.println("in show");
//        obj.show();
//    }
//}


// Functional interface with  -- lambda expression with ONE argument --
//@FunctionalInterface
//interface B{
//    void show(String name);
//}
//public class FunctionalInterfaceExample {
//    public static void main(String[] args){
//        B obj = name -> System.out.println(name);
//        obj.show("Vamsi");
//    }
//}

// Functional interface with  -- lambda expression with multiple arguments --
@FunctionalInterface
interface B{
    int add(int a, int b);
}
public class FunctionalInterfaceExample {
    public static void main(String[] args){
        B obj = (a,b) -> a+b;
        {
            System.out.println(obj.add(5, 3));
            System.out.println(obj.add(5,6));
        }


    }
}
