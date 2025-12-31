package CollectionsExamples;

import java.util.PriorityQueue;
import java.util.*;

public class QueueExample {
    public static  void main(String[] args){
        //Declaration  Que
        PriorityQueue<Integer>  pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(2);
        pq.add(7);
        pq.add(5);
        pq.add(6);
        pq.add(16);
        //Heapsort => Time complexity O(log n)

        System.out.println("Insertion order" + pq);
        System.out.println("----");
        System.out.println(pq.offer(6));
        System.out.println("----");
        System.out.println(pq.poll());
        System.out.println("Insertion after poll" + pq);
        System.out.println("----");
        System.out.println(pq.peek());
        System.out.println("Insertion after peek" + pq);

        Iterator<Integer> it = pq.iterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }

        System.out.println("=======");

//------Declaration of Deque------
        Deque<Integer> deq = new ArrayDeque<>();
        deq.addFirst(10);
        deq.addLast(25);
        deq.add(30);
        System.out.println(deq);
        deq.removeFirst();
        System.out.println(deq);
        deq.removeLast();
        System.out.println(deq);
        deq.addFirst(10);
        deq.addLast(25);
        System.out.println(deq);
        deq.remove();
        System.out.println(deq);
        deq.addFirst(10);
        System.out.println(deq);
        deq.pollFirst();
        System.out.println(deq);
        deq.addFirst(10);
        deq.addFirst(30);
        System.out.println(deq);

        System.out.println(deq.peekFirst());
        System.out.println(deq.peekLast());
        System.out.println(deq);

    }
}
