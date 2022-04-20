package java8program;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriortQueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("ram");
        queue.add("abc");
        queue.add("wqe");
        queue.add("ewd");
        System.out.println("head elememnt"+queue.element());
        System.out.println("head"+queue.peek());
        System.out.println("iterating element");

        Iterator iterator= queue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.hasNext());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
