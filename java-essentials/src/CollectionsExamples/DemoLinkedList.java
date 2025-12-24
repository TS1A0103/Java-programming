package CollectionsExamples;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;

public class DemoLinkedList {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("Krishna");
        list.add("web");
        list.add("Vamsi");
        list.addFirst("Ch");
        list.addLast("Developer");
        System.out.println(list);  //[Ch, Krishna, web, Vamsi, Developer]
        System.out.println(list.size()); //5

        //To remove the first and last elements
        list.removeFirst();
        System.out.println(list); //[Krishna, web, Vamsi, Developer]
        list.removeLast();
        System.out.println(list); //[Krishna, web, Vamsi]

        //Traversing through list using the iterator
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
