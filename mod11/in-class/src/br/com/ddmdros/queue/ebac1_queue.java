package br.com.ddmdros.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class ebac1_queue {
    public static void main(String[] args) {
        //queue: FIFO (firs-in, first-out)
        Queue<String> queue = new PriorityQueue<>();
        queue.add("short");
        queue.add("very long indeed");
        queue.add("medium");
        while (queue.size() != 0){
            System.out.println(queue.remove());
        }
    }
}
