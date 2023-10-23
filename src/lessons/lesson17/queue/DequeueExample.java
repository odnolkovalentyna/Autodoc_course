package lessons.lesson17.queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DequeueExample {
    public static void main(String[] args) {
        Deque<Integer> queue = new LinkedList<>();
        queue.push(3); //add будет работать как fifo
        queue.push(6);
        queue.push(34);
        queue.push(23);
        queue.push(76);

        while (!queue.isEmpty()){
            System.out.println(queue.pop());
        }
        System.out.println(queue.size());
    }
}
