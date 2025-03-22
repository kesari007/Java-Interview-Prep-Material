package multithreading.boundedblockingqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class BoundedBlockingQueue {
    private final int capacity ;
    Queue<Integer> q = new LinkedList<>();
    ReentrantLock lock = new ReentrantLock();
    Condition full = lock.newCondition();
    Condition empty = lock.newCondition();

    public BoundedBlockingQueue(int capacity){
        this.capacity = capacity;
    }

    public void enQueue(int element) throws InterruptedException {
        try{
            lock.lock();
            // see the while loop
            while(q.size() == capacity){
                System.out.print("Queue is full");
                full.await();
            }
            q.add(element);
            full.signal();
        } finally {
            lock.unlock();
        }
    }

}
