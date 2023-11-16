package datastructures.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LIFO {
    public static void main(String[] args){
        Deque<String> dq = new ArrayDeque<>();
        dq.addFirst("Java");
        dq.addFirst("C#");
        dq.addFirst("Python");
        dq.addLast("C++");
        dq.push("Ruby");
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
}
