package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

public class PR0Queue {

    public final int CAPACITY = 10;

    private Queue<Integer> queue;

    public PR0Queue() {
        newQueue();
    }

    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }

    public void fillQueue() {
        for (int i = 2; i <= 29; i++) {     // i number to check
            int j = 2;                      // j divisor
            while (i % j != 0) {
                j++;
            }
            if (j == i) {
                queue.add(i);
            }
        }
    }

    public String clearFullQueue() {
        StringBuilder sb = new StringBuilder();
        char r;
        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(" ");
        }
        return sb.toString();
    }

    public Queue<Integer> getQueue() {
        return this.queue;
    }
}
